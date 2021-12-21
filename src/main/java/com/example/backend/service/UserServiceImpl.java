package com.example.backend.service;

import org.springframework.stereotype.Service;

import com.example.backend.dto.UserViewDTO;
import com.example.backend.model.User;
import com.example.backend.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	
	@Override
	public UserViewDTO getUserById(Long id) {
		final User user = userRepository.findById(id).orElseThrow();
		return UserViewDTO.of(user);
	}
	
	public User addUSer(User user) {
		User save = userRepository.save(user);
		return save;
	}
}
