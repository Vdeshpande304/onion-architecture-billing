package com.example.billing.infrastructure.config;

import com.example.billing.application.usecase.CalculateInvoiceUseCase;
import com.example.billing.domain.service.BillingDomainService;
import com.example.billing.domain.repository.InvoiceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public BillingDomainService billingDomainService() {
        return new BillingDomainService();
    }

    @Bean
    public CalculateInvoiceUseCase calculateInvoiceUseCase(
            InvoiceRepository invoiceRepository,
            BillingDomainService billingDomainService
    ) {
        return new CalculateInvoiceUseCase(invoiceRepository, billingDomainService);
    }
}
