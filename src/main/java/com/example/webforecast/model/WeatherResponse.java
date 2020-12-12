package com.example.webforecast.model;

import java.io.Serializable;
import java.util.List;

import com.example.webforecast.model.WebForecastResponseMapper.Clouds;
import com.example.webforecast.model.WebForecastResponseMapper.Coord;
import com.example.webforecast.model.WebForecastResponseMapper.Main;
import com.example.webforecast.model.WebForecastResponseMapper.Sys;
import com.example.webforecast.model.WebForecastResponseMapper.Weather;

/**
 * @author: Vishal Choubey
 * @create: 2020-12-08 23:24
 **/

public class WeatherResponse implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -6321880412029984847L;
	private Coord coord;
    private List<Weather> weather;
    private String base;
    private Main main;
    private int visibility;
    private Wind wind;
    private Clouds clouds;
    private int dt;
    private Sys sys;
    public Coord getCoord() {
		return coord;
	}
	public void setCoord(Coord coord) {
		this.coord = coord;
	}
	public List<Weather> getWeather() {
		return weather;
	}
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	public int getVisibility() {
		return visibility;
	}
	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public Clouds getClouds() {
		return clouds;
	}
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	public int getDt() {
		return dt;
	}
	public void setDt(int dt) {
		this.dt = dt;
	}
	public Sys getSys() {
		return sys;
	}
	public void setSys(Sys sys) {
		this.sys = sys;
	}
	public int getTimezone() {
		return timezone;
	}
	public void setTimezone(int timezone) {
		this.timezone = timezone;
	}
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
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	private int timezone;
    private int id;
    private String name;
    private int cod;
	@Override
	public String toString() {
		return "WeatherResponse [coord=" + coord + ", weather=" + weather + ", base=" + base + ", main=" + main
				+ ", visibility=" + visibility + ", wind=" + wind + ", clouds=" + clouds + ", dt=" + dt + ", sys=" + sys
				+ ", timezone=" + timezone + ", id=" + id + ", name=" + name + ", cod=" + cod + "]";
	}
}