# Write your MySQL query statement below
SELECT  date_id,make_name, COUNT(DISTINCT lead_id) as unique_leads, count(DISTINCT partner_id) as unique_partners FROM dailysales
GROUP BY make_name,date_id;