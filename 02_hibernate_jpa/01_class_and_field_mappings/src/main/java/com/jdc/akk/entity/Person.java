package com.jdc.akk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
import lombok.Data;


@Entity
@Data
@Table(name = "person_tbl")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(generator = "gen_person_tbl")
	//@TableGenerator(name = "gen_person_tbl", initialValue = 1, allocationSize = 1)
	//@SequenceGenerator(name = "gen_person_tbl", initialValue = 5, allocationSize = 100)
	private int id;
	private String name;
	private int age;
}
