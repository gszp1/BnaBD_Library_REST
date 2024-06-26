package org.example.library_rest.controllers;

import org.example.library_rest.key.KeywordBookPrimaryKey;
import org.example.library_rest.model.KeywordBook;
import org.example.library_rest.service.KeywordBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/keyword_books")
public class KeywordBookController {

    private final KeywordBookService keywordBookService;

    @Autowired
    public KeywordBookController(KeywordBookService keywordBookService) {
        this.keywordBookService = keywordBookService;
    }

    @GetMapping("/all")
    public List<KeywordBook> getAllKeywordBooks() {
        return keywordBookService.getAllKeywordBooks();
    }

    @GetMapping("/id")
    public KeywordBook getKeywordBookById(@RequestParam("bookId") Long bookId, @RequestParam("keywordId") Long keywordId) {
        Optional<KeywordBook> keywordBook = keywordBookService
                .getKeywordBookById(new KeywordBookPrimaryKey(keywordId, bookId));
        return keywordBook.orElse(null);
    }

    @PostMapping("/add")
    public KeywordBook addKeywordBook(@RequestBody KeywordBook keywordBook) {
        return keywordBookService.saveKeywordBook(keywordBook);
    }

    @PutMapping("/update")
    public KeywordBook updateKeywordBook(@RequestBody KeywordBook keywordBook) {
        return keywordBookService.updateKeywordBook(keywordBook);
    }

    @DeleteMapping("/delete")
    public void deleteKeywordBook(@RequestParam("bookId") Long bookId, @RequestParam("keywordId") Long keywordId) {
        keywordBookService.deleteKeywordBook(new KeywordBookPrimaryKey(bookId, keywordId));
    }

}
