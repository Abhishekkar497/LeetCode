# Write your MySQL query statement below
 SELECT DISTINCT l1.num  AS ConsecutiveNums FROM logs l1 WHERE num = (SELECT num FROM logs l2 WHERE id = l1.id+1 ) 
 AND num  =(SELECT num FROM logs WHERE id = l1.id+2)


