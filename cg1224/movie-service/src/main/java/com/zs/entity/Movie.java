package com.zs.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "movies")
@Getter @Setter
public class Movie {
	@Id
	private int fid;
	@Column(length = 20)
	private String title;
	@Column(length = 10)
	private String language;
	@Column(length = 12)
	private String genre;
	@Column(name = "rel_date")
	private LocalDate release;
}
