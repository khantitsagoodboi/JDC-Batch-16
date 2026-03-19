package com.jdc.akk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;

//@Entity
@Data
@Table(
		name = "member_tbl",
		indexes = {@Index(columnList = "id")},
		uniqueConstraints = {@UniqueConstraint(columnNames = {"address"})}
		)
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
}

