package com.jdc.akk.callback.listener;

import java.time.LocalDateTime;

import jakarta.persistence.PostPersist;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

public class EntityListener {
	
	@PrePersist
	void insert(Object obj) {
		if(obj instanceof EnableTimesListener entity) {
			Times times = entity.getTimes();
			if(null == times) {
				times = new Times();
				entity.setTimes(times);
			}
			times.setCreateDate(LocalDateTime.now());
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
			times.setUpdateDate(LocalDateTime.now());
		}
	}
}
