package org.example.testing.payments;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class PaymentProcessorTest {

    private PaymentGateway paymentGateway1;
    private PaymentProcessor paymentProcessor1;

    @Before
    public void setup() {
        paymentGateway1 = Mockito.mock(PaymentGateway.class);
        paymentProcessor1 = new PaymentProcessor(paymentGateway1);
    }


    @Mock
    PaymentGateway paymentGateway;

    @InjectMocks
    PaymentProcessor paymentProcessor;

    @Test
    public void payment_is_correct() {



        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentStatus.OK));
        assertTrue(paymentProcessor.makePayment(1000));
    }

    @Test
    public void payment_is_correct1() {

        Mockito.when(paymentGateway1.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentStatus.OK));
        assertTrue(paymentProcessor1.makePayment(1000));
    }

    @Test
    public void payment_is_incorrect1() {

        Mockito.when(paymentGateway1.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentStatus.ERROR));
        assertFalse(paymentProcessor1.makePayment(1000));
    }


    @Test
    public void payment_is_incorrect() {

        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentStatus.ERROR));
        assertFalse(paymentProcessor.makePayment(1000));
    }

}