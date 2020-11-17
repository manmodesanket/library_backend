package com.api.books;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String author;
    private String description;
    private Integer Counter;

    public Book() {
    };

    public Book(Integer id, String name, String author, String description) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCounter() {
        return Counter;
    }

    public void setCounter(Integer counter) {
        Counter = counter;
    }

}