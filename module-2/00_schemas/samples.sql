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


Select *
From State;



