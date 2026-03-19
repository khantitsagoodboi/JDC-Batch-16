package com.jdc.akk.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaFactory {
	static EntityManagerFactory emf;
	
	@BeforeAll
	static void init() {
		emf = Persistence.createEntityManagerFactory("05_converter");
	}
	
	@Test
	void test() {
		
	}
}
