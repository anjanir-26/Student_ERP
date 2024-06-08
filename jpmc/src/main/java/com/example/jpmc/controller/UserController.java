package com.example.jpmc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpmc.model.User;
import com.example.jpmc.service.UserService;

@RestController

@CrossOrigin(origins = "http://localhost:3000")

public class UserController {
	
	@Autowired
	private UserService uservice;
	
	@PostMapping("/registration")
	public User submitUser(@RequestBody User user) {
		
		return uservice.saveUser(user);
		
	}
	
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) {
		return uservice.findByUserId(user.getId(), user.getPassword());
		
		
	}
	
	
	
	
	

}
