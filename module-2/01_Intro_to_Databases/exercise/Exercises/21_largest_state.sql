-- 21. The name and nickname for the largest state.
-- (1 row)

Select state_name, state_nickname
From state
Order by population desc
limit 1;



