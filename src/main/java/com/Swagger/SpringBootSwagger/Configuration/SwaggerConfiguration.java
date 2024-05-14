package com.Swagger.SpringBootSwagger.Configuration;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import com.Swagger.SpringBootSwagger.Constant;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {

	 @Bean
	 public Docket swaggerConfig() { 
			
			return new Docket(DocumentationType.SWAGGER_2)
					                           .select()
					                           .apis(RequestHandlerSelectors.basePackage(Constant.BASE_PACKAGE))
					                           .paths(PathSelectors.any())         
					                           .build()
					                           .apiInfo(new ApiInfo("Movies api", "Movies Management description",
					                        		   "v.3", "http://Swagger.com/tremsofuse", new Contact("Name", "URL", "infoSwagger.com "), 
					                        		   "OpenSource", "http://Swagger.com/license",Collections.emptyList()));
		}
	 
	
}
