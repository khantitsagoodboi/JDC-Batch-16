package com.jdc.akk.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "address_tbl")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 45)
	private String state;
	
	@Column(length = 45)
	private String township;
	
	@Column(length = 45, nullable = false)
	private String street;

	@ManyToMany (mappedBy = "addresses")
	private List<Customer> customer;
}
