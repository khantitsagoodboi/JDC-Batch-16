package com.jdc.akk.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.ExcludeDefaultListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@ExcludeDefaultListeners
@Table(name = "supplier_tbl")
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 45)
	private String name;
	
	@Embedded
	private Contact contact;
	
	@Embedded
	@AttributeOverride(name = "phone", column = @Column(name = "secondary_phone", length = 20, unique = true))
	@AttributeOverride(name = "email", column = @Column(name = "secondary_email", length = 45, unique = true))
	private Contact contactOne;
	
	@Column(columnDefinition = "tinyint(1) default 1", name = "is_active")
	private boolean isActive;
}
