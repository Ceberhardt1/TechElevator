package com.techelevator.dao;

import com.techelevator.exception.DaoException;

import java.util.List;

public interface TeamDAO {

    List<Team> retrieveListOfTeams() throws DaoException;


}
