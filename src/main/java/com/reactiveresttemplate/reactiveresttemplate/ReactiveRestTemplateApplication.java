package com.reactiveresttemplate.reactiveresttemplate;

import io.netty.resolver.DefaultAddressResolverGroup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

@SpringBootApplication
public class ReactiveRestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveRestTemplateApplication.class, args);
	}
	@Bean

	public WebClient webClient() {
		return WebClient.builder().build();
	}

}
