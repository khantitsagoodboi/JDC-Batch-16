package com.jdc.akk.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "customer_tbl")
public class Customer {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 45, nullable = false)
	private String name;
	
	@Column(columnDefinition = "tinyint(1) not null default 1")
	private boolean isActive;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	private Contact contact;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Address> addresses;
	
}
