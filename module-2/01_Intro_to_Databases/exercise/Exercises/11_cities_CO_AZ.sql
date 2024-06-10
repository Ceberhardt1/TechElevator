-- 11. The name, state, and population of all cities in Colorado (CO) or Arizona (AZ).
-- Order the results by state abbreviation alphabetically (A-Z), then by populatuon (highest first).
-- (22 rows)
SELECT city_name, state_abbreviation, population
FROM city
Where state_abbreviation in ('CO', 'AZ')
Order by state_abbreviation asc, population desc
