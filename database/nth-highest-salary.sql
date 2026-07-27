CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    declare m int;
    set m=N-1;
  RETURN (
    --   select distinct salary from employee e1 where (select count(distinct salary) from employee e2 where e1.salary <= e2.salary) = N
    select distinct salary from employee order by salary desc limit 1 offset M
  );
END