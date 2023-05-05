package com.masai.entities;


public class User{

	private String username;
	private String password;
	private String mobileNo;
	private String email;

	public User() {
		super();
	}

	public User(String username, String password, String mobileNo, String email) {
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

	public String getAddress() {
		return mobileNo;
	}

	public void setAddress(String mobileNo) {
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
