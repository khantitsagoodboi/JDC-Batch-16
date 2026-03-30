package com.jdc.akk.entity;

import com.jdc.akk.entity.dto.SelectByLabelPrice;
import com.jdc.akk.entity.listeners.EnableTimesListener;
import com.jdc.akk.entity.listeners.Times;

import jakarta.persistence.Column;
import jakarta.persistence.ColumnResult;
import jakarta.persistence.ConstructorResult;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SqlResultSetMapping;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "medicine_tbl")
@NamedQuery(name = "Medicine.findAll", query = "select m from Medicine m where m.isActive is true")

@NamedNativeQuery(
		name = "Medicine.selectCategoryMedicinePrice", 
		query = """
				select c.name as category, m.name as medicine, m.label_price as price 
				from medicine_tbl m join category_tbl c on c.id = m.category_id
				""",
		resultSetMapping = "M.SelectCategoryMedicine"
		)

@SqlResultSetMapping(
		name = "M.SelectCategoryMedicine", 
		classes = @ConstructorResult(
				targetClass = SelectByLabelPrice.class,
				columns = {
						@ColumnResult(name = "category", type = String.class),
						@ColumnResult(name = "medicine", type = String.class),
						@ColumnResult(name = "price", type = Double.class)
				}
				))
public class Medicine implements EnableTimesListener {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 45)
	private String name;
	
	@Column(name = "label_price")
	private double labelPrice;
	
	@Embedded
	private Times times;
	
	@Column(columnDefinition = "tinyint(1) default 1", name = "is_active")
	private boolean isActive;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Category category;
}
