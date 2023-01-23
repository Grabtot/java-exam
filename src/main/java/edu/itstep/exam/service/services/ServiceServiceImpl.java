package edu.itstep.exam.service.services;

import edu.itstep.exam.entity.Service;
import edu.itstep.exam.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService{

    @Autowired
    ServiceRepository repository;

    @Override
    public List<Service> getAll() {
        return repository.findAll();
    }

    @Override
    public edu.itstep.exam.entity.Service getById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public edu.itstep.exam.entity.Service saveOrUpdate(Service service) {
        return repository.save(service);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
