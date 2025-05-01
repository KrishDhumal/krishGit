package com.zs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @version 1.3
 * @author zubair, ketki, tanuja
 */
@Entity
@Table(name = "members")
@Getter @Setter
public class Member {
	@Id
	private int mid;
	@Column(name = "mbr_name", length = 20)
	private String name;
	private int age;
	@Column(length = 20)
	private String email;
	@Column(length = 15)
	private String password;
}
