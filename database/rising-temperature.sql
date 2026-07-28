# Write your MySQL query statement below
SELECT w1.id from weather w1
Inner join Weather w2 
ON Datediff(w1.recordDate,w2.recordDate) = 1
WHERE w1.temperature > w2.temperature;
