/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiwong.kiwong.config;

import com.kiwong.kiwong.Dao.orangdao;
import com.kiwong.kiwong.DaoImpl.orangdaoimpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author kiwong
 */

@Configuration
public class DaoSpringconfig {
    
    
    @Bean
    public orangdao orangDao(){
        return new orangdaoimpl();
    }
    
    
    @Bean
    public WebMvcConfigurerAdapter corsConfigurer(){
        return new WebMvcConfigurerAdapter() {

        @Override
        public void addCorsMappings(CorsRegistry registry){
            registry.addMapping("/**").allowedMethods("GET","POST","PUT","DELETE").allowedOrigins("*").allowedHeaders("*");
        }
        
        };
    }
    
     @Bean
	    public ModelMapper modelMapper() {
	        return new ModelMapper();
	    }
    
   
}
