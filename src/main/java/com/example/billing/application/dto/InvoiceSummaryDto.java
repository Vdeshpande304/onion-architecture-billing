package com.example.billing.application.dto;

public class InvoiceSummaryDto {
    private String clientId;
    private double totalAmount;

    public InvoiceSummaryDto(String clientId, double totalAmount) {
        this.clientId = clientId;
        this.totalAmount = totalAmount;
    }

    public String getClientId() {
        return clientId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
