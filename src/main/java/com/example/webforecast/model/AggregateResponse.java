package com.example.webforecast.model;

import java.io.Serializable;
import java.util.Date;

public class AggregateResponse implements Serializable{
	
	/**
	 * Created By Vishal Choubey
	 */
	private static final long serialVersionUID = 2415989117226254770L;
	
	private String cityName;
	private Double temperature;
	private Double feels_like;
	private Double temp_min;
	private Double temp_max;
	private int pressure;
	private int humidity;
	private String foreCastDay;
	private String foreCastNight;
	private String foreCastExpected;
	private String foreCastCategory;
	private Date foreCastDate;
	private int foreCastTemperatue;
	private String foreCastTemperatureUnit;
	private int foreCastMaximumTemp;
	private int foreCastMinimumTemp;
	
	
	public String getForeCastDay() {
		return foreCastDay;
	}
	public void setForeCastDay(String foreCastDay) {
		this.foreCastDay = foreCastDay;
	}
	public String getForeCastNight() {
		return foreCastNight;
	}
	public void setForeCastNight(String foreCastNight) {
		this.foreCastNight = foreCastNight;
	}
	public String getForeCastExpected() {
		return foreCastExpected;
	}
	public void setForeCastExpected(String foreCastExpected) {
		this.foreCastExpected = foreCastExpected;
	}
	public String getForeCastCategory() {
		return foreCastCategory;
	}
	public void setForeCastCategory(String foreCastCategory) {
		this.foreCastCategory = foreCastCategory;
	}
	public Date getForeCastDate() {
		return foreCastDate;
	}
	public void setForeCastDate(Date foreCastDate) {
		this.foreCastDate = foreCastDate;
	}
	public int getForeCastTemperatue() {
		return foreCastTemperatue;
	}
	public void setForeCastTemperatue(int foreCastTemperatue) {
		this.foreCastTemperatue = foreCastTemperatue;
	}
	public String getForeCastTemperatureUnit() {
		return foreCastTemperatureUnit;
	}
	public void setForeCastTemperatureUnit(String foreCastTemperatureUnit) {
		this.foreCastTemperatureUnit = foreCastTemperatureUnit;
	}
	public int getForeCastMaximumTemp() {
		return foreCastMaximumTemp;
	}
	public void setForeCastMaximumTemp(int foreCastMaximumTemp) {
		this.foreCastMaximumTemp = foreCastMaximumTemp;
	}
	public int getForeCastMinimumTemp() {
		return foreCastMinimumTemp;
	}
	public void setForeCastMinimumTemp(int foreCastMinimumTemp) {
		this.foreCastMinimumTemp = foreCastMinimumTemp;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Double getTemperature() {
		return temperature;
	}
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}
	public Double getFeels_like() {
		return feels_like;
	}
	public void setFeels_like(Double feels_like) {
		this.feels_like = feels_like;
	}
	public Double getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(Double temp_min) {
		this.temp_min = temp_min;
	}
	public Double getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(Double temp_max) {
		this.temp_max = temp_max;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	
	@Override
	public String toString() {
		return "AggregateResponse [cityName=" + cityName + ", temperature=" + temperature + ", feels_like=" + feels_like
				+ ", temp_min=" + temp_min + ", temp_max=" + temp_max + ", pressure=" + pressure + ", humidity="
				+ humidity + ", foreCastDay=" + foreCastDay + ", foreCastNight=" + foreCastNight + ", foreCastExpected="
				+ foreCastExpected + ", foreCastCategory=" + foreCastCategory + ", foreCastDate=" + foreCastDate
				+ ", foreCastTemperatue=" + foreCastTemperatue + ", foreCastTemperatureUnit=" + foreCastTemperatureUnit
				+ ", foreCastMaximumTemp=" + foreCastMaximumTemp + ", foreCastMinimumTemp=" + foreCastMinimumTemp + "]";
	}
	
}
