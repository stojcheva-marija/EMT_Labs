package com.example.emtbackend.web.rest;

import com.example.emtbackend.model.entity.Author;
import com.example.emtbackend.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api/authors")
@AllArgsConstructor
public class AuthorController {
   private final AuthorService authorService;

    @GetMapping
    private List<Author> findAll() {
        return this.authorService.findAll();
    }
}
