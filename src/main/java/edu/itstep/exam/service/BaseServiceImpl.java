package edu.itstep.exam.service;

import edu.itstep.exam.entity.BaseEntity;
import edu.itstep.exam.repository.BaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class BaseServiceImpl<T extends BaseEntity, R extends BaseRepository<T>> implements BaseService<T> {


    protected final R repository;
    @Autowired
    public BaseServiceImpl(R repository){
        this.repository = repository;
    }


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
