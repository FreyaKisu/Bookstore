package fi.haagahelia.assignment.bookstore.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;



public interface CategoryRepository extends CrudRepository<Category, Long> {

    List<Category> findAll();
    List<Category> findByName(String name);
}
