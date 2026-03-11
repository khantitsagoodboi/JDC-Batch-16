package com.jdc.akk.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import lombok.Data;

@Embeddable
@Data
public class HumanPk implements Serializable {
	private static final long serialVersionUID = 1L;

	private String phone;
	private String email;
	
}
