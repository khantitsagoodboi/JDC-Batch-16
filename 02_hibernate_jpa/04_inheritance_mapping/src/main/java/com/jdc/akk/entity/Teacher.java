package com.jdc.akk.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("3")
public class Teacher extends Account{
	
	public Teacher() {
		setRole(Role.TEACHER);
	}

	private String teaching;
}
