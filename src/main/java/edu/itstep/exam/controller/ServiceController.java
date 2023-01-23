package edu.itstep.exam.controller;

import edu.itstep.exam.entity.Service;
import edu.itstep.exam.service.ServiceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class ServiceController extends BaseControllerImpl<Service, ServiceService> {
    protected ServiceController(ServiceService service) {
        super(service);
    }
}
