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

import com.leschodes.sporthub.model.BasketballEvent;
import com.leschodes.sporthub.repository.BasketballEventRepository;

@RestController
@RequestMapping("/basket")
public class BasketballEventController {
	
	@Autowired
	BasketballEventRepository repository;
	
    @GetMapping(path="/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<BasketballEvent> getBasketballEvent(@PathVariable int id) {
    	BasketballEvent eventFound = repository.getBasketballEvent(id);
        return new ResponseEntity<BasketballEvent>(eventFound, null, HttpStatus.OK);
    }
	
    @GetMapping(path="/all", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<BasketballEvent>>getAllBasketballEvents()
	{
		List<BasketballEvent> bballEvents = repository.getAllBasketballEvents();
		return new ResponseEntity<List<BasketballEvent>>(bballEvents, null, HttpStatus.OK);
	}
    
	@PostMapping(consumes = "application/json", produces = "application/json")
	public BasketballEvent addBasketballEvent(@RequestBody BasketballEvent bballEvent) {
	    return repository.addBasketballEvent(bballEvent);
	}

}
