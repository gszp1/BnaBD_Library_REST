package org.example.library_rest.service;

import org.example.library_rest.key.GenreBookPrimaryKey;
import org.example.library_rest.model.GenreBook;
import org.example.library_rest.repository.GenreBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenreBookService {

    private GenreBookRepository genreBookRepository;

    @Autowired
    public GenreBookService(GenreBookRepository genreBookRepository) {
        this.genreBookRepository = genreBookRepository;
    }

    public List<GenreBook> getAll() {
        return genreBookRepository.findAll();
    }

    public Optional<GenreBook> getById(GenreBookPrimaryKey genreBookPrimaryKey) {
        return genreBookRepository.findById(genreBookPrimaryKey);
    }

    public GenreBook save(GenreBook genreBook) {
        return genreBookRepository.save(genreBook);
    }

    public void deleteById(GenreBookPrimaryKey genreBookPrimaryKey) {
        genreBookRepository.deleteById(genreBookPrimaryKey);
    }

    public GenreBook update(GenreBook genreBook) {
        return genreBookRepository.save(genreBook);
    }
}
