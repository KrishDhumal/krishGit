package com.krish.ui;

import com.krish.pojo.musicPojo;
import com.krish.service.*;
import com.krish.dao.musicDaoImpl;

import java.util.*;

public class musicUI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        musicService service = new musicServiceImpl(new musicDaoImpl());

        while (true) {
            System.out.println("1. Add Album");
            System.out.println("2. List All Albums");
            System.out.println("3. Search by Title");
            System.out.println("4. Search by Artist");
            System.out.println("5. Search by Genre");
            System.out.println("6. Delete Album");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Title: ");
                        String title = sc.nextLine();
                        System.out.print("Enter Artist: ");
                        String artist = sc.nextLine();
                        System.out.print("Enter Genre: ");
                        String genre = sc.nextLine();
                        System.out.print("Enter Rating (0-10): ");
                        double rating = Double.parseDouble(sc.nextLine());

                        musicPojo album = new musicPojo(title, artist, genre, rating);
                        service.addAlbum(album);
                        System.out.println("Album added successfully!");
                    } catch (InvalidAlbumException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    List<musicPojo> albums = service.getAllAlbums();
                    if (albums.isEmpty()) {
                        System.out.println("No albums found.");
                    } else {
                        albums.forEach(System.out::println);
                    }
                    break;

                case 3:
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    List<musicPojo> foundByTitle = service.getAlbumsByTitle(title);
                    if (foundByTitle.isEmpty()) {
                        System.out.println("No albums found with that title.");
                    } else {
                        foundByTitle.forEach(System.out::println);
                    }
                    break;

                case 4:
                    System.out.print("Enter Artist: ");
                    String artist = sc.nextLine();
                    Optional<musicPojo> artistAlbum = service.getAlbumByArtist(artist);
                    artistAlbum.ifPresentOrElse(
                            System.out::println,
                            () -> System.out.println("No album found for that artist.")
                    );
                    break;

                case 5:
                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();
                    List<musicPojo> byGenre = service.getAlbumsByGenre(genre);
                    if (byGenre.isEmpty()) {
                        System.out.println("No albums found in that genre.");
                    } else {
                        byGenre.forEach(System.out::println);
                    }
                    break;

                case 6:
                    System.out.print("Enter title to delete: ");
                    String delTitle = sc.nextLine();
                    Optional<musicPojo> albumToDelete = service.getAlbumByTitle(delTitle);
                    if (albumToDelete.isPresent()) {
                        service.removeAlbum(albumToDelete.get());
                        System.out.println("Album deleted.");
                    } else {
                        System.out.println("Album not found.");
                    }
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
