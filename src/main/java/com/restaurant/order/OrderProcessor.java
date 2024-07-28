// OrderProcessor.java
package com.restaurant.order;

import org.springframework.stereotype.Component;

@Component
public class OrderProcessor {
    private static OrderProcessor instance;

    private OrderProcessor() {
        // Construtor privado para evitar instâncias múltiplas
    }

    public static OrderProcessor getInstance() {
        if (instance == null) {
            instance = new OrderProcessor();
        }
        return instance;
    }

    public void processOrder(Order order) {
        // Lógica para processar o pedido
        System.out.println("Processing order: " + order);
    }
}
