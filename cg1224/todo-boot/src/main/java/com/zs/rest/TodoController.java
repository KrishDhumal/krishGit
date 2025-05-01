package com.zs.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zs.entity.Todo;
import com.zs.service.TodoService;

@RestController
public class TodoController {

	@Autowired
	private TodoService service;
	
	@PostMapping(value = "/todo/{userid}", consumes = "application/json")
	public String addTodo(@RequestBody Todo todo, @PathVariable int userid) {
		int id = service.addTodo(todo, userid);
		return "ToDo created with Id: " + id;
	}
	
	@GetMapping(value = "/todo/{id}", produces = "application/json")
	public Todo getTodo(@PathVariable int id) {
		return service.getTodo(id);
	}
	
	@GetMapping(value = "/todo/user/{userid}", produces = "application/json")
	public List<Todo> getUserTodo(@PathVariable int userid) {
		return service.todoByUser(userid);
	}
	
	@PutMapping(value = "/todo/{id}", consumes = "application/json")
	public String updateTodo(@RequestBody Todo todo, @PathVariable int id) {
		service.updateTodo(todo, id);
		return "Todo Updated";
	}
}
