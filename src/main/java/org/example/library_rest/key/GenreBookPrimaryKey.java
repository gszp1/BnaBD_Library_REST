package org.example.library_rest.key;



import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class GenreBookPrimaryKey implements Serializable {

    private Long genreId;

    private Long bookId;

    public GenreBookPrimaryKey() {
    }

    public GenreBookPrimaryKey(Long genreId, Long bookId) {
        this.genreId = genreId;
        this.bookId = bookId;
    }

    public Long getGenreId() {
        return genreId;
    }

    public void setGenreId(Long genreId) {
        this.genreId = genreId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenreBookPrimaryKey that = (GenreBookPrimaryKey) o;
        return Objects.equals(genreId, that.genreId) && Objects.equals(bookId, that.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genreId, bookId);
    }

    @Override
    public String toString() {
        return "GenreBookPrimaryKey{" +
                "genreId=" + genreId +
                ", bookId=" + bookId +
                '}';
    }
}
