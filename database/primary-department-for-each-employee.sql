# Write your MySQL query statement below
SELECT employee_id,department_id FROM EMPLOYEE
WHERE primary_flag = "Y" OR employee_id IN (SELECT employee_id FROM Employee GROUP BY employee_id having COUNT(employee_id) =1 );