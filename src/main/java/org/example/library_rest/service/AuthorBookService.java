package org.example.library_rest.service;

import org.example.library_rest.key.AuthorBookPrimaryKey;
import org.example.library_rest.model.AuthorBook;
import org.example.library_rest.repository.AuthorBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorBookService {

    private final AuthorBookRepository authorBookRepository;

    @Autowired
    public AuthorBookService(AuthorBookRepository authorBookRepository) {
        this.authorBookRepository = authorBookRepository;
    }

    public List<AuthorBook> getAllAuthorBooks() {
        return authorBookRepository.findAll();
    }

    public AuthorBook saveAuthorBook(AuthorBook authorBook) {
        return authorBookRepository.save(authorBook);
    }

    public void deleteAuthorBook(AuthorBookPrimaryKey authorBookPrimaryKey) {
        authorBookRepository.deleteById(authorBookPrimaryKey);
    }

    public Optional<AuthorBook> getAuthorBookById(AuthorBookPrimaryKey authorBookPrimaryKey) {
        return authorBookRepository.findById(authorBookPrimaryKey);
    }

    public AuthorBook updateAuthorBook(AuthorBook authorBook) {
        return authorBookRepository.save(authorBook);
    }
}
