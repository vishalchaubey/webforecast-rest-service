package com.example.webforecast.model.WebForecastResponseMapper;

import java.io.Serializable;
import java.util.List;

public class Lists implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = -5648238526557735929L;
	private int dt;
	private Main main;
	private List<Weather> weather;
	private Clouds clouds;
	private Wind wind;
	private int visibility;
	private double pop;
	private Sys sys;
	private String dt_txt;
	private Rain rain;
	public int getDt() {
		return dt;
	}
	public void setDt(int dt) {
		this.dt = dt;
	}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	public List<Weather> getWeather() {
		return weather;
	}
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	public Clouds getClouds() {
		return clouds;
	}
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public int getVisibility() {
		return visibility;
	}
	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}
	public double getPop() {
		return pop;
	}
	public void setPop(double pop) {
		this.pop = pop;
	}
	public Sys getSys() {
		return sys;
	}
	public void setSys(Sys sys) {
		this.sys = sys;
	}
	public String getDt_txt() {
		return dt_txt;
	}
	public void setDt_txt(String dt_txt) {
		this.dt_txt = dt_txt;
	}
	public Rain getRain() {
		return rain;
	}
	public void setRain(Rain rain) {
		this.rain = rain;
	}
	@Override
	public String toString() {
		return "Lists [dt=" + dt + ", main=" + main + ", weather=" + weather + ", clouds=" + clouds + ", wind=" + wind
				+ ", visibility=" + visibility + ", pop=" + pop + ", sys=" + sys + ", dt_txt=" + dt_txt + ", rain="
				+ rain + "]";
	}
	}

