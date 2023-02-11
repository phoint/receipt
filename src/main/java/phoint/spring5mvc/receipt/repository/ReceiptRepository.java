package phoint.spring5mvc.receipt.repository;

import org.springframework.data.repository.CrudRepository;
import phoint.spring5mvc.receipt.domain.Receipt;

public interface ReceiptRepository extends CrudRepository<Receipt, Long> {
}
