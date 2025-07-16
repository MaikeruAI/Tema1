package com.practica.library.controller;

import com.practica.library.model.Book;
import com.practica.library.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {

        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getBook() {

        return bookService.getBooks();
    }

    @PostMapping
    public ResponseEntity<String> addBook(@RequestBody Book book) {
        return ResponseEntity.ok(book.toString());
    }
}
