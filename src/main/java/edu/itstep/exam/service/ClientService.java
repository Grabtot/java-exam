package edu.itstep.exam.service;

import edu.itstep.exam.entity.Client;
import edu.itstep.exam.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService extends BaseServiceImpl<Client, ClientRepository> {
    public ClientService(ClientRepository repository) {
        super(repository);
    }
}
