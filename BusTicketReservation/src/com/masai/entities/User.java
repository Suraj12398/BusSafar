package com.masai.entities;

import java.io.Serializable;

public class User implements Serializable{

	private String username;
	private String password;
	private double mobileNo;
	private String email;

	public User() {
		super();
	}

	public User(String username, String password, double mobileNo, String email) {
		super();
		this.username = username;
		this.password = password;
		this.mobileNo = mobileNo;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getAddress() {
		return mobileNo;
	}

	public void setAddress(double mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [Username=" + username +  ", Mobile No.=" + mobileNo + ", email=" + email
				+ "]";
	}

}
