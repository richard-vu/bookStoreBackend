/**
 * @Nickname: Richard
 * @Email: richardvu.work@gmail.com
 * @Skype: richardvu.work@gmail.com
 * @Phone: (+84) 0935710974 - (+84) 0935810974
 * @Country: Viet Nam
 * @Year: 2021
 * @LICENSE: DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application.configurations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author mx-linux
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

  /**
   * contact - SwaggerConfig.java - Contact:
   */
  Contact contact = new Contact("Richard Vu", "https://github.com/richard-vu", "richardvu.work@gmail.com");

  /**
   * vendorExtensions - SwaggerConfig.java - List<VendorExtension>:
   */
  @SuppressWarnings("rawtypes")
  List<VendorExtension> vendorExtensions = new ArrayList<>();

  /**
   * apiInfo - SwaggerConfig.java - ApiInfo:
   */
  ApiInfo apiInfo = new ApiInfo("RESTful Web Service documentation", "This pages documents RESTful Web Service endpoints", "1.0",
  "https://github.com/richard-vu", contact, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", vendorExtensions);

  /**
   * SwaggerConfig apiDocket
   *
   * @return
   */
  @Bean
  public Docket apiDocket() {

    Docket docket = new Docket(DocumentationType.SWAGGER_2).protocols(new HashSet<>(Arrays.asList("HTTP"))).apiInfo(apiInfo).select()
    .apis(RequestHandlerSelectors.basePackage("com.richard.applicaton")).paths(PathSelectors.any()).build();

    return docket;

  }

}