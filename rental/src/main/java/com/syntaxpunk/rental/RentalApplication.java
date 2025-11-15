package com.syntaxpunk.rental;

import com.thoughtworks.xstream.XStream;
import org.axonframework.serialization.Serializer;
import org.axonframework.serialization.json.JacksonSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RentalApplication {

    @Bean
    public Serializer messageSerializer() {
        return JacksonSerializer.builder()
                .defaultTyping()
                .build();
    }

    @Bean
    public Serializer eventSerializer() {
        return JacksonSerializer.builder()
                .defaultTyping()
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(RentalApplication.class, args);
    }

}
