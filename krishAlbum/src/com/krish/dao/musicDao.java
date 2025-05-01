package com.krish.dao;

import com.krish.pojo.musicPojo;
import java.util.*;

public interface musicDao {
    void save(musicPojo a);
    List<musicPojo> list();
    Optional<musicPojo> findByTitle(String title);
    Optional<musicPojo> findByArtist(String artist);
    List<musicPojo> findAlbumsByTitle(String title);
    List<musicPojo> findByGenre(String genre);
    void delete(musicPojo a);
}
