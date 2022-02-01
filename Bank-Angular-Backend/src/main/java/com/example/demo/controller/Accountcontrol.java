package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.service.Accountservice;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class Accountcontrol {
	@Autowired
	Accountservice accservice;

	@PostMapping(value="/saveacc")
	
	public Account saveaccount(@RequestBody Account account)
	{
		accservice.saveaccountdetails(account);
		return account;
		
	}
}
