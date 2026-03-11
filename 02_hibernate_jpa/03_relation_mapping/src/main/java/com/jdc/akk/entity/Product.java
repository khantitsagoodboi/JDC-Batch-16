package com.jdc.akk.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
//@Entity
@Table(name = "product_tbl")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 45, nullable = false, unique = true)
	private String name;
	
	@Column(columnDefinition = "tinyint(1) not null default 1")
	private boolean isTrue;
	
	@ManyToOne    //add a column
	private Category category;
}
