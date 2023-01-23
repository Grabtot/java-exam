package edu.itstep.exam.service;

import edu.itstep.exam.entity.Manager;
import edu.itstep.exam.repository.ManagerRepository;
import org.springframework.stereotype.Service;

@Service
public class ManagerService extends BaseServiceImpl<Manager, ManagerRepository> {
    public ManagerService(ManagerRepository repository) {
        super(repository);
    }
}
