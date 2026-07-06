# Write your MySQL query statement below
SELECT p.product_id,p.product_name FROM PRODUCT p
WHERE p.product_id IN (SELECT product_id FROM Sales Group BY product_id Having Min(sale_date) >='2019-01-01' AND Max(sale_date) <='2019-03-31');