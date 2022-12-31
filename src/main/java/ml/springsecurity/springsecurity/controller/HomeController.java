package ml.springsecurity.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return  "welcome to the home page";
    }

    @GetMapping("/dashboard")
    public String dashboard(){
        return  "welcome to the dashboard page";
    }
}
