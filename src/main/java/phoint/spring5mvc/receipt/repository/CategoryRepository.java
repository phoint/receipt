package phoint.spring5mvc.receipt.repository;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import phoint.spring5mvc.receipt.domain.Category;

import java.util.Optional;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescriptions(String description);
}
