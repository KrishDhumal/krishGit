package com.zubair.service;

import java.util.List;
import com.zubair.pojo.Album;

public interface AlbumService {

	void save(Album a);
	
	List<Album> list();
	
	Album findByTitle(String title) throws InvalidAlbumException;
	
	void delete(String title) throws InvalidAlbumException;
}
