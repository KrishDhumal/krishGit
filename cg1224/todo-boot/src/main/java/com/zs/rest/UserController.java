package com.zs.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zs.entity.User;
import com.zs.excep.InvalidUserException;
import com.zs.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping(value = "/user", consumes = "application/json")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		int id = service.addUser(user);
		return new ResponseEntity<String>("User added with Id: " + id, HttpStatus.OK);
	}
	
	@GetMapping(value = "/user/{userid}", produces = "application/json")
	public ResponseEntity<User> getUser(@PathVariable int userid) throws InvalidUserException {
		User user = service.getUser(userid);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@GetMapping(value = "/users", produces = "application/json")
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}
	
}
