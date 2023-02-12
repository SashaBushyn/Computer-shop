package com.sashabushyn.computershop;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class ComputerShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComputerShopApplication.class, args);
    }

}
