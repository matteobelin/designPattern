package org.payment;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PayFastAdapter implements PaymentProcessor{

    private final PayFastSDK payFastSDK;

    @Override
    public boolean processPayment(double amountInEuros, String customerEmail) {
        int payResult = payFastSDK.executeTransaction((int) amountInEuros * 100, customerEmail);
        return payResult == 200;
    }
}
