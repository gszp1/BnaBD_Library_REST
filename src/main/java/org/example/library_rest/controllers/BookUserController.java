package org.example.library_rest.controllers;

import org.aspectj.apache.bcel.classfile.Module;
import org.example.library_rest.model.BookUser;
import org.example.library_rest.service.BookUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/book_users")
public class BookUserController {

    private final BookUserService bookUserService;

    @Autowired
    public BookUserController(BookUserService bookUserService) {
        this.bookUserService = bookUserService;
    }

    @GetMapping("/all")
    public List<BookUser> getAllBookUsers() {
        return bookUserService.getAllBookUser();
    }

    @GetMapping("/{id}")
    public BookUser getBookUserById(@PathVariable("id") Long id) {
        Optional<BookUser> bookUser = bookUserService.getBookUserById(id);
        return bookUser.orElse(null);
    }

    @PostMapping("/add")
    public BookUser createBookUser(@RequestBody BookUser bookUser) {
        return bookUserService.createBookUser(bookUser);
    }

    @PutMapping("/update")
    public BookUser updateBookUser(@RequestBody BookUser bookUser) {
        return bookUserService.updateBookUser(bookUser);
    }

    @DeleteMapping("/delete")
    public void deleteBookUser(@RequestParam("id") Long id) {
        bookUserService.deleteBookUserById(id);
    }
}
