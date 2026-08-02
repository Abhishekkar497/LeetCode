CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
     SELECT Distinct e1.Salary from employee e1 where (Select Count( e2.salary)  FROM Employee e2 Where e1.salary <= e2.salary ) = N
  );
END