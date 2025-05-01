package com.zs.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zs.entity.Review;
import com.zs.service.ReviewService;
import com.zs.vo.Movie;

@CrossOrigin
@RestController
@RequestMapping("/review")
public class ReviewController {

	@Autowired
	private ReviewService service;
	
	@PostMapping(value = "/add", consumes = "application/json")
	public void add(@RequestBody Review r) {
		service.add(r);
	}
	
	@GetMapping(value = "/film/{fid}", produces = "application/json")
	public Movie findByFilm(@PathVariable int fid) {
		return service.findByFilm(fid);
	}
	
	@GetMapping(value = "/rating/{rating}", produces = "application/json")
	public List<Review> findByRating(@PathVariable int rating) {
		return service.findByRating(rating);
	}
}
