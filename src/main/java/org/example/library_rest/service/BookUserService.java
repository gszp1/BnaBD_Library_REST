package org.example.library_rest.service;

import org.example.library_rest.model.BookUser;
import org.example.library_rest.repository.BookUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookUserService {

    private final BookUserRepository bookUserRepository;

    public BookUserService(BookUserRepository bookUserRepository) {
        this.bookUserRepository = bookUserRepository;
    }

    public List<BookUser> getAllBookUser() {
        return bookUserRepository.findAll();
    }

    public Optional<BookUser> getBookUserById(Long id) {
        return bookUserRepository.findById(id);
    }

    public BookUser createBookUser(BookUser bookUser) {
        return bookUserRepository.save(bookUser);
    }

    public BookUser updateBookUser(BookUser bookUser) {
        return bookUserRepository.save(bookUser);
    }

    public void deleteBookUserById(Long id) {
        bookUserRepository.deleteById(id);
    }
}
