package com.jdc.akk.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("3")
public class Teacher extends Account{
	
	public Teacher(String loginId, String psw) {
		super(loginId,psw);
		setRole(Role.TEACHER);
	}

	private String teaching;
}
