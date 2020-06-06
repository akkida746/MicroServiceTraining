package com.example.training.service;

import org.springframework.stereotype.Service;

import com.example.training.entity.User;

@Service
public class UserServiceImpl implements UserService{

	public User getUser() {
		return User.builder().name("Akash").build();
	}
}
