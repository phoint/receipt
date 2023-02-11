package phoint.spring5mvc.receipt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import phoint.spring5mvc.receipt.domain.UnitOfMeasure;

import java.util.Optional;

@Repository
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescriptions(String descriptions);
}
