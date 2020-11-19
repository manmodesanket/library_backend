package com.api.users.admin;

import java.util.List;

import com.api.users.librarian.Librarian;
import com.api.users.librarian.LibrarianRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminRepository repo;

    @Autowired
    private LibrarianRepository libRepo;

    @GetMapping("/admins")
    public List<Admin> getAdmins() {
        return (List<Admin>) repo.findAll();
    }

    @GetMapping("/admin/{id}")
    public Admin getAdmin(@PathVariable Integer id) {
        return repo.findById(id).get();
    }

    @PostMapping("/admins")
    public void addAdmin(@RequestBody Admin ad) {
        repo.save(ad);
    }

    @GetMapping("/libs")
    public List<Librarian> getLibrarians() {
        return (List<Librarian>) libRepo.findAll();
    }

    @GetMapping("/lib/{id}")
    public Librarian getLibrarian(@PathVariable Integer id) {
        return libRepo.findById(id).get();
    }

    @PostMapping("/libs")
    public void addLibrarian(@RequestBody Librarian lib) {
        libRepo.save(lib);
    }

    @DeleteMapping("/libs/{id}")
    public void deleteLibrarian(@PathVariable Integer id) {
        libRepo.deleteById(id);
    }
}
