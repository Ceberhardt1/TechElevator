package com.techelevator.movies.dao;

import com.techelevator.movies.model.Genre;
import com.techelevator.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcMovieDao implements MovieDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcMovieDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        String sql = "SELECT movie_id, title, overview, tagline, poster_path, home_page, release_date, length_minutes, director_id, collection_id FROM movie";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()){
            movies.add(mapRowToMovie(results));
        }
        return movies;
    }

    @Override
    public Movie getMovieById(int movieId) {
        Movie movies = null;
        String sql = " SELECT movie_id, title, overview, tagline, poster_path, home_page, release_date, length_minutes, director_id, collection_id " +
                "FROM movie " +
                "WHERE movie_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, movieId);
        if(results.next()){
            movies = mapRowToMovie(results);
        }
        return movies;
    }

    @Override
    public List<Movie> getMoviesByTitle(String title, boolean useWildCard) {
        List<Movie> movies = new ArrayList<>();

        String sql = "SELECT movie_id, title, overview, tagline, poster_path, home_page, release_date, length_minutes, director_id, collection_id \n" +
                "FROM movie " +
                "WHERE title ILIKE ?";
        if(useWildCard){
            title = "%" + title + "%";
        }
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, title);
        while(results.next()){
            movies.add(mapRowToMovie(results));
        }
        return movies;
    }

    @Override
    public List<Movie> getMoviesByDirectorNameAndBetweenYears(String directorName, int startYear,
                                                              int endYear, boolean useWildCard) {
        return null;
    }
    private Movie mapRowToMovie(SqlRowSet rowSet){
        Movie movies= new Movie();
        movies.setId(rowSet.getInt("movie_id"));
        movies.setTitle(rowSet.getString("title"));
        movies.setOverview(rowSet.getString("overview"));
        movies.setTagline(rowSet.getString("tagline"));
        movies.setPosterPath(rowSet.getString("poster_path"));
        movies.setReleaseDate(rowSet.getDate("release_date").toLocalDate());
        movies.setLengthMinutes(rowSet.getInt("length_minutes"));
        movies.setDirectorId(rowSet.getInt("director_id"));
        movies.setCollectionId(rowSet.getInt("collection_id"));
        return movies;
    }
}
