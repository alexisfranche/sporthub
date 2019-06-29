package com.leschodes.sporthub.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Repository;

import com.leschodes.sporthub.model.BasketballEvent;

@Repository
public class BasketballEventRepository {
	
	@Autowired
	EntityManager entityManager;
	
	@Transactional
	public BasketballEvent addBasketballEvent(BasketballEvent bballEvent) {
		entityManager.persist(bballEvent);
		return bballEvent;
	}
	
	@Transactional
	public BasketballEvent getBasketballEvent(int id)
	{
		BasketballEvent foundBballEvent = entityManager.find(BasketballEvent.class, id);
		return foundBballEvent;
	}

	@Transactional
	public List<BasketballEvent> getAllBasketballEvents(){
		List<BasketballEvent> basketballEvents = new ArrayList<BasketballEvent>(); 
		basketballEvents = entityManager.createQuery("SELECT a FROM BasketballEvent a").getResultList();
		return basketballEvents;
	}

}
