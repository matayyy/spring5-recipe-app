package project.matayyyy.repositories;

import org.springframework.data.repository.CrudRepository;
import project.matayyyy.model.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
