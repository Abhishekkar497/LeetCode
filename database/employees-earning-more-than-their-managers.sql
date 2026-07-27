# Write your MySQL query statement below
SELECT e.name AS Employee from employee e where e.Salary > (SELECT salary from Employee where e.managerId = id);