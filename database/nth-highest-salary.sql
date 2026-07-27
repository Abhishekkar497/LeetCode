CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
DECLARE M INT;
  SET M = N - 1;
  RETURN (
    -- select distinct salary from employee order by salary desc limit 1 offset M
      select distinct salary from employee e1 where (select count(distinct salary) from employee e2 where e1.salary < e2.salary) = N-1
  );
END