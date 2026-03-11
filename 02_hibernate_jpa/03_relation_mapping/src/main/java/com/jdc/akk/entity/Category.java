package com.jdc.akk.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

//@Entity
@Data
@Table(name = "category_tbl")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 45, nullable = false, unique = true)
	private String name;
	
	@Column(columnDefinition = "tinyint(1) not null default 1")
	private boolean isActive;
	
	@ElementCollection
	@OneToMany(mappedBy = "category")  //add join table
	private List<Product> products;
}
