package phoint.spring5mvc.receipt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phoint.spring5mvc.receipt.domain.Receipt;
import phoint.spring5mvc.receipt.repository.ReceiptRepository;

import java.util.HashSet;
import java.util.Set;
@Service
public class RecipeServiceImpl implements RecipeService{
    @Autowired
    private ReceiptRepository receiptRepository;

    @Override
    public Set<Receipt> getReceipt() {
        Set<Receipt> receipts = new HashSet<>();
        receiptRepository.findAll().iterator().forEachRemaining(receipts::add);
        return receipts;
    }
}
