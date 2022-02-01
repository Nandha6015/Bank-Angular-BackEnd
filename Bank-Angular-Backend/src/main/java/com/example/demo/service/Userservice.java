package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.User;
import com.example.demo.repo.Userrepo;

@Service
public class Userservice {
	
	@Autowired
	Userrepo repo;

	public User store(User user) {
		return repo.save(user);
		
	}

	public List<User> getuser() {
		List<User> list=repo.findAll();
		return list;
	}
	public User fetchuserbyemail(String email)
	{
		return  repo.findByEmailid(email);
		
		
	}
	public User fetchuserbyemailandpass(String email,String password)
	{
		return  repo.findByEmailidAndPassword(email, password);
		
		
	}

	public User getuser(String email) {
	   
		User user= repo.findByEmailid(email);
		return user;
		
	}

}
