package com.jdc.akk.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class SubData implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private String child;
	private int count;
}
