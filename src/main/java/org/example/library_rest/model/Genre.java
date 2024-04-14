package org.example.library_rest.model;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "genres")
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genre_id")
    private Long id;

    @Column(length = 255, unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "genre")
    private List<GenreBook> genreBooks = new ArrayList<>();

    protected Genre() {
    }

    public Genre(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GenreBook> getGenreBooks() {
        return genreBooks;
    }

    public void setGenreBooks(List<GenreBook> genreBooks) {
        this.genreBooks = genreBooks;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genreBooks=" + genreBooks +
                '}';
    }
}
