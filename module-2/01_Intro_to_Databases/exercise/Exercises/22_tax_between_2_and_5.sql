-- 22. The name and sales tax for states and territories with sales tax greater than or equal to 2% and less than or equal to 5%.
-- Order the results by sales tax, lowest first.
-- (15 rows)

SELECT state_name, sales_tax
From state
Where sales_tax >= 2 and sales_tax <= 5
order by sales_tax asc;