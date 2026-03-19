package com.jdc.akk.test;

import org.junit.jupiter.api.Test;

import com.jdc.akk.entity.Member;
import com.jdc.akk.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class jpaFactoryTest {
	EntityManagerFactory emf;
	EntityManager em;
	
	@Test
	void test() {
		emf = Persistence.createEntityManagerFactory("01_class_and_field_mappings");
		em = emf.createEntityManager();
		
//		Member m = new Member();
//		m.setName("Aung");
//		m.setAddress("58th Street");
//		
//		Member m1 = new Member();
//		m1.setName("Khant");
//		m1.setAddress("Thamaseikta Street");
		
		Person p = new Person();
		p.setName("Aung");
		p.setAge(21);
		
		Person p1 = new Person();
		p1.setName("Khant");
		p1.setAge(23);
		
		Person p2 = new Person();
		p2.setName("Kyaw");
		p2.setAge(24);
		
		em.getTransaction().begin();
		em.persist(p);
		em.persist(p1);
		em.persist(p2);
		em.getTransaction().commit();
	}
}
