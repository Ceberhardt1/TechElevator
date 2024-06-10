-- 16. The name, date established, and area of parks that contain the string "Canyon" anywhere in the name.
-- Order the results by date established, oldest first.
-- (5 rows)

SELECT park_name, date_established, area
From park
Where park_name like '%Canyon%'
Order by date_established asc
