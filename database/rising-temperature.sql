# Write your MySQL query statement below
SELECT  id FROM weather w1  WHERE temperature >(SELECT W2.temperature FROM weather W2 WHERE W2.recordDate = DATE_SUB(w1.recordDate, INTERVAL 1 DAY) )