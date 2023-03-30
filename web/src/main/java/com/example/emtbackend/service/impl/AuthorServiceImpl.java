package com.example.emtbackend.service.impl;

import com.example.emtbackend.model.entity.Author;
import com.example.emtbackend.repository.AuthorRepository;
import com.example.emtbackend.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }
}
