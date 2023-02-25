package com.example.monikafs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@SpringBootApplication
@RestController
@Controller

public class MonikaFsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonikaFsApplication.class, args);
    }

    @GetMapping("/hej")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/medarbejder")
    public String medarbejder() {
        return "medarbejder";
    }



    @GetMapping("/login")
    @ResponseBody
    public String index() throws IOException {
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource("classpath:/static/login.html");
        InputStream inputStream = resource.getInputStream();
        byte[] bytes = StreamUtils.copyToByteArray(inputStream);
        String htmlContent = new String(bytes, StandardCharsets.UTF_8);
        return htmlContent;

    }
}
