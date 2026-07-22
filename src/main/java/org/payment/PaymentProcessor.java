package org.payment;

public interface PaymentProcessor {
    boolean processPayment(double amountInEuros, String customerEmail);
}
