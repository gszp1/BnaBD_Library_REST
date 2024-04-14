package org.example.library_rest.repository;

import org.example.library_rest.model.BookUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookUserRepository extends JpaRepository<BookUser, Long> {
}
