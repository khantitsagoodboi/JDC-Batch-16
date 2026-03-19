package com.jdc.akk.test;

import java.util.UUID;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdc.akk.entity.Teacher;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaFactory {

	static EntityManagerFactory emf;
	
	@BeforeAll
	static void init() {
		emf = Persistence.createEntityManagerFactory("04_inheritance_mapping");
	}
	
	@Test
	void test() {
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		Teacher acc1 = new Teacher();
		acc1.setLoginId("test@gmail.com");
		acc1.setPassword("123");
		
//		var course = new Course();
//		course.setName("Core Java");
//		course.setDescription("This is about java basic.");
//		
//		acc1.setCourse(course);	
//		em.persist(course);
		em.persist(acc1);
		em.getTransaction().commit();
		
	}
}
