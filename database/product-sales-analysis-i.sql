# Write your MySQL query statement below
select product_name,year,price FROM sales s INNER JOIN product p ON p.product_id = s.product_id;