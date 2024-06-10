-- 13. The name, abbreviation, and population of all records in the state table with no official nickname (NULL).
-- Order the results by state name alphabetically.
-- (5 rows)

Select state_name, state_abbreviation, population
From state
Where state_nickname is NULL
Order by state_name asc

