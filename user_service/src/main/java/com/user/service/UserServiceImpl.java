package com.user.service;

import java.util.Optional;

//import java.util.Arrays;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

//	List<User> list = Arrays.asList(
//			new User(1311L, "Dummy", "123456"), 
//			new User(1312L, "Dummy2", "234567"),
//			new User(1313L, "Dummy3", "345678"),
//			new User(1314L, "Dummy4", "456789")
//			);

	@Override
	public User getUser(Long id) {
//		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
		User user = null;
		Optional<User> optional = userRepository.findById(id);
		if (optional.isPresent()) {
			user = optional.get();
		}
		return user;
	}

}
