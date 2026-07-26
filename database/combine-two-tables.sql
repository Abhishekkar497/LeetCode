# Write your MySQL query statement below
SELECT p.firstName,p.lastName,a.city ,a.state from person p
LEFT JOIN Address A 
ON p.personId = a.personId;