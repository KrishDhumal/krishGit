package com.zs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zs.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

	List<Review> findByFid(int fid);
	
	List<Review> findByRating(int rating);
}
