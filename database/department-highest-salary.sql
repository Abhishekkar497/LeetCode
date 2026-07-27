# Write your MySQL query statement below
select d.name as Department,
      e.name as Employee,
      e.salary AS Salary
      FROM employee e 
       join department d 
      ON e.departmentid = d.id
      WHERE e.salary =(
        select Max(salary) from employee where 
       departmentid= e.departmentid
      );