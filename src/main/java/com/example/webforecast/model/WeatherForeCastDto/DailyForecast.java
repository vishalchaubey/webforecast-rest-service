package com.example.webforecast.model.WeatherForeCastDto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DailyForecast implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = -4793459667818448641L;
	@JsonProperty("Date") 
	 private Date date;
	 @JsonProperty("EpochDate") 
	 private int epochDate;
	 @JsonProperty("Temperature") 
	 private Temperature temperature;
	 @JsonProperty("Day") 
	 private Day day;
	 @JsonProperty("Night") 
	 private Night night;
	 @JsonProperty("Sources") 
	 private List<String> sources;
	 public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getEpochDate() {
		return epochDate;
	}
	public void setEpochDate(int epochDate) {
		this.epochDate = epochDate;
	}
	public Temperature getTemperature() {
		return temperature;
	}
	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}
	public Day getDay() {
		return day;
	}
	public void setDay(Day day) {
		this.day = day;
	}
	public Night getNight() {
		return night;
	}
	public void setNight(Night night) {
		this.night = night;
	}
	public List<String> getSources() {
		return sources;
	}
	public void setSources(List<String> sources) {
		this.sources = sources;
	}
	public String getMobileLink() {
		return mobileLink;
	}
	public void setMobileLink(String mobileLink) {
		this.mobileLink = mobileLink;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	@JsonProperty("MobileLink") 
	 private String mobileLink;
	 @JsonProperty("Link") 
	 private String link;
	@Override
	public String toString() {
		return "DailyForecast [date=" + date + ", epochDate=" + epochDate + ", temperature=" + temperature + ", day="
				+ day + ", night=" + night + ", sources=" + sources + ", mobileLink=" + mobileLink + ", link=" + link
				+ "]";
	}
	}