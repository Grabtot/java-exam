package edu.itstep.exam.service.services;

import edu.itstep.exam.entity.Service;

import java.util.List;

public interface ServiceService {
    List<Service> getAll();

    Service getById(int id);

    Service saveOrUpdate(Service service);

    void deleteById(int id);
}
