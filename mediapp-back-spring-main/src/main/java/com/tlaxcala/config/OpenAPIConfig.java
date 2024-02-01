package com.tlaxcala.config;


import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenAPIConfig {

 

  @Bean
  public OpenAPI myOpenAPI() {
	  
	  public static final Contact DEFAULT_CONTACT = new Contact("Escalab", "https://www.laescala.cl","mchamorro@laescala.cl");
      public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Mediapp Api Documentation", "Mediapp Api Documentation", "1.0",
      "PREMIUM", DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0",
      new ArrayList<VendorExtension>());

      @Bean
       return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO);
      }
    
  }

}