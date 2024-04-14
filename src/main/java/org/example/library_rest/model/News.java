package org.example.library_rest.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "news_id")
    private Long id;

    @Column(name = "book_id")
    private Long bookId;

    @Column(length = 255)
    private String image;

    @Column(name = "news_date")
    private LocalDate newsDate;

    @Column(columnDefinition = "TEXT")
    private String text;

    @Column(length = 255)
    private String title;

    protected News() {
    }

    public News(Long bookId, String image, LocalDate newsDate, String text, String title) {
        this.bookId = bookId;
        this.image = image;
        this.newsDate = newsDate;
        this.text = text;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDate getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(LocalDate newsDate) {
        this.newsDate = newsDate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", bookId=" + bookId +
                ", image='" + image + '\'' +
                ", newsDate=" + newsDate +
                ", text='" + text + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
