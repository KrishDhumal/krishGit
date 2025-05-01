package com.krish.service;

import com.krish.pojo.musicPojo;
import java.util.*;

public interface musicService {
    void addAlbum(musicPojo a) throws InvalidAlbumException;
    List<musicPojo> getAllAlbums();
    Optional<musicPojo> getAlbumByTitle(String title);
    Optional<musicPojo> getAlbumByArtist(String artist);
    List<musicPojo> getAlbumsByTitle(String title);
    List<musicPojo> getAlbumsByGenre(String genre); // Add this method
    void removeAlbum(musicPojo a);
}
