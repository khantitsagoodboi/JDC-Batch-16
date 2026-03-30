package com.jdc.akk.jpa.relation;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaFactory {
	
	static EntityManagerFactory emf;
	//EntityManager em;
	
	@BeforeAll
	static void inti() {
		emf = Persistence.createEntityManagerFactory("03_relation_mapping");
	}
}
