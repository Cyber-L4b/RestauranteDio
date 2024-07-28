// CreditCardPayment.java
package com.restaurant.order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(@Value("${payment.card.number}") String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}