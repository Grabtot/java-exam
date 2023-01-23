package edu.itstep.exam.service.country;

import edu.itstep.exam.entity.Country;

import java.util.List;

public interface CountryService {
    List<Country> getAll();

    Country getById(int id);

    Country saveOrUpdate(Country country);

    void deleteById(int id);
}
