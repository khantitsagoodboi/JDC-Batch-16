package com.jdc.akk.callback;

import java.time.LocalDate;

import com.jdc.akk.callback.listener.EnableTimesListener;
import com.jdc.akk.callback.listener.Times;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "passport_tbl")
public class Passport implements EnableTimesListener{
	@Id
	private String id;
	private LocalDate issueDate;
	private LocalDate validDate;
	@Enumerated(EnumType.STRING)
	private BloodType type;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Person person;
	@Embedded
	private Times times;
	
	public enum BloodType{
		A,B,AB,O
	}
}
