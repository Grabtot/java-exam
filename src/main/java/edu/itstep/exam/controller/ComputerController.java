package edu.itstep.exam.controller;

import edu.itstep.exam.entity.Computer;
import edu.itstep.exam.service.ComputerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/computers")
public class ComputerController extends BaseControllerImpl<Computer, ComputerService> {
    protected ComputerController(ComputerService service) {
        super(service);
    }
}
