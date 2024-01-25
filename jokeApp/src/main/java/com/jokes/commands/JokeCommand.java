package com.jokes.commands;

import com.jokes.client.JokeClient;
import com.jokes.model.JokeResponse;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.security.Key;

@ShellComponent
public class JokeCommand {

    private final JokeClient jokeClient;

    public JokeCommand(JokeClient jokeClient){
        this.jokeClient = jokeClient;
    }

    @ShellMethod(key="Joke", value="Will output a random joke")
    public String getRandomJoke(){
        JokeResponse random = jokeClient.random();
        return random.joke();
    }
}
