package com.jdc.akk.jpa.relation;

import org.junit.jupiter.api.Test;

import com.jdc.akk.entity.Customer;

public class A_Default_Join_Relationship extends JpaFactory {

	
	@Test
	void test() {
		var em = emf.createEntityManager();
		var customer = em.find(Customer.class, 1);
		System.out.println(customer);
	}
	
}
