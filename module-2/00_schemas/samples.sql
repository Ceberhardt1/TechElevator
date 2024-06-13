-- SELECT * FROM city;

-- select * from city;

-- * means all

Select city_name, state_abbreviation, city_id from city;

select * from park;

SELECT park_id, park_name, date_established as open_date, has_camping FROM park;

--Order by
Select * 
From city
Order by population DESC;

--distinct
SELECT DISTINCT 
city_name as theCityName FROM city;


SELECT population
From city
Where(population < 100000); 




SELECT city_name, population
From city
Where state_abbreviation = 'OH'
Order by city_name Asc;



SELECT city_name
From city
Where state_abbreviation = 'PA'
Order by city_name desc;





SELECT park_name, date_established
From park
Where date_established BETWEEN '1960-01-01' and '1969-12-31'
Order by date_established desc;

Select state_name, state_nickname
From state
Order by population desc
limit 1;

Select *
From State;



----Hw 02 subquires and aggregations

--1).
Select (city_name || ' ,' || state_abbreviation) AS name_and_state, population
from city
Where state_abbreviation in ('Pa', 'WV', 'KY', 'IN', 'MI')
Order By state_abbreviation asc, city_name asc;



Select * 
From state


SELECT Avg(population) As average_population
FROM state
WHERE census_region = 'West';

SELECT sum(population) AS california_population
FROM city
WHERE state_name = 'California';



