CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
     SELECT Salary from employee where salary < (Select Max(salary) FROM Employee Limit 1 offset 1 ) = N
  );
END