package com.example.webforecast.model;


import java.io.Serializable;

public class Response implements Serializable {

	private static final long serialVersionUID = -7071879091924046844L;
	private final String jwttoken;

	public Response(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}

	@Override
	public String toString() {
		return "Response [jwttoken=" + jwttoken + "]";
	}
}