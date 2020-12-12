package com.example.webforecast.model.WeatherForeCastDto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Night implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = -4939825790978729978L;
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
	@Override
	public String toString() {
		return "Night [icon=" + icon + ", iconPhrase=" + iconPhrase + ", hasPrecipitation=" + hasPrecipitation + "]";
	}
	}