package com.jdc.test.jpql;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.jdc.akk.entity.Medicine;
import com.jdc.test.JpaFactory;

public class E_Join_In_Relationship extends JpaFactory{

	//@ParameterizedTest
	@ValueSource(strings = {"Cold & Flu", "Antibiotics"})
	@Order(1)
	/*
	 * select * from medicine_tbl m 
	 * join category_tbl c on c.id = m.category_id
	 * where c.name = 'Cold & Flu';
	 */
	void singleFieldWithoutJoin(String category) {
		var query = em.createQuery("select m from Medicine m where m.category.name = :name",Medicine.class);
		query.setParameter("name", category);
		var list = query.getResultList();
		System.out.println(list);
	}
	
	//@ParameterizedTest
	@ValueSource(strings = "ABC Pharma Co.")
	@Order(2)
	/*
	 * select * from medicine_tbl m
	 * join purchase_detail_tbl pd on pd.medicine_id = m.id
	 * join purchase_tbl p on p.id = pd.purchase_id
	 * join supplier_tbl s on s.id = p.supplier_id
	 * where s.name = ?
	 */
	void singleFieldWithJoin(String supplier) {
		var queryWithoutJoin = "select pd.medicine from PurchaseDetails pd where pd.purchase.supplier.name = :supplier";
		var queryWithJoin = """
				select m from PurchaseDetails pd
				join pd.medicine m 
				join pd.purchase p
				where p.supplier.name = :supplier
				""";
		var query = em.createQuery(queryWithoutJoin,Medicine.class);
		query.setParameter("supplier", supplier);
		var list = query.getResultList();
		System.out.println(list);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Cold & Flu", "Antibiotics"})
	@Order(3)
	/*
	 * 
	 */
	void collectionWithJoin(String category) {
		var query = em.createQuery("""
				select c.medicines from Category c 
				join c.medicines where c.name = :category
				""",Medicine.class);
		query.setParameter("category", category);
		var list = query.getResultList();
	}
	
}
