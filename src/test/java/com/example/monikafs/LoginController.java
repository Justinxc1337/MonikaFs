package com.example.monikafs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

@RestController
@Controller
public class LoginController {
 /* not fucking implemented yet  */
    @PostMapping("/login")
    public String login() {

        String redirectUrl = "http://localhost:8080/forside";
        return "redirect:" + redirectUrl;
    }
}