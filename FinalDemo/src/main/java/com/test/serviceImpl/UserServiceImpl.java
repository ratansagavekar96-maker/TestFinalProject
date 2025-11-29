package com.test.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.User;
import com.test.repository.UserRepository;
import com.test.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		User user1=userRepository.save(user);
		return user1;
	}

	@Override
	public User updateUser(User user) {
		User user1=userRepository.save(user);
		return user1;
	}

	@Override
	public User getUserById(Integer id) {
		Optional<User> user=userRepository.findById(id);
		User users=null;
		if(user.isPresent()) {
			users=user.get();
		}
		return users;
	}

	@Override
	public void deleteUserById(Integer id) {
		userRepository.deleteById(id);
	}

}
