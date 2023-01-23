package edu.itstep.exam.controller;


import edu.itstep.exam.entity.Country;
import edu.itstep.exam.service.CountryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryController extends BaseControllerImpl<Country, CountryService>{

    public CountryController(CountryService service){
        super(service);
    }
}
