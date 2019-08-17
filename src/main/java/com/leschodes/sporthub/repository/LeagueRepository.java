package com.leschodes.sporthub.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.leschodes.sporthub.model.League;

@Repository
public class LeagueRepository {
	
	@Autowired
	EntityManager entityManager;
	
	@Transactional
	public League addLeague(League league) {
		entityManager.persist(league);
		return league;
	}
	
	@Transactional
	public League getLeague(int id)
	{
		League foundLeague = entityManager.find(League.class, id);
		return foundLeague;
	}

	@Transactional
	public List<League> getAllLeagues(){
		List<League> leagues = new ArrayList<League>(); 
		leagues = entityManager.createQuery("SELECT a FROM League a").getResultList();
		return leagues;
	}

}
