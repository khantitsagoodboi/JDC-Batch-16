package com.jdc.akk.test.state;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.akk.entity.Teacher;
import com.jdc.akk.test.JpaFactory;

public class A_StateTest extends JpaFactory {
	
	@Test
	@Order(3)
	void testRemoveState() {
		var em = emf.createEntityManager();
		// To be Managed Sate
		var teacher = em.find(Teacher.class, 1);
		assertTrue(em.contains(teacher));
		
		em.getTransaction().begin();
		// To be DetachedState
		em.remove(teacher);
		assertFalse(em.contains(teacher));
		em.getTransaction().commit();
		em.close();
	}
	
	@Test
	@Order(2)
	void testDetachedState() {
		var em = emf.createEntityManager();
		// To be Managed Sate
		var teacher = em.find(Teacher.class, 1);
		assertTrue(em.contains(teacher));
		// To be DetachedState
		em.detach(teacher);
		assertFalse(em.contains(teacher));
	}
	
	@Test
	@Order(1)
	void testManageState() {
		var em = emf.createEntityManager();
		
		// To be Transient State
		var teacher = new Teacher("admin","123");
//		teacher.setLoginId("admin");
//		teacher.setPassword("123");
		teacher.setTeaching("Java");
		
		assertFalse(em.contains(teacher));
		
		em.getTransaction().begin();
		// To be Manage State
		em.persist(teacher);
		assertTrue(em.contains(teacher));
		
		em.getTransaction().commit();
		em.close();
	}
	
}
