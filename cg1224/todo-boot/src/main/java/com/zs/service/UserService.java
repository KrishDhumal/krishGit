package com.zs.service;

import java.util.List;

import com.zs.entity.User;
import com.zs.excep.InvalidUserException;

public interface UserService {
	
	int addUser(User user);
	
	User getUser(int userid) throws InvalidUserException;
	
	List<User> getAllUsers();
	
}
