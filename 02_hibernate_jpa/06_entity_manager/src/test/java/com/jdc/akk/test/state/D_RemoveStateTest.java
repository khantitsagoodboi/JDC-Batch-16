package com.jdc.akk.test.state;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.jdc.akk.entity.Course;
import com.jdc.akk.entity.Student;
import com.jdc.akk.test.JpaFactory;

public class D_RemoveStateTest extends JpaFactory {
	
	
	
	@ParameterizedTest
	@ValueSource(ints = {1})
	void removeTest(int id) {
		// To be managed
		var em = emf.createEntityManager();
		var course = em.find(Course.class, id);
		assertTrue(em.contains(course));
		
		em.getTransaction().begin();
//		var list = course.getStudents();
//		
//		if(null != list) {
//			list.remove(1);
//		}
		
		// To be removed
		em.remove(course);
		
		em.getTransaction().commit();
		
		em.close();
	}
}
