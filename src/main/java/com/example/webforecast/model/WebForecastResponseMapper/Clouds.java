package com.example.webforecast.model.WebForecastResponseMapper;

import java.io.Serializable;

public class Clouds implements Serializable {
	/**
	 * Created By Vishal Choubey
	 */
	private static final long serialVersionUID = 641437964074113579L;
	private int all;
	public int getAll() {
		return all;
	}
	public void setAll(int all) {
		this.all = all;
	}
	
	@Override
	public String toString() {
		return "Clouds [all=" + all + "]";
	}
}
