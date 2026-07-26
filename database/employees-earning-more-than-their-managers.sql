# Write your MySQL query statement below
SELECT e.name AS Employee from Employee e WHERE e.salary >(SELECT m.salary from Employee m  where e.managerid = m.id);