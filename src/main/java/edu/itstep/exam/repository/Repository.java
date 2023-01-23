package edu.itstep.exam.repository;

import edu.itstep.exam.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository<T extends BaseEntity> extends JpaRepository<T, Integer> {
}
