package com.mynd.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mynd.userservice.model.User;
import com.mynd.userservice.model.UserRequest;
import com.mynd.userservice.repository.UserServiceRepository;



@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
UserServiceRepository userRepository ;

    // 🔹 Create User
    @PostMapping
    public User createUser(@RequestBody UserRequest request) {

    	System.out.println("User Request"+request);
        User user = new User();
        user.setName(request.name());
        user.setPhone(request.phone());
        user.setEmail(request.email());

        return userRepository.save(user);
    }

    // 🔹 Get All Users
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

  
}