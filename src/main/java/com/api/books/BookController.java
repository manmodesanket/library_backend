package com.api.books;

import java.util.List;
//import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private BookRepo bookrepo;

    Logger logger = LoggerFactory.getLogger(BookController.class);

    @RequestMapping("/books")
    public List<Book> getAllBooks() {
        logger.trace("Books accessed");
        return (List<Book>) bookrepo.findAll();
    }

    @RequestMapping("/books/{id}")
    public Book getBook(@PathVariable Integer id) {
        logger.trace("Book with id " + id + " accessed");
        return bookrepo.findById(id).get();
    }

    @PostMapping("/books")
    public void addBook(@RequestBody Book book) {
        bookrepo.save(book);
        logger.trace("New book added with id " + book.getId());
    }

}
