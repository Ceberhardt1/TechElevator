-- 17. The name, population, and area of all records in the state table with no census region (NULL) and area less than 5000 square kilometers.
-- Order the results by area, largest first.
-- (3 rows)

SELECT state_name, population, area
From state
Where census_region is null and area < 5000
order by area desc;