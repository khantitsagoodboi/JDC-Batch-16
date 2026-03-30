package com.jdc.akk.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Contact implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(length = 20, unique = true)
	private String phone;
	
	@Column(length = 45, unique = true)
	private String email;

}
