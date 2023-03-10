package com.example.springcrudoperation.controller;


import com.example.springcrudoperation.model.Books;
import com.example.springcrudoperation.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksController {

    @Autowired
    BooksService booksService;


    @GetMapping("/book")

    private List<Books> getAllBooks()
    {
        return booksService.getAllBooks();
    }

    @GetMapping("/book/{bookid}")

    private Books getBookd(@PathVariable("bookid") int bookid)
    {
        return booksService.getBooksById(bookid);
    }

    @DeleteMapping("/book/{bookid}")
    private void deleteBook(@PathVariable("bookid") int bookid)
    {
        booksService.delete(bookid);
    }

    @PostMapping("/books")
    private int saveBook(@RequestBody Books books)
    {
        booksService.saveOrUpdate(books);
        return books.getBookid();
    }

    @PutMapping("/books")

    private Books update(@RequestBody Books books)
    {
        booksService.saveOrUpdate(books);

        return books;
    }
}
