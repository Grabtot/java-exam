package edu.itstep.exam.controller;


import edu.itstep.exam.entity.*;
import edu.itstep.exam.service.country.CountryService;
import edu.itstep.exam.service.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private CountryService countryService;
    @Autowired
    private ServiceService serviceService;


    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countryService.getAll();
    }

    @GetMapping("/countries/{id}")
    public Country getCountryById(@PathVariable int id){
        return countryService.getById(id);
    }

    @PostMapping("/countries")
    public Country addCountry(@RequestBody Country country){
        return countryService.saveOrUpdate(country);
    }

    @PutMapping("/countries")
    public Country updateCountry(@RequestBody Country country) {
        return countryService.saveOrUpdate(country);
    }

    @DeleteMapping("/countries/{id}")
    public void deleteCounty(@PathVariable int id){
        countryService.deleteById(id);
    }

    @GetMapping("/error")
    public String error(){
        return "error";
    }
}
