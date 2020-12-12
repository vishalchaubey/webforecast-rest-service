package com.example.webforecast.model.WebForecastResponseMapper;

import java.io.Serializable;

public class City implements Serializable{
	 /**
	 * Created By Vishal Choubey
	 */
	private static final long serialVersionUID = -5142776838907117407L;
	private int id;
	private String name;
	private Coord coord;
	private String country;
	private int population;
	private int timezone;
	private int sunrise;
	private int sunset;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Coord getCoord() {
		return coord;
	}
	public void setCoord(Coord coord) {
		this.coord = coord;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public int getTimezone() {
		return timezone;
	}
	public void setTimezone(int timezone) {
		this.timezone = timezone;
	}
	public int getSunrise() {
		return sunrise;
	}
	public void setSunrise(int sunrise) {
		this.sunrise = sunrise;
	}
	public int getSunset() {
		return sunset;
	}
	public void setSunset(int sunset) {
		this.sunset = sunset;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", coord=" + coord + ", country=" + country + ", population="
				+ population + ", timezone=" + timezone + ", sunrise=" + sunrise + ", sunset=" + sunset + "]";
	}
}
