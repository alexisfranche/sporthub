package com.leschodes.sporthub.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.leschodes.sporthub.model.SoccerEvent;

@Repository
public class SoccerEventRepository {

	@Autowired
	EntityManager entityManager;
	
	@Transactional
	public SoccerEvent addSoccerEvent(SoccerEvent soccerEvent) {
		entityManager.persist(soccerEvent);
		return soccerEvent;
	}
	
	@Transactional
	public SoccerEvent getSoccerEvent(int id)
	{
		SoccerEvent foundSoccerEvent = entityManager.find(SoccerEvent.class, id);
		return foundSoccerEvent;
	}

	@Transactional
	public List<SoccerEvent> getAllSoccerEvents(){
		List<SoccerEvent> soccerEventAll = new ArrayList<SoccerEvent>(); 
		soccerEventAll = entityManager.createQuery("SELECT a FROM SoccerEvent a").getResultList();
		return soccerEventAll;
	}
	
	@Transactional
	public boolean deleteSoccerEvent(int id) {
		SoccerEvent soccerEvent = entityManager.find(SoccerEvent.class, id);
		
		if(soccerEvent == null)
			return false;
		
		entityManager.remove(soccerEvent);
		return true;
	}
	
}
