package com.api.users.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo repo;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return (List<Student>) repo.findAll();
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable Integer id) {
        return repo.findById(id).get();
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Student stu) {
        repo.save(stu);
    }
}
