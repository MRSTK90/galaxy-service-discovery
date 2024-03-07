package kr.co.galaxy.gsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GalaxyServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalaxyServiceDiscoveryApplication.class, args);
	}

}
