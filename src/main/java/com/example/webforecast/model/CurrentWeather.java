package com.example.webforecast.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author: Vishal Choubey
 * @create: 2020-12-08 23:24
 **/

public class CurrentWeather implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4122584069353180816L;
	private String city;
    private String aqi;
    private String ganmao;
    private String wendu;
    private List<WeatherForeCast> forecast;
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    public String getAqi() {
        return aqi;
    }
 
    public void setAqi(String aqi) {
        this.aqi = aqi;
    }
 
    public String getGanmao() {
        return ganmao;
    }
 
    public void setGanmao(String ganmao) {
        this.ganmao = ganmao;
    }
 
    public String getWendu() {
        return wendu;
    }
 
    public void setWendu(String wendu) {
        this.wendu = wendu;
    }
 
    public List<WeatherForeCast> getForecast() {
        return forecast;
    }
 
    public void setForecast(List<WeatherForeCast> forecast) {
        this.forecast = forecast;
    }

	@Override
	public String toString() {
		return "CurrentWeather [city=" + city + ", aqi=" + aqi + ", ganmao=" + ganmao + ", wendu=" + wendu
				+ ", forecast=" + forecast + "]";
	}

}
