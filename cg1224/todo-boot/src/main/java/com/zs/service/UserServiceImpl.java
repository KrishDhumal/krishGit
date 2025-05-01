package com.zs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zs.entity.User;
import com.zs.excep.InvalidUserException;
import com.zs.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;
	
	@Override
	public int addUser(User user) {
		repo.save(user);
		return user.getUserid();
	}

	@Override
	public User getUser(int userid) throws InvalidUserException {
		return repo.findById(userid).orElseThrow(() -> 
			new InvalidUserException("User not found with Id: " + userid));
	}

	@Override
	public List<User> getAllUsers() {
		return repo.findAll();
	}
}
