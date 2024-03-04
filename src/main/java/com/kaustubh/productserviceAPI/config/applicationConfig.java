package com.kaustubh.productserviceAPI.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class applicationConfig {

    @Bean
    public RestTemplate createRestTemplate(){
        return new RestTemplateBuilder().build();
    }

}
