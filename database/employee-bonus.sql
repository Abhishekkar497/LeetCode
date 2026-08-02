# Write your MySQL query statement below
SELECT e.name, b.bonus from Employee e
LEFT Join Bonus b ON b.empid = e.empid
WHERE b.bonus < 1000 OR b.bonus IS NULL;
