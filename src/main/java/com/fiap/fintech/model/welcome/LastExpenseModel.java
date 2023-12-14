package com.fiap.fintech.model.welcome;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LastExpenseModel {

	private LocalDate date;

	private String description;

	private BigDecimal value;

	private String paymentCard;
}
