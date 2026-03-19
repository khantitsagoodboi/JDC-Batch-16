package com.jdc.akk.entity;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("2")
public class Staff extends Account{

	@ElementCollection
	@CollectionTable(
			name = "information_tbl",
			joinColumns = {
					@JoinColumn(name = "staff_id")
			})
	private List<String> informations;
	
}
