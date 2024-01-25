package com.jokes.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class GreetingsCommand {

    @ShellMethod(key="Hello", value = "I will say hello")
    public String hello(){
        return "Hello World!";
    }

    @ShellMethod(key="Goodbye", value = "I will say goodbye")
    public String goodbye(){
        return "Cheers World!";
    }
}
