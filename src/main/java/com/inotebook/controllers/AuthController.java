package com.inotebook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inotebook.models.User;
import com.inotebook.services.UserService;

@RestController
public class AuthController {
	
	@Autowired
	private UserService userservice;

	@PostMapping("/api/user")
	public User createUser( @RequestBody User user) {
		return this.userservice.createUser(user);
		
	}
}
