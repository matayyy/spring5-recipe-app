package project.matayyyy.repositories;

import org.springframework.data.repository.CrudRepository;
import project.matayyyy.model.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
