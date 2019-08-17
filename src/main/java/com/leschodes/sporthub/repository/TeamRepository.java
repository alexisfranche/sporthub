package com.leschodes.sporthub.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.leschodes.sporthub.model.Team;

@Repository
public class TeamRepository {
	
	@Autowired
	EntityManager entityManager;
	
	@Transactional
	public Team addTeam(Team team) {
		entityManager.persist(team);
		return team;
	}
	
	@Transactional
	public Team getTeam(int id)
	{
		Team foundTeam = entityManager.find(Team.class, id);
		return foundTeam;
	}

	@Transactional
	public List<Team> getAllTeams(){
		List<Team> teams = new ArrayList<Team>(); 
		teams = entityManager.createQuery("SELECT a FROM Team a").getResultList();
		return teams;
	}

}
