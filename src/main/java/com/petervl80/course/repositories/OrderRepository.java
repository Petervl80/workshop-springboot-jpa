package com.petervl80.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petervl80.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
