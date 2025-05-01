package com.krish.service;

import com.krish.dao.musicDao;
import com.krish.pojo.musicPojo;

import java.util.*;

public class musicServiceImpl implements musicService {

    private final musicDao dao;

    // Constructor injection of the DAO implementation
    public musicServiceImpl(musicDao dao) {
        this.dao = dao;
    }

    @Override
    public void addAlbum(musicPojo a) throws InvalidAlbumException {
        if (a.getRating() < 0 || a.getRating() > 10) {
            throw new InvalidAlbumException("Rating must be between 0 and 10");
        }
        dao.save(a);
    }

    @Override
    public List<musicPojo> getAllAlbums() {
        return dao.list();
    }

    @Override
    public Optional<musicPojo> getAlbumByTitle(String title) {
        return dao.findByTitle(title);
    }

    @Override
    public Optional<musicPojo> getAlbumByArtist(String artist) {
        return dao.findByArtist(artist);
    }

    @Override
    public List<musicPojo> getAlbumsByTitle(String title) {
        return dao.findAlbumsByTitle(title);
    }

    @Override
    public List<musicPojo> getAlbumsByGenre(String genre) {
        return dao.findByGenre(genre);
    }

    @Override
    public void removeAlbum(musicPojo a) {
        dao.delete(a);
    }
}
