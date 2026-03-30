package com.jdc.test.jpql;

import org.junit.jupiter.api.Test;

import com.jdc.akk.entity.Medicine;
import com.jdc.akk.entity.dto.SelectByLabelPrice;
import com.jdc.akk.entity.dto.SelectWithTotalPurchaseQty;
import com.jdc.test.JpaFactory;

public class F_Join_With_Projection extends JpaFactory {

	//@Test
	/*
	 * select c.name, m.name, m.label_price from medicine_tbl join category_tbl c on
	 * c.id = m.category_id where m.label_price >= (3.00);
	 */
	void selectByPrice() {
		String jpql = "select new com.jdc.akk.entity.dto.SelectByLabelPrice(m.category.name, m.name, m.labelPrice) from Medicine m where m.labelPrice >= :price";
		var query = em.createQuery(jpql, SelectByLabelPrice.class);
		query.setParameter("price", 3.0);
		var list = query.getResultList();
		System.out.println(list);
	}

	@Test
	/*
	 * select s.name, m.name, sum(pd.qty) from supplier_tbl s join purchase_tbl p on
	 * p.supplier_id = s.id join purchase_detail pd on pd.purchase_id = p.id join
	 * medicine_tbl m on pd.medicine_id = m.id group by s.name, m.name having sum(pd.qty) > 100
	 */
	void selectPurchaseTotalPriceWithSupplier() {
		String jpql = """
						select new com.jdc.akk.entity.dto.SelectWithTotalPurchaseQty (
						pd.purchase.supplier.name supplier, pd.medicine.name medicine, sum(pd.qty)) 
						from PurchaseDetails pd
						group by supplier, medicine
						having sum(pd.qty) > 100
						""";
		var query = em.createQuery(jpql, SelectWithTotalPurchaseQty.class);
		var list = query.getResultList();
		list.forEach(s -> System.out.println(s.supplier() + "\t" + s.medicine() + "\t" + s.total()));
	}
}
