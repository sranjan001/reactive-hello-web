package com.example.reactive.helloweb;

import com.example.reactive.helloweb.client.GreetingWebClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactiveSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactiveSampleApplication.class, args);

        GreetingWebClient gwc = new GreetingWebClient();
        System.out.println(gwc.getResult());
    }

}
