package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.User;
import com.example.demo.service.Userservice;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class Bankcontroller {
	
	@Autowired
	Userservice service;
	
	@PostMapping(value="/send")
	public User print(@RequestBody User user) throws Exception
	{
		String tempemail=user.getEmailid();
		if(tempemail!= null && "".equals(tempemail))
		{
			User obj=service.fetchuserbyemail(tempemail);
		   if(obj !=null)
		   {
			   throw new Exception("User is "+tempemail+" already exits");
		   }
		}
		User obj=null;
		obj=service.store(user);
		return obj;
		
	}
	@GetMapping(value="/Users",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<User>> saveuser()
	{
		List<User> list=service.getuser();
		return new ResponseEntity<List<User>>(list,HttpStatus.CREATED);
		
	}
	@PostMapping("/login")
	public User loginuser(@RequestBody User user) throws Exception
	{
		String tempemail=user.getEmailid();
		String temppass=user.getPassword();
		User obj=null;
		if(tempemail !=null && temppass!=null) {
			obj=service.fetchuserbyemailandpass(tempemail, temppass);
			
		}
		if(obj ==null)
		{
			throw new Exception("User doesnot exits");
		}
		return obj;
		
	}
	@GetMapping(value="/user/{emailid}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getstd (@PathVariable("emailid") String emailid)
	{
	
		String tempemail=emailid;
	    User u=service.getuser(tempemail);
		return new ResponseEntity<User>(u,HttpStatus.CREATED);
	}
	

}
