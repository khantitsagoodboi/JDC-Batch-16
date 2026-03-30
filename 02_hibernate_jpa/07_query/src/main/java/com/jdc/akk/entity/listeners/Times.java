package com.jdc.akk.entity.listeners;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Times implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "create_time")
	private LocalDateTime createTime;
	
	@Column(name = "update_time")
	private LocalDateTime updateTime;
}
