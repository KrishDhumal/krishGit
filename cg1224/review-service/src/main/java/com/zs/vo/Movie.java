package com.zs.vo;

import java.time.LocalDate;
import java.util.List;

import com.zs.entity.Review;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
	private int fid;
	private String title;
	private String language;
	private String genre;
	private LocalDate release;
	
	private List<Review> reviews;
}
