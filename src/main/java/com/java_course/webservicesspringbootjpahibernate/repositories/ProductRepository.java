package com.java_course.webservicesspringbootjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java_course.webservicesspringbootjpahibernate.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
