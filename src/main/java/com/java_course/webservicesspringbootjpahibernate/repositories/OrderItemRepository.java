package com.java_course.webservicesspringbootjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java_course.webservicesspringbootjpahibernate.entities.OrderItem;
import com.java_course.webservicesspringbootjpahibernate.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
