package com.jdc.akk.callback;

import org.hibernate.internal.build.AllowSysOut;

import com.jdc.akk.callback.listener.EnableTimesListener;
import com.jdc.akk.callback.listener.EntityListener;
import com.jdc.akk.callback.listener.Times;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.ExcludeDefaultListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "person_tbl")
//@EntityListeners(EntityListener.class)
@ExcludeDefaultListeners
public class Person implements EnableTimesListener {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	
	@Embedded
	private Times times;
	
//	@PrePersist
//	void beforePersist() {
//		System.out.println("Before persist");
//	}
//	
//	@PostPersist
//	void afterPersist() {
//		System.out.println("After persist");
//	}
//	
//	@PreUpdate
//	void beforeMerge() {
//		System.out.println("Before merge");
//	}
//	
//	@PostUpdate
//	void afterMerge() {
//		System.out.println("After merge");
//	}
}
