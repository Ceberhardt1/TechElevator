-- 3. The name, population, and sales tax of the states in the "West" census region.
-- Order the results by sales tax, lowest first.
-- (13 rows)
Select state_name, population, sales_tax
From State
Where census_region = 'West'
Order by sales_tax asc
