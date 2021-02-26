package project.matayyyy.repositories;

import org.springframework.data.repository.CrudRepository;
import project.matayyyy.model.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
