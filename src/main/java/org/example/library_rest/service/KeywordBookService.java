package org.example.library_rest.service;

import org.example.library_rest.key.KeywordBookPrimaryKey;
import org.example.library_rest.model.KeywordBook;
import org.example.library_rest.repository.KeywordBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KeywordBookService {

    private final KeywordBookRepository keywordBookRepository;

    @Autowired
    public KeywordBookService(KeywordBookRepository keywordBookRepository) {
        this.keywordBookRepository = keywordBookRepository;
    }

    public List<KeywordBook> getAllKeywordBooks() {
        return keywordBookRepository.findAll();
    }

    public Optional<KeywordBook> getKeywordBookById(KeywordBookPrimaryKey keywordBookPrimaryKey) {
        return keywordBookRepository.findById(keywordBookPrimaryKey);
    }

    public KeywordBook saveKeywordBook(KeywordBook keywordBook) {
        return keywordBookRepository.save(keywordBook);
    }

    public KeywordBook updateKeywordBook(KeywordBook keywordBook) {
        return keywordBookRepository.save(keywordBook);
    }

    public void deleteKeywordBook(KeywordBookPrimaryKey keywordBookPrimaryKey) {
        keywordBookRepository.deleteById(keywordBookPrimaryKey);
    }
}
