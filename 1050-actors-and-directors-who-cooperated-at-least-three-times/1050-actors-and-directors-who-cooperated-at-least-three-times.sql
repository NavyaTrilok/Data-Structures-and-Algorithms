/* Write your T-SQL query statement below */

select actor_id,director_id 
from ActorDirector 
Group by actor_id,director_id
having count(*) >= 3


