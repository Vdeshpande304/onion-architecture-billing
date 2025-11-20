package com.example.billing.controller;

import com.example.billing.domain.model.Invoice;
import com.example.billing.domain.service.BillingDomainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/billing")
public class BillingController {

    private final BillingDomainService billingService;

    public BillingController(BillingDomainService billingService) {
        this.billingService = billingService;
    }

    @PostMapping("/total")
    public double calculateTotal(@RequestBody List<Invoice> invoices) {
        return billingService.calculateTotal(invoices);
    }

    @GetMapping("/health")
    public String health() {
        return "Billing Service is running!";
    }

}
