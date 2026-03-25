package com.jdc.akk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "transfer_tbl")
public class Transfer {

	@Id
	private int id;
	private String name;
	private double balance;
}
