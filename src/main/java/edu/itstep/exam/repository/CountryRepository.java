package edu.itstep.exam.repository;

import edu.itstep.exam.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends BaseRepository<Country> {

}
