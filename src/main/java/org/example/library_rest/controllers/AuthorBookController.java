package org.example.library_rest.controllers;

import org.example.library_rest.key.AuthorBookPrimaryKey;
import org.example.library_rest.model.AuthorBook;
import org.example.library_rest.service.AuthorBookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/authors_books")
public class AuthorBookController {

    private final AuthorBookService authorBookService;

    public AuthorBookController(AuthorBookService authorBookService) {
        this.authorBookService = authorBookService;
    }

    @GetMapping("/all")
    public List<AuthorBook> getAllAuthorBooks() {
        return authorBookService.getAllAuthorBooks();
    }

    @GetMapping("/id")
    public AuthorBook getAuthorBookById(@RequestParam("authorId") Long authorId, @RequestParam("bookId") Long bookId) {
        Optional<AuthorBook> authorBook = authorBookService
                .getAuthorBookById(new AuthorBookPrimaryKey(authorId, bookId));
        return authorBook.orElse(null);
    }

    @PostMapping("/add")
    public AuthorBook addAuthorBook(@RequestBody AuthorBook authorBook) {
        return authorBookService.saveAuthorBook(authorBook);
    }

    @PutMapping("/update")
    public AuthorBook updateAuthorBook(@RequestBody AuthorBook authorBook) {
        return authorBookService.updateAuthorBook(authorBook);
    }

    @DeleteMapping("/delete")
    public void deleteAuthorBook(@RequestParam("authorId") Long authorId, @RequestParam("bookId") Long bookId) {
        authorBookService.deleteAuthorBook(new AuthorBookPrimaryKey(authorId, bookId));
    }
}
