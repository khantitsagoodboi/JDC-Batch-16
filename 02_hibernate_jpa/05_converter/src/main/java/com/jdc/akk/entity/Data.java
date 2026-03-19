package com.jdc.akk.entity;

import java.util.Random;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@lombok.Data
@Entity
@Table(name = "data_tbl")
public class Data {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Convert(converter = StringConverter.class)
	private String value;
	
	private SubData data1;
	@AttributeOverride(name = "child", column = @Column(name = "sub_child"))
	@AttributeOverride(name = "count", column = @Column(name = "sub_count"))
	private SubData data2;
}
