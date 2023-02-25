package com.example.monikafs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@Controller
@RequestMapping("/forside")

public class MonikaFsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonikaFsApplication.class, args);
    }

    @GetMapping("/hej")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}
