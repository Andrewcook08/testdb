package com.example.testdb.service.ServiceImpl;

import com.example.testdb.model.User;
import com.example.testdb.repository.UserRepository;
import com.example.testdb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService { // implements the interface methods

    // Injects and instance of UserRepository so that the implementation can use it
    @Autowired
    UserRepository UserRepository; //interface that extends JpaRepository or another Spring Data repository, allowing for CRUD operations in the database

    // lets compiler know that you are overriding and implementation of the interface
    @Override
    public User create(User user) {
        // repository connects with the database to insert the data
        return UserRepository.save(user);
    }

    @Override
    public User findById(Integer Id){
        return UserRepository.findById(Id).orElse(null);
    }
}
