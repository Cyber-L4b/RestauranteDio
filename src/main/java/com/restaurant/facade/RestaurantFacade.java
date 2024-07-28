// RestaurantFacade.java
package com.restaurant.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.restaurant.order.Order;
import com.restaurant.order.OrderProcessor;
import com.restaurant.order.PaymentStrategy;

@Component
public class RestaurantFacade {
    private OrderProcessor orderProcessor;

    @Autowired
    public RestaurantFacade(OrderProcessor orderProcessor) {
        this.orderProcessor = orderProcessor;
    }

    public void placeOrder(Order order, PaymentStrategy paymentMethod) {
        orderProcessor.processOrder(order);
        paymentMethod.pay(order.getAmount());
    }
}
