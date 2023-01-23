package edu.itstep.exam.service;

import edu.itstep.exam.entity.Brand;
import edu.itstep.exam.repository.BrandRepository;
import org.springframework.stereotype.Service;

@Service
public class BrandService extends BaseServiceImpl<Brand, BrandRepository> {
    public BrandService(BrandRepository repository) {
        super(repository);
    }
}
