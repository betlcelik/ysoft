package com.example.ysofthr;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableSwagger2
@EnableAutoConfiguration
public class YsofthrApplication {

	public static void main(String[] args) {
		SpringApplication.run(YsofthrApplication.class, args);
	}
	
	@Bean 
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.example.ysofthr"))                                       
          .build();                                           
    }

}
