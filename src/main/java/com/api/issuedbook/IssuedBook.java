package com.api.issuedbook;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IssuedBook {

    @Id
    private Integer id;
    private Integer issuedBy;
    private Integer issuedTo;

    public IssuedBook() {

    }

    public IssuedBook(Integer id, Integer issuedBy, Integer issuedTo) {
        this.id = id;
        this.issuedBy = issuedBy;
        this.issuedTo = issuedTo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(Integer issuedBy) {
        this.issuedBy = issuedBy;
    }

    public Integer getIssuedTo() {
        return issuedTo;
    }

    public void setIssuedTo(Integer issuedTo) {
        this.issuedTo = issuedTo;
    }

}