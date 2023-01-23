package org.example.service;

import org.example.model.Order;

import java.util.List;

public interface IOrderService {
    List<Order> findAll();
}
