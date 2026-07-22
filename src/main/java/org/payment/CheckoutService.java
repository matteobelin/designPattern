package org.payment;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CheckoutService {
    private final PaymentProcessor processor;

    boolean completeOrder(double totalAmount, String userEmail){
        return processor.processPayment(totalAmount, userEmail);
    }
}
