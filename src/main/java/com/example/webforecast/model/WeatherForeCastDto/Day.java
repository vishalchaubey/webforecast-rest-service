package com.example.webforecast.model.WeatherForeCastDto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Day implements Serializable{
	 /**
	 * Created By Vishal Choubey
	 */
	private static final long serialVersionUID = 4945870846284573342L;
	@JsonProperty("Icon") 
	 private int icon;
	 @JsonProperty("IconPhrase") 
	 private String iconPhrase;
	 @JsonProperty("HasPrecipitation") 
	 private boolean hasPrecipitation;
	 
	 public int getIcon() {
		return icon;
	}
	public void setIcon(int icon) {
		this.icon = icon;
	}
	public String getIconPhrase() {
		return iconPhrase;
	}
	public void setIconPhrase(String iconPhrase) {
		this.iconPhrase = iconPhrase;
	}
	public boolean isHasPrecipitation() {
		return hasPrecipitation;
	}
	public void setHasPrecipitation(boolean hasPrecipitation) {
		this.hasPrecipitation = hasPrecipitation;
	}
	public String getPrecipitationType() {
		return precipitationType;
	}
	public void setPrecipitationType(String precipitationType) {
		this.precipitationType = precipitationType;
	}
	public String getPrecipitationIntensity() {
		return precipitationIntensity;
	}
	public void setPrecipitationIntensity(String precipitationIntensity) {
		this.precipitationIntensity = precipitationIntensity;
	}
	@JsonProperty("PrecipitationType") 
	 private String precipitationType;
	 @JsonProperty("PrecipitationIntensity") 
	 private String precipitationIntensity;

	@Override
	public String toString() {
		return "Day [icon=" + icon + ", iconPhrase=" + iconPhrase + ", hasPrecipitation=" + hasPrecipitation
				+ ", precipitationType=" + precipitationType + ", precipitationIntensity=" + precipitationIntensity
				+ "]";
	}
	 
	}
