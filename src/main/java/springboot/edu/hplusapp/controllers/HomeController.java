package springboot.edu.hplusapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String goHome() {
        System.out.println("We are in the home controller.");
        return "home";
    }

    @GetMapping("/goToSearch")
    public String goToSearch() {
        System.out.println("going to the search page...");
        return "search";
    }

    @GetMapping("/goToLogin")
    public String goToLogin() {
        System.out.println("going to the login page...");
        return "login";
    }

    @GetMapping("/goToRegistration")
    public String goToRegistration() {
        System.out.println("going to the register page...");
        return "register";
    }
}
