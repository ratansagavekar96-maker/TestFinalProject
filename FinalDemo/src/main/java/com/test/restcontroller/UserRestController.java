package com.test.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.User;
import com.test.service.UserService;
@RestController
public class UserRestController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/saveUser")
    public User saveUser(@RequestBody User user) {
		User user1=userService.saveUser(user);
		return user1;
    	
	}
	
	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user) {
		User user1=userService.updateUser(user);
		return user1;
	}
	
	@GetMapping("/getUser/{id}")
	@ResponseBody
	public User getUserById(@PathVariable Integer id) {
		User user1=userService.getUserById(id);
		System.out.println(user1);
		return user1;
	}
	@DeleteMapping("/deleteUser/{id}")
    public String  deleteUserById(@PathVariable Integer id) {
    	userService.deleteUserById(id);
    	return "Data deleted succesfully";
    }

}
