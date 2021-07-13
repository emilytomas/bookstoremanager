package com.emilytomas.bookstoremanager.repository;

import com.emilytomas.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
