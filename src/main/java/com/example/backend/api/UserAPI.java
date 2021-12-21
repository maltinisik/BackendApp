package com.example.backend.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dto.UserViewDTO;
import com.example.backend.model.User;
import com.example.backend.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserAPI {
  
	private final UserService userService;
	
	@GetMapping("v1/user/{id}")
	public ResponseEntity<UserViewDTO>  getUserById(@PathVariable Long id) {
        final UserViewDTO user = userService.getUserById(id);
		return ResponseEntity.ok(user);
	}
	
	@PostMapping("/addUser")
	public User createUser(@RequestBody User user) {
		return userService.addUSer(user);
	}
}
