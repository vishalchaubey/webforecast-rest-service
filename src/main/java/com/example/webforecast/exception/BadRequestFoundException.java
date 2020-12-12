package com.example.webforecast.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BadRequestFoundException  extends RuntimeException{

	/**
	 * Created By Vishal Choubey
	 */
	private static final long serialVersionUID = -3472073927637627523L;

	public BadRequestFoundException(String resource) {
		super(resource);
	}
}
