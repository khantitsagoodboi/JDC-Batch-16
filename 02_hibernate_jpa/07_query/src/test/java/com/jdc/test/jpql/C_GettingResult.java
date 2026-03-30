package com.jdc.test.jpql;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.akk.entity.Category;
import com.jdc.test.JpaFactory;

public class C_GettingResult extends JpaFactory {
	
	//@Test
	@Order(1)
	void listReturnTest() {
		var em = emf.createEntityManager();
		var query = em.createQuery("select c from Category c where isActive is not false",Category.class);
		var list = query.getResultList();
		System.out.println(list);
		em.close();
	}
	
	//@Test
	@Order(2)
	void streamReturnTest() {
		var em = emf.createEntityManager();
		var query = em.createQuery("select c from Category c where isActive is true",Category.class);
		var stream = query.getResultStream();
		stream.forEach(System.out::println);
		em.close();
	}
	
	//@Test
	@Order(3)
	void singleReturnTest() {
		var em = emf.createEntityManager();
		var query = em.createQuery("select count (c) from Category c where isActive is true",Long.class);
		var total = query.getSingleResult();
		System.out.println("Total Record: "+ total);
		em.close();
	}
	
	@Test
	@Order(4)
	void intReturnTest() {
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		var query = em.createQuery("update Category c set c.isActive = ?1 where c.isActive = true");
		query.setParameter(1, false);
		var total = query.executeUpdate();
		System.out.println("Total Record: "+ total);
		em.getTransaction().commit();
		em.close();
	}
}
