package com.jdc.test.jpql;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.jdc.akk.entity.Employee;
import com.jdc.akk.entity.Employee.Role;
import com.jdc.test.JpaFactory;
import com.jdc.akk.entity.Medicine;

public class D_Select_With_Param extends JpaFactory {
	
	@Test
	@Order(1)
	/*
	 * select * from employee_tbl where role = ? and is_active = true;
	 */
	void selectAllCashierWithIndexParam() {
		var query = em.createQuery("select e from Employee e where e.role =  ?1",Employee.class);
		query.setParameter(1, Role.CASHIER);
		var list = query.getResultList();
		System.out.println(list);
	}
	
	
	@Test
	@Order(2)
	/*
	 * select * from medicine_tbl where label_price between ? and ?;
	 */
	void selectAllMedicinePriceWithNameParam() {
		var query = em.createQuery("select m from Medicine m where m.labelPrice between :from and :to",Medicine.class);
		query.setParameter("from", 5);
		query.setParameter("to", 10);
		var list = query.getResultList();
		System.out.println(list);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"m","p"})
	@Order(3)
	/*
	 * select * from medicine_tbl m where lower(m.name) like lower('m%'); 
	 */
	void selectEmployeeWithLikeOperator(String name) {
		var query = em.createQuery("select m from Medicine m where lower(m.name) like :name",Medicine.class);
		query.setParameter("name", name.concat("%").toLowerCase());
		var list = query.getResultList();
		System.out.println(list);
	}
	
	@Test
	@Order(4)
	/*
	 * select * from employee_tbl emp where emp.role in ('CASHIER','MANAGER');
	 */
	void selectEmployeeWithInOperator() {
		var query = em.createQuery("select emp from Employee emp where emp.role in (:opt1,:opt2)",Employee.class);
		query.setParameter("opt1", Role.CASHIER);
		query.setParameter("opt2", Role.MANAGER);
		var list = query.getResultList();
		System.out.println(list);
	}
	
	@Test
	@Order(5)
	/*
	 * select m.name from medicine_tbl m where m.label_price = (select min(m.label_price) from medicine_tbl); 
	 */
	void selectMedicineWithNested() {
		var query = em.createQuery("select m.name from Medicine m where m.labelPrice = (select min(m.labelPrice) from Medicine m)", String.class);
		var list = query.getSingleResult();
		System.out.println(list);
	}
	
	//@Test
	//@Order(6)
	/*
	 * select emp.role, count (emp) qty from employee_tbl emp group by emp.role order by qty
	 */
	void selectEmployeeWithCount_Groupby_Orderby() {
		
	}
}
