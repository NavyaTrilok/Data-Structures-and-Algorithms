# Write your MySQL query statement below

SELECT DATE_ID, MAKE_NAME, COUNT(DISTINCT LEAD_ID) AS unique_leads, COUNT(DISTINCT partner_id) AS unique_partners
FROM DailySales
GROUP BY DATE_ID, MAKE_NAME