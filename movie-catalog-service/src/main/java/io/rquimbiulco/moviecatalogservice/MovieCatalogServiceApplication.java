package io.rquimbiulco.moviecatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@EnableEurekaClient
@EnableCircuitBreaker
@EnableHystrixDashboard
@SpringBootApplication
public class MovieCatalogServiceApplication {

	@Bean
	@LoadBalanced
	public WebClient.Builder getWebClient() {
		return WebClient.builder();
	}

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogServiceApplication.class, args);
	}

}
