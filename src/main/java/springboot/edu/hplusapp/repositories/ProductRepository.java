package springboot.edu.hplusapp.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import springboot.edu.hplusapp.models.Product;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    @Query("select p from Product p where p.name like %:name%")
    public List<Product> searchName(@Param("name") String name);
}
