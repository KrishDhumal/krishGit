package com.zs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zs.entity.Todo;
import com.zs.entity.User;
import com.zs.repo.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoRepository repo;
	
	@Autowired
	private UserService uservice;
	
	@Override
	public int addTodo(Todo todo, int userid) {
		User user = uservice.getUser(userid);
		todo.setUser(user);
		repo.save(todo);
		return todo.getId();
	}

	@Override
	public Todo getTodo(int id) {
		return repo.findById(id).orElseThrow(() -> 
			new IllegalArgumentException("Invalid Todo Id: " + id));
	}

	@Override
	public List<Todo> todoByUser(int userid) {
		return repo.findAllByUser(userid);
	}

	@Override
	public boolean removeTodo(int id) {
		repo.delete(repo.findById(id).orElseThrow(() -> 
			new IllegalArgumentException("Invalid Todo Id: " + id)));
		return false;
	}

	@Override
	public Todo updateTodo(Todo todo, int id) {
		User user = uservice.getUser(id);
		todo.setUser(user);
		repo.save(todo);
		return todo;
	}
}
