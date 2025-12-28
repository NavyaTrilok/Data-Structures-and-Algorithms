# Write your MySQL query statement below

#SELECT SALARY AS SecondHighestSalary
#FROM
#(SELECT SALARY, ROW_NUMBER() OVER (ORDER BY SALARY DESC) AS RW
#FROM EMPLOYEE )A
#WHERE RW = 2

SELECT MAX(salary) AS SecondHighestSalary
FROM employee
WHERE salary < (SELECT MAX(salary) FROM employee);

