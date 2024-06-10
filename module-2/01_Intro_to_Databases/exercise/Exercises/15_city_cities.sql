-- 15. The name, state abbreviation, and population for cities that end with the word "City".
-- Order the results by population, largest first.
-- (11 rows)

SELECT city_name, state_abbreviation, population
From city
Where city_name like '%City'
Order by population desc;
