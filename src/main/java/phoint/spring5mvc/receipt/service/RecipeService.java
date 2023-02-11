package phoint.spring5mvc.receipt.service;

import phoint.spring5mvc.receipt.domain.Receipt;

import java.util.Set;

public interface RecipeService {
    Set<Receipt> getReceipt();
}
