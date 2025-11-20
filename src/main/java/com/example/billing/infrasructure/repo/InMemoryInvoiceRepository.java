package com.example.billing.infrastructure.repo;

import com.example.billing.domain.model.Invoice;
import com.example.billing.domain.repository.InvoiceRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class InMemoryInvoiceRepository implements InvoiceRepository {

    @Override
    public List<Invoice> findInvoicesByClient(String clientId) {
        return Arrays.asList(
                new Invoice(clientId, 200),
                new Invoice(clientId, 150),
                new Invoice(clientId, 85)
        );
    }
}
