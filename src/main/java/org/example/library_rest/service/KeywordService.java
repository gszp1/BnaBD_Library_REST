package org.example.library_rest.service;

import org.example.library_rest.model.Keyword;
import org.example.library_rest.repository.KeywordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KeywordService {

    private final KeywordRepository keywordRepository;

    @Autowired
    public KeywordService(KeywordRepository keywordRepository) {
        this.keywordRepository = keywordRepository;
    }

    public List<Keyword> findAll() {
        return keywordRepository.findAll();
    }

    public Optional<Keyword> findById(Long id) {
        return keywordRepository.findById(id);
    }

    public Keyword save(Keyword keyword) {
        return keywordRepository.save(keyword);
    }

    public void deleteById(Long id) {
        keywordRepository.deleteById(id);
    }

    public Keyword update(Keyword keyword) {
        return keywordRepository.save(keyword);
    }
}
