package com.example.emtbackend.model.dto;

import com.example.emtbackend.enumeration.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private String name;
    private Category category;
    private Long author;
    private int availableCopies;
}
