package com.jdc.akk.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ExcludeDefaultListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@ExcludeDefaultListeners
@Table(name = "category_tbl")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 45)
	private String name;
	
	//@ColumnDefault("1") // for hibernate project
	@Column(columnDefinition = "tinyint(1) default 1", name = "is_active")
	private boolean isActive;
	
	@OneToMany(mappedBy = "category")
	private List<Medicine> medicines;
}
