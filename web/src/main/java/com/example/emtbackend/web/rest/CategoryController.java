package com.example.emtbackend.web.rest;

import com.example.emtbackend.enumeration.Category;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoryController {

    @GetMapping
    public List<Category> findAll(){
        return Arrays.stream(Category.values()).toList();
    }
}
