package edu.itstep.exam.service;

import edu.itstep.exam.entity.BaseEntity;
import edu.itstep.exam.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ServiceBase<T extends BaseEntity>{
    List<T> getAll();
    T getById(int id);
    T saveOrUpdate(T entity);
    void deleteById(int id);
}
