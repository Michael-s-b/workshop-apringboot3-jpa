package com.java_course.webservicesspringbootjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java_course.webservicesspringbootjpahibernate.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
