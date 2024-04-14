package org.example.library_rest.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;

    @Column(length = 255, unique = true, nullable = false)
    private String isbn;

    @Column(length = 255, nullable = false)
    private String image;

    @Column(length = 255, unique = true, nullable = false)
    private String name;

    @Column(length = 255)
    private String place;

    @Column(nullable = false)
    private Long quantity;

    @Column(nullable = false)
    private LocalDate releaseDate;

    @Column(nullable = false)
    private Long tome;

    @OneToMany(mappedBy = "book")
    private List<BookUser> bookBorrows = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "series_id")
    private Series series;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    @OneToMany(mappedBy = "book")
    private List<KeywordBook> bookKeywords = new ArrayList<>();

    @OneToMany(mappedBy = "book")
    private List<GenreBook> genres = new ArrayList<>();

    @OneToMany(mappedBy = "book")
    private List<AuthorBook> bookAuthors = new ArrayList<>();

    protected Book() {
    }

    public Book(String isbn, String image, String name, String place, Long quantity,
                LocalDate releaseDate, Long tome, Series series, Publisher publisher) {
        this.isbn = isbn;
        this.image = image;
        this.name = name;
        this.place = place;
        this.quantity = quantity;
        this.releaseDate = releaseDate;
        this.tome = tome;
        this.series = series;
        this.publisher = publisher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<BookUser> getBookBorrows() {
        return bookBorrows;
    }

    public void setBookBorrows(List<BookUser> bookBorrows) {
        this.bookBorrows = bookBorrows;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public List<KeywordBook> getBookKeywords() {
        return bookKeywords;
    }

    public void setBookKeywords(List<KeywordBook> bookKeywords) {
        this.bookKeywords = bookKeywords;
    }

    public List<AuthorBook> getBookAuthors() {
        return bookAuthors;
    }

    public void setBookAuthors(List<AuthorBook> bookAuthors) {
        this.bookAuthors = bookAuthors;
    }

    public List<GenreBook> getGenres() {
        return genres;
    }

    public void setGenres(List<GenreBook> genres) {
        this.genres = genres;
    }

    public Long getTome() {
        return tome;
    }

    public void setTome(Long tome) {
        this.tome = tome;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", quantity=" + quantity +
                ", releaseDate=" + releaseDate +
                ", tome=" + tome +
                ", bookBorrows=" + bookBorrows +
                ", series=" + series +
                ", publisher=" + publisher +
                ", bookKeywords=" + bookKeywords +
                ", genres=" + genres +
                ", bookAuthors=" + bookAuthors +
                '}';
    }
}
