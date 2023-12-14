package com.fiap.fintech.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.fintech.entity.Income;
import com.fiap.fintech.entity.User;
import com.fiap.fintech.model.welcome.FinancialPortfolio;
import com.fiap.fintech.model.welcome.UserModel;
import com.fiap.fintech.model.welcome.WelcomeModel;
import com.fiap.fintech.repository.IncomeRepository;
import com.fiap.fintech.repository.UserRepository;

@Service
public class FintechService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private IncomeRepository incomeRepository;

	public WelcomeModel getData(String userId) {
		User user = userRepository.findByUserCode(userId);

		List<Income> incomes = incomeRepository.findAllByUser(user);

		WelcomeModel welcomeModel = WelcomeModel.builder().user(buildUser(user))
				.portfolio(buildPortfolio(incomes)).build();

		return welcomeModel;
	}

	private UserModel buildUser(User user) {
		return UserModel.builder().name(user.getName()).lastName(user.getLastName()).build();
	}

	private BigDecimal calcMonthlyIncome(List<Income> incomes) {
		return incomes.stream().map(Income::getValue).reduce(BigDecimal.ZERO, BigDecimal::add);
	}

	private FinancialPortfolio buildPortfolio(List<Income> incomes) {
		return FinancialPortfolio.builder().income(calcMonthlyIncome(incomes)).build();

	}
}