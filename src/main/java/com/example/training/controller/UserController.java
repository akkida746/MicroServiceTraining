package com.example.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.training.entity.User;
import com.example.training.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/{name}")
	public String greeting(@PathVariable String name) {
		return "Hello " + name + "!";
	}
	
	@GetMapping("/user")
	public User getUser() {
		return userService.getUser();
	}
}
