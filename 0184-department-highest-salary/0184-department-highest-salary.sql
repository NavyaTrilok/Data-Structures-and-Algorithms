# Write your MySQL query statement below

#SELECT NAME AS Department, Employee, SALARY, ROW_NUMBER() OVER (ORDER BY #DEPARTMENTID)
#FROM EMPLOYEE E
#JOIN DEPARTMENT D
#ON E.DEPARTMENTID = D.ID



SELECT Department, Employee, Salary
FROM
(SELECT Department, Employee, Salary, DENSE_RANK() OVER (PARTITION BY Department ORDER BY Salary DESC) AS RW
FROM
(SELECT D.NAME AS Department, E.NAME AS Employee, SALARY AS Salary
FROM EMPLOYEE E
JOIN DEPARTMENT D
ON E.departmentId = D.id)A)B
WHERE RW = 1





 