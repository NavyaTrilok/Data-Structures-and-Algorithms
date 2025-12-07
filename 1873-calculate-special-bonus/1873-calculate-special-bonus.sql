# Write your MySQL query statement below


SELECT employee_id, CASE WHEN employee_id % 2 <> 0 AND SUBSTRING(name,1,1) <> 'M' THEN SALARY
                         ELSE 0 END AS bonus
                         FROM EMPLOYEES
                         ORDER BY EMPLOYEE_ID

