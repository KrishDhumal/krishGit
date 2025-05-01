package com.zs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "reviews")
@Getter @Setter
public class Review {
	@Id
	@GeneratedValue
	private int rid;
	private int fid;
	private int mid;
	private int rating;
	@Column(length = 30)
	private String comment;
	
}
