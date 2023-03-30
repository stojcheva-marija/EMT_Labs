package com.example.emtbackend.web.rest;

import com.example.emtbackend.model.entity.Country;
import com.example.emtbackend.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api/countries")
@AllArgsConstructor
public class CountryController {
    private final CountryService countryService;

    @GetMapping
    public List<Country> findAll(){
        return countryService.findAll();
    }
}
