package org.example.library_rest.controllers;

import org.example.library_rest.model.Keyword;
import org.example.library_rest.service.KeywordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/keywords")
public class KeywordController {

    private final KeywordService keywordService;

    @Autowired
    public KeywordController(KeywordService keywordService) {
        this.keywordService = keywordService;
    }

    @GetMapping("/all")
    public List<Keyword> findAll() {
        return keywordService.getAllKeywords();
    }

    @GetMapping("/{id}")
    public Keyword findById(@PathVariable("id") Long id) {
        Optional<Keyword> keyword = keywordService.getKeywordById(id);
        return keyword.orElse(null);
    }

    @PostMapping("/add")
    public Keyword save(@RequestBody Keyword keyword) {
        return keywordService.saveKeyword(keyword);
    }

    @DeleteMapping("/delete")
    public void deleteById(@RequestParam("id") Long id) {
        keywordService.deleteKeywordById(id);
    }

    @PutMapping("/update")
    public Keyword update(@RequestBody Keyword keyword) {
        return keywordService.updateKeyword(keyword);
    }
}
