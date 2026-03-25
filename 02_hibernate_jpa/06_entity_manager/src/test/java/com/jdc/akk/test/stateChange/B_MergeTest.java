package com.jdc.akk.test.stateChange;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.jdc.akk.entity.Staff;
import com.jdc.akk.test.JpaFactory;

public class B_MergeTest extends JpaFactory {
	
	@Test
	void mergeTest() {
		
		var em = emf.createEntityManager();
		
		//To be transient state
		var staff = new Staff("George","G123");
		staff.addInfo("check attendance", "collect payment");
		
		//To be managed state
		var staff1 = em.merge(staff);
		assertFalse(em.contains(staff));
		assertTrue(em.contains(staff1));
		
		// To be detached State
		em.detach(staff1);
		assertFalse(em.contains(staff1));
		
		//To be managed State
		var staff2 = em.merge(staff1);
		assertTrue(em.contains(staff2));
		
		// To be removed state
		em.remove(staff2);
		assertFalse(em.contains(staff2));
		assertThrows(IllegalArgumentException.class, () -> em.merge(staff2));
		
		
	}
	
}
