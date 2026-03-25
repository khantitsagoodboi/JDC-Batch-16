package com.jdc.akk.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("4")
public class Student extends Account{
	
	public Student(String loginId, String psw) {
		super(loginId, psw);
		setRole(Role.STUDENT);
	}
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Course course;
}