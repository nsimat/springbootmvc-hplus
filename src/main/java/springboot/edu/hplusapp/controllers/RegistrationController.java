package springboot.edu.hplusapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import springboot.edu.hplusapp.models.User;
import springboot.edu.hplusapp.repositories.UserRepository;

@Controller
public class RegistrationController {
    private final UserRepository userRepository;

    public RegistrationController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @PostMapping("/registeruser")
    public String registerUser(@ModelAttribute("newuser") User user, Model model){
        System.out.println("in registration controller.");
        userRepository.save(user);
        model.addAttribute("dataSaved", "User registered successfully!");
        return "login";
    }
}
