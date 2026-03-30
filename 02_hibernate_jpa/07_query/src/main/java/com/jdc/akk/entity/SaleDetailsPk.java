package com.jdc.akk.entity;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class SaleDetailsPk implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "sale_id")
	private UUID saleId;
	
	@Column(name = "medicine_id")
	private int medicineId;
	
	@Column(name = "sale_time")
	private LocalTime saleTime;
}
