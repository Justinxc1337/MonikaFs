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

    /* up and down both does nothing other than saying their own shit currently */
    @GetMapping("/medarbejder")
    public String medarbejder() {
        return "medarbejder";
    }


    @GetMapping("/forside")
    @ResponseBody
    public String index() throws IOException {
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource("classpath:/static/forside.html");
        InputStream inputStream = resource.getInputStream();
        byte[] bytes = StreamUtils.copyToByteArray(inputStream);
        String htmlContent = new String(bytes, StandardCharsets.UTF_8);
        return htmlContent;

    }

    @GetMapping("/?username=dennis&password=umaru")
    public String xx() {
        return "unknown statement required, file is [REDACTED]";
    }




























































































    @GetMapping("/wonder")
    public String wonder() {
        return "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⡿⠛⡏⠁⠀⠀⠀⠀⠈⠉⠑⠄⠀⠉⠑⠢⣔⠀⢱⣄⠀⠈⠲⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⡿⢹⠁⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠐⡄⠀⠀⠑⢿⣿⣷⡄⠀⠈⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⠏⡿⠁⠀⠀⠀⠘⡀⠀⠀⠀⠀⢀⢠⡀⠀⠀⢡⠐⡀⠀⠀⠀⠹⣿⣿⣆⠀⠀⢂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⠃⢼⠃⠀⣧⠀⠀⠀⢳⠀⠀⠀⠀⠀⠀⠑⢄⠀⠀⢀⢱⠀⠀⠀⠀⠈⢿⣿⡆⠀⠀⢇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⡜⢸⠀⠀⣾⡇⢀⠀⠀⢇⠀⠀⠀⠀⠀⠀⠀⠐⢀⠀⠀⢇⠀⠀⠀⠀⠹⣿⣿⠀⠀⠈⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠁⣾⠀⠀⢿⡏⠀⡄⠀⠈⡄⠀⠀⠀⠀⠈⢂⠀⠀⠐⡀⠸⠀⠀⠀⠀⠰⡟⣿⡇⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡇⠰⠀⡧⠀⠀⡟⢻⡄⠰⠀⠀⠘⡀⠀⣀⡀⠀⠀⢢⣀⠀⠈⠂⡇⠀⢀⠀⠀⡇⢸⣧⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⠀⠈⠀⡇⠀⢨⡇⠀⣧⠀⢇⠀⠀⠐⡀⠀⢠⠀⠀⠀⠠⡀⠀⠀⣿⠀⠀⠀⠀⢹⠀⠏⠀⠀⠀⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⡏⠰⠀⠀⡇⠀⢸⠁⢀⠼⡀⠈⠆⠀⠀⠐⡄⠀⠡⡀⠀⠀⠈⢦⡀⣺⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⡇⡄⢰⠀⠇⠀⢸⠊⠁⠀⠱⡀⠘⢄⠀⠀⠈⣦⡀⠰⣀⣠⣤⣖⣿⣟⣀⣀⡀⠀⢸⠶⡄⢰⠀⠀⠀⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⢠⡇⠀⠀⠠⠀⢸⠀⠀⠀⠀⢱⡀⠈⠀⣀⠠⠜⠙⠉⣽⣿⣿⣿⣿⣯⡽⠉⠃⠀⢠⠴⢌⣿⠀⠀⠀⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣟⣿⣿⢸⡇⢘⠀⢹⠀⢸⣤⣤⣤⣤⣤⣟⠋⠁⠀⠀⠀⠀⠀⠋⠈⠿⠛⠛⠛⠁⠀⠀⠀⡐⢒⡮⡷⠀⠀⠀⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣯⣿⡇⠀⠀⢸⡄⣼⣾⠛⠘⣿⣶⣿⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠀⠠⠀⠀⡇⠈⡏⢡⠀⠀⠀⢳⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢾⣿⣿⣿⣿⣿⣿⣇⠀⠀⠈⡿⢻⡟⠤⠀⠹⠟⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠀⢰⠀⠀⡷⠚⣧⠘⠀⠀⠀⢸⠧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⠏⠋⢈⣿⠀⡄⠀⢷⠈⡟⣄⠀⠀⠀⠀⠀⠀⠀⠀⠄⠀⠀⠀⠀⠀⠀⠀⢨⠀⠐⠀⠀⣇⠀⠸⠀⡀⠀⠀⢸⡌⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⠏⠀⢀⢸⣿⡀⠇⠀⠸⡀⣷⣌⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠀⡐⠀⢸⣿⠀⠀⢳⡇⠀⠀⠈⣷⢥⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⠏⠀⠀⠸⣾⣿⣇⢣⠀⠀⡇⢸⢻⣿⠦⡀⠀⠀⠀⠀⠀⠀⠀⠊⠁⠀⠀⠀⠀⣿⠀⠃⠀⣸⣿⡀⠀⠀⢷⠀⠀⠀⠟⢿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⡟⠀⠀⠀⢠⣿⣿⠙⢹⣀⠀⣿⣾⡆⢻⡄⠈⠒⠠⢀⠀⠀⠀⠀⠀⠀⠀⢀⡤⢚⡇⢠⠁⠀⣿⠄⣇⠀⠀⠘⡀⠀⣀⠼⠚⢷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⡿⠀⠀⠀⠀⣾⣿⡇⠀⡇⣿⠀⣿⢸⣿⡸⠃⠠⠀⠀⠀⡋⠑⠒⢤⣀⣀⠔⠉⠀⣾⠀⡈⠀⠀⣧⡆⠘⡄⠀⡠⠗⠝⠁⠀⡠⠾⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⠃⠀⠀⠀⣼⣿⡿⠀⢰⣇⢸⡇⢸⡤⠻⡷⠄⢀⠀⠀⠀⡇⠀⠀⣀⣿⣀⡠⠔⠊⣽⣇⠇⠀⣸⣽⣧⣀⠜⠉⣀⣰⣤⡴⠊⠀⠀⢠⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⡏⠀⠀⢀⣼⠿⠛⠁⠀⢸⣸⡄⡇⠘⣷⡀⠀⠂⠀⠈⠒⢤⣇⣠⠜⢡⢿⣿⡀⠀⢠⢟⡟⠀⠀⡇⣠⠟⠃⠀⣠⣭⡟⠉⠁⠒⢄⠀⢸⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⠁⠀⠠⠞⠀⠀⠀⠀⠀⣾⢀⠻⣷⠀⠇⠈⠒⡶⢦⡄⣀⠔⢛⡏⣰⣇⣸⡆⠰⣠⠊⣸⡇⢠⢵⣟⠀⠀⡠⣶⣿⡏⠀⠀⠀⠀⠀⢡⠀⠿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡆⠀⠀⠀⠀⠀⠀⠀⣰⡏⠸⡇⢻⠀⢰⠀⠀⣀⣶⣾⣁⢀⣮⣾⢗⣾⣿⢻⣿⣷⣴⣿⢀⠆⣸⡘⣀⠜⠀⣿⣿⣷⣤⡄⠀⠀⠀⠀⣇⠰⠘⡧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠃⠀⠀⠀⠀⠀⠀⡴⡿⠁⢀⣷⣿⡄⡯⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⡘⢰⣿⣷⣻⠀⣼⣿⣿⢾⣿⡃⠀⠀⠀⠀⢸⣀⠁⠐⡁⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⠾⠒⠛⠉⠉⠉⣼⡇⢥⣿⣿⣿⣿⠿⡿⠟⢉⣿⡟⣿⡿⣿⣿⣿⣿⡰⢠⠟⠁⠈⣿⣏⠁⣰⣿⣿⡇⢣⠄⡠⠀⠀⢨⡏⠀⠀⠸⣣⡳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠄⠒⠉⠊⠁⠀⡠⠂⡄⠤⠔⠛⢳⣼⡿⠟⢉⡠⠊⠀⠀⣾⣿⣧⠈⠻⣿⣿⣿⣧⢟⠇⠀⠀⠀⠈⢿⡭⣿⣿⣿⢸⢡⠎⠥⣑⣬⣼⣇⡀⠀⠀⠘⡍⠪⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠔⠈⢀⠔⠁⠀⠀⡠⠈⡠⠈⠀⡀⠃⢾⡿⠋⢓⡔⠁⠀⢀⠄⢰⣿⣿⠋⠀⠀⠈⢋⡹⢁⠎⠀⠀⠀⠀⠆⠈⣷⣼⣿⢇⡏⣎⢞⣱⣿⣿⣿⣿⣧⠀⠀⠀⠘⢆⠈⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠌⠀⠀⠀⠀⠀⠀⠀⠰⡠⠎⢀⡠⠊⠀⣰⠜⠓⡤⠋⠀⠀⢠⠃⠀⣾⣿⣿⠀⠀⠀⠀⢈⣠⠊⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣾⣼⣼⡿⣿⣿⡿⢟⡹⣇⢣⠀⠀⠀⠈⢆⠀⠐⢕⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢣⠀⠈⠀⠰⠊⠁⣠⣶⡗⠀⠀⠰⠁⠀⢰⣿⣿⡇⠀⠀⠀⠀⢨⡀⠀⠀⠀⠀⠀⠀⠸⠀⠀⣿⣿⣿⣿⣿⣿⢫⡛⡜⢦⡑⢿⡄⢂⠀⠀⠀⠀⢢⡀⠀⠑⠱⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠃⠀⠀⠀⠀⠀⠀⠈⠑⠠⢀⠀⢣⠀⠀⠀⠀⠀⠸⣏⠀⠀⢠⠁⠀⢀⣿⠟⠁⠀⠀⠀⠀⠀⠐⡇⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣧⣛⢦⡻⣜⡹⢢⢍⢚⣧⠀⢆⠀⠀⠀⠀⠡⠑⠀⠀⠉⠶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢽⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⢣⠀⠀⠀⠀⠀⠈⢆⠀⠀⠀⠀⠘⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠀⠐⠢⠤⢤⠂⣈⣿⣿⣿⣷⣬⣧⠳⣌⢇⣣⣮⣼⣿⡆⠈⢆⠀⠀⠀⠀⠡⡈⠢⡀⠀⠙⡦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠀⠀⠀⠀⢣⠀⠀⠀⠀⠀⠘⡦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠁⠀⡟⠉⠙⠛⢿⣿⣿⣿⣾⣾⣿⣻⠞⠃⠀⠀⠀⢢⠀⠀⠀⠀⠑⡄⠈⢀⠀⠈⢎⠢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡀⠀⠀⠀⠀⠀⠀⠀⢠⡶⠤⢠⢶⣾⠀⠀⠀⠀⠀⡰⠀⢘⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⢀⠃⠀⠀⠀⠀⠀⢠⠁⢀⡞⠁⠀⠀⠀⠀⠘⢻⣿⣿⡿⠋⠀⡀⠀⠀⠀⠀⠀⠃⠀⠀⠀⠀⠈⢄⠀⠠⡀⠀⠡⡈⠢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣷⠀⡀⠀⠀⠀⠀⢠⠓⣾⡗⡞⠈⢇⡀⠐⠒⠲⡾⣧⠀⠘⠀⠀⠀⠀⠀⠀⡠⠁⡠⠀⡜⠀⠀⠀⠀⠀⢀⣇⣴⣋⠀⠀⠀⠀⠀⠀⢀⠎⠀⠀⠀⠀⠀⢡⠀⠀⠀⠀⠀⠀⠁⠈⢄⠀⠀⠀⠂⠀⠐⢄⠀⠐⠀⠐⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⡿⠉⠢⡀⢂⠀⠀⢰⠂⠀⠀⡘⠀⠀⠀⠈⠑⠒⠚⠉⣹⡀⣀⢧⠀⠀⠀⠀⠀⢠⠎⠁⡰⠀⡠⠂⠀⠀⣰⣿⠟⠁⠀⠉⠐⠢⡀⠀⡠⠋⠀⠀⠀⠀⠀⠀⠀⡄⠀⠀⠀⠀⠀⠀⠀⠀⠢⡀⠀⠀⠡⠀⠀⠣⡀⠀⡀⠀⠑⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⠋⠀⠀⠠⠋⠘⢳⢶⠇⠀⠀⡘⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣷⣿⣞⣧⠄⠀⠀⡔⠁⢀⣴⡡⠊⠀⣀⣤⡾⠟⠁⠀⠀⠀⠀⠀⠀⡨⢶⠁⠀⠀⠀⠀⠀⠀⠀⠀⠰⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⠀⠀⠀⠑⡀⠀⠀⠄⠀⡀⠀⠀⠢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡼⠁⠀⠀⡰⠁⠀⣠⠿⣏⣀⣀⡘⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣷⣶⣶⣶⣿⣷⣶⣾⣿⠟⠉⠀⠀⠀⠀⠀⠀⠀⢀⡜⠀⠈⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⢇⠀⠀⠀⠀⠀⠀⠀⠈⢢⠈⢀⠀⠀⠈⢄⠀⠀⢀⠰⠀⠀⠀⠈⢄⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⢻⠁⠀⠀⡜⠁⠀⣰⡟⢀⡠⠜⠋⠑⢀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⢯⡻⣝⡻⣟⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⢀⠌⠀⠀⠀⢇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡀⠀⠀⠀⠀⠀⠀⠀⠀⠡⡀⠠⠀⠀⠈⠢⠀⠀⠢⣣⠀⠀⠀⠀⠡⡀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡎⠀⠇⠀⠀⡈⠀⠀⢰⣿⡶⠁⠀⠀⠀⠀⠀⠁⢆⡀⠀⠀⣀⣿⣿⣿⣿⣹⡎⣷⣉⣷⢿⣹⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠎⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠰⡀⠀⠀⠁⠀⠀⢹⡆⠀⠀⠀⠀⠸⡀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠊⠀⡜⠀⠀⡌⠀⠀⢠⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢹⣿⣿⣿⣿⣿⣿⣿⣿⣶⣻⣼⣳⣟⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⡠⠏⠀⠀⠀⠀⠀⠸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠐⡄⠀⠀⠡⠀⠀⢱⠀⠀⠀⠀⠀⠘⠄⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡔⠁⠀⢰⠁⠀⡌⠀⠀⢠⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⠿⠁⠀⠀⠀⠀⠀⠀⣀⠠⣴⠇⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠼⡀⠀⠀⠀⠀⠀⠀⠀⠀⠐⡀⠀⠈⢄⠀⠀⠱⡀⠀⡷⠀⠀⠀⠀⠀⠘⡄⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠎⠀⠀⠀⡆⠀⡄⠀⠀⠂⡞⠁⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⡿⠿⠿⠻⠟⠿⠛⠋⠉⠉⠉⢉⠟⠀⠀⠀⠀⠀⠀⣠⠂⠁⠀⡿⢧⣄⠀⠀⠀⠀⠀⠀⢱⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠱⡀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡄⠀⠀⢂⠀⠀⠘⢄⠀⠡⠀⠀⠀⠀⠀⠘⡀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠋⠀⠀⠀⢰⠀⡌⠀⢠⠇⡸⠃⠀⠹⡄⠀⠀⠀⠀⣀⠤⠔⠚⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡜⠀⠀⠀⠀⠀⠀⡰⠃⠀⠀⡘⠀⠀⠻⣷⣦⣄⠀⠀⠀⠈⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠱⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡄⠀⠀⠀⠀⠀⠀⠳⠀⠡⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⠁⠀⠀⠀⠀⢸⡜⣀⣰⠟⢲⡧⠒⠚⠉⠉⠙⠛⠋⠉⠀⠀⠲⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠀⠀⠀⠀⠀⠀⠰⠁⠀⠀⡰⠀⠀⠀⠀⠙⢿⣯⠻⢦⣀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⡀⢡⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡄⠀⠀⠑⡀⠀⠀⠁⡀⢣⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⣀⠀⣤⣤⣤⣤⣤⣀⣀⣀⣞⠀⠀⠀⠀⠀⠀⣸⠀⢋⣱⣄⠿⢷⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⢔⣿⠇⠀⠀⠀⠀⠀⠠⠃⠀⠀⣼⠁⠀⠀⠀⠀⠀⠈⢿⣞⡰⢈⠑⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢡⠀⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⡀⠀⠀⠈⠄⠀⠀⠐⡀⢣⠀⠀⠀⠀⠀⠀\n" +
                "⢸⣿⣷⢶⣮⣟⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣶⣤⣧⣴⣾⣿⣿⣷⣼⡄⠑⡄⠀⠀⠀⠀⠀⠀⠀⠀⢡⡀⠙⢧⡄⠀⠀⠀⠀⠠⢤⠾⠃⣠⠟⢹⠀⠀⠀⠀⠀⠀⠁⠀⠀⡜⠼⠀⠀⠀⠀⠀⠀⠀⠀⢿⡙⠛⠀⠂⠈⠓⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠘⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⠀⠀⠀⠘⠀⠀⠀⠘⢌⡆⠀⠀⠀⠀⠠\n" +
                "⢸⣿⣧⢫⡜⣛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⡻⣟⣿⣿⣿⣧⣶⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⢷⡀⠀⠙⠳⢄⣀⣀⣉⣡⠴⠚⠁⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠜⠀⠀⡄⠀⠀⠀⠀⠀⠀⠀⠈⢷⡈⢈⠀⠀⠀⠀⠩⠢⣀⠀⠀⠀⠀⠀⠀⠀⠀⠱⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢃⠀⠀⠀⠀⠀⠀⠀⠨⢮⡄⠀⠀⠀⠀\n" +
                "⠀⣿⣷⢫⣜⡱⢮⡱⡙⢿⣿⣿⣿⣿⣽⣿⢿⡿⣿⢾⡽⣽⣞⡽⣿⣿⣿⣿⢧⠀⠀⠀⠀⠀⠀⠀⠀⠈⣷⠀⠀⠀⠀⠈⠉⠉⠀⢀⡠⠀⠛⠁⠒⠂⠐⠀⠀⢀⣀⠌⠀⠀⠀⣇⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣤⠈⢡⠀⠀⠀⠀⠛⣖⡄⠀⠀⠀⠀⠀⠀⠀⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢆⠀⠀⠀⠀⠠⡀⠀⢻⣷⠀⠀⠀⠀\n" +
                "⠀⢸⣿⠳⣌⡓⢦⠱⣉⠖⡬⣙⠻⢿⣿⣿⣯⡿⣽⢷⣛⡶⣹⢯⣽⣻⣿⠿⢾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣇⠀⠀⠀⠀⠀⠀⠀⢼⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠐⠀⡤⠀⣼⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣹⢷⠀⠰⠀⠀⠀⠀⠀⠙⢗⢄⡀⠀⠀⠀⠀⠈⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢆⠀⠀⠀⠀⠑⡀⠀⢿⣆⠀⠀⠀\n" +
                "⠀⠀⢿⣿⡸⣜⢢⠹⣄⢋⠴⡨⡑⢎⡙⢷⣿⢿⣿⣺⠽⣷⣏⡞⡶⣿⣷⡀⠶⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⡄⠀⠀⠀⠀⠀⠀⢘⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡅⠀⠀⠇⠀⣻⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠃⠘⣧⡀⠂⠄⡀⠀⠀⠀⠀⠑⢕⢦⣄⠀⠀⠀⠸⢡⠀⠀⢀⣀⡀⢀⣀⠀⠀⠈⠀⠀⠀⠀⢠⠐⡄⠘⡘⡄⠀⠀\n" +
                "⠀⠀⠘⣿⡕⣮⡘⠵⡨⢎⠲⣡⠙⡴⢘⢢⠙⣿⣞⣿⣯⣗⣻⡼⣳⣭⣿⣿⠛⢛⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳⡀⠀⠀⠀⠀⠀⢬⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠀⠀⢸⠀⢀⣟⠀⠀⠀⠀⠀⠀⠀⠀⢠⣞⣠⢼⣿⣿⣦⣔⠠⠀⠄⠀⠀⠀⠈⢣⡙⣏⡒⠤⣄⠘⠁⠉⠀⠀⠀⠀⠀⢈⠁⢤⠀⠀⠂⠀⠀⢢⠐⡀⠁⢡⠀⠀\n" +
                "⠀⠀⠀⠹⣿⡦⣙⢣⡱⢊⠱⢄⢋⠴⡉⠦⡙⢄⠛⣷⣿⣯⣷⣻⠏⠉⢹⣿⣄⣈⣿⣧⠀⠀⠀⢀⠀⠀⠀⠀⠀⢃⠀⠀⠀⠀⠀⢚⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠀⠀⡈⠀⡌⢸⠀⠀⠀⠀⠀⠀⠀⢀⣾⣁⡄⢠⣿⠽⣏⡿⣿⣶⣤⣂⣄⡀⠀⠉⢣⣘⣻⣁⣚⣯⡦⢄⠀⠀⠀⠀⠀⠀⠑⢄⢣⠀⠐⠀⠀⠀⢆⠐⠀⠀⡇⠀\n" +
                "⠀⠀⠀⠀⢹⣿⣮⡱⢎⡱⢌⠢⢎⡒⣍⢒⡉⢦⢉⠌⢻⣟⣿⣿⢷⣖⣫⢿⣿⣿⣷⣼⣇⠀⠀⠀⠳⣄⠀⠀⠀⠈⡄⠂⡀⠀⠀⡌⠀⠀⠀⠀⠀⠀⠀⠀⠀⡆⠀⠀⠇⢰⠇⢸⠀⠀⠀⠀⠀⠀⠀⣼⠋⠏⢠⣼⣯⢟⡼⡽⢶⡹⣞⡽⣫⢟⡻⢷⣻⣿⡿⣿⣿⣿⣻⠤⢽⣦⠀⠀⠀⠀⠀⠈⣷⡆⠀⢃⠀⠀⠘⡄⠳⣴⠹⠀\n" +
                "⠀⠀⠀⠀⠀⣿⣿⣷⣙⠶⣩⢞⡴⣱⠌⢦⡙⢤⠊⢎⠀⠻⣿⣿⣿⣻⢖⡻⣿⣿⡍⠁⢹⣧⠀⠀⠀⠘⢦⡀⠀⠀⠰⡀⢡⠀⠀⠆⠀⠀⠀⠀⠀⠀⠀⠀⢰⠁⣀⡈⠀⢻⠀⡉⠀⠀⠀⠀⠀⠀⣸⠟⠸⣿⣿⣿⣛⢮⢷⣹⢳⡻⣜⣳⡝⣮⣽⡿⣻⣽⡿⠿⢋⠡⡀⠄⡈⣿⣇⠀⠀⠀⠀⠀⠸⣷⠀⠰⠀⠀⠀⠰⠀⣿⠀⡄\n" +
                "⠀⠀⠀⠀⢀⠀⠹⣿⣯⡽⣱⢎⡷⣍⡛⢧⡘⢦⡙⠤⡁⠄⢘⣿⣽⣿⣏⢷⣻⣿⣷⣄⣏⣿⣷⣄⠀⠀⠀⠙⢦⠀⠀⢱⡀⢃⠀⢢⣀⣀⣀⣀⣀⣀⠀⠀⢸⢸⣿⡷⠀⡌⠀⡇⠀⠀⠀⠀⠀⣰⢃⡠⡄⢸⣿⣷⣏⣟⢮⡝⣧⢻⡜⣧⣿⠟⣧⠿⢋⠡⡐⢂⠎⡒⣍⢒⡡⣿⣹⠖⠀⠀⠀⠀⠀⣿⡀⠀⡄⠀⠀⠀⡇⢸⠀⠁\n" +
                "⠀⠀⠀⠀⢸⠀⠀⠙⣿⣿⣧⣏⢶⢣⡝⡣⢝⡢⢕⢢⢁⠂⠀⣘⢿⣿⣿⢮⣿⢾⣿⣿⣿⣿⣌⡫⠧⣀⠀⠀⠈⢳⡀⠀⢳⡌⡄⠀⣷⠀⠀⠀⠀⠠⡀⠙⡉⠉⠉⠁⢠⠁⢰⠃⠀⠀⠀⠀⣴⣿⣽⣤⣧⣿⣿⣿⡾⣜⣻⢼⡹⢧⣿⢿⣭⠟⢡⠒⠌⡰⢁⠎⢢⠑⡜⢦⡱⣽⣽⡷⡄⢀⠠⠴⠤⣿⡇⠀⡏⠀⠀⠀⢿⠀⡂⠀\n" +
                "⠀⠀⠀⠀⢸⠀⠀⠀⠈⠻⣿⣿⣮⡳⣍⠳⣍⠶⣉⠖⡨⠐⡀⢀⠘⢻⣾⣿⣿⣻⣿⣿⣿⣿⣅⠀⠸⣿⣷⣦⣄⠀⠑⢄⠀⢻⣆⠀⡇⠀⠀⠀⠀⠀⠱⡀⢳⠀⠀⠀⡌⠀⡜⠀⠀⠀⣠⣞⠙⠓⢻⣿⣿⣿⣿⣿⣿⡱⣏⢾⣹⣿⣿⠟⢧⡜⠰⡈⢆⡑⢎⡌⢣⠚⣌⢣⡕⢾⣿⡟⠷⣆⠣⡜⡰⣿⡇⠀⡇⠀⠀⠀⠈⠃⡇⠀\n" +
                "⠀⠀⠀⠀⠸⡀⠀⠀⠀⠀⠈⠻⣿⣷⣭⣛⠴⣃⢮⡘⢅⠣⡐⣀⢦⣬⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠈⢢⣄⣱⡄⠻⣤⡇⠀⠀⠀⠀⠀⠀⢣⠀⡇⠀⢰⠀⠰⠁⣠⡤⣾⣿⡀⡟⢠⣾⣿⣿⣿⣿⣿⣿⣵⢫⣾⣿⡿⢯⠀⠈⢷⡱⡘⢤⡉⢖⡸⢡⢫⣌⠳⣜⢻⣿⣜⡳⣌⢳⡱⣹⣿⡇⠀⡇⠀⠀⠀⡀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢇⡀⠀⠀⠀⠀⠀⢈⣿⣿⣏⡞⡱⢦⡙⣤⣳⣶⣾⣿⣿⣿⣿⣿⣿⣿⣻⡷⣟⣿⣿⣿⣿⣿⣷⣄⡀⠘⣷⣬⣛⢷⣜⡇⠀⠀⠀⠀⠀⠀⠀⠃⠘⣀⠃⣀⠀⣞⢧⡀⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⠟⠀⢸⠄⠀⡈⣻⣼⢠⡙⢦⣑⣋⠶⣌⡳⢎⡳⣿⣿⣶⣭⣶⣷⣿⣿⠂⢠⡇⠀⠀⠀⠅⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠈⠣⠀⠀⠀⢀⣴⣿⣿⡟⢧⡚⡝⣦⠿⢛⠡⢾⣿⣿⣿⣿⣿⡿⣽⡾⣷⡿⣟⣷⣯⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠙⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏⠉⢰⣶⣿⣴⣁⣴⣿⣿⣿⣿⣿⣷⣿⣿⣿⣾⣿⣿⣿⠋⠀⠀⢸⡆⠀⠐⡈⢿⣷⣜⢥⠲⣌⡳⢼⡱⣏⢷⣿⣿⣿⣿⣿⣿⣿⡏⠀⢸⠁⠀⠀⡜⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⣀⣶⣿⣿⣿⢳⡝⣧⠻⣝⢢⡙⢬⡑⠸⣿⣿⣿⣿⡿⣽⣯⢿⡽⣟⣿⣽⡾⣟⣯⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡇⠀⠀⠀⠀⢀⡀⠀⠀⠀⢰⣀⣠⣿⣿⣿⣿⠿⣭⢻⣿⣿⣿⣾⢿⣿⣟⣿⣿⡿⠁⠀⠀⠀⢸⡷⠈⢄⠱⡈⢿⡿⣮⣳⠹⣜⢧⡳⣎⣿⣿⣿⣿⣿⣿⣿⠟⢀⣶⠎⠀⠀⡰⠁⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣟⡻⣜⢧⡻⡜⡽⣌⠳⡜⢢⠜⣡⠹⣿⣿⡿⣟⣷⢯⡿⣽⡿⣽⣾⣟⣿⢯⣷⣿⣻⣿⡿⣿⣿⣿⣿⣿⣧⠀⠀⣿⡀⠠⡏⠀⡏⠀⣰⣿⣿⣿⣿⣿⣯⣿⣾⣷⣿⣿⣿⣽⣿⣻⣿⣿⡟⠁⠀⠀⠀⠀⢸⣟⠈⡄⢂⠱⠌⣿⡭⢷⣟⡼⣣⠷⣹⣿⣿⣿⣿⣿⣿⣋⠔⠁⣾⠁⡠⠊⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢰⣿⣿⣟⡳⣎⢷⡹⢮⡵⣛⡴⣋⠷⣙⢬⠚⣄⢃⢻⣿⣿⣿⢯⣿⣽⣳⢿⣻⣾⣽⣯⣿⢿⣾⣟⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⢻⣧⠀⣧⣰⣷⣾⣿⣿⣿⠿⠿⠟⠻⠻⣿⣿⣿⣿⣿⣟⣾⣿⣿⠟⠀⠀⠀⠀⠀⠀⢘⡧⢈⠐⠌⢢⠱⣈⠷⣉⢟⣷⣧⣻⣿⣿⣿⣿⣿⠟⠋⠁⠀⣰⠟⠈⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠸⣿⣗⢮⡳⣝⢮⣝⡳⢮⢵⡚⣥⡛⡜⢮⡱⢌⢎⠦⣹⣿⣿⣿⣻⣾⡽⣯⢷⣻⡾⣷⣻⣿⣻⣾⣿⣿⣿⣟⣿⣿⣿⣿⣿⣷⣾⣿⡿⠟⠛⠋⠉⠁⠀⠀⠀⠀⠀⠀⠀⠽⣶⣽⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⢸⡐⠀⠡⠈⡅⢒⡡⢎⠵⣊⠶⣹⢿⣿⣿⣿⣿⣅⠀⠀⠀⢠⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⢸⣿⣞⡷⣼⡺⣜⡳⣆⢦⢳⣄⢳⠳⣄⠧⡜⡜⢤⢃⣼⢿⣿⣿⣿⢧⣟⡾⣧⡷⣿⣻⣼⢿⣧⢿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⣿⣿⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⡇⢀⠀⠠⡐⠢⣄⠚⡤⣛⠴⣣⡜⣧⢟⡿⣿⣿⡄⠀⢀⠞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣷⣟⡷⣽⢮⡝⡶⣊⣏⡗⣎⡳⣍⠞⣬⠓⣤⢛⣿⣿⣿⣿⣾⣽⣳⣟⡷⣯⣟⡿⣞⣿⣟⣿⣿⣿⣾⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⡐⢠⣿⣷⠀⢆⡡⢘⡱⢄⠫⣔⡩⢞⣥⢻⡜⣯⣟⣿⣿⣿⣖⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣟⣾⣽⡳⣝⡶⣹⣎⡷⣎⢿⡰⣏⠶⣩⣾⣧⠈⠛⠾⣿⣿⢾⣽⣷⣞⣽⣻⢾⣟⣯⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⢀⠄⠒⠈⠀⠁⣈⡁⠐⠠⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⠀⣾⣟⣿⡘⢤⠒⡥⢚⣌⠳⡴⣙⢎⡶⣫⣞⣷⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠿⣿⣾⣿⣯⣿⣷⣿⣽⣯⣿⣷⣯⣿⣿⣿⣿⡀⠀⠀⠀⠈⠙⠻⠾⢿⣿⣛⣿⣿⣿⣿⣿⠿⠿⠛⠉⢹⡇⠀⢀⢜⡡⠒⠁⠀⠀⠀⠀⠀⠈⠐⠤⡈⠢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡜⠁⣸⣿⡾⣿⣧⢮⣙⢶⣩⢖⡹⣖⡽⣎⣷⣟⣾⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠉⠁⠀⠀⠀⣸⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⣠⡿⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠂⠌⢢⠀⠀⠀⠀⠀⠀⠀⠜⠀⣰⣿⣿⣽⣿⣿⣮⡽⣞⣧⣿⣽⣷⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣷⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠡⡀⠀⠀⠀⡠⠊⠀⣰⣿⣿⣿⣿⣿⡿⠙⠛⠿⢿⣿⣿⣿⣿⣿⣿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⢿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢆⠀⠈⠀⠀⣰⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⢛⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡄⠀⠀⡴⠿⠛⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⣇⡠⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣾⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠉⠒⠄⣀⡀⠀⠀⢀⣀⣀⠠⠔⢛⡩⢻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⡾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡰⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
    }

    @GetMapping("/gasper")
    public String gasper() {
        return "⠀⠸⡘⢄⠓⠖⡊⠑⠠⠔⠀⠆⣴⢩⣎⠀⠀⣿⠀⠀⠓⠐⠃⢘⠔⡵⣷⡀⢸⢢⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣯⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⣿⣿⣿⡟⢷⣌⣿⣿⣿⣿⡏⣔⣳⡯⣿⣿⣴⣿⣿⣆⠙⠔⠉⠐⢒⢺⣴⠋⡏⢂⣰⡀⠈⡆⣒⠒⣩⡋⢼⢌⡑⠀⡀\n" +
                "⠀⠀⠈⡄⡥⡀⠸⠑⢀⠀⡠⠊⢠⡇⢙⠂⠠⡗⣶⡜⠒⢄⢠⠂⡠⢇⡹⡡⢺⣽⡿⣅⠹⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢿⣿⡻⣿⣻⣿⣿⣿⣁⣴⢟⡻⠻⣯⣌⣿⣿⣿⣿⣿⣿⣿⢳⢭⣿⣿⣿⣿⡳⢌⠱⡀⠀⠔⠁⣼⡇⢀⠇⡯⣏⠺⢆⠱⣀⠜⢁⠇⢸⠼⡘⡢⠁\n" +
                "⠀⠀⣸⢸⣧⠈⠄⠃⣀⣈⡲⠒⠁⡱⠐⠆⢰⡇⠑⠪⢕⣈⠄⠉⢀⠔⢫⠆⣾⡿⢷⣮⣥⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠯⠝⠛⠉⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠻⣏⣀⣙⡄⢿⣿⣿⣿⣿⣿⣿⣿⢟⡬⣯⢛⠻⢿⣧⠃⢼⣷⠉⠘⠒⠒⢋⡔⠁⢦⡅⠸⠂⠤⠂⠈⠠⠊⡠⢺⣣⣅⡪⡏\n" +
                "⠀⠀⡿⡀⢏⠶⡚⠀⠀⠀⠀⠰⣅⢤⡪⡔⢹⠙⣽⡕⢄⠀⠀⢀⠳⢒⣷⣿⣿⢱⡂⠜⣿⣿⣿⣿⣿⣿⣿⡿⢛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⡿⡱⠟⢀⡇⠸⣶⣿⣿⠶⣋⠹⡇⠀⠀⡔⠁⡇⠀⣹⡈⠢⠆⠈⠢⡀⠀⡰⢁⢼⡈⡓⢢⣇\n" +
                "⠀⠀⡇⡑⠺⡣⠊⠢⠀⠀⠀⠛⢺⠋⡔⠀⢸⡢⠏⠉⠈⠀⠀⠈⢩⣣⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⠏⡰⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢻⣿⣭⡽⠟⠫⠅⣿⡿⢶⣿⠿⣻⣿⣿⣿⣿⣶⣅⣵⠀⡎⢀⠐⢀⢔⢼⡀⢑⣄⠁⠒⡡⠁⡇⡌⢸⠸⡑⢄⢶\n" +
                "⠀⠀⣧⠈⡠⢈⠁⠈⠀⠀⠀⠀⠉⠉⢀⠄⢸⠢⡑⢠⠤⡀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣉⠻⣿⣿⣿⣿⢏⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢤⠢⣀⣀⠤⢞⢟⣟⣒⣣⠼⡯⡟⢻⡥⡒⠘⣿⣿⡆⠀⡡⠐⡼⡁⠸⣔⢌⢞⡌⠢⡃⠘⡜⣡⢸⣀⢃⠆⢹\n" +
                "⠀⠀⣧⠓⡰⡅⡑⠂⡀⠀⠀⠀⢀⠔⢉⢀⡜⠀⠏⠢⡑⠘⠀⠀⢠⠋⣴⡿⡿⣿⡔⠻⣿⣿⣿⣿⣏⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⡀⣆⣐⣥⣴⣾⣿⣿⣿⣶⠊⣼⣀⣸⣧⣿⣿⣿⣽⣷⢎⣀⡜⠄⡇⢸⢯⢇⠙⢦⠁⢨⠒⡁⠆⢸⢾⣎⠑⡋\n" +
                "⠀⠀⣟⡌⠈⠾⣔⠀⠈⢢⠀⠀⠘⠒⠨⢃⢇⠁⡌⠒⠚⠀⠀⣠⣿⣾⡟⣤⣇⠘⣿⣷⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠄⢻⣿⣿⣿⣿⣿⣿⣽⣻⣿⣿⣿⣿⢿⡍⢻⣿⣿⡇⠀⡇⠸⠀⢼⡄⠙⢧⡀⢓⢇⢀⠗⡓⡹⣇⢷⠓⣔\n" +
                "⠀⠀⣻⠈⠢⢀⠈⡖⠀⠂⠀⠀⠀⠀⠁⠁⠈⠢⠅⠀⠀⠀⣰⠏⣾⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⠃⠀⣀⠠⠤⠐⠒⠒⠓⠒⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠐⠒⠒⠒⠤⠤⣀⠀⠘⣿⣿⣿⣿⣿⣿⣷⡟⢰⡿⠻⣟⡚⠻⣷⣿⣿⣿⠀⣧⣓⢥⢺⢰⣂⠄⡈⠈⠀⢀⢎⡽⡄⣇⣮⠀⢣\n" +
                "⠀⠀⢩⡞⠂⠄⡈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠃⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠔⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⢿⣿⣿⣿⣿⣿⢙⢲⡞⢀⡄⠈⡗⣲⣾⣿⣿⡟⠁⣰⢁⡜⢸⠈⢞⠠⠈⢢⠰⠥⢼⢣⢳⡇⠀⢸⡐\n" +
                "⠀⠀⡁⠸⡀⠀⠈⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠃⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣷⠈⢞⡷⣻⡏⢦⠗⣿⣿⣿⣿⣷⣾⠈⠁⠀⢸⡀⠀⠑⠂⠡⠀⢀⡬⣜⢜⣅⠀⠂⡐\n" +
                "⠀⠀⠥⠀⠈⠁⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠇⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⣀⣀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣾⣿⣷⣯⣼⣿⣿⣿⣿⣿⣿⣿⡄⠀⢠⢚⡴⡀⠈⠢⠀⠁⠂⢔⡋⠂⣇⠑⣐⡀\n" +
                "⠀⠀⠠⠥⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡎⠀⠀⣯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⡀⠀⣎⣁⣤⣼⣖⣶⣦⣬⣑⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠖⣈⣭⣤⣴⣮⣭⣴⡦⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣟⠿⣿⣿⣿⡇⠀⡆⢨⡇⠈⡄⠀⠀⠀⠁⢉⠔⢲⢾⠠⠱⡂\n" +
                "⠀⠀⠈⠀⢰⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⢧⣤⣾⡿⣿⣿⣿⣿⣯⣽⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣾⢿⣿⣿⣿⣿⣙⣿⣿⣿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡱⣎⡟⣿⣿⣿⣿⠀⠒⡝⣹⣀⠇⠀⠀⠀⠀⠢⠄⢆⣸⠀⢃⠂\n" +
                "⠀⠀⠀⠣⠸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠇⠀⠀⢸⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡠⣾⣿⠟⠀⣿⣿⠛⢽⣿⡿⢿⣿⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠋⠧⣾⣿⡟⠻⣿⣿⢿⣿⡟⣿⣿⣿⣿⡿⠿⣿⣿⣿⣿⣿⣿⣿⣾⣾⣿⣿⣿⣿⣧⠀⡇⠀⡇⠀⠀⠀⠀⠀⢀⡠⠐⢹⠢⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠙⠆⠀⠙⡘⠢⡘⠿⢃⡞⡾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣫⠳⡙⢿⠃⡚⣻⢻⣿⣿⣿⣿⠴⠐⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣧⠈⠤⠁⠀⠀⠀⠀⢄⠕⡡⡎⠸⠀⡕⠄\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⢺⡄⠀⠀⢢⡀⠙⠢⢀⣀⠡⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⠦⣄⣀⣁⠮⠃⣸⣏⣺⣿⣿⠹⡎⣇⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠘⣧⠀⠀⠀⠀⠀⠀⠀⠎⠠⢡⠒⡗⠝⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⡇⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠣⣷⠀⠀⠉⠙⠛⠦⠲⠒⠂⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠒⠲⠦⠴⠶⠶⠊⣿⠇⣼⣿⣿⡩⢛⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠹⣧⠀⠀⠀⠀⠀⠀⠀⠀⣇⠝⠀⠚⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡘⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⠀⣿⣿⡏⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢞⣿⣿⠀⠹⣷⡀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡇⠀⠀⣼⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⡀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡟⠀⣿⣿⣧⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣧⠀⠘⣷⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⡀⣸⣿⡿⣼⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⠡⠞⠉⠉⠉⠹⢩⠿⠽⠯⠍⠉⠀⠀⠀⠀⠀⠐⠒⠐⠒⡖⢩⡶⠒⠒⠤⠤⢤⢤⣤⣾⡇⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠈⢿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣳⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⢸⠀⠀⠀⢀⡇⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠁⡎⠀⠀⠀⠀⠀⠎⣾⣿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠻⣧⡀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⢤⣄⣁⣈⣇⣧⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⡇⠀⠄⠠⢀⢸⢱⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀⠀⠘⢿⣄⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣾⣿⣏⣟⣿⣯⣟⣿⣟⣿⡹⢏⢯⡝⣭⣫⡝⡴⢸⢰⡧⠼⣜⣲⢣⢾⣾⡏⣽⡟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠈⢻⣆⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣿⣿⣾⡿⣟⣿⣿⣯⣉⠉⠉⠛⠛⠛⠛⠓⠓⠚⠒⠛⠾⠗⠛⠚⢓⠿⣿⣿⣷⢟⣭⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠹⣧⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⢯⡔⣓⣦⣠⢄⠀⠀⠀⠀⠀⠀⠀⣠⣴⠴⡚⢡⢢⣿⠼⠃⢎⣿⣿⣿⣿⡧⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠹⣧⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣧⡿⣏⣾⠮⣕⣭⣆⣄⣤⡠⠶⡋⡕⢠⢂⡑⢂⣿⠎⡐⢈⣾⣿⣿⣿⣿⣳⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⢹⣧⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⣾⣿⣿⣿⣿⠿⢋⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⢭⡞⡵⣋⡿⣙⠶⣣⢿⣿⠁⠦⡑⠒⡌⢂⠆⣌⣿⠃⡐⠄⢳⣿⣿⣿⣿⣯⢖⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⣿⣇⠀\n" +
                "⠀⠀⠀⠀⠀⠀⢀⣴⣽⣾⣿⣿⣿⠟⠁⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢮⡿⡜⡵⣣⡇⠿⣭⢳⣻⡘⢏⠢⢍⡱⠨⠜⣰⡾⠃⠤⠑⣈⣿⣿⣿⣿⣿⢏⣞⡼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠀⠀⢹⣿⡀\n" +
                "⠀⠀⠀⠀⣠⣺⣿⣿⣿⣿⡿⠋⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣫⢟⠶⣹⠵⣳⣏⠇⠛⣧⣿⡇⢎⡱⢊⠴⡉⢮⡟⢠⠑⠌⢢⢸⣿⣿⣿⣿⣿⢏⡽⣞⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⢸⣿⡇\n" +
                "⠀⠀⡠⣪⣾⣿⣿⣿⡟⠁⠀⠀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣣⢏⡻⣴⣛⣴⣻⠎⡡⠌⢣⢿⠦⡑⢪⠖⣫⠟⢠⠃⢌⡘⢠⣿⣿⣿⣿⣿⡟⣎⠶⣹⡞⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣧⣾⣿⡇\n" +
                "⢀⢌⣲⣿⣿⣿⡿⠋⠀⠀⣠⣾⣿⣿⣿⣿⣿⣟⣾⣿⣟⣾⣿⣿⢿⣽⣾⣿⣿⢯⣿⣿⣹⣿⣿⣿⣿⣿⣿⡹⢭⠯⣝⣭⠷⡾⣟⡧⠐⠨⠌⢫⣗⡡⢃⡾⠅⢃⠢⠈⠄⡂⣿⡏⢾⣿⣿⢿⡿⢼⠟⠁⢳⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇";
    }

    @GetMapping("/hechmann")
    public String hechmann() {
        return "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⡄⡽⠀⢰⣿⡟⠉⢀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣷⠇⢠⠋⢹⠃⣰⠏⠀⠀⠀⢀⠄⢀⡤⠀⠀⠀⠠⢈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡞⠀⠠⠈⢀⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠂⢬⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣟⡟⣠⠃⢠⣏⡼⠁⠀⠀⠀⡠⠊⢠⠏⠀⢀⠐⠈⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡇⠀⠐⡄⠂⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⢀⠀⣟⡲⢀⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣟⣾⣷⣿⣇⣻⠏⠀⠀⠀⣠⠞⢀⡴⠃⠀⠄⠂⢄⠁⠀⡀⠌⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠂⡌⢱⡈⠄⠀⠀⠀⠀⠀⠀⡀⠁⠠⠀⢘⣯⣇⠧⡐⠈⢀⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠈⠀⠀⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⡐⡈⠄⢢⠐⠠⡐⣀⢂⡐⣀⠂⡄⢸⣿⣿⣻⢼⣿⣹⡟⠁⠀⠀⠀⡴⢁⡴⠋⠀⢠⠘⡠⡉⠄⡀⢂⠀⢰⠂⠀⠀⠀⠀⠀⠀⠀⠠⠈⢸⡇⠀⠘⣄⠣⠆⠄⠀⠀⠀⠀⠀⢀⠀⠐⠀⡐⢨⣿⢮⡱⢌⡂⠄⡀⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⡀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⢆⡑⡊⢤⠃⡅⠒⡄⢢⠐⡄⢊⠔⣹⣿⢷⣫⡟⣷⠋⠀⠀⠀⢀⡞⣁⠋⡀⡐⢌⠢⣡⠃⡐⠠⡐⠠⢪⠏⠀⠀⠀⠀⠀⠀⠀⠠⠐⢀⢺⡅⠀⠒⣌⢣⡝⡀⠀⠀⠀⠀⠀⡀⠠⠈⢀⠠⠀⣿⣟⣆⠣⠜⡐⠠⠀⠐⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⢢⠐⡡⢢⠑⡈⠱⢈⠆⠱⡈⢆⢺⣿⡿⣏⡷⡽⠃⠀⠀⠀⢠⡟⡄⡁⢆⠰⣡⢊⡕⠠⢂⠔⡡⢌⢱⡏⠀⠀⠀⠀⠀⠀⠀⠈⠀⢄⢪⣽⠂⠀⠒⣌⡳⢆⡅⠀⠀⠀⠀⠀⠀⠄⠐⠀⠠⠀⢿⣿⣎⡱⠊⡌⠱⣀⠁⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠀⠠⠐⠀⠀⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⢂⠱⢀⠣⢀⠁⡃⠌⡐⢡⠘⢤⣿⣻⢿⣱⡟⠁⠀⠀⠀⣰⢏⡔⢠⡑⢪⡑⢦⠃⡔⢡⢊⠰⡐⢌⡾⠀⠀⠀⠂⠀⠀⠀⠀⡁⠤⣌⠷⣾⠁⠠⠑⣬⣛⡎⡄⠀⢀⠀⠀⠈⢀⠐⠈⡀⠁⠄⣺⣿⣷⣡⠃⡌⠱⣀⠣⢀⠂⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀⠀⠄⠂⠀⠀⠐⠀⠀⠐⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⢂⠐⠂⡐⠂⠁⠄⠂⠐⠠⡘⣼⣿⣯⢯⠟⠀⠀⠀⠀⣼⢣⡞⡨⢆⡙⢦⡙⠦⡉⢆⠡⢊⠔⡡⣾⠁⠀⠀⠁⠀⠀⡀⠀⢁⠀⣴⢫⡟⣿⠀⠠⡙⣴⢫⡜⡔⠀⠀⠀⠀⠠⠀⢀⠂⢀⠡⠐⣼⣿⡷⣭⢓⡈⡁⢆⡑⠢⢌⠐⠀⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠀⠀⠠⠀⠀⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠌⠀⠐⠀⠀⠀⠀⠁⡐⢰⣿⣿⣽⠋⠀⠀⠀⠐⣼⣣⢏⠲⣑⢎⡝⢦⡉⢆⠱⡈⢆⢡⢊⣱⠇⠀⠀⠁⠀⠂⠁⠀⠐⠀⡼⣎⠷⣽⣿⠀⠠⢓⡭⣷⡹⢄⠀⠂⠀⠀⠀⠀⠂⢀⠂⢀⢣⣾⠿⣿⡽⣎⡔⠡⠠⠌⡱⢈⠆⡡⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠀⠀⠀⠀⠀⠀⠀⡀⠄⠂⠀⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⡐⣿⡿⣾⠃⠀⢀⠠⢁⣾⢳⣋⢬⠳⣩⠞⡼⢡⡘⢌⠢⡑⡈⢆⢢⡏⠀⡀⠁⠀⠂⢀⠂⠁⢠⣙⢾⣩⣟⣿⣿⠄⢢⡙⣞⣷⡹⢆⠠⠀⢀⠀⠀⠀⠀⠄⢀⠢⢜⣿⠠⢻⣿⡷⣎⠱⡀⠆⢡⠊⠴⡁⢆⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠐⠀⠈⠀⠄⠀⠀⠀⠐⠀⡀⠂⠈⢀⠀⠈⢀⠀⠐⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠠⢼⣿⣿⠃⠀⠀⡀⣠⣿⣳⢏⠲⣌⠳⣥⠻⡜⣡⠰⢈⠆⡑⠌⡄⣿⠀⣰⠁⠀⠂⠠⠀⠠⠘⣤⢻⡬⢷⣿⢃⣿⡃⠤⣙⢮⣷⡻⢬⠄⠀⠠⠀⠠⠐⠈⠀⠄⡘⢼⡇⡃⠆⠻⣿⣏⣳⡐⠌⡠⢉⠆⡱⢌⠢⠀⠄⠀⠀⠀⠀⠀⠀⠀⠄⠀⡀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠠⠀⠐⠀⡀⠄⢁⠠⠀⠂⠀⠁⠀⠂⠀⠄⠁⡀⠀⠂⠀⠀⠄⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⡿⠁⠀⠀⠄⣰⣿⣱⠫⣜⠳⣬⡛⢶⡙⡰⢂⠜⢠⠊⡔⢡⢸⠇⢰⢃⠠⠈⢀⠐⠈⠤⣙⢮⡳⣝⣿⡃⠇⣿⡅⢒⠽⣎⣷⣻⣃⠎⠐⠀⡐⠀⠄⢈⠀⢂⡘⢾⡇⡘⢀⠁⠺⣿⣧⡙⡤⢑⠠⡘⡐⢎⢡⠃⠄⠂⢀⠀⠠⠐⠀⠠⠀⠂⠀⠄⠁⡀⠂⠀⠄⠁⡀⠂⠀⢁⠠⠐⠀⢂⠀⠢⢀⢂⠡⠐⠈⢀⠠⠁⠈⠀⠄⠀⠐⠀⠈⠀⡀⠄\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⣸⡿⠁⠀⠄⠁⣸⣿⢳⣣⢛⡴⣛⡴⣛⠦⢡⠑⡌⡘⣀⠣⠘⡄⡿⢠⠏⢄⠂⡁⢂⠐⡈⢶⣭⢳⢯⣿⠓⡐⠌⣾⡇⣌⢻⡼⣳⢧⡏⢞⠠⠀⠀⠄⠂⢀⠐⠠⣘⣻⣧⠂⠄⠈⠄⢹⣿⣷⡜⣠⠃⡔⢡⠊⢆⡍⡒⠠⠀⢀⠀⠀⠐⠀⡐⠀⠁⢂⠡⡀⠄⡁⢀⠂⠀⠄⠁⠠⠀⡐⠈⢀⠠⢡⠩⡌⢆⡱⢈⠀⠄⠀⠌⠀⡐⠈⠀⠀⠂⠁⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢠⣿⠁⠀⠄⠀⣲⣿⢳⣏⣖⢫⠖⣧⢳⠡⠎⡄⠣⢄⠱⢠⢁⠣⣼⠃⡾⢁⠎⠤⢑⢂⡘⢬⠷⣎⣯⡿⡍⠐⢀⡼⢻⡇⡜⣣⢟⣽⣏⡾⣡⠎⠀⠁⠠⠐⠀⠂⢁⠦⣿⡙⢂⠀⠈⠐⠀⠸⣿⣿⣄⠣⠌⡂⢍⢂⠖⡉⢆⠡⠀⠠⠈⠀⠐⠀⠠⠁⢌⢢⡑⠬⣐⠢⢌⠒⡈⠄⠡⠀⠄⡈⠄⡒⢠⠓⡜⣬⠢⡅⡌⠂⠄⠐⢀⠠⠀⠁⠠⠀⠁⡐⠀\n" +
                "⠀⠀⠀⠀⠀⠀⢠⣻⠃⠀⠠⠀⢢⢿⣿⣛⢶⢪⣏⠿⣜⠣⣑⢊⠔⡡⢊⠔⡡⢌⠒⡯⢰⢃⠎⡜⢢⠃⡖⢬⣻⣝⣳⡿⠁⠀⠁⡞⠁⢸⡗⣸⢱⣏⣿⠾⣵⢣⢎⠠⠁⢀⠐⠈⡀⢌⡺⣿⠁⠎⢲⡀⠀⠀⠀⠹⣿⣿⣦⢃⠜⡠⢊⠴⣉⠬⡑⡌⡀⠐⠈⢀⠈⢀⠐⢠⢢⡙⢦⡑⢎⢆⡣⢜⡨⠑⡌⢢⠐⡡⢘⢢⡙⢼⡰⢳⡜⣤⢉⡒⠀⠠⠀⠠⠁⢀⠀⠂⠠⠀\n" +
                "⠀⠀⠀⠀⠀⠀⣾⠃⠀⠠⠀⢠⣿⢯⣟⡼⢎⡷⣎⠿⢤⡓⡌⢆⠚⡄⢣⠘⡰⢈⢼⣇⢏⠂⠧⡘⢤⢋⡜⣷⣻⣼⡟⠁⠀⠁⠀⠀⠀⠘⣇⢲⡹⣎⣿⢿⣭⡓⣎⠄⡐⠀⡀⠂⠀⢬⣱⣿⠀⠂⠀⠳⡀⠀⠀⠀⠈⢿⣿⣷⡨⡐⢡⠒⡌⠲⡑⠤⢃⡐⠀⡀⠀⠂⡈⠔⢢⡙⢦⡙⢎⡖⣙⠦⢣⡝⡰⢃⠎⡑⢎⠦⣙⠦⣝⢧⡻⣴⢣⡜⠤⠁⡀⠁⠠⠀⠠⠀⠡⠀\n" +
                "⠀⠀⠀⠀⠀⢠⠏⠀⣀⠒⡴⣿⣿⡟⣧⢻⡝⣾⣙⢮⢳⡘⡜⣌⠳⣌⢣⡘⡔⣉⣾⠘⡄⡋⠦⢱⡈⠶⣸⣏⢷⣿⣴⣼⣤⣦⣄⣀⡀⠀⣧⢎⡵⣏⣿⣻⠶⣽⡘⢆⠀⡐⠀⠠⠁⢢⡳⣿⠀⠀⠀⠀⠱⡄⠀⠀⠀⠀⠹⣿⣷⣑⠢⠡⢌⠡⢍⠒⡡⢆⠡⠀⠄⠁⡐⡈⢆⡙⢦⡘⠥⡎⢥⣋⢧⡚⢵⡩⢎⡱⢪⡜⣥⠻⣬⢳⡝⣮⡗⡾⣡⠃⠀⠄⠁⠐⠀⡁⠂⠄\n" +
                "⠀⠀⠀⠀⢠⠟⠀⠀⢦⡙⣼⡿⣿⡹⣎⢷⣛⡶⣹⢎⢧⢳⡱⢎⡱⢆⠧⡜⣰⢱⡇⡋⢔⠡⢎⡡⢜⣹⢳⢮⡿⠆⠀⢀⠄⠈⠉⠙⠻⢶⣿⢸⢲⡭⣿⣽⣛⡶⣙⠆⢂⠀⠄⠁⢈⠶⣹⣿⠀⠀⠀⠀⠀⠘⢄⠀⠀⠀⠀⠨⣿⣷⣭⠒⡌⠰⢈⠜⡰⢈⠎⡡⠀⠂⠐⠈⠤⣙⢢⡙⠲⣍⠲⡱⢆⡛⢦⡙⢶⡙⢶⡘⢶⡹⢖⣫⢞⡵⣫⣗⢧⣋⡄⠐⠈⢀⠐⡀⠂⠀\n" +
                "⠀⠀⠀⠀⡞⠀⠠⢍⢦⣹⣿⣻⣯⠷⣽⡞⣽⢺⡵⣫⢞⣥⢛⣬⠳⣭⢲⡙⣤⣻⠰⡑⢌⠎⡔⡱⢪⢧⣫⡿⠄⠀⢀⠊⠀⠀⠀⠀⠀⠀⢻⣇⢻⡜⣿⡷⣏⢾⡍⡞⠠⠀⠠⠈⠐⣎⢳⡯⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣷⣘⠰⠈⠤⠑⡌⢒⠡⡑⠄⠁⡈⠔⡠⢇⡚⠵⣈⠳⣍⢎⡝⢦⣙⠶⣙⢮⡙⣧⠹⡮⢵⢎⣳⢳⡞⣯⢶⡘⡄⠐⠀⡀⠔⠀⡁\n" +
                "⠀⠀⠀⡾⠁⡨⣑⢎⡞⣽⣿⣟⣮⢟⣧⣟⢧⡻⣜⢧⣛⢦⣛⠶⣛⡴⣣⡝⢦⣿⠠⡑⢊⠜⡰⣱⢏⣮⡟⠀⠀⡴⠋⠀⠀⠀⠀⠀⠀⠀⢸⢯⠜⡽⣿⣿⡽⣞⡹⢬⡁⠂⠁⠀⠌⣜⣣⡗⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⣿⣷⢣⠍⡠⠑⡈⢆⠱⡘⠤⢃⠀⠄⠱⢌⢎⡱⢅⠳⣌⡚⡬⢓⡬⢳⠩⡖⢭⢲⡹⣱⢋⡮⢇⡟⣼⣛⣮⢷⣘⠀⠠⠀⢘⡀⠀\n" +
                "⠀⠀⣸⠁⠰⡱⣌⡾⣹⣿⣿⡽⢮⣟⠾⣜⢯⡳⡝⣮⢝⣎⢧⡻⣥⢻⡱⣎⢧⡏⢆⢡⢉⠲⣡⠟⣼⡞⠀⠀⠘⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡏⡞⣽⣻⣿⣿⢵⣫⠳⡄⠐⠈⠀⠰⣘⠶⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣯⠞⡤⠡⠐⡈⠆⠱⡈⠆⠤⠈⡐⢌⠦⡱⣊⠕⢦⠱⣙⠼⣘⠥⡛⡜⣬⢃⠶⣡⢏⡼⣙⢎⣧⢻⣼⢻⣜⡣⢀⠐⠀⡆⠀\n" +
                "⠀⣰⠃⡔⣣⢳⢬⣷⣿⣿⢷⣻⣟⢾⡹⣎⢷⡹⣝⠶⣫⡜⣮⢳⢭⡳⡝⣜⣺⡇⢌⠢⢌⠳⣼⢻⣼⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠸⣥⢻⡇⣿⢧⣏⠷⣘⠀⢀⠈⢠⢙⡞⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢀⢀⣤⣿⣿⣼⠡⡅⡐⠈⠥⡘⢌⠒⡡⠀⠎⡰⢥⢃⠞⣌⢣⡍⢲⢍⡚⠵⣘⠦⣙⡚⡴⢎⠶⣙⠮⣖⢫⡞⣟⡾⣵⠂⠀⡀⠥⠀\n" +
                "⢰⠇⡸⢼⡱⣯⣿⣻⣿⣯⣟⣳⡾⣿⢱⡏⢾⡱⣏⢾⡱⣞⡱⣏⢾⣱⡛⣬⣿⠐⢌⢢⢭⢾⣏⣿⢃⣤⣴⣶⣶⣤⣤⣀⡀⠀⠀⠀⢀⡀⠀⢸⡕⣮⢻⡇⢸⡷⣎⢟⡬⢀⠀⠀⢠⠓⣼⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣨⠿⡏⠁⠀⠘⢿⣷⡱⣌⢂⠑⠰⡈⢆⡑⢂⠄⠓⣌⢎⡹⢤⠣⡜⡡⠞⡌⣇⢓⠮⡱⡜⡸⣍⠞⣥⢛⣬⢳⠼⣭⣟⡷⣇⠀⠀⠱⢀\n" +
                "⠏⡰⣙⣶⠿⣧⢿⣿⣟⡷⣾⣿⣽⢧⣋⡞⣧⢻⡜⣧⢻⡜⣧⢏⡷⣣⢟⡴⣏⠌⣢⢳⢮⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣄⠀⠈⠻⣾⣷⢌⢯⣟⠀⣿⣝⣺⡜⡤⠀⠀⠠⢙⠼⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠙⠻⣷⡜⢦⡁⠆⡑⠤⡘⢂⢆⠐⡈⢦⡙⢦⠳⣌⠱⣉⠖⡬⢊⡵⡑⢮⢱⢊⡝⢦⢋⠶⣩⠞⡵⣾⣽⣻⡄⠀⠸⢠\n" +
                "⡰⣵⡟⠁⢸⣳⣿⣿⢯⣿⣿⡷⣿⢢⡝⣾⡱⣏⢾⡱⣏⢾⡱⣏⢷⡹⣎⢞⣧⠚⣼⣣⣿⣿⣿⣿⣿⠿⠛⠛⠙⣛⣻⣿⣿⣿⣿⣿⣿⣦⡀⠈⢻⣎⠷⣿⠀⢹⣿⡵⣺⠔⡀⠀⢀⠸⣘⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⣿⣇⡞⠴⢠⠑⡌⢡⠊⢖⡈⢦⡙⢦⡛⣤⠛⡤⢋⡴⢋⠴⡙⡬⢣⣋⡜⢎⡝⡎⡵⣋⠾⣱⢯⡷⣧⠀⠘⡸\n" +
                "⡿⠋⠀⠀⣼⣿⣿⣯⣿⣿⣟⣿⣿⢠⢟⡶⣹⢎⣷⡹⣞⢧⡟⣞⢧⡻⣜⡭⡗⣏⢾⣽⣿⣿⣿⠛⠁⠀⡀⠀⠙⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠈⣯⢿⣿⠀⠈⣿⣿⡱⢏⡄⠀⠀⢘⠴⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣾⡱⣃⠒⠌⢢⠙⢢⠜⡤⢛⠦⡝⣆⠻⣌⠧⡜⡱⢊⠵⣘⢣⠜⡜⣪⠴⣙⠴⣩⠳⢭⢿⡽⣷⡄⠀⡵\n" +
                "⠀⠀⠀⢀⣿⣿⡿⣿⣿⣿⣿⣿⣿⢨⡞⣵⣏⡟⣶⢫⡽⣞⡽⡽⣎⢷⡹⣜⢳⣿⣚⣿⣿⣿⠁⠀⠀⢠⣧⡀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠘⣯⢿⠀⠀⠹⣿⣝⣣⠆⡀⠀⢸⡘⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣶⠿⠛⠉⠉⠀⠀⠀⠹⣿⣧⣋⣜⠠⡉⢆⡙⠴⣩⢳⡹⢬⠳⣜⢢⡕⣡⢋⠖⣡⢚⡜⡱⢆⡳⣉⢞⣡⢛⡬⣳⢟⡷⣧⠀⢸\n" +
                "⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⡏⠲⣝⣳⡞⣽⢞⣯⢳⣻⡼⣟⡽⣎⢷⡹⣎⣿⢞⣿⣿⡏⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⢹⣿⠀⠀⠀⢿⣿⢦⢓⡀⠀⠱⣈⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠿⠋⠀⠀⢀⣠⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⢷⡌⡼⡱⣌⢣⡙⢮⡹⢎⣇⠲⡡⠎⡜⠤⢣⠜⣡⠏⠶⣉⢎⠦⡓⡼⢱⢯⢿⣵⡂⢸\n" +
                "⠀⠀⢀⣿⣿⣽⣿⣿⣿⣿⣿⣿⡁⢙⢮⡷⣻⡽⣞⣧⣟⣳⢿⣝⡾⣹⢮⣽⢺⣝⣯⣿⣿⡇⡀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣎⢿⠀⠀⠀⠈⢻⣿⡎⡄⠀⠀⠔⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠟⠁⠀⢀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣿⡵⣳⢽⣳⣜⠦⣙⢯⡜⣣⢑⠣⡜⢡⢣⠚⡥⣚⠵⣉⠞⡬⠱⣌⠳⣎⡻⣼⢧⠀\n" +
                "⠀⠀⣼⣯⡷⣿⣾⣿⣿⣿⣿⡿⡇⢨⢷⣻⢷⣻⡽⣞⣾⡽⣟⣮⠷⣏⡷⣞⣯⣿⣻⡿⣿⡆⠀⠀⢸⣿⣟⢿⣿⣟⣳⢯⡽⣯⣟⣿⣿⣿⣿⣿⡟⠟⠀⠀⠀⠀⠀⠀⠀⠿⣿⡔⡠⠀⢌⣻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣿⣽⣧⢯⣗⠿⣷⡩⢖⣯⢒⡍⡒⢌⠣⣌⠳⣐⢣⠞⣡⠞⡰⢋⡔⢣⢜⡳⣝⡾⡄\n" +
                "⠀⠀⢺⢿⣼⣷⣿⣿⣿⣿⣿⡝⣇⢸⣾⣟⣯⡷⣟⣯⣷⢿⣟⣞⣻⢽⣺⡽⣾⣿⣿⠀⢻⣇⠀⠀⠈⣿⡏⠌⢿⡿⣼⢣⡟⣶⢫⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⡐⡄⠂⣽⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⣿⠿⠛⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣺⢻⡽⣿⠸⣜⣧⢎⠱⢌⡱⢄⠳⢌⡖⣙⠦⡙⢦⣉⢿⣌⠲⣙⢮⡽⣧\n" +
                "⠀⠀⢸⡟⣾⣿⣿⣿⣿⣿⡟⡼⣷⠀⡿⣾⣯⣟⣿⣳⣯⣿⢾⣝⣮⢯⡷⣽⣿⣿⣿⡇⠀⠻⣆⠀⠀⠹⢿⡀⠀⠻⣿⢯⣽⡞⣯⣿⠟⣾⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣷⡰⠈⢾⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢘⣿⠟⣁⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠻⣿⣿⣿⣯⢞⣽⡗⢬⣹⣎⡱⢊⠔⠪⠔⡣⢜⠼⡸⢍⡲⢌⡞⣷⡹⣘⢎⡷⣻\n" +
                "⠀⠀⣿⡝⣿⣿⣿⣿⣿⣿⡽⣱⢻⠀⡿⣿⣳⣿⣞⣯⣿⢯⣟⡾⣭⢷⣻⡽⣿⣿⣿⣿⠀⠀⠈⠢⣀⠀⠻⣷⣀⠀⠈⠉⠓⠛⠁⠈⢮⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⣷⡅⠚⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠁⠀⣿⣷⣶⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⢸⣿⣷⣿⣯⢾⢋⠶⡌⣷⡥⢃⢎⠱⣉⠲⣉⠮⣑⢫⠔⣣⢚⡼⣷⡩⢞⡼⣽\n" +
                "⠀⢠⡗⣯⣿⣿⣿⣿⣿⢧⣳⢣⢻⡇⢸⢿⣟⣾⢿⣽⡿⣿⣽⣻⡽⣯⢷⣻⣿⣿⣿⣿⠀⠀⠀⠀⠀⠉⠑⠮⠛⠳⠶⠤⢤⡤⠶⠿⠛⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣆⢿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢃⠀⢸⣿⣿⣿⣿⣿⣿⣟⡷⣿⣻⡽⣿⣿⣿⣿⣿⣿⡿⠀⠀⠈⢻⣿⣯⣿⡘⣦⠹⣜⣧⠏⣌⠲⣀⠇⡜⢢⡹⢌⣋⠶⣩⢒⡹⣿⡌⣳⠽\n" +
                "⠀⢸⣛⠶⣿⣿⣿⣿⣿⠳⣬⡓⢧⣧⠘⣿⣿⡾⣿⣻⣿⣟⣾⣳⢿⡽⣯⢷⣿⣿⣿⣿⠐⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⢈⣿⣿⣿⣿⣿⣿⣞⣿⣳⢯⡿⣽⣿⡟⣷⣿⣿⠃⠀⠀⠀⣾⣿⣿⣷⣻⣜⡿⣴⣿⡯⡔⢣⡐⠎⠬⡑⢎⡱⣊⠵⢣⡹⣜⡻⣷⣡⢛\n" +
                "⠀⣼⢎⣿⣿⣿⣿⣿⡻⣝⡲⣝⢺⣿⡀⢿⣿⢿⣽⣿⣳⣿⢯⣟⣯⢿⣽⣻⣿⣻⣿⣿⡇⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢆⠀⢻⣿⡱⢛⢿⣯⣿⡷⣿⢿⣽⠟⠋⢘⣼⣿⠏⠀⠀⠀⣾⢿⡽⠃⢻⣿⣿⣿⣿⣿⣷⡙⢦⡑⡊⢥⠙⡌⣖⡡⢏⡱⢒⣭⢳⣹⣧⣋\n" +
                "⠀⡏⡾⣼⣿⣿⣿⡇⡿⣜⡱⢮⣹⡟⣇⢸⣾⣟⡿⣾⣟⣿⣯⣟⣾⣻⣞⣿⣯⢿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⢌⣿⣷⣌⠀⠉⠙⠋⠛⠉⠀⢐⣠⣼⡿⠁⠀⠀⣤⣼⡿⠋⠀⠀⣴⣿⣿⣿⣿⣿⣿⣝⢦⡱⡘⠤⢋⡔⢢⠕⡪⠔⠣⣜⢣⢿⡼⣧\n" +
                "⠀⣿⡱⢿⣿⣿⣿⢼⣟⢲⡙⣦⣻⣝⣻⡄⢿⣯⡿⣿⣽⣿⡾⣽⣞⡷⣯⣿⣽⣻⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠋⠙⠻⠶⠤⣤⣤⣤⣾⣿⠿⠂⠀⠀⢀⠴⠟⠋⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣎⠵⣈⢇⠣⡜⡡⢎⡱⢩⠱⢬⢣⣿⣳⣽\n" +
                "⠈⣧⢻⣽⣻⣿⣿⢸⡝⢮⠵⣒⣿⢮⡳⣷⠨⢿⣽⡿⣽⣷⣿⣳⢯⡿⣽⣟⣿⣳⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠒⠒⠒⠋⠁⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢎⡕⣊⠱⢢⡑⢎⡔⢣⠘⣬⢓⣿⣳⢾\n" +
                "⢰⡱⣏⢾⣽⣿⢿⡘⣮⠝⣎⠧⣿⡳⣝⡾⡇⢻⣯⣿⢿⣟⣾⡽⣯⣟⣿⣽⣞⡷⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⡜⢢⠍⢦⡉⠖⡬⡁⠎⡴⢫⢿⣯⣟\n" +
                "⢸⢲⡝⣾⣽⣯⢿⣘⢦⠻⣜⠳⣿⡝⣮⢳⣿⠡⣿⣿⢿⣿⣳⣟⣷⣻⣿⢎⣷⣻⣽⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣻⣿⣿⣻⣿⣿⣿⣿⣾⣿⣭⢣⡚⢤⡙⡜⣠⠑⡂⢽⢹⢺⡷⣯\n" +
                "⢸⢣⡟⣼⣟⡞⣿⡘⣎⡳⣍⡳⣿⡹⣎⢷⣻⣧⢛⣿⣿⣯⢷⣻⣞⣿⣳⢻⡼⣳⢿⣿⣿⣿⡷⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⢯⣿⣿⣟⣿⣽⣿⣿⣷⣿⣿⣿⣇⠞⡰⣘⠰⣁⠎⡰⣍⡿⢸⣟⡷\n" +
                "⡇⡿⣜⣳⢯⡽⣻⢱⢣⢳⡜⣱⣿⢳⡝⣾⣹⣿⣎⢿⣿⣽⢯⡷⣿⣿⡱⣏⡾⣝⣿⣿⣿⣿⡿⣷⣻⣿⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣷⢤⣀⣀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⢯⣿⣿⢿⡾⣯⣟⣿⣿⣿⣿⣿⣿⣿⡬⡱⢌⠣⡜⢢⠐⣾⡇⢸⣟⡾\n" +
                "⣇⠿⣜⢧⡻⣜⣿⢩⢞⡱⢮⡱⣿⢣⡟⣶⣻⣟⣯⠞⣿⣿⢯⣿⣿⣷⡻⣼⣹⠽⣾⣿⣿⡷⣿⣻⡽⣷⣻⢷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣎⠷⣭⢻⡼⣭⣯⣝⡳⢶⡤⣄⣀⡀⣀⣀⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⢯⣿⣿⢯⣿⣻⢷⣻⣾⣿⣿⣿⣿⣿⣿⣧⠓⣎⠱⣌⠣⣘⣿⠁⢸⣯⣟\n" +
                "⢎⡟⡼⣣⢟⡼⣻⠜⣮⡙⣖⢣⣿⢣⣛⢶⣻⢮⣽⡞⣽⡿⣯⣿⣿⣿⡳⢧⣏⠿⣽⣿⣿⣿⣻⣽⣟⡷⣯⣟⡿⣽⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢯⡻⣜⢧⡻⣴⡙⡶⣹⢲⡹⡼⣩⠟⣭⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⢯⣿⣿⢯⣿⣳⢯⣟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⢬⡓⣌⠣⢸⣿⠀⢸⣷⣿\n" +
                "⢸⡹⣵⢫⢞⡵⣿⠸⣥⢛⣬⢓⣿⣣⠟⣮⢿⣓⢮⣿⢼⣛⣷⣿⣿⣿⣟⡳⢮⣻⣽⣿⣿⣳⣿⣳⣯⢿⣻⣞⣿⡽⣯⢿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⢽⣮⡵⣣⢟⡱⢧⣏⣳⢳⣭⣛⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣾⣿⣿⣿⣿⣿⣿⣿⡿⣯⢿⡾⣝⣻⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢢⡝⢦⡙⢼⡗⣈⠰⣿⣽\n" +
                "⣸⢳⡜⢧⣏⢾⣱⣙⢦⣋⠶⣩⢾⡵⣛⡼⣻⡜⣎⢿⣚⣯⣿⣿⢷⣿⣿⣹⢧⡳⢿⣿⣿⣽⢾⣷⣻⣟⣯⣟⣾⡽⣯⣟⣾⢿⣿⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠷⢮⣽⣧⣾⠥⠷⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣳⣿⢿⡽⣯⢻⣽⣿⣿⣿⣯⣽⣿⣿⣿⣿⣿⣿⣿⣷⡘⢧⠜⣿⠃⠤⠘⣿⣿\n" +
                "⡜⣣⢞⣣⣞⠾⠿⠾⠷⠟⠛⠛⠛⠛⠛⠚⠿⠿⠿⠞⠛⠋⠉⠙⠛⠻⣿⣿⡮⣝⣻⣿⣿⣯⢿⣞⣷⣻⣾⡽⣷⣻⢷⣯⣟⣿⣿⠟⠈⢓⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣿⣯⢿⣝⣯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣫⢓⣺⡿⡈⢆⠡⣿⣿\n" +
                "⣜⡷⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣎⡷⣿⣿⣯⣟⡿⣞⣷⢯⡿⣽⢯⣿⣾⡿⠉⠀⠀⠀⠈⣿⢝⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣤⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⣟⡾⣏⣾⡾⠻⠛⠛⠙⠋⠉⠉⠛⣿⣿⣿⣿⣿⣿⣿⣧⢏⣼⠧⡑⢌⡀⣿⢯\n" +
                "⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⡨⠙⠓⣿⣿⡷⣯⣟⡿⣾⣻⣽⣯⢿⠿⡏⠀⠀⠀⠀⠀⠀⠘⣞⢿⣎⡟⠦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣴⠖⠒⠋⠋⠁⠘⠻⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡿⣝⣳⣽⣿⣶⣶⣶⣶⣦⣴⣤⣴⣼⣿⣿⣿⣿⣿⣿⣿⣿⣎⣿⠰⣁⠆⠄⣿⠹\n" +
                "⠀⠀⠄⠀⠀⠀⠀⠀⠀⠀⣴⡇⠀⠀⠀⠀⠀⠀⠀⢠⣿⡷⠀⠀⠀⠀⠀⢀⠇⠀⠀⠀⠻⣿⣽⢾⣻⢷⣻⣽⡿⠂⣼⠁⠀⠀⠀⠀⠀⠀⠀⠹⣟⣿⣿⡰⢌⡓⢦⣀⠀⠄⠀⠀⣀⣀⣤⠤⠖⡒⢋⣯⣭⡿⠛⠁⠀⠠⢀⠀⠀⠁⢀⠀⠙⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣽⢫⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⡟⠰⠰⣈⠂⠓⠀\n" +
                "⠀⢠⠀⠀⠀⠀⠀⠀⢀⣾⢿⠧⠀⠀⠀⠀⠀⠀⢀⣿⡿⠁⠀⠀⠀⠀⠀⡼⠂⠀⠀⠀⠀⢹⠯⠿⠛⠛⠋⠉⣽⠀⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡎⢿⣿⣷⣜⢢⠩⡙⣉⠋⡍⢡⠒⡄⢎⣔⣽⣶⠿⠏⠀⡀⠐⡈⠤⢁⠂⠄⠠⠀⠀⣼⣷⢠⠏⣙⣻⣿⣿⣿⣿⣿⣿⣿⡿⣿⣻⡭⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢏⠅⡓⠤⢈⠀⠀\n" +
                "⠀⡀⠀⠀⠀⠀⠀⠀⣸⠃⡾⠀⠀⠀⠀⠀⠀⠀⣾⡟⡕⠀⠀⠀⠀⠀⢰⡇⠀⠀⠀⠀⠀⣸⠀⠀⠀⠀⠀⢾⡏⢨⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢀⠙⢿⣿⣿⣔⡱⢂⡱⡘⢦⣙⣼⣿⡿⠛⠁⠀⡀⠐⡄⢃⠜⡐⠠⠈⠄⠡⢈⠀⣿⡏⣹⡰⠛⠻⠿⣿⣿⣿⣿⣿⣿⣿⣟⢧⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⢂⠚⣄⠣⠄⠂⠀\n" +
                "⠂⠀⠀⠀⠀⠀⠀⢀⡏⢠⡗⠀⠀⠀⠀⠀⠀⢰⣿⢱⠇⠀⠀⠀⠀⢀⡟⠆⠀⠀⠀⠀⠀⣇⡄⠀⠀⠀⠀⢸⣷⢸⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠙⢿⣿⣷⣭⢒⣽⣾⠿⡋⠑⠀⠁⠀⡀⠄⠡⢈⠆⡐⢀⠃⠌⡈⠐⡠⢘⣿⡇⡼⢧⠀⠀⠀⠀⠉⠉⠉⠛⢻⣟⣮⡿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡮⢌⠱⢠⢃⠌⡀⠀\n" +
                "⢈⠀⠀⠀⠀⠀⠀⣼⠁⢸⡏⠁⠀⠀⠀⠀⢀⣿⣧⡞⠀⠀⠀⠀⠀⢸⢳⠀⠀⠀⠀⠀⣸⠁⠀⠀⠀⠀⣼⠟⣡⢸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠈⠄⡉⢻⣝⣿⣿⠟⣡⠞⠀⠀⠀⠀⢀⠀⠌⢠⠁⠂⠔⠂⠌⠐⠠⠁⠒⣹⣿⠁⣧⠛⠀⠀⠀⠀⠀⠀⠀⠀⣼⢣⡟⠀⠀⠀⠀⠀⠀⠉⠙⠻⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠤⣉⠦⡈⠆⠀⠀\n" +
                "⠃⠀⠀⠀⠀⠀⢰⠟⠛⣿⠀⠀⠀⠀⠀⠀⢸⢻⠹⠁⠀⠀⠀⠀⠀⣾⠄⠀⠀⠀⠀⢠⣏⡀⠀⠀⠀⠘⣯⣰⢁⢺⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢌⠐⡀⠈⢯⣹⠉⡸⠁⠀⠀⠀⢈⠀⠄⠂⠌⠠⢈⠁⢂⠡⠈⠄⠡⢈⠐⣿⣞⢸⡷⡀⠀⠀⠀⠀⠀⠀⠀⢰⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⡰⢁⠆⡱⠈⠄⠀\n" +
                "⠀⠀⠀⠀⠀⠀⣸⢀⡾⠁⠀⠀⠀⠀⠀⢀⣾⠟⠀⠀⠀⠀⠀⠀⢸⡇⡇⠀⠀⠀⠀⣸⠀⠳⣄⠀⢀⣼⢽⡏⢸⡘⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠊⠄⡀⠃⡸⣞⢸⡃⠀⠀⠂⠀⠄⢈⠐⡈⠄⠡⢈⣶⡿⢦⠈⠀⠁⠀⢢⣯⣏⠠⣇⠙⣄⠀⠀⠀⠀⠀⠀⠺⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠿⣿⣿⣿⣿⣿⣿⣷⡘⠤⠓⢤⠉⡀⠀\n" +
                "⠀⠀⠀⢀⣠⣴⢻⠟⠀⠀⠀⠀⠀⠀⣪⡟⠉⠀⠀⠀⠀⠀⠀⢀⡿⢀⣀⡀⠀⠀⣀⡿⠀⠀⢸⠄⣼⣁⣞⠁⢀⡁⢇⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠣⢐⠠⢁⣹⣷⣼⠀⡄⢡⠁⠌⠐⡀⠂⠐⢈⠀⣼⡟⡄⢈⣿⢤⡀⠀⣸⣿⡨⠇⢸⡼⠛⠠⠁⠌⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⣿⣿⣿⣷⠱⡈⡕⢢⠁⠄⠀\n" +
                "⠒⠛⠋⠉⠀⣿⠋⠀⠀⠀⠀⠀⣀⣾⠋⠀⠀⠀⠀⠀⠀⠀⣠⡾⢡⡜⢸⡈⠛⠒⠹⠁⠀⠀⢸⡾⠓⣿⠄⠀⠀⣷⣾⠜⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠐⢀⣦⣵⠾⠿⠟⠛⠻⣷⣼⣤⡘⠠⠁⠀⠄⠁⠀⣴⡿⣦⠀⣾⢃⣤⣿⢶⣻⠇⣽⠀⢼⡟⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⣿⣿⣯⢣⠑⡌⢢⢁⠂⠀\n" +
                "⠀⠀⠀⠀⠀⠹⢄⣂⠀⠀⢀⣴⡟⠉⠀⠀⠀⠀⠀⢀⣠⠴⣏⠁⠀⢷⡘⠧⣀⡀⠀⠀⠀⠀⣼⢹⣼⠋⠀⠀⠀⢿⣸⠀⠀⠀⠀⠈⠀⡁⠀⠄⠈⢀⢢⣾⠟⠀⠠⠀⠌⠐⢀⠀⠌⠙⣾⣤⠐⠀⠀⢂⣠⣿⠁⣹⡟⢿⡝⢃⡞⢠⡏⣽⠁⠀⢘⢷⣠⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⡅⢎⠰⡁⠆⡐⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠀⠉⣳⢤⣀⣀⣠⠴⠋⠁⠀⠈⠉⠉⠉⠛⠦⣤⣈⠑⠂⢀⣾⠟⢹⡇⠀⠀⠀⠀⣿⢺⣆⠀⠀⠀⡁⠂⠐⠠⠀⠌⢠⣿⠇⠀⠂⡁⠐⠠⠈⡀⠐⡀⠂⡘⣿⡆⠀⠀⢈⣿⣧⡾⠟⡹⠛⠹⡞⠀⣞⢠⣯⠀⠀⠈⡿⡏⢪⡅⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣿⡘⢄⢣⠘⡰⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡏⠀⠀⠀⠀⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⣿⢠⠏⠁⠀⠀⠀⠀⣣⠽⡇⠆⠀⠀⠀⠡⠈⢀⣐⣾⠛⣿⠀⠀⡁⠠⠈⠄⠐⠀⡁⢀⠂⡱⠿⡷⣆⠈⠘⢺⣏⠀⡽⠃⠀⣰⠃⢰⢷⡻⠃⠀⠀⠀⢹⢳⣞⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣳⡜⡌⣂⠇⡡⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠁⠀⠀⠀⠀⠈⠳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡾⢛⡏⠀⠀⠀⠀⠀⠀⣻⡓⣷⠀⠀⠀⢁⣤⣶⠿⡽⠛⣋⣽⠀⠐⠀⡁⠐⡈⢀⠁⡀⢂⠰⣹⢥⡙⢾⡦⡄⠈⠈⢳⣦⣀⣴⠃⢠⣾⠼⠟⠀⠈⠆⠀⢸⢼⡏⠛⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⡔⢢⢊⠔⠁⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡟⠀⠀⠀⠀⠀⠀⠀⠙⢆⠀⠀⠀⠀⠀⠀⠀⠀⠀⢺⢀⠾⠀⠀⠀⠀⠀⠀⠀⠘⠳⢾⣀⡲⠶⠟⣋⠓⠖⠃⠀⠌⠿⣧⠂⡁⠠⢁⠐⣀⠂⡐⣀⢳⡝⡾⠉⢁⡉⠉⢲⢤⠀⡀⢈⠁⣄⣾⠠⠇⠀⢀⠃⠈⠀⠀⠘⢻⣄⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣇⠬⠘⡀⠀";
    }

}
