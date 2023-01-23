package edu.itstep.exam.controller;

import edu.itstep.exam.entity.Order;
import edu.itstep.exam.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController extends BaseControllerImpl<Order, OrderService> {
    protected OrderController(OrderService service) {
        super(service);
    }
}
