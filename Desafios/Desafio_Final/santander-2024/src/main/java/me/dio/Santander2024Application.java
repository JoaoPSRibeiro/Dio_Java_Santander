package me.dio;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.sun.beans.introspect.PropertyInfo.Name.description;

@OpenAPIDefinition(servers = { (@Server(url = "/"), description = "Default Server URL")})
@SpringBootApplication
public class Santander2024Application {

	public static void main(String[] args) {
		SpringApplication.run(Santander2024Application.class, args);
	}

}
