package com.example.emtbackend.repository;

import com.example.emtbackend.model.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    void deleteBookByName(String name);
    Page<Book> findAll(Pageable pageable);
}
