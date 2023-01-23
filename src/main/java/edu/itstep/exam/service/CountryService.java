package edu.itstep.exam.service;

import edu.itstep.exam.entity.Country;
import edu.itstep.exam.repository.CountryRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryService extends BaseServiceImpl<Country, CountryRepository>{

public CountryService(CountryRepository repository){
    super(repository);
}
}
