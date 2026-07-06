# Write your MySQL query statement below
SELECT u.name,SUM(t.amount) AS balance FROM Transactions t
INNER JOIN users u ON u.account = t.account 
GROUP BY t.account
HAVING SUM(t.amount) > 10000;