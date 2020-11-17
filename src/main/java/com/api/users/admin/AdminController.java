package com.api.users.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminRepository repo;

    @GetMapping("/admins")
    public List<Admin> getStudents() {
        return (List<Admin>) repo.findAll();
    }

    @GetMapping("/admin/{id}")
    public Admin getStudent(@PathVariable Integer id) {
        return repo.findById(id).get();
    }

    @PostMapping("/admins")
    public void addStudent(@RequestBody Admin ad) {
        repo.save(ad);
    }
}
