package springboot.edu.hplusapp.repositories;

import org.springframework.data.repository.CrudRepository;
import springboot.edu.hplusapp.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
