-- 6. The name, abbreviation, population, and area of states with an area greater than 200,000 square kilometers.
-- Order the results by area, highest first.
-- (16 rows)

Select state_name, state_abbreviation, population, area
From state
Where (area > 200000)
Order by area desc;

