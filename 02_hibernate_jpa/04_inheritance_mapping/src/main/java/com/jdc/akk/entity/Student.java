package com.jdc.akk.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("4")
public class Student extends Account{
	
	public Student() {
		setRole(Role.STUDENT);
	}
	
	@ManyToOne
	private Course course;
}