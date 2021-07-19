package com.project.dabang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // timestamped 관련 필수 어노테이션
@SpringBootApplication
public class DabangApplication {

    public static void main(String[] args) {
        SpringApplication.run(DabangApplication.class, args);

    }

}
