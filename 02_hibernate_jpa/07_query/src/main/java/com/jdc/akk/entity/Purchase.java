package com.jdc.akk.entity;

import java.time.LocalDate;
import java.util.UUID;

import com.jdc.akk.entity.listeners.EnableTimesListener;
import com.jdc.akk.entity.listeners.Times;
import jakarta.persistence.CascadeType;
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
@Table(name = "purchase_tbl")
public class Purchase implements EnableTimesListener {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Supplier supplier;
	
	@Embedded
	private Times times;
	
	@Column(name = "issue_date")
	private LocalDate issueDate;
}
