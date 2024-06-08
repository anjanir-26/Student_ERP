package com.example.jpmc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpmc.model.User;
import com.example.jpmc.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired 
	private UserRepository urepo;
	
	public User saveUser(User user) {
		return urepo.save(user);
	}
	public User findByUserId(int id,String password) {
		return urepo.findByIdAndPassword(id, password);
	}
	
	
	

}
