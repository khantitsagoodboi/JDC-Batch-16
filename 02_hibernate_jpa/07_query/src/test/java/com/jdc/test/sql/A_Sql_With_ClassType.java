package com.jdc.test.sql;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.akk.entity.Medicine;
import com.jdc.akk.entity.dto.SelectByLabelPrice;
import com.jdc.test.JpaFactory;

public class A_Sql_With_ClassType extends JpaFactory {
	
	@Test
	@Order(1)
	void withoutClassTypeArgs(){
		var sql = em.createNativeQuery("select * from medicine_tbl");
		var list = sql.getResultList();
		System.out.println(list);
	}
	
	@Test
	@Order(2)
	void withClassTypeArgs(){
		var sql = em.createNativeQuery("select * from medicine_tbl", Medicine.class);
		var list = sql.getResultList();
		System.out.println(list);
	}
	
	@Test
	@Order(3)
	void withResultSetMappingArgs(){
		var sql = em.createNativeQuery("""
				select c.name as category, m.name as medicine, m.label_price as price from medicine_tbl m
				join category_tbl c on c.id = m.category_id
				""",SelectByLabelPrice.class);
		var list = sql.getResultList();
		System.out.println(list);
	}
}
