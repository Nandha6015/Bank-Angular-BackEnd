package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Account;
import com.example.demo.repo.Accountrepo;

@Service
public class Accountservice {

	@Autowired 
	Accountrepo repo;
	public void saveaccountdetails(Account account) {
		
	         repo.save(account);
	}
	

}
