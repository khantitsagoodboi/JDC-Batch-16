set foreign_key_checks=0;

INSERT INTO category_tbl (name) VALUES( 'Antibiotics');
INSERT INTO category_tbl (name) VALUES( 'Painkillers');
INSERT INTO category_tbl (name) VALUES( 'Vitamins');
INSERT INTO category_tbl (name) VALUES( 'Cold & Flu');
INSERT INTO category_tbl (name) VALUES( 'Digestive');

INSERT INTO medicine_tbl (name, label_price, create_time, update_time, is_active, category_id)VALUES('Paracetamol 500mg', 2.50, NOW(), NOW(), 1, 2);
INSERT INTO medicine_tbl (name, label_price, create_time, update_time, is_active, category_id)VALUES('Amoxicillin 250mg', 5.75, NOW(), NOW(), 1, 1);
INSERT INTO medicine_tbl (name, label_price, create_time, update_time, is_active, category_id)VALUES('Vitamin C 1000mg', 3.20, NOW(), NOW(), 1, 3);
INSERT INTO medicine_tbl (name, label_price, create_time, update_time, is_active, category_id)VALUES('Ibuprofen 400mg', 4.10, NOW(), NOW(), 1, 2);
INSERT INTO medicine_tbl (name, label_price, create_time, update_time, is_active, category_id)VALUES('Cough Syrup', 6.50, NOW(), NOW(), 1, 4);
INSERT INTO medicine_tbl (name, label_price, create_time, update_time, is_active, category_id)VALUES('Antacid Tablet', 2.80, NOW(), NOW(), 1, 5);
INSERT INTO medicine_tbl (name, label_price, create_time, update_time, is_active, category_id)VALUES('Azithromycin 500mg', 8.90, NOW(), NOW(), 1, 1);
INSERT INTO medicine_tbl (name, label_price, create_time, update_time, is_active, category_id)VALUE('Multivitamin Capsules', 7.30, NOW(), NOW(), 1, 3);
INSERT INTO medicine_tbl (name, label_price, create_time, update_time, is_active, category_id)VALUES('Cold Relief Tablet', 3.75, NOW(), NOW(), 1, 4);
INSERT INTO medicine_tbl (name, label_price, create_time, update_time, is_active, category_id)VALUES('ORS Sachet', 1.20, NOW(), NOW(), 1, 5);
INSERT INTO medicine_tbl (name, label_price, create_time, update_time, is_active, category_id)VALUES('Diclofenac Gel', 4.90, NOW(), NOW(), 1, 2);
INSERT INTO medicine_tbl (name, label_price, create_time, update_time, is_active, category_id)VALUES('Calcium Tablets', 6.00, NOW(), NOW(), 1, 3);
INSERT INTO medicine_tbl (name, label_price, create_time, update_time, is_active, category_id)VALUES('Metronidazole 400mg', 5.40, NOW(), NOW(), 1, 1);
INSERT INTO medicine_tbl (name, label_price, create_time, update_time, is_active, category_id)VALUES('Flu Syrup Kids', 5.10, NOW(), NOW(), 1, 4);
INSERT INTO medicine_tbl (name, label_price, create_time, update_time, is_active, category_id)VALUES('Digestive Enzyme Syrup', 6.80, NOW(), NOW(), 1, 5);

INSERT INTO customer_tbl (name, phone, email, is_active)VALUES('John Doe', '0912345678', 'john.doe@gmail.com', 1);
INSERT INTO customer_tbl (name, phone, email, is_active)VALUES('Alice Smith', '0923456789', 'alice.smith@gmail.com', 1);
INSERT INTO customer_tbl (name, phone, email, is_active)VALUES('Michael Johnson', '0934567890', 'michael.j@gmail.com', 1);
INSERT INTO customer_tbl (name, phone, email, is_active)VALUES('Emma Brown', '0945678901', 'emma.brown@gmail.com', 1);
INSERT INTO customer_tbl (name, phone, email, is_active)VALUES('David Wilson', '0956789012', 'david.wilson@gmail.com', 1);
INSERT INTO customer_tbl (name, phone, email, is_active)VALUES('Sophia Taylor', '0967890123', 'sophia.taylor@gmail.com', 1);
INSERT INTO customer_tbl (name, phone, email, is_active)VALUES('Daniel Anderson', '0978901234', 'daniel.anderson@gmail.com', 1);
INSERT INTO customer_tbl (name, phone, email, is_active)VALUES('Olivia Thomas', '0989012345', 'olivia.thomas@gmail.com', 1);
INSERT INTO customer_tbl (name, phone, email, is_active)VALUES('James Jackson', '0990123456', 'james.jackson@gmail.com', 1);
INSERT INTO customer_tbl (name, phone, email, is_active)VALUES('Isabella White', '0901234567', 'isabella.white@gmail.com', 1);
INSERT INTO customer_tbl (name, phone, email, is_active)VALUES('Old Customer One', '0911111111', 'old1@gmail.com', 0);
INSERT INTO customer_tbl (name, phone, email, is_active)VALUES('Old Customer Two', '0922222222', 'old2@gmail.com', 0);

INSERT INTO employee_tbl(name, role, phone, email, is_active)VALUES('Aung Aung', 'ADMIN', '0911111001', 'admin1@gmail.com', 1);
INSERT INTO employee_tbl(name, role, phone, email, is_active)VALUES('Kyaw Kyaw', 'MANAGER', '0911111002', 'manager1@gmail.com', 1);
INSERT INTO employee_tbl(name, role, phone, email, is_active)VALUES('Hla Hla', 'CASHIER', '0911111003', 'cashier1@gmail.com', 1);
INSERT INTO employee_tbl(name, role, phone, email, is_active)VALUES('Su Su', 'CASHIER', '0911111004', 'cashier2@gmail.com', 1);
INSERT INTO employee_tbl(name, role, phone, email, is_active)VALUES('Ko Ko', 'MANAGER', '0911111005', 'manager2@gmail.com', 1);
INSERT INTO employee_tbl(name, role, phone, email, is_active)VALUES('Mya Mya', 'CASHIER', '0911111006', 'cashier3@gmail.com', 1);
INSERT INTO employee_tbl(name, role, phone, email, is_active)VALUES('Zaw Zaw', 'ADMIN', '0911111007', 'admin2@gmail.com', 1);
INSERT INTO employee_tbl(name, role, phone, email, is_active)VALUES('Nyein Nyein', 'CASHIER', '0911111008', 'cashier4@gmail.com', 1);
INSERT INTO employee_tbl(name, role, phone, email, is_active)VALUES('Old Cashier', 'CASHIER', '0911111999', 'oldcashier@gmail.com', 0);

INSERT INTO supplier_tbl(name, phone, email, secondary_phone, secondary_email, is_active)VALUES('ABC Pharma Co.', '0912000001', 'abc@pharma.com', '0912000101', 'abc.secondary@pharma.com', 1);
INSERT INTO supplier_tbl(name, phone, email, secondary_phone, secondary_email, is_active)VALUES('Global Medical Supply', '0912000002', 'global@medical.com', '0912000102', 'global.secondary@medical.com', 1);
INSERT INTO supplier_tbl(name, phone, email, secondary_phone, secondary_email, is_active)VALUES('HealthCare Distributors', '0912000003', 'health@distributor.com', '0912000103', 'health.secondary@distributor.com', 1);
INSERT INTO supplier_tbl(name, phone, email, secondary_phone, secondary_email, is_active)VALUES('MediLife Co.', '0912000004', 'medilife@gmail.com', '0912000104', 'medilife.secondary@gmail.com', 1);
INSERT INTO supplier_tbl(name, phone, email, secondary_phone, secondary_email, is_active)VALUES('Wellness Pharma', '0912000005', 'wellness@pharma.com', '0912000105', 'wellness.secondary@pharma.com', 1);
INSERT INTO supplier_tbl(name, phone, email, secondary_phone, secondary_email, is_active)VALUES('Old Supplier', '0912999999', 'old@supplier.com', '0912888888', 'old.secondary@supplier.com', 0);

INSERT INTO purchase_tbl(id, supplier_id, create_time, update_time, issue_date)VALUES('11111111-1111', 1, NOW(), NOW(), '2024-01-10');
INSERT INTO purchase_tbl(id, supplier_id, create_time, update_time, issue_date)VALUES('22222222-2222', 2, NOW(), NOW(), '2024-01-12');
INSERT INTO purchase_tbl(id, supplier_id, create_time, update_time, issue_date)VALUES('33333333-3333', 3, NOW(), NOW(), '2024-01-15');
INSERT INTO purchase_tbl(id, supplier_id, create_time, update_time, issue_date)VALUES('44444444-4444', 1, NOW(), NOW(), '2024-02-01');
INSERT INTO purchase_tbl(id, supplier_id, create_time, update_time, issue_date)VALUES('55555555-5555', 2, NOW(), NOW(), '2024-02-05');

INSERT INTO purchase_detail_tbl(purchase_id, medicine_id, purchase_time, qty, purchase_price, create_time, update_time)VALUES('11111111-1111', 1, '09:00:00', 100, 2.00, NOW(), NOW());
INSERT INTO purchase_detail_tbl(purchase_id, medicine_id, purchase_time, qty, purchase_price, create_time, update_time)VALUES('11111111-1111', 2, '09:05:00', 50, 4.50, NOW(), NOW());
INSERT INTO purchase_detail_tbl(purchase_id, medicine_id, purchase_time, qty, purchase_price, create_time, update_time)VALUES('11111111-1111', 3, '09:10:00', 200, 2.80, NOW(), NOW());

INSERT INTO purchase_detail_tbl(purchase_id, medicine_id, purchase_time, qty, purchase_price, create_time, update_time)VALUES('22222222-2222', 1, '10:00:00', 150, 2.10, NOW(), NOW());
INSERT INTO purchase_detail_tbl(purchase_id, medicine_id, purchase_time, qty, purchase_price, create_time, update_time)VALUES('22222222-2222', 4, '10:05:00', 75, 3.90, NOW(), NOW());

INSERT INTO purchase_detail_tbl(purchase_id, medicine_id, purchase_time, qty, purchase_price, create_time, update_time)VALUES('33333333-3333', 5, '11:00:00', 120, 5.50, NOW(), NOW());
INSERT INTO purchase_detail_tbl(purchase_id, medicine_id, purchase_time, qty, purchase_price, create_time, update_time)VALUES('33333333-3333', 2, '11:10:00', 60, 4.40, NOW(), NOW());

INSERT INTO purchase_detail_tbl(purchase_id, medicine_id, purchase_time, qty, purchase_price, create_time, update_time)VALUES('44444444-4444', 3, '12:00:00', 90, 2.75, NOW(), NOW());

INSERT INTO purchase_detail_tbl(purchase_id, medicine_id, purchase_time, qty, purchase_price, create_time, update_time)VALUES('55555555-5555', 1, '13:00:00', 110, 2.05, NOW(), NOW());


INSERT INTO sale_tbl(id, customer_id, employee_id, create_time, update_time, sale_date)VALUES('aaaaaaa1-1111-1111-1111-111111111111', 1, 3, NOW(), NOW(), '2024-03-01');
INSERT INTO sale_tbl(id, customer_id, employee_id, create_time, update_time, sale_date)VALUES('aaaaaaa2-2222-2222-2222-222222222222', 2, 3, NOW(), NOW(), '2024-03-02');
INSERT INTO sale_tbl(id, customer_id, employee_id, create_time, update_time, sale_date)VALUES('aaaaaaa3-3333-3333-3333-333333333333', 3, 4, NOW(), NOW(), '2024-03-03');
INSERT INTO sale_tbl(id, customer_id, employee_id, create_time, update_time, sale_date)VALUES('aaaaaaa4-4444-4444-4444-444444444444', 1, 4, NOW(), NOW(), '2024-03-04');
INSERT INTO sale_tbl(id, customer_id, employee_id, create_time, update_time, sale_date)VALUES('aaaaaaa5-5555-5555-5555-555555555555', 4, 3, NOW(), NOW(), '2024-03-05');

INSERT INTO sale_tbl(id, customer_id, employee_id, create_time, update_time, sale_date)VALUES('ccccccc1-1111-1111-1111-111111111111', 1, 3, NOW(), NOW(), CURDATE());
INSERT INTO sale_tbl(id, customer_id, employee_id, create_time, update_time, sale_date)VALUES('ccccccc2-2222-2222-2222-222222222222', 2, 4, NOW(), NOW(), CURDATE());
INSERT INTO sale_tbl(id, customer_id, employee_id, create_time, update_time, sale_date)VALUES('ccccccc3-3333-3333-3333-333333333333', 2, 4, NOW(), NOW(), CURDATE());


INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('aaaaaaa1-1111-1111-1111-111111111111', 1, '09:00:00', 2, 2.50, NOW(), NOW());
INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('aaaaaaa1-1111-1111-1111-111111111111', 2, '09:05:00', 1, 5.75, NOW(), NOW());

INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('aaaaaaa2-2222-2222-2222-222222222222', 3, '10:00:00', 3, 3.20, NOW(), NOW());
INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('aaaaaaa2-2222-2222-2222-222222222222', 4, '10:05:00', 1, 4.10, NOW(), NULL);
INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('aaaaaaa2-2222-2222-2222-222222222222', 5, '10:10:00', 2, 6.50, NOW(), NULL);

INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('aaaaaaa3-3333-3333-3333-333333333333', 1, '11:00:00', 1, 2.50, NOW(), NOW());
INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('aaaaaaa3-3333-3333-3333-333333333333', 4, '11:10:00', 2, 4.10, NOW(), NOW());

INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('aaaaaaa3-3333-3333-3333-333333333333', 2, '11:00:00', 1, 5.75, NOW(), NULL);
INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('aaaaaaa3-3333-3333-3333-333333333333', 3, '11:05:00', 2, 3.20, NOW(), NULL);
INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('aaaaaaa3-3333-3333-3333-333333333333', 1, '11:10:00', 1, 2.50, NOW(), NULL);

INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('aaaaaaa4-4444-4444-4444-444444444444', 5, '12:00:00', 1, 6.50, NOW(), NULL);
INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('aaaaaaa4-4444-4444-4444-444444444444', 4, '12:05:00', 3, 4.10, NOW(), NULL);

INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('aaaaaaa5-5555-5555-5555-555555555555', 1, '13:00:00', 2, 2.50, NOW(), NULL);
INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('aaaaaaa5-5555-5555-5555-555555555555', 3, '13:05:00', 1, 3.20, NOW(), NULL);
INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('aaaaaaa5-5555-5555-5555-555555555555', 2, '13:10:00', 2, 5.75, NOW(), NULL);

INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('ccccccc1-1111-1111-1111-111111111111', 1, '14:00:00', 1, 2.50, NOW(), NULL);
INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('ccccccc1-1111-1111-1111-111111111111', 2, '14:03:00', 2, 5.75, NOW(), NULL);
INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('ccccccc1-1111-1111-1111-111111111111', 3, '14:06:00', 1, 3.20, NOW(), NULL);

INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('ccccccc2-2222-2222-2222-222222222222', 4, '15:00:00', 3, 4.10, NOW(), NULL);
INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('ccccccc2-2222-2222-2222-222222222222', 5, '15:05:00', 1, 6.50, NOW(), NULL);

INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('ccccccc3-3333-3333-3333-333333333333', 2, '16:00:00', 2, 5.75, NOW(), NULL);
INSERT INTO sale_details_tbl(sale_id, medicine_id, sale_time, qty, sale_price, create_time, update_time)VALUES('ccccccc3-3333-3333-3333-333333333333', 1, '16:05:00', 1, 2.50, NOW(), NULL);
set foreign_key_checks=1;