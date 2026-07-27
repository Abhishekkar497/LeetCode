CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      select salary from employee e1 where (select count(*) from employee e2 where e1.salary >= e2.salary) = N
  );
END