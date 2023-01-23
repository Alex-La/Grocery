package org.example.service;

import org.example.model.Order;

import java.util.List;

public interface IOrderService {
    List<Order> findAll();
    Order findById(Long id);
    Long create(Order newOrder); // Должен вернуть id нового ордера
    Order update(Order newOrder, Long id);
    void delete(Long id);
}
