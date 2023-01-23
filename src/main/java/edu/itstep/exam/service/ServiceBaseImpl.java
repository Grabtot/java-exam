package edu.itstep.exam.service;

import edu.itstep.exam.entity.BaseEntity;
import edu.itstep.exam.repository.Repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBaseImpl<T extends BaseEntity> implements ServiceBase<T> {

    @Autowired
    Repository<T> repository;

    @Override
    @Transactional
    public List<T> getAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public T getById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public T saveOrUpdate(T entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
