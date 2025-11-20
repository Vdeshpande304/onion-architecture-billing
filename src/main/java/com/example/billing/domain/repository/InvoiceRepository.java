package com.example.billing.domain.repository;

import com.example.billing.domain.model.Invoice;
import java.util.List;

public interface InvoiceRepository {
    List<Invoice> findInvoicesByClient(String clientId);
}
