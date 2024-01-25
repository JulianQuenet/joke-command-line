package com.jokes;

import com.jokes.client.JokeClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@SpringBootApplication
public class JokeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokeAppApplication.class, args);
	}

	@Bean
	JokeClient jokeClient(){
		WebClient client = WebClient.builder()
				.baseUrl("https://icanhazdadjoke.com/")
				.defaultHeader("accept", "application/json")
		        .build();

		HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(WebClientAdapter.create(client)).build();

		return factory.createClient(JokeClient.class);
	}
}
