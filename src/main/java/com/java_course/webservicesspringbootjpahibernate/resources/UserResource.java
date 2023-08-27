package com.java_course.webservicesspringbootjpahibernate.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java_course.webservicesspringbootjpahibernate.entities.User;
import com.java_course.webservicesspringbootjpahibernate.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserService UserService;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> users = UserService.findAll();
        return ResponseEntity.ok().body(users);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User obj = UserService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
