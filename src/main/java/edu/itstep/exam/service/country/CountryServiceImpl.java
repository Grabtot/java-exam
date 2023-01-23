package edu.itstep.exam.service.country;

import edu.itstep.exam.entity.Country;
import edu.itstep.exam.repository.CountryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    CountryRepository repository;

    @Override
    @Transactional
    public List<Country> getAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Country getById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Country saveOrUpdate(Country country) {
        return repository.save(country);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        repository.deleteById(id);
    }


}
