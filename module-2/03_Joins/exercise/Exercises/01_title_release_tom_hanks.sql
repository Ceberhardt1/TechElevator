-- 1. The titles and release dates of movies that Tom Hanks has appeared in.
-- Order the results by release date, newest to oldest.
-- (47 rows)

SELECT title, release_date
FROM movie
WHERE actor_id = 'Tom Hanks'
ORDER BY release_date;