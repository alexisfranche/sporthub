package com.leschodes.sporthub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leschodes.sporthub.model.Team;
import com.leschodes.sporthub.repository.TeamRepository;

@RestController
@RequestMapping("/team")
public class TeamController {
	
	@Autowired
	TeamRepository repository;
	
    @GetMapping(path="/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Team> getTeam(@PathVariable int id) {
    	Team eventFound = repository.getTeam(id);
        return new ResponseEntity<Team>(eventFound, null, HttpStatus.OK);
    }
	
    @GetMapping(path="/all", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Team>>getAllTeams()
	{
		List<Team> teams = repository.getAllTeams();
		return new ResponseEntity<List<Team>>(teams, null, HttpStatus.OK);
	}
    
	@PostMapping(consumes = "application/json", produces = "application/json")
	public Team addTeam(@RequestBody Team team) {
	    return repository.addTeam(team);
	}

}
