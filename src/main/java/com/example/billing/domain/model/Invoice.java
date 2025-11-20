package com.example.billing.domain.model;

public class Invoice {
    private String clientId;
    private double amount;

    public Invoice(String clientId, double amount) {
        this.clientId = clientId;
        this.amount = amount;
    }

    public String getClientId() {
        return clientId;
    }

    public double getAmount() {
        return amount;
    }
}
