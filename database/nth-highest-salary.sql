CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
    -- select count(*) from employee e2 where e2.salary > 100
      select distinct salary from employee e1 where (select count(*) from employee e2 where e1.salary < e2.salary) = N-1
  );
END