package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", accounttype=" + accounttype + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String accounttype;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	

}
