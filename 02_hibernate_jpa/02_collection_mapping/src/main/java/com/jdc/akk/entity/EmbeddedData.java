package com.jdc.akk.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class EmbeddedData {
	//@Column(name = "value_one")
	private String valueFromEmbedded;
	
	//@Column(name = "value_two")
	//private int valueTwoFromEmbedded;
	
//	@ElementCollection
//	private List<String> data;
}
