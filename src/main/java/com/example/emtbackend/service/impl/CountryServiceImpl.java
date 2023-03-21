package com.example.emtbackend.service.impl;

import com.example.emtbackend.model.entity.Country;
import com.example.emtbackend.repository.CountryRepository;
import com.example.emtbackend.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    @Override
    public List<Country> findAll() {
        return this.countryRepository.findAll();
    }

}
