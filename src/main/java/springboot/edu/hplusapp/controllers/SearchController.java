package springboot.edu.hplusapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SearchController {

    @GetMapping("/search")
    public String search(){
        System.out.println("We are in search controller.");
        return "search";
    }
}
