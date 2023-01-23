package edu.itstep.exam.controller;

import edu.itstep.exam.entity.Brand;
import edu.itstep.exam.service.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brands")
public class BrandController extends BaseControllerImpl<Brand, BrandService> {
    protected BrandController(BrandService service) {
        super(service);
    }
}
