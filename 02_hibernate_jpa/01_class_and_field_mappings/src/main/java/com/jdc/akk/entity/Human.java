package com.jdc.akk.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;

//@Entity
@Data
@Table(name = "human_tbl")
@IdClass(HumanClassPk.class)
public class Human {
//	@EmbeddedId
//	private HumanPk id;
	private String name;
	
	@Id
	private String phone;
	@Id
	private String email;
}
