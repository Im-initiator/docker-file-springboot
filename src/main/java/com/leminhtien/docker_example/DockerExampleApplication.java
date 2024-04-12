package com.leminhtien.docker_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.leminhtien"})
public class DockerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerExampleApplication.class, args);
    }

}
