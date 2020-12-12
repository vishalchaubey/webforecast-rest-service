package com.example.webforecast.model.WebForecastResponseMapper;

import java.io.Serializable;

public class Coord implements Serializable{
	 /**
	 * Created By Vishal Choubey
	 */
	private static final long serialVersionUID = -3897849099664181371L;
	private double lat;
	 private double lon;
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	@Override
	public String toString() {
		return "Coord [lat=" + lat + ", lon=" + lon + "]";
	}
	
	}