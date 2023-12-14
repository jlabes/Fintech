package com.fiap.fintech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.fintech.entity.Income;
import com.fiap.fintech.entity.User;

public interface IncomeRepository extends JpaRepository<Income, Long> {

	List<Income> findAllByUser(User user);
}
