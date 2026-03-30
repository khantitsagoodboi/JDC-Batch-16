package com.jdc.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@TestMethodOrder(OrderAnnotation.class)
public class JpaFactory {
	protected static EntityManagerFactory emf;
	protected EntityManager em;
	
	@BeforeAll
	protected static void init(){
		emf = Persistence.createEntityManagerFactory("07_query");
	}
	
	@AfterAll
	protected static void closeEmf() {
		if(null != emf && emf.isOpen()) emf.close();
	}
	
	@BeforeEach
	protected  void createEm() {
		em = emf.createEntityManager();
	}
	
	@AfterEach
	protected  void closeEm() {
		if (null != em && em.isOpen())
		em.close();
	}
	
	@Test
	void createTable() {
		
	}
}
