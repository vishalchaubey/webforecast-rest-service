package com.example.webforecast.configuraions;


import java.util.concurrent.Executor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.client.RestTemplate;
 
/**
 * @author: Vishal Choubey
 * @create: 2020-12-08 23:51
 * @description: Configuration class
 **/

@Configuration
@EnableAsync
public class RestConfiguration {
 
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
 
    @Bean
    public RestTemplate restTemplate(){
        return restTemplateBuilder.build();
    }
    
    @Bean(name = "asyncBean")
    public Executor asyncExecutor() {
    	ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
    	executor.setCorePoolSize(3);
    	executor.setMaxPoolSize(3);
    	executor.setQueueCapacity(100);
    	executor.setThreadNamePrefix("Vishal-Threads");
    	executor.initialize();
    	return executor;
    }
 }