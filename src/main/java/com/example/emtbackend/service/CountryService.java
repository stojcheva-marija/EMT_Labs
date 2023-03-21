package com.example.emtbackend.service;

import com.example.emtbackend.model.entity.Country;

import java.util.List;

public interface CountryService {
    List<Country> findAll();
}
