package com.example.demo.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	int id;
	String name;
	String emailid;
	String password;
	long mobilenumber;
	@Override
	public String toString() {
		return "Bank [name=" + name + ", emailid=" + emailid + ", password=" + password + ", mobilenumber="
				+ mobilenumber + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	

}
