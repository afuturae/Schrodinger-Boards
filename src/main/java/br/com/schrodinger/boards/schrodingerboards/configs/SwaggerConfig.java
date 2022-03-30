package br.com.schrodinger.boards.schrodingerboards.configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI api() {
        return new OpenAPI()
                .addServersItem(new Server().url("/"))
                .info(
                        new Info()
                                .title("Schrodinger Boards API")
                                .version("1.0.0")
                                .description("Api of microservice Schrodinger Boards")
                                .termsOfService("http://swagger.io/terms/")
                                .license(new License().name("Apache 2.0").url("http://springdoc.org"))
                );
    }

}
