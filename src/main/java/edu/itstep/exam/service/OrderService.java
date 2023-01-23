package edu.itstep.exam.service;

import edu.itstep.exam.entity.Order;
import edu.itstep.exam.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends BaseServiceImpl<Order, OrderRepository> {
    public OrderService(OrderRepository repository) {
        super(repository);
    }
}
