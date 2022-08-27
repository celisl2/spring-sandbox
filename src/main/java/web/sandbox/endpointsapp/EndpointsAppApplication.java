package web.sandbox.endpointsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "web.sandbox") 
//allows for scanning outside the web.sandbox.endpointsapp package
public class EndpointsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndpointsAppApplication.class, args);

	}

}
