package com.example.emtbackend.data;

import com.example.emtbackend.enumeration.Category;
import com.example.emtbackend.model.entity.Author;
import com.example.emtbackend.model.entity.Book;
import com.example.emtbackend.model.entity.Country;
import com.example.emtbackend.repository.AuthorRepository;
import com.example.emtbackend.repository.BookRepository;
import com.example.emtbackend.repository.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@AllArgsConstructor
public class DataHolder {

    private List<Author> authors;
    private List<Book> books;
    private List<Country> countries;
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final CountryRepository countryRepository;

    @PostConstruct
    public void init() {;
        Country c1 = new Country("Macedonia","Europe");
        Country c2 = new Country("Japan","Asia");
        Country c3 = new Country("USA","North America");
        countries.add(c1);
        countries.add(c2);
        countries.add(c3);
        countryRepository.saveAll(countries);

        Author a1 = new Author("Lidija","Dimkovska",c1);
        Author a2 = new Author("Haruki" ,"Murakami",c2);
        Author a3 = new Author("Colleen", "Hoover",c3);
        authors.add(a1);
        authors.add(a2);
        authors.add(a3);
        authorRepository.saveAll(authors);

        Book b1 = new Book("What I Talk About When I Talk About Running", Category.BIOGRAPHY,a2,300);
        Book b2 = new Book("Dance Dance Dance", Category.NOVEL,a2,20);
        Book b3 = new Book("It ends with us", Category.NOVEL,a3,50);
        Book b4 = new Book("It starts with us", Category.NOVEL,a3,100);
        Book b5 = new Book("Verity", Category.THRILLER,a3,300);
        Book b6 = new Book("When We Left \"Karl Liebknecht\"", Category.HISTORY,a1,500);
        Book b7 = new Book("A Spare Life", Category.CLASSICS,a1,100);
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b6);
        books.add(b7);
        bookRepository.saveAll(books);
    }

}
