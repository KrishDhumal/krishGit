package com.zs.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "todo_master")
public class Todo {
	@Id
	@GeneratedValue
	private int id;
	@Column(length = 20)
	private String task;
	@Column(length = 20)
	private String category;
	@Column(length = 20)
	private String priority;
	@Column(length = 20)
	private String status;
	private LocalDate assignDate;
	private LocalDate finishDate;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	// Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getAssignDate() {
		return assignDate;
	}
	public void setAssignDate(LocalDate assignDate) {
		this.assignDate = assignDate;
	}

	public LocalDate getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(LocalDate finishDate) {
		this.finishDate = finishDate;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
