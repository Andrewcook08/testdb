package com.example.testdb.repository;

import com.example.testdb.model.User;
//JpaRepository interface from Spring Data JPA, which provides a set of generic methods for performing CRUD
import org.springframework.data.jpa.repository.JpaRepository;

// by extending JpaRepository, UserRepository inherits a number of methods for interacting with the database, such as save(), findAll(), findById(), delete()
public interface UserRepository extends JpaRepository<User, Integer> {
}
