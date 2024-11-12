package com.example.testdb.service;

import com.example.testdb.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service //Spring will detect this annotation and automatically register the class as a Spring bean, making it available for dependency injection in other parts of the application.
// define a contract that other classes can implement.
// This means that any class that implements the interface must provide implementations for all the methods declared in the interface.
// multiple different implementations for one method
public interface UserService {
    // create method signatures without the implementation
    public User create(User user);

    public User findById(Integer id);
}
