package com.petervl80.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petervl80.course.entities.OrderItem;
import com.petervl80.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
