package com.example.webforecast.model.WeatherForeCastDto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Temperature implements Serializable{
	 /**
	 * Created By Vishal Choubey
	 */
	private static final long serialVersionUID = -8620215234173467314L;
	@JsonProperty("Minimum") 
	 private Minimum minimum;
	 @JsonProperty("Maximum") 
	 private Maximum maximum;
	public Minimum getMinimum() {
		return minimum;
	}
	public void setMinimum(Minimum minimum) {
		this.minimum = minimum;
	}
	public Maximum getMaximum() {
		return maximum;
	}
	public void setMaximum(Maximum maximum) {
		this.maximum = maximum;
	}
	@Override
	public String toString() {
		return "Temperature [minimum=" + minimum + ", maximum=" + maximum + "]";
	}
	}