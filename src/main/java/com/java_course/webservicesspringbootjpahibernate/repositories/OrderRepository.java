package com.java_course.webservicesspringbootjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java_course.webservicesspringbootjpahibernate.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
