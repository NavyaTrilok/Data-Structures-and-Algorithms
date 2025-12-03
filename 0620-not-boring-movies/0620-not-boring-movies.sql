# Write your MySQL query statement below

SELECT id, movie, description, rating
FROM CINEMA
WHERE ID % 2 <> 0 AND DESCRIPTION <> "boring"
order by rating DESC
