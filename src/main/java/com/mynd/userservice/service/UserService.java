package com.mynd.userservice.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mynd.userservice.model.User;

@Service
public interface UserService {
	
	ResponseEntity addUser(User user);
	User findById(int id);
	

}
