package dev.autometrics.example;

import dev.autometrics.bindings.EnableAutometrics;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutometrics
public class AutometricsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutometricsExampleApplication.class, args);
	}

}
