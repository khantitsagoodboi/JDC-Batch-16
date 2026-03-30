package com.jdc.akk.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SelectByLabelPrice {
	private String category;
	private String product;
	private double price;
}
