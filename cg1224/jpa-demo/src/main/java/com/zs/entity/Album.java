package com.zs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Album {
	@Id
	private int id;
	@Column(length = 20)
	private String title;
	@Column(length = 15)
	private String genre;
	private double rating;
	
	// Generate default and parameterized constructors
	// Generate getters and setters
	// Generate toString()
}
