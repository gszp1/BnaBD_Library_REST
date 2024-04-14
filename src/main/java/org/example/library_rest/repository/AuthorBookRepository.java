package org.example.library_rest.repository;


import org.example.library_rest.key.AuthorBookPrimaryKey;
import org.example.library_rest.model.AuthorBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorBookRepository extends JpaRepository<AuthorBook, AuthorBookPrimaryKey> {
}
