package com.jdc.akk.jpa.relation;

import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaFactory {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	@Test
	void testRelation() {
		emf = Persistence.createEntityManagerFactory("03_relation_mapping");
	}
	
	
}
