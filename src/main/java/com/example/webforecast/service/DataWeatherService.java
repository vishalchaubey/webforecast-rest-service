package com.example.webforecast.service;

import java.util.concurrent.CompletableFuture;

import com.example.webforecast.model.AggregateResponse;
import com.example.webforecast.model.WeatherResponse;
import com.example.webforecast.model.WeatherForeCastDto.ForeCastrResponse;

/**
 * @author: Vishal Choubey
 * @create: 2020-12-08 23:24
 **/

public interface DataWeatherService {
	

	CompletableFuture<ForeCastrResponse>  getDataOfForecast(String City);
 
    /**
     * Check weather data by city name
     * @param cityName
     * @return
     */
	CompletableFuture<WeatherResponse>  getDataOfWeather(String City);
	
	
	/**
     * Map the final Response
     * @param WeatherResponse obj1, ForeCastrResponse obj2
     * @return
     */
	AggregateResponse getResponseMapper(WeatherResponse obj1, ForeCastrResponse obj2);
 
}
