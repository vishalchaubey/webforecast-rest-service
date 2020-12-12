package com.example.webforecast.model.WebForecastResponseMapper;

import java.io.Serializable;

public class Weather implements Serializable{
	 /**
	 * Created By Vishal Choubey
	 */
	private static final long serialVersionUID = -3555044684738865941L;
	public int id;
	private String main;
	private String description;
	private String icon;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	@Override
	public String toString() {
		return "Weather [id=" + id + ", main=" + main + ", description=" + description + ", icon=" + icon + "]";
	}
	}