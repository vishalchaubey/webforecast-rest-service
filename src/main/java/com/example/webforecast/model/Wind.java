package com.example.webforecast.model;

import java.io.Serializable;

public class Wind implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = -2735459981407741037L;
	private double speed;
	private int deg;
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getDeg() {
		return deg;
	}
	public void setDeg(int deg) {
		this.deg = deg;
	}
	@Override
	public String toString() {
		return "Wind [speed=" + speed + ", deg=" + deg + "]";
	}
	}