package com.jdc.akk.entity.listeners;

import java.time.LocalDateTime;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

public class EntityListener {
	
	@PrePersist
	void save(Object obj) {
		if(obj instanceof EnableTimesListener entity) {
			Times times = entity.getTimes();
			if(null == times) {
				times = new Times();
				entity.setTimes(times);
			}
			times.setCreateTime(LocalDateTime.now());
		}
	}
	
	@PreUpdate
	void update(Object obj) {
		if(obj instanceof EnableTimesListener entity) {
			Times times = entity.getTimes();
			if(null == times) {
				times = new Times();
				entity.setTimes(times);
			}
			times.setUpdateTime(LocalDateTime.now());
		}
	}	
}
