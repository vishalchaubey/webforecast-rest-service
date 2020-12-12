package com.example.webforecast.service;

import com.example.webforecast.exception.BadRequestFoundException;
import com.example.webforecast.model.AggregateResponse;
import com.example.webforecast.model.WeatherResponse;
import com.example.webforecast.model.WeatherForeCastDto.ForeCastrResponse;
import java.util.concurrent.CompletableFuture;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
 
/**
 * @author: Vishal Choubey
 * @create: 2020-12-08 23:24
 * @description: implementation class
 **/
 
@Service
public class DataWeatherServiceImpl implements DataWeatherService {
 
	/* API EndsPoint for OpenWeatherMap */
    private static final String WEATHER_URI = "http://api.openweathermap.org/data/2.5/weather?";
    
    /* API EndsPoint for OpenWeatherMap */
    private static final String FORECAST_URI = "http://dataservice.accuweather.com/forecasts/v1/daily/1day/";
    
    /* API KEY for OpenWeatherMap */
    private static final String APIKEY_ = "dd3d710d1ef6bac07baad9d0377c0011";
    
    /* API KEY for AccuWeather*/
    private static final String APIKEY= "A1Ae6P0wKCrh9Tz5BHtvSAH6FoNeFbP8";
 
    @Autowired
    public RestTemplate restTemplate;
    
    org.slf4j.Logger logs =  LoggerFactory.getLogger(DataWeatherServiceImpl.class);
 
    /**
     * Method getDataOfWeather() is to get the Weather data by city code Method Works Asynchronous.
     * @param City
     * @return
     */
    @Override
    @Async("asyncBean")
    public CompletableFuture<WeatherResponse>  getDataOfWeather(String City) {
    	logs.info("The Method getDataOfWeather started");
        String url = WEATHER_URI + "q=" + City + "&appid=" + APIKEY_;
        	WeatherResponse weatherResponse = null;
        	try {
        		weatherResponse = restTemplate.getForObject(url, WeatherResponse.class);
        	}catch (Exception e) {
				// TODO: handle exception
        		throw new BadRequestFoundException("Something Went Wrong. Please try to connect with Admin");
			}
        return CompletableFuture.completedFuture(weatherResponse);
        
	}
    
    /**
     * Method getDataOfForecast() is to get the Forecast data by city code Method Works Asynchronous.
     * @param City
     * @return
     */
	@Override
	@Async("asyncBean")
	public CompletableFuture<ForeCastrResponse> getDataOfForecast(String City) {
		// TODO Auto-generated method stub
		String url = FORECAST_URI  + City + "?apikey=" + APIKEY;
		ForeCastrResponse foreCastresponse = null;
		try {
			foreCastresponse = restTemplate.getForObject(url, ForeCastrResponse.class);
		}catch(Exception ex) {
			throw new BadRequestFoundException("Something Went Wrong. Please try to connect with Admin");
		}
		return CompletableFuture.completedFuture(foreCastresponse);
	}
	
	/**
     * Map the final Response
     * @param WeatherResponse obj1, ForeCastrResponse obj2
     * @return
     */
	@Override
	public AggregateResponse getResponseMapper(WeatherResponse obj1, ForeCastrResponse obj2) {
		// TODO Auto-generated method stub
		try {
		AggregateResponse aggregateResponse =  new AggregateResponse();
		aggregateResponse.setCityName(obj1.getName());
		aggregateResponse.setFeels_like(obj1.getMain().getFeels_like());
		aggregateResponse.setHumidity(obj1.getMain().getHumidity());
		aggregateResponse.setPressure(obj1.getMain().getPressure());
		aggregateResponse.setTemperature(obj1.getMain().getTemp());
		aggregateResponse.setTemp_max(obj1.getMain().getTemp_max());
		aggregateResponse.setTemp_min(obj1.getMain().getTemp_min());
		aggregateResponse.setForeCastCategory(obj2.getHeadline().getCategory());
		aggregateResponse.setForeCastDay(obj2.getDailyForecasts().iterator().next().getDay().getIconPhrase());
		aggregateResponse.setForeCastExpected(obj2.getHeadline().getText());
		aggregateResponse.setForeCastTemperatureUnit(obj2.getDailyForecasts().iterator().next().getTemperature().getMaximum().getUnit());
		aggregateResponse.setForeCastNight(obj2.getDailyForecasts().iterator().next().getNight().getIconPhrase());
		aggregateResponse.setForeCastDate(obj2.getHeadline().getEffectiveDate());
		aggregateResponse.setForeCastMaximumTemp(obj2.getDailyForecasts().iterator().next().getTemperature().getMaximum().getValue());
		aggregateResponse.setForeCastMinimumTemp(obj2.getDailyForecasts().iterator().next().getTemperature().getMinimum().getValue());
		aggregateResponse.setForeCastTemperatue(obj2.getDailyForecasts().iterator().next().getTemperature().getMinimum().getValue());
		return aggregateResponse;
		}catch (Exception e) {
			throw new BadRequestFoundException("Something Went Wrong. Please try to connect with Admin");
		}
	}
}
