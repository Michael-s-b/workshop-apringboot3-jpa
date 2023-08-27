package com.java_course.webservicesspringbootjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java_course.webservicesspringbootjpahibernate.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
