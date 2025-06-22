package com.Ecomarket.Ecomarket.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("API - EcoMarket")
                .version("1.0")
                .description("Microservicios para la gestión de productos, usuarios y compras en EcoMarket."));
    }
}
