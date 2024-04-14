package org.example.library_rest.model;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "keywords")
public class Keyword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "keyword_id")
    private Long id;

    @Column(length = 255, nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "keyword")
    private List<KeywordBook> keywordBooks = new ArrayList<>();

    protected Keyword() {
    }

    public Keyword(String name) {
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

    public List<KeywordBook> getKeywordBooks() {
        return keywordBooks;
    }

    public void setKeywordBooks(List<KeywordBook> keywordBooks) {
        this.keywordBooks = keywordBooks;
    }

    @Override
    public String toString() {
        return "Keyword{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", keywordBooks=" + keywordBooks +
                '}';
    }
}
