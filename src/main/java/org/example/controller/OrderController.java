package org.example.controller;

import org.example.model.Order;
import org.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    List<Order> orders() {
        return orderService.findAll();
    }

    @GetMapping("/order/{id}")
    Order orderById(@PathVariable Long id) {
        return orderService.findById(id);
    }

    @PostMapping("/order")
    Long createOrder(@RequestBody Order newOrder) {
        return orderService.create(newOrder);
    }

    @PutMapping("/order/${id}")
    Order updateOrder(@RequestBody Order newOrder, @PathVariable Long id) {
        return orderService.update(newOrder, id);
    }

    @DeleteMapping("/order/{id}")
    void deleteOrder(@PathVariable Long id) {
        orderService.delete(id);
    }
}
