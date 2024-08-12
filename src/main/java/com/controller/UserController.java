package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.UserEntity;
import com.repository.UserRepository;

@Controller
public class UserController {
	
	//Polymorphic Object
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/newuser")
	public String newUser() {
		return "newUser"; 
	}
	
	@PostMapping("saveuser")
	public String saveUser(UserEntity userEntity) {
		userRepository.save(userEntity);
		return "newUser";
	}
}
