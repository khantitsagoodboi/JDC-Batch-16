package com.jdc.akk.entity;


import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Convert;

@Convert
public class StringConverter implements AttributeConverter<String, Integer> {

	@Override
	public Integer convertToDatabaseColumn(String str) {
		try {
			return Integer.valueOf(str);
		} catch (Exception e) {
			System.out.println("Can't convert to integer");
		}
		return null;
	}

	@Override
	public String convertToEntityAttribute(Integer dbData) {
		return String.valueOf(dbData);
	}

}
