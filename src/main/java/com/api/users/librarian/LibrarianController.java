package com.api.users.librarian;

import java.util.List;

import com.api.books.Book;
import com.api.books.BookRepo;
import com.api.issuedbook.IssuedBook;
import com.api.issuedbook.IssuedBookRepo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibrarianController {
    @Autowired
    private BookRepo bookrepo;

    @Autowired
    private IssuedBookRepo repo;

    Logger logger = LoggerFactory.getLogger(LibrarianController.class);

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        logger.trace("Books accessed");
        return (List<Book>) bookrepo.findAll();
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable Integer id) {
        logger.trace("Book with id " + id + " accessed");
        return bookrepo.findById(id).get();
    }

    @PostMapping("/books")
    public void addBook(@RequestBody Book book) {
        bookrepo.save(book);
        logger.trace("New book added with id " + book.getId());
    }

    @GetMapping("/issuedbooks")
    public List<IssuedBook> getIssuedBooks() {
        return (List<IssuedBook>) repo.findAll();
    }

    @GetMapping("/issuedbooks/{id}")
    public List<IssuedBook> getIssuedBook(@PathVariable Integer id) {
        logger.trace("issued book with id:" + id);
        return (List<IssuedBook>) repo.selectById(id);
    }

    @PostMapping("/issuedbooks")
    public void addIssuedBooks(@RequestBody IssuedBook book) {
        repo.save(book);
    }

}
