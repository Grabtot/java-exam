package edu.itstep.exam.service;

import edu.itstep.exam.entity.Computer;
import edu.itstep.exam.repository.ComputerRepository;
import org.springframework.stereotype.Service;

@Service
public class ComputerService extends BaseServiceImpl<Computer, ComputerRepository> {
    public ComputerService(ComputerRepository repository) {
        super(repository);
    }
}
