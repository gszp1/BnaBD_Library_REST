package org.example.library_rest.model;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private Long id;

    @Column(length = 255, nullable = false)
    private String name;

    @OneToMany(mappedBy = "author")
    private List<AuthorBook> authorBooks = new ArrayList<>();

    protected Author() {
    }

    public Author(String name) {
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

    public List<AuthorBook> getAuthorBooks() {
        return authorBooks;
    }

    public void setAuthorBooks(List<AuthorBook> authorBooks) {
        this.authorBooks = authorBooks;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authorBooks=" + authorBooks +
                '}';
    }
}
