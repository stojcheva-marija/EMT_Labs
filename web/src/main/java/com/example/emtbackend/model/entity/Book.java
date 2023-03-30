package com.example.emtbackend.model.entity;

import com.example.emtbackend.enumeration.Category;
import javax.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    @Enumerated(value = EnumType.STRING)
    Category category;

    @ManyToOne(fetch = FetchType.EAGER)
    Author author;

    Integer availableCopies;

    public Book() {

    }

    public Book(String name, Category category, Author author, Integer availableCopies) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.availableCopies = availableCopies;
    }
}
