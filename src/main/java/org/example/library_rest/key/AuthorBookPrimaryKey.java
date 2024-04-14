package org.example.library_rest.key;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AuthorBookPrimaryKey implements Serializable {

    private Long authorId;

    private Long bookId;

    protected AuthorBookPrimaryKey() {
    }

    public AuthorBookPrimaryKey(Long authorId, Long bookId) {
        this.authorId = authorId;
        this.bookId = bookId;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
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
        AuthorBookPrimaryKey that = (AuthorBookPrimaryKey) o;
        return Objects.equals(authorId, that.authorId) && Objects.equals(bookId, that.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorId, bookId);
    }

    @Override
    public String toString() {
        return "AuthorBookPrimaryKey{" +
                "authorId=" + authorId +
                ", bookId=" + bookId +
                '}';
    }
}
