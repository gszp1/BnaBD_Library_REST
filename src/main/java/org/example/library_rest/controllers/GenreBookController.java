package org.example.library_rest.controllers;

import org.example.library_rest.key.GenreBookPrimaryKey;
import org.example.library_rest.model.GenreBook;
import org.example.library_rest.service.GenreBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/genre_books")
public class GenreBookController {

    private final GenreBookService genreBookService;

    @Autowired
    public GenreBookController(GenreBookService genreBookService) {
        this.genreBookService = genreBookService;
    }

    @GetMapping("/all")
    public List<GenreBook> getAllGenreBooks() {
        return genreBookService.getAll();
    }

    @GetMapping("/id")
    public GenreBook getGenreBookById(@RequestParam("bookId") Long bookId, @RequestParam("genreId") Long genreId) {
        Optional<GenreBook> genreBook = genreBookService.getById(new GenreBookPrimaryKey(genreId, bookId));
        return genreBook.orElse(null);
    }

    @PostMapping("/add")
    public GenreBook addGenreBook(@RequestBody GenreBook genreBook) {
        return genreBookService.save(genreBook);
    }

    @PutMapping("/update")
    public GenreBook updateGenreBook(@RequestBody GenreBook genreBook) {
        return genreBookService.save(genreBook);
    }

    @DeleteMapping("/delete")
    public void deleteGenreBook(@RequestParam("bookId") Long id, @RequestParam("genreId")Long genreId) {
        genreBookService.deleteById(new GenreBookPrimaryKey(genreId, id));
    }
}
