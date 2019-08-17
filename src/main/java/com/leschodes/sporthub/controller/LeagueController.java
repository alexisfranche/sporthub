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

import com.leschodes.sporthub.model.League;
import com.leschodes.sporthub.repository.LeagueRepository;

@RestController
@RequestMapping("/league")
public class LeagueController {
	
	@Autowired
	LeagueRepository repository;
	
    @GetMapping(path="/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<League> getLeague(@PathVariable int id) {
    	League eventFound = repository.getLeague(id);
        return new ResponseEntity<League>(eventFound, null, HttpStatus.OK);
    }
	
    @GetMapping(path="/all", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<League>>getAllLeagues()
	{
		List<League> leagues = repository.getAllLeagues();
		return new ResponseEntity<List<League>>(leagues, null, HttpStatus.OK);
	}
    
	@PostMapping(consumes = "application/json", produces = "application/json")
	public League addLeague(@RequestBody League league) {
	    return repository.addLeague(league);
	}

}
