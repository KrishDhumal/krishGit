package com.zs.service;

import java.util.List;

import com.zs.entity.Todo;

public interface TodoService {
	
	int addTodo(Todo todo, int userid);
	
	Todo getTodo(int id);
	
	List<Todo> todoByUser(int userid);
	
	boolean removeTodo(int id);
	
	Todo updateTodo(Todo todo, int id);
}
