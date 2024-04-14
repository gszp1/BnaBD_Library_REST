package org.example.library_rest.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user_data")
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_data_id")
    private Long id;

    @Column(name = "ic_number", length = 255, nullable = false, unique = true)
    private String icNumber;

    @Column(length = 12, nullable = false, unique = true)
    private String pesel;

    @Column(length = 255)
    private String city;

    @Column(length = 255, unique = true, nullable = false)
    private String email;

    @Column(length = 255)
    private String name;

    @Column(length = 13, name = "phone_number")
    private String phoneNumber;

    @Column(length = 10, name = "postal_code")
    private String postalCode;

    @Column(length = 255)
    private String street;

    @Column(length = 255)
    private String surname;

    @OneToMany(mappedBy = "userData")
    List<Account> accounts = new ArrayList<>();

    @OneToMany(mappedBy = "userData")
    List<BookUser> bookUsers = new ArrayList<>();

    protected UserData() {
    }

    public UserData(String icNumber, String pesel, String city, String email,
                    String name, String phoneNumber, String postalCode, String street, String surname) {
        this.icNumber = icNumber;
        this.pesel = pesel;
        this.city = city;
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.postalCode = postalCode;
        this.street = street;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIcNumber() {
        return icNumber;
    }

    public void setIcNumber(String icNumber) {
        this.icNumber = icNumber;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<BookUser> getBookUsers() {
        return bookUsers;
    }

    public void setBookUsers(List<BookUser> bookUsers) {
        this.bookUsers = bookUsers;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "id=" + id +
                ", icNumber='" + icNumber + '\'' +
                ", pesel='" + pesel + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", street='" + street + '\'' +
                ", surname='" + surname + '\'' +
                ", accounts=" + accounts +
                ", bookUsers=" + bookUsers +
                '}';
    }
}