package com.zs.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "todo_user")
public class User {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int userid;
	@Column(length = 25)
	private String name;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "user")
	private List<Todo> todos = new ArrayList<Todo>();
	
	// Getters and Setters
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Todo> getTodos() {
		return todos;
	}
	public void setTodos(List<Todo> todos) {
		this.todos = todos;
	}
}
