-- 12. The state name, nickname, and sales tax from records in the state table in the "West" and "South" census regions with a sales tax that isn't 0%.
-- Order the results by sales tax (highest first), then state name alphabetically (A-Z).
-- (26 rows)

Select state_name, state_nickname, sales_tax
From state
Where census_region in ('West', 'South') and sales_tax != 0
Order by sales_tax desc, state_name asc
