package com.example.webforecast.model.WebForecastResponseMapper;

import java.io.Serializable;

public class Rain implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = -2892766227760192473L;
	private double h;
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	@Override
	public String toString() {
		return "Rain [h=" + h + "]";
	}
	}
