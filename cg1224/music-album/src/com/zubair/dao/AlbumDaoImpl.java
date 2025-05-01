package com.zubair.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.zubair.pojo.Album;

public class AlbumDaoImpl implements AlbumDao {
	private List<Album> albums;
	
	public AlbumDaoImpl() {
		albums = new ArrayList<Album>();
	}
	
	@Override
	public void save(Album a) {
		albums.add(a);
	}

	@Override
	public List<Album> list() {
		return albums;
	}

	@Override
	public Optional<Album> findByTitle(String title) {
		// Use stream to find album
		return albums.stream().filter(a -> a.getTitle().equals(title))
				.findFirst();
	}

	@Override
	public void delete(Album a) {
		albums.remove(a);
	}
}



