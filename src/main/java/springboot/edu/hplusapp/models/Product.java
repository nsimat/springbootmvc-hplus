package springboot.edu.hplusapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product {
    private int id;
    @Id
    private String name;
    private String imagePath;
}
