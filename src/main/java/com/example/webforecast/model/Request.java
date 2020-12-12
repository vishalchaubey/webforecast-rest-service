package com.example.webforecast.model;


import java.io.Serializable;

public class Request implements Serializable {

	private static final long serialVersionUID = 4926468583005750707L;
	
	private String username;
	private String password;
	
	//need default constructor for JSON Parsing
	public Request()
	{
		
	}

	public Request(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Request [username=" + username + ", password=" + password + "]";
	}
}
