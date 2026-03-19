package com.jdc.akk.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("1")
@DiscriminatorColumn(name = "Child",discriminatorType = DiscriminatorType.INTEGER)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@MappedSuperclass
public abstract class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	@Column(nullable = false,length = 20,unique = true)
	private String loginId;
	@Column(nullable = false,length = 20)
	private String password;
	@Enumerated(EnumType.STRING)
	private Role role;
	
	public enum Role {
		STUDENT, TEACHER, STAFF;
	}
}
