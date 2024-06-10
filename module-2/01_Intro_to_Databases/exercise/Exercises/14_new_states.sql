-- 14. The state name, nickname, and census region for states that start with the word "New".
-- Order the results by census region alphabetically, then state nickname alphabetically.
-- (4 rows)

select state_name, state_nickname, census_region
From state
Where state_name like 'New%'
Order by census_region asc, state_name asc;