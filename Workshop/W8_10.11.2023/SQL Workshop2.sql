--26. Stokta bulunmayan ürünlerin ürün listesiyle birlikte tedarikçilerin ismi ve iletişim numarasını (`ProductID`, `ProductName`, `CompanyName`, `Phone`) almak için bir sorgu yazın.
Select product_id,product_name,company_name,phone,units_in_stock from products p
inner join suppliers s on s.supplier_id = p.supplier_id
where units_in_stock = 0;
--27. 1998 yılı mart ayındaki siparişlerimin adresi, siparişi alan çalışanın adı, çalışanın soyadı
select o.ship_address, e.first_name || ' ' || e.last_name as "AD SOYAD", o.order_date from orders o
inner join employees e on o.employee_id = e.employee_id
WHERE o.order_date BETWEEN '1998-03-01' AND '1998-03-31';
--28. 1997 yılı şubat ayında kaç siparişim var?
select Count(*) from orders
where extract(year from order_date) = '1997' and extract(month from order_date) = '02';
--29. London şehrinden 1998 yılında kaç siparişim var?
SELECT COUNT(*) FROM orders
WHERE EXTRACT (YEAR FROM order_date) = 1998 AND ship_city = 'London';
--30. 1997 yılında sipariş veren müşterilerimin contactname ve telefon numarası
SELECT DISTINCT(customers.contact_name), customers.phone FROM orders
INNER JOIN customers ON orders.customer_id = customers.customer_id
WHERE EXTRACT (YEAR FROM order_date) = 1997
--31. Taşıma ücreti 40 üzeri olan siparişlerim
SELECT * FROM orders
WHERE freight > 40














