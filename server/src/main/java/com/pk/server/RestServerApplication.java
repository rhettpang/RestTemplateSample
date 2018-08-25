package com.pk.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pangkunkun on 2018/8/25.
 */
@SpringBootApplication
@RestController
public class RestServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestServerApplication.class,args);
    }

    @GetMapping("/server")
    public String restServer(){
        System.out.println("This is rest server");
        return "success";
    }
}
