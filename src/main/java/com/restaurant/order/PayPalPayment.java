// PayPalPayment.java
package com.restaurant.order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PayPalPayment implements PaymentStrategy {
    private String email;

    /*public PayPalPayment(String email) {
        this.email = email;
    }*/

    public PayPalPayment(@Value("${payment.paypal.email}")String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}