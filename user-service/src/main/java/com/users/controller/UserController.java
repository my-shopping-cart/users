package com.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.domain.UserDetails;
import com.users.repo.UserDetailsRepository;

@RestController
@RequestMapping("/user-details")
public class UserController {

	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@PostMapping
	public String createUser(@RequestBody UserDetails userDetails) {
		userDetailsRepository.save(userDetails);
		return "User details saved";
	}
}
