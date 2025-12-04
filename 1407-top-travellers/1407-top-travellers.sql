# Write your MySQL query statement below

SELECT NAME, IFNULL(SUM(DISTANCE),0) AS travelled_distance
FROM USERS U
LEFT JOIN RIDES R
ON U.ID = R.USER_ID
GROUP BY U.ID, NAME
ORDER BY travelled_distance DESC, NAME ASC