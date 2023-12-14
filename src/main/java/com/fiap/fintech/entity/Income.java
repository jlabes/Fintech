package com.fiap.fintech.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "INCOME", uniqueConstraints = { @UniqueConstraint(columnNames = { "DESCRIPTION", "USER_ID", "DATE_INCOME"}) })
public class Income {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
    @JoinColumn(name="USER_ID", nullable = false)
	private User user;

	@Column(name = "DATE_INCOME", columnDefinition = "TIMESTAMP")
	private LocalDateTime date;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "VALUE_INCOME")
	private BigDecimal value;
}
