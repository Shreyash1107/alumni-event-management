package com.alumniEvent.management.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

public class ModelMapperConfig {
    @Bean
    public ModelMapper modelMap(){
        return new ModelMapper();
    }
}
