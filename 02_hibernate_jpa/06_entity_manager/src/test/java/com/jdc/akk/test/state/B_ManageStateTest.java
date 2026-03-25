package com.jdc.akk.test.state;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.akk.entity.Course;
import com.jdc.akk.entity.Staff;
import com.jdc.akk.entity.Student;
import com.jdc.akk.test.JpaFactory;

import jakarta.persistence.EntityNotFoundException;

public class B_ManageStateTest extends JpaFactory {
	
	/*
	 * 1. if found Id 
	 * 						find	getReference
	 * i. Return Value => entity	proxy obj
	 * 
	 * 2. if not found Id
	 * 						find	getReference
	 * ii. Return Value => entity	proxy obj
	 * 
	 */
	
	
	@Order(3)
	@ParameterizedTest
	@CsvSource("Michael bannett, 5")
	void findWithNotFoundTest(String loginId, int id) {
		var em = emf.createEntityManager();
		var ref = em.getReference(Staff.class, id);
		//System.out.println(ref.getLoginId());
		assertThrows(EntityNotFoundException.class, () -> ref.getLoginId());
		
		var fi = em.find(Staff.class, id);
		//assertNull(fi);
		assertThrows(NullPointerException.class, () -> fi.getLoginId());
		
		em.close();
	}
	
	
	@Order(2)
	@ParameterizedTest
	@CsvSource("Michael Bannett, 1")
	void findWithFoundIdTest(String loginId, int id) {
		var em = emf.createEntityManager();
		//var staff = em.find(Staff.class, 1); // or getReference
		var student = em.getReference(Student.class, id); 
		assertTrue(em.contains(student));
		assertEquals("Java Basic", student.getCourse().getName());
		//assertEquals(staff.getId(), id);
		assertEquals(loginId, student.getLoginId());
		em.close();
	}
	
	
	@Order(1)
	@ParameterizedTest
	@CsvSource("David, 123")
	void persistTest(String loginId, String psw) {
//		var staff = new Staff(loginId, psw);
//		staff.setLoginId(loginId);
//		staff.setPassword(psw);
//		staff.addInfo("Writer","Singer");
//		
//		var em = emf.createEntityManager();
//		em.getTransaction().begin();
//		em.persist(staff);
//		assertTrue(em.contains(staff));
//		em.getTransaction().commit();
//		em.close();
		
		var student = new Student(loginId, psw);
		var course = new Course("Python");
		student.setCourse(course);
		
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		//em.persist(course);
		em.persist(student);
		assertTrue(em.contains(student));
		em.getTransaction().commit();
		em.close();
	}
}
