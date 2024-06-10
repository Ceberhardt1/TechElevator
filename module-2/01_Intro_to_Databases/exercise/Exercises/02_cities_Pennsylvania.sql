-- 2. The name and area of all cities in Pennsylvania (PA).
-- Order the results in reverse alphabetical order (Z-A) by city name.
-- (4 rows)
SELECT city_name, area
From city
Where state_abbreviation = 'PA'
Order by city_name desc
