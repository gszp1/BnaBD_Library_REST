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

    public List<Keyword> getAllKeywords() {
        return keywordRepository.findAll();
    }

    public Optional<Keyword> getKeywordById(Long id) {
        return keywordRepository.findById(id);
    }

    public Keyword saveKeyword(Keyword keyword) {
        return keywordRepository.save(keyword);
    }

    public Keyword updateKeyword(Keyword keyword) {
        return keywordRepository.save(keyword);
    }

    public void deleteKeywordById(Long id) {
        keywordRepository.deleteById(id);
    }

}
