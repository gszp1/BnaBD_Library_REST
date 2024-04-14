package org.example.library_rest.repository;

import org.example.library_rest.key.KeywordBookPrimaryKey;
import org.example.library_rest.model.KeywordBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeywordBookRepository extends JpaRepository<KeywordBook, KeywordBookPrimaryKey> {
}
