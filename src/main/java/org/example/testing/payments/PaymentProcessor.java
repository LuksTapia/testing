package org.example.testing.payments;

public class PaymentProcessor{

    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        setPaymentGateway(paymentGateway);
    }


    public boolean makePayment(double amount) {

        boolean resp = false;
        PaymentResponse presponse = paymentGateway.requestPayment(new PaymentRequest(amount));
        if(presponse.getStatus() == PaymentStatus.OK) {
            resp = true;
        }
        return resp;
    }
    private void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
}
