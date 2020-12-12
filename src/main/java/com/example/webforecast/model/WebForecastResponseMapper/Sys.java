package com.example.webforecast.model.WebForecastResponseMapper;

import java.io.Serializable;

public class Sys implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 902724764015544632L;
	private String pod;
	public String getPod() {
		return pod;
	}
	public void setPod(String pod) {
		this.pod = pod;
	}
	@Override
	public String toString() {
		return "Sys [pod=" + pod + "]";
	}
}
