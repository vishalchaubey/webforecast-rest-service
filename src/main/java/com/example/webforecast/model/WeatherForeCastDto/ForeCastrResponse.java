package com.example.webforecast.model.WeatherForeCastDto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ForeCastrResponse{
 @JsonProperty("Headline") 
 private Headline headline;
 public Headline getHeadline() {
	return headline;
}
public void setHeadline(Headline headline) {
	this.headline = headline;
}
public List<DailyForecast> getDailyForecasts() {
	return dailyForecasts;
}
public void setDailyForecasts(List<DailyForecast> dailyForecasts) {
	this.dailyForecasts = dailyForecasts;
}
@JsonProperty("DailyForecasts") 
 private List<DailyForecast> dailyForecasts;


@Override
public String toString() {
	return "ForeCastrResponse [headline=" + headline + ", dailyForecasts=" + dailyForecasts + "]";
}
}



