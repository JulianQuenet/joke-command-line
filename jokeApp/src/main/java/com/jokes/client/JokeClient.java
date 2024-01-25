package com.jokes.client;

import com.jokes.model.JokeResponse;
import org.springframework.web.service.annotation.GetExchange;

public interface JokeClient {

    @GetExchange("/")
    JokeResponse random();
}
