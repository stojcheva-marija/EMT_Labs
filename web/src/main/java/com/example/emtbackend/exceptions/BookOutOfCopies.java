package com.example.emtbackend.exceptions;

public class BookOutOfCopies extends RuntimeException{

    public BookOutOfCopies(Long id){
        super(String.format("Book with id: %d is out of copies", id));
    }
}
