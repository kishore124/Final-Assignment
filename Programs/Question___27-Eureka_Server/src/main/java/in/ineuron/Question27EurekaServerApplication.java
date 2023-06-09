package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Question27EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Question27EurekaServerApplication.class, args);
	}

}
