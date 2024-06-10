-- 1. The name and population of all cities in Ohio (OH).
-- Order the results alphabetically (A-Z) by city.
-- (6 rows)
SELECT city_name, population
From city
Where state_abbreviation = 'OH'
Order by city_name Asc


