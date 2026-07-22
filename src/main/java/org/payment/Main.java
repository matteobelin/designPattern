package org.payment;

public class Main {
    static void main(String[] args) {
        PayFastSDK payFastSDK = new PayFastSDK();

        PaymentProcessor adapter = new PayFastAdapter(payFastSDK);

        CheckoutService checkout = new CheckoutService(adapter);

        System.out.println(checkout.completeOrder(49.99, "test@test.com"));
    }
}
