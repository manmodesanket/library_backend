package com.api.users.librarian;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibrarianController {
    @Autowired
    private LibrarianRepository repo;

    @GetMapping("/libs")
    public List<Librarian> getStudents() {
        return (List<Librarian>) repo.findAll();
    }

    @GetMapping("/lib/{id}")
    public Librarian getStudent(@PathVariable Integer id) {
        return repo.findById(id).get();
    }

    @PostMapping("/libs")
    public void addStudent(@RequestBody Librarian lib) {
        repo.save(lib);
    }
}
