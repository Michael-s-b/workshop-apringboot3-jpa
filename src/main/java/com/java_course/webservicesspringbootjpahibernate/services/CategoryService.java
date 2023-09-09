package com.java_course.webservicesspringbootjpahibernate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java_course.webservicesspringbootjpahibernate.entities.Category;
import com.java_course.webservicesspringbootjpahibernate.repositories.CategoryRepository;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        return repository.findById(id).get();
    }
}
