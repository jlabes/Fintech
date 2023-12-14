package com.fiap.fintech.model.welcome;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class FinancialPortfolio {
	
	private Integer month;

	private Integer year;

	private BigDecimal income;

	private BigDecimal expenses;

	private BigDecimal investiment;

	private BigDecimal result;
}
