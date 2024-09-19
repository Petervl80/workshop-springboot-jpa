package com.petervl80.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petervl80.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
