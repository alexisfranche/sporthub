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

import com.leschodes.sporthub.model.SoccerEvent;
import com.leschodes.sporthub.repository.SoccerEventRepository;

@RestController
@RequestMapping("/soccer")
public class SoccerEventController {
	
	@Autowired
	SoccerEventRepository repository;
	
    @GetMapping(path="/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<SoccerEvent> getSoccerEvent(@PathVariable int id) {
    	SoccerEvent eventFound = repository.getSoccerEvent(id);
        return new ResponseEntity<SoccerEvent>(eventFound, null, HttpStatus.OK);
    }
	
    @GetMapping(path="/all", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<SoccerEvent>>getAllSoccerEvents()
	{
		List<SoccerEvent> soccerEvents = repository.getAllSoccerEvents();
		return new ResponseEntity<List<SoccerEvent>>(soccerEvents, null, HttpStatus.OK);
	}
    
	@PostMapping(consumes = "application/json", produces = "application/json")
	public SoccerEvent addSoccerEvent(@RequestBody SoccerEvent soccerEvent) {
	    return repository.addSoccerEvent(soccerEvent);
	}

}
