--Product isimlerini (`ProductName`) ve birim başına miktar (`QuantityPerUnit`) değerlerini almak için sorgu yazın.
Select product_name,quantity_per_unit from products;
--Ürün Numaralarını (`ProductID`) ve Product isimlerini (`ProductName`) değerlerini almak için sorgu yazın. Artık satılmayan ürünleri (`Discontinued`) filtreleyiniz.
Select product_id,product_name,discontinued from products
where discontinued IN(1);
--Durdurulan Ürün Listesini, Ürün kimliği ve ismi (`ProductID`, `ProductName`) değerleriyle almak için bir sorgu yazın.
Select product_id,product_name,discontinued from products
where discontinued=1;
--Ürünlerin maliyeti 20'dan az olan Ürün listesini (`ProductID`, `ProductName`, `UnitPrice`) almak için bir sorgu yazın.
Select product_id,product_name,unit_price from products
where unit_price<20;
--Ürünlerin maliyetinin 15 ile 25 arasında olduğu Ürün listesini (`ProductID`, `ProductName`, `UnitPrice`) almak için bir sorgu yazın.
Select product_id,product_name,unit_price from products
where unit_price BETWEEN 15 and 25;
--Ürün listesinin (`ProductName`, `UnitsOnOrder`, `UnitsInStock`) stoğun siparişteki miktardan az olduğunu almak için bir sorgu yazın.
Select product_name,units_on_order,units_in_stock from products
where units_in_stock < units_on_order;
--İsmi `a` ile başlayan ürünleri listeleyeniz.
Select product_name from products
where LOWER(product_name) LIKE 'a%';
--İsmi `i` ile biten ürünleri listeleyeniz.
Select product_name from products
where LOWER(product_name) LIKE '%i';
--Ürün birim fiyatlarına %18’lik KDV ekleyerek listesini almak (ProductName, UnitPrice, UnitPriceKDV) için bir sorgu yazın.
Select product_name,unit_price,(unit_price*1.18) as unit_price_kdv from products;
--Fiyatı 30 dan büyük kaç ürün var?
Select Count(*) from products
where unit_price > 30;
--Ürünlerin adını tamamen küçültüp fiyat sırasına göre tersten listele
Select LOWER(product_name),unit_price from products
order by unit_price DESC;
--Çalışanların ad ve soyadlarını yanyana gelecek şekilde yazdır
Select CONCAT(first_name,' ',last_name) as full_name from employees;
--Region alanı NULL olan kaç tedarikçim var?
Select Count(*) as region_count from suppliers
where region is null;
--a.Null olmayanlar?
Select Count(*) as region_count from suppliers
where region is not null;
--Ürün adlarının hepsinin soluna TR koy ve büyültüp olarak ekrana yazdır.
Select CONCAT('TR ',UPPER(product_name)) from products;
--a.Fiyatı 20den küçük ürünlerin adının başına TR ekle
Select CONCAT('TR ',UPPER(product_name)) from products
where unit_price < 20;
--En pahalı ürün listesini (`ProductName` , `UnitPrice`) almak için bir sorgu yazın.
Select product_name,unit_price from products
order by unit_price DESC;
--En pahalı on ürünün Ürün listesini (`ProductName` , `UnitPrice`) almak için bir sorgu yazın.
Select product_name,unit_price from products
order by unit_price DESC
limit 10;
--Ürünlerin ortalama fiyatının üzerindeki Ürün listesini (`ProductName` , `UnitPrice`) almak için bir sorgu yazın.
Select product_name,unit_price from products
where unit_price > (Select AVG(unit_price) from products);
--Stokta olan ürünler satıldığında elde edilen miktar ne kadardır.
Select SUM(unit_price*units_in_stock) From products;
--Mevcut ve Durdurulan ürünlerin sayılarını almak için bir sorgu yazın.
SELECT 
SUM(CASE WHEN Discontinued = 0 THEN 1 ELSE 0 END) AS mevcut_urun_sayisi,
SUM(CASE WHEN Discontinued = 1 THEN 1 ELSE 0 END) AS durdurulan_urun_sayisi
from products;
--Ürünleri kategori isimleriyle birlikte almak için bir sorgu yazın.
Select products.product_name, categories.category_name
from products
inner join categories on products.category_id = categories.category_id;
--Ürünlerin kategorilerine göre fiyat ortalamasını almak için bir sorgu yazın.
Select categories.category_name,AVG(products.unit_price) from products
inner join categories on products.category_id = categories.category_id
group by categories.category_name;
--En pahalı ürünümün adı, fiyatı ve kategorisin adı nedir?
Select products.product_name,products.unit_price,categories.category_name from products
inner join categories on products.category_id = categories.category_id
where unit_price=(SELECT MAX(unit_price) from products);
--En çok satılan ürününün adı, kategorisinin adı ve tedarikçisinin adı
Select products.product_name,products.unit_price,categories.category_name,suppliers.company_name,products.units_on_order from products
inner join categories on products.category_id = categories.category_id
inner join suppliers on products.supplier_id = suppliers.supplier_id
order by products.units_on_order DESC
limit 1;















