package com.jdc.akk.test;

import org.junit.jupiter.api.Test;

import com.jdc.akk.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaFactory {
	EntityManagerFactory emf;
	EntityManager em;

	//@Test
	void test() {
		emf = Persistence.createEntityManagerFactory("01_class_and_field_mappings");  //build database table;
//		em = emf.createEntityManager();
//		var user = new User();
//		user.setName("Andrew");
//		user.setAge(20);
//		
//		em.getTransaction().begin();
//		em.persist(user);
//		em.getTransaction().commit();
	}
}
