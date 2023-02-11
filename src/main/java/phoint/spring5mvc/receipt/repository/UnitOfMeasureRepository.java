package phoint.spring5mvc.receipt.repository;

import org.springframework.data.repository.CrudRepository;
import phoint.spring5mvc.receipt.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
