package edu.itstep.exam.service;

import edu.itstep.exam.entity.BaseEntity;

import java.util.List;

public interface BaseService<T extends BaseEntity>{
    List<T> getAll();
    T getById(int id);
    T saveOrUpdate(T entity);
    void deleteById(int id);
}
