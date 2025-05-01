package com.zubair.dao;

import java.util.List;
import java.util.Optional;

import com.zubair.pojo.Album;

public interface AlbumDao {

	void save(Album a);
	
	List<Album> list();
	
	Optional<Album> findByTitle(String title);
	
	void delete(Album a);
}
