-- 1. The titles and release dates of movies that Tom Hanks has appeared in.
-- Order the results by release date, newest to oldest.
-- (47 rows)

SELECT title, release_date
FROM movie
JOIN movie_actor ON movie.movie_id = movie_actor.movie_id
JOIN person on movie_actor.actor_id = person.person_id
WHERE person.person_name IN ('Tom Hanks')
ORDER BY release_date desc;