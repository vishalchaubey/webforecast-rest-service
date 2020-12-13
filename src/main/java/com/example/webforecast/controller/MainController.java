package com.example.webforecast.controller;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.webforecast.model.AggregateResponse;
import com.example.webforecast.model.WeatherResponse;
import com.example.webforecast.model.WeatherForeCastDto.ForeCastrResponse;
import com.example.webforecast.service.DataWeatherService;
 
/**
 * @author: Vishal Choubey
 * @create: 2020-12-08 23:45
 * @description: MainController
 **/
@CrossOrigin
@RestController
@RequestMapping("/api")
public class MainController {
 
    @Autowired
    private DataWeatherService dataWeatherService;

    @GetMapping("/Name/{Name}")
    public AggregateResponse getWeatherByCityName(@PathVariable("Name") String Name) throws InterruptedException, ExecutionException{
    	
    	/*Asynchronous First API call Note:- To check the the methods process Asynchronous put logs and logs the thread */
    	CompletableFuture<WeatherResponse> weatherResponseResults = dataWeatherService.getDataOfWeather(Name);
    	/* Asynchronous second API call */
    	CompletableFuture<ForeCastrResponse> foreCastResponse = dataWeatherService.getDataOfForecast(Name);
    	CompletableFuture.allOf(weatherResponseResults,foreCastResponse).join();
    	
    	/* Map the Response of the 2 API call and return the final response to the requested server */
    	AggregateResponse response = dataWeatherService.getResponseMapper(weatherResponseResults.get(), foreCastResponse.get());
    	
		return response;
    }
 
}
