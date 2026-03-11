package com.jdc.akk.test;

import org.junit.jupiter.api.Test;

import com.jdc.akk.entity.Member;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class jpaFactoryTest {
	EntityManagerFactory emf;
	EntityManager em;
	
	//@Test
	void test() {
		emf = Persistence.createEntityManagerFactory("01_class_and_field_mappings");
		em = emf.createEntityManager();
		
		Member m = new Member();
		m.setName("Aung");
		m.setAddress("58th Street");
		
		em.getTransaction().begin();
		em.persist(m);
		em.getTransaction().commit();
	}
}
