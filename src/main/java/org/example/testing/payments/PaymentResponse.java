package org.example.testing.payments;

public class PaymentResponse {
    private PaymentStatus status;

    public PaymentResponse(PaymentStatus status) {
        setStatus(status);
    }


    public PaymentStatus getStatus() {
        return status;
    }
    private void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
