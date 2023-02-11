package phoint.spring5mvc.receipt.repository;

import org.springframework.data.repository.CrudRepository;
import phoint.spring5mvc.receipt.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
