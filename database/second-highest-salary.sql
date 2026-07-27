# Write your MySQL query statement below
SELECT Max(Distinct salary) AS SecondHighestSalary from Employee where salary <(SELeCT Max(salary) FROM employee);