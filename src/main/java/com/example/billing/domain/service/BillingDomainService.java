package com.example.billing.domain.service;

import com.example.billing.domain.model.Invoice;

import java.util.List;

public class BillingDomainService {

    public double calculateTotal(List<Invoice> invoices) {
        return invoices.stream()
                .mapToDouble(Invoice::getAmount)
                .sum();
    }
}
