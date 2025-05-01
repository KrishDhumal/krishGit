package com.zs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.zs.entity.Review;
import com.zs.repo.ReviewRepository;
import com.zs.vo.Movie;

@Service
public class ReviewServiceImpl implements ReviewService {
	
	@Autowired
	private ReviewRepository repo;
	
	@Autowired
	private RestTemplate rest;

	@Value("${movie-service.url}")
	private String movieServiceURL;
	
	@Override
	public void add(Review r) {
		repo.save(r);
	}

	@Override
	public Movie findByFilm(int fid) {
		Movie m = rest.getForObject(movieServiceURL + "/movie/" + fid, Movie.class);
		m.setReviews(repo.findByFid(fid));
		return m;
	}

	@Override
	public List<Review> findByRating(int rating) {
		return repo.findByRating(rating);
	}

}
