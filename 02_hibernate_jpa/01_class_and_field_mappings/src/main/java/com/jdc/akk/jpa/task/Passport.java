package com.jdc.akk.jpa.task;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
@Table(name = "passport_tbl")
public class Passport {
	@Id
	@Column(columnDefinition = "varchar(9)")
	private String id;
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Blood bt;
	@Temporal(TemporalType.DATE)
	private Date issue_date;
	@Temporal(TemporalType.DATE)
	private Date valid_date;
	@Column(columnDefinition = "int unique")
	private int customer_id;
	
	public enum Blood {
		A,
		B,
		AB,
		O
	}
}
