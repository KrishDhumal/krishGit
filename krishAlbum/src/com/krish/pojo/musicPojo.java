package com.krish.pojo;

public class musicPojo {
    private String title;
    private String artist;
    private String genre;
    private double rating;

    public musicPojo() {
        // Default constructor
    }

    public musicPojo(String title, String artist, String genre, double rating) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Artist: " + artist + ", Genre: " + genre + ", Rating: " + rating;
    }
}
