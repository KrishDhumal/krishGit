package com.zs.service;

import java.util.List;

import com.zs.entity.Review;
import com.zs.vo.Movie;

public interface ReviewService {

	void add(Review r);
	
	Movie findByFilm(int fid);
	
	List<Review> findByRating(int rating);
}
