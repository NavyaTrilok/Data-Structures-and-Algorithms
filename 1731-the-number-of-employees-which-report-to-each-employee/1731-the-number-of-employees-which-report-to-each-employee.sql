# Write your MySQL query statement below


SELECT E1.EMPLOYEE_ID AS employee_id, E1.NAME AS name, COUNT(E2.EMPLOYEE_ID) AS reports_count, ROUND(AVG(E2.AGE)) AS average_age
FROM EMPLOYEES E1
JOIN EMPLOYEES E2
ON E1.EMPLOYEE_ID = E2.REPORTS_TO
GROUP BY employee_id, name
ORDER BY employee_id