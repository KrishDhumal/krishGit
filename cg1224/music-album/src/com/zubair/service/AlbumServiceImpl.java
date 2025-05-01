package com.zubair.service;

import java.util.List;

import com.zubair.dao.AlbumDao;
import com.zubair.dao.AlbumDaoImpl;
import com.zubair.pojo.Album;

public class AlbumServiceImpl implements AlbumService {
	private AlbumDao dao;
	
	public AlbumServiceImpl() {
		dao = new AlbumDaoImpl();
	}
	
	@Override
	public void save(Album a) {
		// After performing all validations
		dao.save(a);
	}

	@Override
	public List<Album> list() {
		return dao.list();
	}

	@Override
	public Album findByTitle(String title) throws InvalidAlbumException {
		return dao.findByTitle(title).orElseThrow(() -> 
			new InvalidAlbumException("Album not found: " + title));
	}

	@Override
	public void delete(String title) throws InvalidAlbumException {
		Album a = findByTitle(title);
		dao.delete(a);
	}
}








