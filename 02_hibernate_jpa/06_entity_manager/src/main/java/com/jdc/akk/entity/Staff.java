package com.jdc.akk.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("2")
public class Staff extends Account{
	
	{
		setRole(Role.STAFF);
		informations = new ArrayList<String>();
	}

	
	public Staff(String loginId, String psw) {
		super(loginId,psw);
	}
	
	@ElementCollection
	@CollectionTable(
			name = "information_tbl",
			joinColumns = {
					@JoinColumn(name = "staff_id")
			})
	private List<String> informations;
	
	public void addInfo(String...infos) { //last parameter
		for(String str : infos) {
			informations.add(str);
		}
	}
	
}
