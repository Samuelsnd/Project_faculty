package com.crud.projeto.Faculdade.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {


    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Api Rest with Spring Boot")
                        .version("v1")
                        .description("Api de demonstração e aprendizado...")
                        .termsOfService("https://github.com/Samuelsnd")
                        .license(new License().name("Apache 2.0").url("https://github.com/Samuelsnd")));
    }
}
