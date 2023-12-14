package com.fiap.fintech.model.welcome;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class WelcomeModel {

	private UserModel user;

	private FinancialPortfolio portfolio;

	private LastExpenseModel lastExpense;
}
