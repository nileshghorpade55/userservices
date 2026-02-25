package com.mynd.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mynd.userservice.model.User;
import com.mynd.userservice.repository.UserServiceRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserServiceRepository userServiceRepository;

	@Override
	public ResponseEntity addUser(User user) {
		// TODO Auto-generated method stub
		User savedUser=userServiceRepository.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return userServiceRepository.getById(id);
	}
	
	

}
