package com.zs.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zs.entity.Movie;
import com.zs.repo.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository repo;
	
	@Override
	public void add(Movie m) {
		repo.save(m);
	}

	@Override
	public List<Movie> list() {
		return repo.findAll();
	}

	@Override
	public Movie getById(int fid) {
		return repo.findById(fid).orElseThrow(
			() -> new InvalidMovieException("Movie not found with Id: " + fid));
	}

	@Override
	public List<Movie> findByLanguage(String language) {
		return repo.findByLanguage(language);
	}

	@Override
	public List<Movie> findByGenre(String genre) {
		return repo.findByGenre(genre);
	}

	@Override
	public List<Movie> findByReleaseBetween(LocalDate begin, LocalDate end) {
		return repo.findByReleaseBetween(begin, end);
	}

}
