package springboot.edu.hplusapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
    @Id
    private int id;
    private String username;
    private String password;
    private String gender;
    private String activity;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
}
