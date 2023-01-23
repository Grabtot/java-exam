package edu.itstep.exam.controller;

import edu.itstep.exam.entity.Client;
import edu.itstep.exam.service.ClientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController extends BaseControllerImpl<Client, ClientService> {
    protected ClientController(ClientService service) {
        super(service);
    }
}
