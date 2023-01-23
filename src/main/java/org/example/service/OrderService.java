package org.example.service;

import org.example.exception.OrderNotFoundException;
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

    @Override
    public Order findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new OrderNotFoundException(id));
    }

    @Override
    public Long create(Order newOrder) {
        return repository.save(newOrder).getId();
    }

    @Override
    public Order update(Order newOrder, Long id) {
        return repository.findById(id).map(order -> {
            order.setCustomerName(newOrder.getCustomerName());
            order.setCustomerSurname(newOrder.getCustomerSurname());
            order.setCustomerPhone(newOrder.getCustomerPhone());
            return repository.save(order);
        }).orElseGet(() -> {
            newOrder.setId(id);
            return repository.save(newOrder);
        });
    }

    @Override
    public void delete(Long id) {
        repository.delete(findById(id));
    }
}
