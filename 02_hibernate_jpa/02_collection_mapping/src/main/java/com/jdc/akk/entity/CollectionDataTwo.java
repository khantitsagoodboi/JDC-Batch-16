package com.jdc.akk.entity;

import java.util.List;
import java.util.Map;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.MapKeyEnumerated;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;
import lombok.Data;

@Data
//@Entity
@Table(name = "collection_two_tbl")
public class CollectionDataTwo {
	@Id
	private int id;
	
	@ElementCollection
	@Column(name = "list_value")
	@CollectionTable(
			name = "list_tbl",
			joinColumns = {
					@JoinColumn(name = "list_id")
			})
	@Enumerated(EnumType.STRING)
	@OrderBy("lists asc")
	private List<Days> lists;
	
	@ElementCollection
	@Column(name = "map_value")
	@CollectionTable(
			name = "map_tbl",
			joinColumns = {
					@JoinColumn(name = "map_id")
			})
	@MapKeyColumn(name = "key_id")
	//@Enumerated(EnumType.STRING) //for values position
	@MapKeyEnumerated(EnumType.STRING) //for key position
	private Map<Days, String> maps;
	
	private Days day; 
	
	public enum Days{
		MON,
		TUE,
		WED,
		THURS,
		FRI,
		SAT,
		SUN
	}
}
