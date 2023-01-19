package springboot.edu.hplusapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springboot.edu.hplusapp.models.Product;
import springboot.edu.hplusapp.repositories.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {

    private final ProductRepository productRepository;

    public SearchController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @GetMapping("/search")
    public String search(@RequestParam("search") String search, Model model){
        System.out.println("We are in search controller.");
        System.out.println("search critera: " + search);

        List<Product> products = new ArrayList<>();
        products = productRepository.searchByName(search);
        System.out.println("We have " + products.size() + " products.");
        model.addAttribute("products", products);
        return "search";
    }
}
