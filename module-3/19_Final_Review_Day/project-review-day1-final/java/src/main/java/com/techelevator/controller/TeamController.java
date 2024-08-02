package com.techelevator.controller;

import com.techelevator.dao.Team;
import com.techelevator.dao.TeamDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@PreAuthorize("isAuthenticated()")
public class TeamController {

    @Autowired
    private TeamDAO teamDAO;


    @GetMapping(path = "/teams")
    @PreAuthorize("permitAll")
    public List<Team> retrieveListOfTeams() {
        return teamDAO.retrieveListOfTeams();
    }

}
