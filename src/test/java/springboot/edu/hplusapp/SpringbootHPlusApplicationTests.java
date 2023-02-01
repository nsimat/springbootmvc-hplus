package springboot.edu.hplusapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springboot.edu.hplusapp.controllers.HomeController;
import springboot.edu.hplusapp.controllers.RegistrationController;
import springboot.edu.hplusapp.controllers.SearchController;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SpringbootHPlusApplicationTests {
    @Autowired
    private HomeController controller;
    @Autowired
    private RegistrationController register;
    @Autowired
    private SearchController searcher;

    @Test
    public void contextLoads() {
        assertThat(controller).isNotNull();
        assertThat(register).isNotNull();
        assertThat(searcher).isNotNull();
    }

}
