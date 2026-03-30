package com.jdc.akk.entity;

import com.jdc.akk.entity.listeners.EnableTimesListener;
import com.jdc.akk.entity.listeners.Times;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "sale_details_tbl")
public class SaleDetails implements EnableTimesListener{
	
	private int qty;
	
	@Column(name = "sale_price")
	private double salePrice;
	
	@Embedded
	private Times times;
	
	@ManyToOne
	@MapsId("medicineId")
	private Medicine medicine;
	
	@ManyToOne
	@MapsId("saleId")
	private Sale sale;
	
	@EmbeddedId
	private SaleDetailsPk saleDetailsPk;
}
