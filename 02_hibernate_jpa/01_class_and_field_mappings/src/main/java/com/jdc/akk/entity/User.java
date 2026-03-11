package com.jdc.akk.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

@Entity
@Data
@SecondaryTable(name = "contact_tbl")
@Table(
		name = "user_tbl"
//		indexes = { @Index(columnList = "phone,email")}, 
//		uniqueConstraints = { @UniqueConstraint(columnNames = { "email", "phone" }) }
		)
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column (table = "contact_tbl")
	private String email;
	@Column (table = "contact_tbl")
	private String phone;
	private int age;
	@Embedded
	private UserInfo info;
}
