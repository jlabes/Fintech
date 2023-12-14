package com.fiap.fintech.entity;

import java.security.InvalidParameterException;
import java.util.stream.Stream;

public enum Gender {

	MALE("M"), FEMALE("F");

	private String value;

	Gender(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public static Gender of(String gender) {
		return Stream.of(Gender.values()).filter(g -> g.getValue().equalsIgnoreCase(gender)).findFirst()
				.orElseThrow(InvalidParameterException::new);
	}
}
