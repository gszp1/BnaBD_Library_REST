package org.example.library_rest.controllers;

import org.example.library_rest.model.Genre;
import org.example.library_rest.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/genres")
public class GenreController {

    private final GenreService genreService;

    @Autowired
    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping("/all")
    public List<Genre> getAllGenres() {
        return genreService.getAllGenres();
    }

    @GetMapping("/{id}")
    public Genre getGenreById(@PathVariable("id") Long id) {
        Optional<Genre> genre = genreService.getGenreById(id);
        return genre.orElse(null);
    }

    @PostMapping("/add")
    public Genre addGenre(@RequestBody Genre genre) {
        return genreService.saveGenre(genre);
    }

    @PutMapping("/update")
    public Genre updateGenre(@RequestBody Genre genre) {
        return genreService.updateGenre(genre);
    }

    @DeleteMapping("/delete")
    public void deleteGenre(@RequestParam("id") Long id) {
        genreService.deleteGenreById(id);
    }
}
