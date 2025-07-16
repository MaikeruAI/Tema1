package com.practica.library.repository;

import com.practica.library.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    public List<Book> getBooks() {

        Book book1 = new Book(1L, "Inteligenta emotionala", "Daniel Hoffman");
        Book book2 = new Book(2L, "Bani", "Daniel McWilliams");
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        return books;
    }
}
