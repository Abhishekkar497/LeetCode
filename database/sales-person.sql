# Write your MySQL query statement below
SELECT name FROM salesperson WHERE sales_id NOT IN(SELECT sales_id FROM orders WHERE com_id =ANY(SELECT com_id FROM company WHERE name  ='red'));