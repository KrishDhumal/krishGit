package com.zs.rest;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zs.entity.Movie;
import com.zs.service.InvalidMovieException;
import com.zs.service.MovieService;


@CrossOrigin
@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	private MovieService service;
	
	@PostMapping(value = "/add", consumes = "application/json")
	public void add(@RequestBody Movie m) {
		service.add(m);
	}
	
	@GetMapping(value = "/{fid}", produces = "application/json")
	public Movie get(@PathVariable int fid) {
		return service.getById(fid);
	}
	
	@GetMapping(value = "/list", produces = "application/json")
	public List<Movie> list() {
		return service.list();
	}
	
	@GetMapping(value = "/lang/{lang}", produces = "application/json")
	public List<Movie> listByLang(@PathVariable String lang) {
		return service.findByLanguage(lang);
	}
	
	@GetMapping(value = "/genre/{genre}", produces = "application/json")
	public List<Movie> listByGenre(@PathVariable String genre) {
		return service.findByGenre(genre);
	}
	
	@GetMapping(value = "/release", produces = "application/json")
	public List<Movie> listByRelease(@RequestParam LocalDate begin, @RequestParam LocalDate end) {
		return service.findByReleaseBetween(begin, end);
	}
	
	@ExceptionHandler(InvalidMovieException.class)
	public ResponseEntity<Object> handleInvalidMovieException(InvalidMovieException ex) {
		return new ResponseEntity<>( ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
