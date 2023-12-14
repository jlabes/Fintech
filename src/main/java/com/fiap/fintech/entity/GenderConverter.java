package com.fiap.fintech.entity;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class GenderConverter implements AttributeConverter<Gender, String> {

	@Override
	public Gender convertToEntityAttribute(String gender) {
		if (gender == null) {
			return null;
		}

		return Gender.of(gender);
	}

	@Override
	public String convertToDatabaseColumn(Gender gender) {
		if (gender == null) {
			return null;
		}
		return gender.getValue();
	}
}