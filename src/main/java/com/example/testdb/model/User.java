package com.example.testdb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity // this will be a table in the database
@Table(name = "User") // name the table in the database
@Data // was going to use it for getters and setters but intellij has a good feature for it.
public class User {
    @Id // marks the column as the primary key
    @Column(name = "Id")
    private int id; // column of the database

    @Column(name = "Name")
    private String name;

    @Column(name = "Email")
    private String email;

    // getters and setters for the fields
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
