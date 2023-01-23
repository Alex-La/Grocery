package org.example.service;

import org.example.model.Order;
import org.example.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {
    @Autowired
    private OrderRepository repository;

    @Override
    public List<Order> findAll() {
        return (List<Order>) repository.findAll();
    }
}
