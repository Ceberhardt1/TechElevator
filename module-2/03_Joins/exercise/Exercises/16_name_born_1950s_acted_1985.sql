-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985.
-- Order the results by actor from oldest to youngest.
-- (20 rows)

SELECT person.person_name, person.birthday
FROM movie
JOIN movie_actor ON movie.movie_id = movie_actor.movie_id
JOIN person ON movie_actor.actor_id = person.person_id
WHERE person.birthday BETWEEN '1950-01-01' AND '1985-12-31'
ORDER BY person.birthday ASC;