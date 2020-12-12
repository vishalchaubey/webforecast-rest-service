package com.example.webforecast.model.WeatherForeCastDto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Maximum implements Serializable{
	 /**
	 * Created By Vishal Choubey
	 */
	private static final long serialVersionUID = -1402608697612464289L;
	@JsonProperty("Value") 
	 private int value;
	 @JsonProperty("Unit") 
	 private String unit;
	 @JsonProperty("UnitType") 
	 private int unitType;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getUnitType() {
		return unitType;
	}
	public void setUnitType(int unitType) {
		this.unitType = unitType;
	}
	@Override
	public String toString() {
		return "Maximum [value=" + value + ", unit=" + unit + ", unitType=" + unitType + "]";
	}
	}