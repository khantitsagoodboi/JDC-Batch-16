package com.jdc.akk.test.synchronizecallbacklistener;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.jdc.akk.callback.Passport;
import com.jdc.akk.callback.Person;
import com.jdc.akk.test.JpaFactory;

public class B_CallbackListenerTest extends JpaFactory{
	
	@Test
	void test() {
		var person = new Person();
		person.setName("Andrew");
		person.setAge(30);
		var passport = new Passport();
		passport.setId("AB-33rr32");
		passport.setIssueDate(LocalDate.now());
		passport.setValidDate(LocalDate.of(2028, 03, 25));
		passport.setPerson(person);
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(passport);
		person.setAge(40);
		em.getTransaction().commit();
		em.close();
	}
}
