package com.jdc.akk.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import com.jdc.akk.entity.Teacher;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
public class JpaFactory {

	protected static EntityManagerFactory emf;
	
	@BeforeAll
	protected static void init() {
		emf = Persistence.createEntityManagerFactory("06_entity_manager");
	}
	
	@AfterAll
	protected static void closeEmf() {
		if (null != emf && emf.isOpen()) {
			emf.close();
		}
	}
}
