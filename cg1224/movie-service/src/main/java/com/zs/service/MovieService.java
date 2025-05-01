package com.zs.service;

import java.time.LocalDate;
import java.util.List;

import com.zs.entity.Movie;

public interface MovieService {

	void add(Movie m);
	
	List<Movie> list();
	
	Movie getById(int fid);
	
	List<Movie> findByLanguage(String language);
	
	List<Movie> findByGenre(String genre);
	
	List<Movie> findByReleaseBetween(LocalDate begin, LocalDate end);
}
