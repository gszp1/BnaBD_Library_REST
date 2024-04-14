package org.example.library_rest.repository;

import org.example.library_rest.key.GenreBookPrimaryKey;
import org.example.library_rest.model.GenreBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreBookRepository extends JpaRepository<GenreBook, GenreBookPrimaryKey> {
}
