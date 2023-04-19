package net.dialecticsoftware.hrdemo;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HrDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(HrDemoApplication.class, args);
  }

  @Bean
  public OpenAPI openAPI() {
    return new OpenAPI().info(
        new Info()
            .title("Test")
            .description("Test")
            .version("1.0.0")
            .license(new License().name("Test")));
  }
}
