package com.jdc.akk.entity;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class EmbeddedData {
	private String value;
	
//	@ElementCollection
//	private List<String> data;
}
