package com.example.springcrudoperation.repository;

import com.example.springcrudoperation.model.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books, Integer> {
}
