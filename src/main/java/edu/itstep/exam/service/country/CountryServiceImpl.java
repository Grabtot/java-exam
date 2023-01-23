package edu.itstep.exam.service.country;

import edu.itstep.exam.entity.Country;
import edu.itstep.exam.repository.CountryRepository;
import edu.itstep.exam.service.ServiceBase;
import edu.itstep.exam.service.ServiceBaseImpl;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl extends ServiceBaseImpl<Country> implements CountryService{


}
