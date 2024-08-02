package com.techelevator.dao;

import com.techelevator.exception.DaoException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcTeamDao implements TeamDAO{

    private final JdbcTemplate jdbcTemplate;

    public JdbcTeamDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Team> retrieveListOfTeams() throws DaoException{

        List<Team> teams = new ArrayList<>();
        String sql = "SELECT team_id, name, year_established FROM teams";
        try {
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
            while  (results.next()) {
                Team team = mapRowToTeam(results);
                teams.add(team);
            }
        } catch (CannotGetJdbcConnectionException e) {
            throw new DaoException("Unable to connect to server or database", e);
        }
        return teams;


    }

    private Team mapRowToTeam(SqlRowSet results) {

        Team team = new Team();

        team.setTeamId(results.getInt("team_id"));
        team.setTeamName(results.getString("name"));
        team.setYearEstablished(results.getString("year_established"));

        return team;
    }
}
