package com.example.backend.service;

import com.example.backend.dto.UserViewDTO;
import com.example.backend.model.User;

public interface UserService {

	UserViewDTO  getUserById(Long id);

	public User addUSer(User user);
}
