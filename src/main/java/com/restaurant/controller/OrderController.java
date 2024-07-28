package com.restaurant.controller;

import com.restaurant.order.Order;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final List<Order> orders = new ArrayList<>();

    @GetMapping
    public List<Order> getAllOrders() {
        return orders;
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        orders.add(order);
        return order;
    }
}