package com.fiap.fintech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.fintech.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUserCode(String userid);
}