package org.example.library_rest.model;

import jakarta.persistence.*;
import org.example.library_rest.key.KeywordBookPrimaryKey;

import java.util.Objects;

@Entity
@Table(name = "books_keywords")
public class KeywordBook {

    @EmbeddedId
    private KeywordBookPrimaryKey keywordBookPrimaryKey;

    @ManyToOne
    @MapsId("keywordId")
    @JoinColumn(name = "keywords_keyword_id")
    private Keyword keyword;

    @ManyToOne
    @MapsId("bookId")
    @JoinColumn(name = "books_book_id")
    private Book book;

    public KeywordBook() {
    }

    public KeywordBook(KeywordBookPrimaryKey keywordBookPrimaryKey, Keyword keyword, Book book) {
        this.keywordBookPrimaryKey = keywordBookPrimaryKey;
        this.keyword = keyword;
        this.book = book;
    }

    public KeywordBookPrimaryKey getKeywordBookPrimaryKey() {
        return keywordBookPrimaryKey;
    }

    public void setKeywordBookPrimaryKey(KeywordBookPrimaryKey keywordBookPrimaryKey) {
        this.keywordBookPrimaryKey = keywordBookPrimaryKey;
    }

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeywordBook that = (KeywordBook) o;
        return Objects.equals(keywordBookPrimaryKey, that.keywordBookPrimaryKey) && Objects.equals(keyword, that.keyword) && Objects.equals(book, that.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keywordBookPrimaryKey, keyword, book);
    }

    @Override
    public String toString() {
        return "KeywordBook{" +
                "keywordBookPrimaryKey=" + keywordBookPrimaryKey +
                ", keyword=" + keyword +
                ", book=" + book +
                '}';
    }
}
