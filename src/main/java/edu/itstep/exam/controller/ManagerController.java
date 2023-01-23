package edu.itstep.exam.controller;

import edu.itstep.exam.entity.Manager;
import edu.itstep.exam.service.ManagerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/managers")
public class ManagerController extends BaseControllerImpl<Manager, ManagerService> {
    protected ManagerController(ManagerService service) {
        super(service);
    }
}
