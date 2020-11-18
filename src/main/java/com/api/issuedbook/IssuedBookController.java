package com.api.issuedbook;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IssuedBookController {

    @Autowired
    private IssuedBookRepo repo;

    Logger logger = LoggerFactory.getLogger(IssuedBookController.class);

    @GetMapping("/issuedbooks")
    public List<IssuedBook> geIssuedBooks() {
        return (List<IssuedBook>) repo.findAll();
    }

    @GetMapping("/issuedbooks/{id}")
    public List<IssuedBook> getIssuedBook(@PathVariable Integer id) {
        logger.trace("issued book with id:" + id);
        return (List<IssuedBook>) repo.selectById(id);
    }

}
