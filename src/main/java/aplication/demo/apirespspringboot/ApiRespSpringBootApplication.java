package aplication.demo.apirespspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "aplication.demo.apirespspringboot")
@EntityScan(basePackages = "aplication.demo.apirespspringboot.model")
public class ApiRespSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRespSpringBootApplication.class, args);
	}

}
