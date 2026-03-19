package com.jdc.akk.entity.test;

import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import lombok.Data;

@Data
public class Collection {
	EntityManagerFactory emf;
	EntityManager em;
	
	@Test
	void test() {
		emf = Persistence.createEntityManagerFactory("02_collection_mapping");
	}
}

