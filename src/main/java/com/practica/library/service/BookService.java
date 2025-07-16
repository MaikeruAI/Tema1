package com.practica.library.service;

import com.practica.library.model.Book;
import com.practica.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks() {

        List<Book> books = bookRepository.getBooks();
        List<Book> filteredBooks = new ArrayList<>();

        for (Book book: books) {
            if (book.getId() < 3L) {
                filteredBooks.add(book);
            }
        }

        return filteredBooks;
    }
}
