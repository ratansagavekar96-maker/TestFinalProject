package com.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.entity.User;


public interface UserService {
	
	public User saveUser(User user);
	
	public User updateUser(User user);
	
	public User getUserById(Integer id);
	
    public void deleteUserById(Integer id);
	
	

}
