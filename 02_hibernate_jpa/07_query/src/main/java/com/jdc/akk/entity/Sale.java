package com.jdc.akk.entity;

import java.time.LocalDate;
import java.util.UUID;

import com.jdc.akk.entity.listeners.EnableTimesListener;
import com.jdc.akk.entity.listeners.Times;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "sale_tbl")
public class Sale implements EnableTimesListener {
	@Id
	@Column(length = 36)
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Embedded
	private Times times;
	
	@ManyToOne
	private Customer customer;
	
	@ManyToOne
	private Employee employee;
	
	@Column(name = "sale_date")
	private LocalDate saleDate;
}
