package com.musibe.intern.karaoke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class KaraokeApplication {

    public static void main(String[] args) {
        SpringApplication.run(KaraokeApplication.class, args);
    }

}
