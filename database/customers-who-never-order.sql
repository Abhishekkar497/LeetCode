# Write your MySQL query statement below
SELECT c.name AS Customers FROM customers c where c.id NOT IN(select  customerid FROM orders);