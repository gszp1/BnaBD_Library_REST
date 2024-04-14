package org.example.library_rest.key;


import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class KeywordBookPrimaryKey implements Serializable {

    private Long keywordId;

    private Long bookId;

    public KeywordBookPrimaryKey() {
    }

    public KeywordBookPrimaryKey(Long keywordId, Long bookId) {
        this.keywordId = keywordId;
        this.bookId = bookId;
    }

    public Long getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(Long keywordId) {
        this.keywordId = keywordId;
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
        KeywordBookPrimaryKey that = (KeywordBookPrimaryKey) o;
        return Objects.equals(keywordId, that.keywordId) && Objects.equals(bookId, that.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keywordId, bookId);
    }

    @Override
    public String toString() {
        return "KeywordBookPrimaryKey{" +
                "keywordId=" + keywordId +
                ", bookId=" + bookId +
                '}';
    }
}

