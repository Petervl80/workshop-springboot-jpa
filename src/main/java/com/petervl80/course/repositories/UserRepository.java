package com.petervl80.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petervl80.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
