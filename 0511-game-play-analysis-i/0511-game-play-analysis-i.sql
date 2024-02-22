# Write your MySQL query statement below

select player_id,event_date as first_login from
	(select *,row_number() over(partition by player_id order by event_date) as row_no
	from activity) x
where x.row_no = '1'