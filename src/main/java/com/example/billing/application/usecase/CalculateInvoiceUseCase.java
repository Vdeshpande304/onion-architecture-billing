package com.example.billing.application.usecase;

import com.example.billing.application.dto.InvoiceSummaryDto;
import com.example.billing.domain.model.Invoice;
import com.example.billing.domain.repository.InvoiceRepository;
import com.example.billing.domain.service.BillingDomainService;

import java.util.List;

public class CalculateInvoiceUseCase {

    private final InvoiceRepository invoiceRepository;
    private final BillingDomainService billingDomainService;

    public CalculateInvoiceUseCase(InvoiceRepository invoiceRepository,
                                   BillingDomainService billingDomainService) {
        this.invoiceRepository = invoiceRepository;
        this.billingDomainService = billingDomainService;
    }

    public InvoiceSummaryDto calculate(String clientId) {
        List<Invoice> invoices = invoiceRepository.findInvoicesByClient(clientId);
        double total = billingDomainService.calculateTotal(invoices);
        return new InvoiceSummaryDto(clientId, total);
    }
}
