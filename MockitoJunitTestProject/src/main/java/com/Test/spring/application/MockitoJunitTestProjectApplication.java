package com.Test.spring.application;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MockitoJunitTestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockitoJunitTestProjectApplication.class, args);
	}
	
//	public Docket getDocket() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.paths(PathSelectors.ant("/*"))
//				.apis(RequestHandlerSelectors.basePackage("com.Test.spring.application.controller"))
//				.build();			
//	}

}
