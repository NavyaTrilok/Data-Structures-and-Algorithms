# Write your MySQL query statement below


SELECT MAX(NUM) AS num
FROM
((SELECT NUM
FROM
(SELECT num, COUNT(num) OVER (PARTITION BY NUM) AS CNT
FROM MyNumbers)A
WHERE CNT = 1))B

