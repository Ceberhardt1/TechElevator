-- 4. The name, population, and nickname of the states in the "Northeast" census region.
-- Order the results by population, highest first.
-- (9 rows)
Select state_name, population, state_nickname
From State
Where census_region = 'Northeast'
Order by population desc

