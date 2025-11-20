package com.example.billing.infrastructure.controller;

import com.example.billing.application.dto.InvoiceSummaryDto;
import com.example.billing.application.usecase.CalculateInvoiceUseCase;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    private final CalculateInvoiceUseCase calculateInvoiceUseCase;

    public InvoiceController(CalculateInvoiceUseCase calculateInvoiceUseCase) {
        this.calculateInvoiceUseCase = calculateInvoiceUseCase;
    }

    @GetMapping("/{clientId}")
    public InvoiceSummaryDto getInvoice(@PathVariable String clientId) {
        return calculateInvoiceUseCase.calculate(clientId);
    }
}
