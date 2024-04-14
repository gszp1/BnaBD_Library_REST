package org.example.library_rest.controllers;

import org.example.library_rest.model.Book;
import org.example.library_rest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") Long id) {
        Optional<Book> book = bookService.getBookById(id);
        return book.orElse(null);
    }

    @PostMapping("/add")
    public Book saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @DeleteMapping("/delete")
    public void deleteBookById(@RequestBody Long id) {
        bookService.deleteBookById(id);
    }

    @PutMapping("/update")
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }
}
