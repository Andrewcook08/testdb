package com.example.testdb.controller;

import com.example.testdb.model.User;
import com.example.testdb.service.UserService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/users") // base url for the controller
@RestController // tells spring to handle web requests and return values go directly to HTTP body (JSON usually)
public class UserController { // handles http requests related to user operations

    @Autowired // provides and instance of user service in this field. Logic behind CRUD operations
    UserService UserService; //

    // get route for the user endpoint just used for testing the route
    @GetMapping("/user")
    public String index(){
        return "hello world";
    }

    // post route that adds a user to the database by going to User Service, creating the User, and then using
    // UserServiceImpl to communicate with the repository to add a user to the database.
    // responds to the http body with the user that was added in JSON format
    @PostMapping("/addUser")
    public User saveUser(@RequestBody User user){
        return UserService.create(user);
    }

    // users/id gives you the user associated with the id
    @GetMapping("{id}")
    // @PathVariable tells Spring to take the value from the URL path and pass it into findById.
    public User getUser(@PathVariable Integer id){
        return UserService.findById(id);
    }

}
