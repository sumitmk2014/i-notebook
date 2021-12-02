package com.inotebook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inotebook.models.User;
import com.inotebook.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userrepository;
	
	
	
	@Override
	public User createUser(User user) {
		userrepository.save(user);
		return user;
	}

}
