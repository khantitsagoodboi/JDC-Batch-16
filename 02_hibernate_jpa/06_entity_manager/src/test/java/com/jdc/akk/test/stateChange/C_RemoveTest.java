package com.jdc.akk.test.stateChange;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.jdc.akk.entity.Teacher;
import com.jdc.akk.test.JpaFactory;

public class C_RemoveTest extends JpaFactory {

	@Test
	void removeTest() {
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		
		
		// To be managed
		var teacher = em.find(Teacher.class, 2);
		assertTrue(em.contains(teacher));
		
		// To removed
		em.remove(teacher);
		assertFalse(em.contains(teacher));
		
		// To managed
		em.persist(teacher);
		assertTrue(em.contains(teacher));
		
		// To detached
		em.clear();
		//assertFalse(em.contains(teacher));
		assertThrows(IllegalArgumentException.class, () -> em.remove(teacher));
		
		em.getTransaction().commit();
		em.close();
	}
	
}
