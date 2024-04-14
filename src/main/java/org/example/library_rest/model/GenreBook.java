package org.example.library_rest.model;


import jakarta.persistence.*;
import org.example.library_rest.key.GenreBookPrimaryKey;

@Entity
@Table(name = "books_genres")
public class GenreBook {

    @EmbeddedId
    private GenreBookPrimaryKey genreBookPrimaryKey;

    @ManyToOne
    @MapsId("genreId")
    @JoinColumn(name = "genres_genre_id")
    private Genre genre;

    @ManyToOne
    @MapsId("bookId")
    @JoinColumn(name = "books_book_id")
    private Book book;

    public GenreBook() {
    }

    public GenreBook(GenreBookPrimaryKey genreBookPrimaryKey, Genre genre, Book book) {
        this.genreBookPrimaryKey = genreBookPrimaryKey;
        this.genre = genre;
        this.book = book;
    }

    public GenreBookPrimaryKey getGenreBookPrimaryKey() {
        return genreBookPrimaryKey;
    }

    public void setGenreBookPrimaryKey(GenreBookPrimaryKey genreBookPrimaryKey) {
        this.genreBookPrimaryKey = genreBookPrimaryKey;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "GenreBook{" +
                "genreBookPrimaryKey=" + genreBookPrimaryKey +
                ", genre=" + genre +
                ", book=" + book +
                '}';
    }
}
