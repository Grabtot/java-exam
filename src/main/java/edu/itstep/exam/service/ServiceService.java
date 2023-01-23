package edu.itstep.exam.service;

import edu.itstep.exam.entity.Service;
import edu.itstep.exam.repository.BaseRepository;
import edu.itstep.exam.repository.ServiceRepository;

@org.springframework.stereotype.Service
public class ServiceService extends BaseServiceImpl<Service, ServiceRepository> {
    public ServiceService(ServiceRepository repository) {
        super(repository);
    }
}
