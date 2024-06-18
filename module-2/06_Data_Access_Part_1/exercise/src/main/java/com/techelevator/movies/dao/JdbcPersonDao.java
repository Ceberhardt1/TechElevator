package com.techelevator.movies.dao;

import com.techelevator.movies.model.Movie;
import com.techelevator.movies.model.Person;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcPersonDao implements PersonDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcPersonDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Person> getPersons() {
        List<Person> person = new ArrayList<>();
        String sql = "SELECT person_id, person_name, birthday, deathday, biography, profile_path, home_page FROM person ";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()){
            person.add(mapRowToPerson(results));
        }
        return person;
    }

    @Override
    public Person getPersonById(int personId) {
        Person person = null;
        String sql = " SELECT person_id, person_name, birthday, deathday, biography, profile_path, home_page " +
                "FROM person " +
                "WHERE person_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, personId);
        if(results.next()){
            person = mapRowToPerson(results);
        }
        return person;
    }

    @Override
    public List<Person> getPersonsByName(String name, boolean useWildCard) {
        List<Person> person = new ArrayList<>();

        String sql = "SELECT person_id, person_name, birthday, deathday, biography, profile_path, home_page \n" +
                "FROM person " +
                "WHERE person_name ILIKE ?";
        if(useWildCard){
            name = "%" + name + "%";
        }
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, name);
        while(results.next()){
            person.add(mapRowToPerson(results));
        }
        return person;
    }

    @Override
    public List<Person> getPersonsByCollectionName(String collectionName, boolean useWildCard) {
        List<Person> person = new ArrayList<>();

        String sql = "SELECT person_id, person_name, birthday, deathday, biography, profile_path, home_page \n" +
                "FROM person " +
                "WHERE person_name ILIKE ?";
        if(useWildCard){
            collectionName = "%" + collectionName + "%";
        }
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, collectionName);
        while(results.next()){
            person.add(mapRowToPerson(results));
        }
        return person;
    }
    private Person mapRowToPerson(SqlRowSet rowSet){
        Person person = new Person();
        person.setId(rowSet.getInt("person_id"));
        person.setName(rowSet.getString("person_name"));
        if(rowSet.getDate("birthday") != null){
            person.setBirthday(rowSet.getDate("birthday").toLocalDate());
        }
        if(rowSet.getString("biography") != null){
            person.setDeathDate(rowSet.getDate("deathday").toLocalDate());
        }
        person.setBiography(rowSet.getString("biography"));
        person.setProfilePath(rowSet.getString("profile_path"));
        person.setHomePage(rowSet.getString("home_page"));
        return person;
    }
}
