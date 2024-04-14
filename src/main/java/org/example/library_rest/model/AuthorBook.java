package org.example.library_rest.model;


import jakarta.persistence.*;
import org.example.library_rest.key.AuthorBookPrimaryKey;

@Entity
@Table(name = "books_authors")
public class AuthorBook {

    @EmbeddedId
    private AuthorBookPrimaryKey authorBookPrimaryKey;

    @ManyToOne
    @MapsId("authorId")
    @JoinColumn(name = "authors_author_id")
    private Author author;

    @ManyToOne
    @MapsId("bookId")
    @JoinColumn(name = "books_book_id")
    private Book book;

    public AuthorBook() {
    }

    public AuthorBook(AuthorBookPrimaryKey authorBookPrimaryKey, Author author, Book book) {
        this.authorBookPrimaryKey = authorBookPrimaryKey;
        this.author = author;
        this.book = book;
    }

    public AuthorBookPrimaryKey getAuthorBookPrimaryKey() {
        return authorBookPrimaryKey;
    }

    public void setAuthorBookPrimaryKey(AuthorBookPrimaryKey authorBookPrimaryKey) {
        this.authorBookPrimaryKey = authorBookPrimaryKey;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "AuthorBook{" +
                "authorBookPrimaryKey=" + authorBookPrimaryKey +
                ", author=" + author +
                ", book=" + book +
                '}';
    }
}
