package org.example.testing.payments;

public class PaymentRequest {

    private double amount;


    public PaymentRequest (double amount) {
        setAmount(amount);
    }

    private void setAmount(double amount) {
        this.amount = amount;
    }
}
