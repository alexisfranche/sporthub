/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4529.a212bcccf modeling language!*/

package com.leschodes.sporthub.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonFormat;

// line 4 "../../../../../../../ump/tmp930352/model.ump"
// line 25 "../../../../../../../ump/tmp930352/model.ump"
@MappedSuperclass
public abstract class SportEvent {

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------

	// SportEvent Attributes
	private String location;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date timeAndDate;
	private String teamHome;
	private String teamAway;
	private float price;
	private String level;
	private int id;
	private double longitude;
	private double latitude;

	// SportEvent Associations
	private List<Team> teams;

	// ------------------------
	// CONSTRUCTOR
	// ------------------------
	public SportEvent(String aLocation, Date aTimeAndDate, String aTeamHome, String aTeamAway, float aPrice,
			String aLevel, double aLongitude, double aLatitude) {
		location = aLocation;
		timeAndDate = aTimeAndDate;
		teamHome = aTeamHome;
		teamAway = aTeamAway;
		price = aPrice;
		level = aLevel;
		longitude = aLongitude;
		latitude = aLatitude;
		teams = new ArrayList<Team>();
	}

	public SportEvent() {
	}

	// ------------------------
	// INTERFACE
	// ------------------------

	public boolean setLocation(String aLocation) {
		boolean wasSet = false;
		location = aLocation;
		wasSet = true;
		return wasSet;
	}

	public boolean setTimeAndDate(Date aTimeAndDate) {
		boolean wasSet = false;
		timeAndDate = aTimeAndDate;
		wasSet = true;
		return wasSet;
	}

	public boolean setTeamHome(String aTeamHome) {
		boolean wasSet = false;
		teamHome = aTeamHome;
		wasSet = true;
		return wasSet;
	}

	public boolean setTeamAway(String aTeamAway) {
		boolean wasSet = false;
		teamAway = aTeamAway;
		wasSet = true;
		return wasSet;
	}

	public boolean setPrice(float aPrice) {
		boolean wasSet = false;
		price = aPrice;
		wasSet = true;
		return wasSet;
	}

	public boolean setLevel(String aLevel) {
		boolean wasSet = false;
		level = aLevel;
		wasSet = true;
		return wasSet;
	}
	
	public boolean setLongitude(double aLongitude) {
		boolean wasSet = false;
		longitude = aLongitude;
		wasSet = true;
		return wasSet;
	}
	
	public boolean setLatitude(double aLatitude) {
		boolean wasSet = false;
		latitude = aLatitude;
		wasSet = true;
		return wasSet;
	}

	public boolean setId(int aId) {
		boolean wasSet = false;
		id = aId;
		wasSet = true;
		return wasSet;
	}

	public String getLocation() {
		return location;
	}

	public Date getTimeAndDate() {
		return timeAndDate;
	}

	public String getTeamHome() {
		return teamHome;
	}

	public String getTeamAway() {
		return teamAway;
	}

	public float getPrice() {
		return price;
	}

	public String getLevel() {
		return level;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int getId() {
		return id;
	}

	/* Code from template association_GetMany */
	public Team getTeam(int index) {
		Team aTeam = teams.get(index);
		return aTeam;
	}

	@ManyToMany(cascade=CascadeType.ALL)  
    @JoinTable(name="sportevent_team", joinColumns=@JoinColumn(name="sportEvent_id"), inverseJoinColumns=@JoinColumn(name="team_id")) 
	public List<Team> getTeams() {
		List<Team> newTeams = Collections.unmodifiableList(teams);
		return newTeams;
	}
	
	public boolean setTeams(List<Team> setTeams) {
		boolean wasSet = false;
		teams = setTeams;
		wasSet = true;
		return wasSet;
	}

	public int numberOfTeams() {
		int number = teams.size();
		return number;
	}

	public boolean hasTeams() {
		boolean has = teams.size() > 0;
		return has;
	}

	public int indexOfTeam(Team aTeam) {
		int index = teams.indexOf(aTeam);
		return index;
	}

	/* Code from template association_MinimumNumberOfMethod */
	public static int minimumNumberOfTeams() {
		return 0;
	}

	/* Code from template association_AddUnidirectionalMany */
	public boolean addTeam(Team aTeam) {
		boolean wasAdded = false;
		if (teams.contains(aTeam)) {
			return false;
		}
		teams.add(aTeam);
		wasAdded = true;
		return wasAdded;
	}

	public boolean removeTeam(Team aTeam) {
		boolean wasRemoved = false;
		if (teams.contains(aTeam)) {
			teams.remove(aTeam);
			wasRemoved = true;
		}
		return wasRemoved;
	}

	/* Code from template association_AddIndexControlFunctions */
	public boolean addTeamAt(Team aTeam, int index) {
		boolean wasAdded = false;
		if (addTeam(aTeam)) {
			if (index < 0) {
				index = 0;
			}
			if (index > numberOfTeams()) {
				index = numberOfTeams() - 1;
			}
			teams.remove(aTeam);
			teams.add(index, aTeam);
			wasAdded = true;
		}
		return wasAdded;
	}

	public boolean addOrMoveTeamAt(Team aTeam, int index) {
		boolean wasAdded = false;
		if (teams.contains(aTeam)) {
			if (index < 0) {
				index = 0;
			}
			if (index > numberOfTeams()) {
				index = numberOfTeams() - 1;
			}
			teams.remove(aTeam);
			teams.add(index, aTeam);
			wasAdded = true;
		} else {
			wasAdded = addTeamAt(aTeam, index);
		}
		return wasAdded;
	}

	public void delete() {
	}

	  public String toString()
	  {
	    return super.toString() + "["+
	            "location" + ":" + getLocation()+ "," +
	            "teamHome" + ":" + getTeamHome()+ "," +
	            "teamAway" + ":" + getTeamAway()+ "," +
	            "price" + ":" + getPrice()+ "," +
	            "longitude" + ":" + getLongitude()+ "," +
	            "latitude" + ":" + getLatitude()+ "," +
	            "level" + ":" + getLevel()+ "]" + System.getProperties().getProperty("line.separator") +
	            "  " + "timeAndDate" + "=" + (getTimeAndDate() != null ? !getTimeAndDate().equals(this)  ? getTimeAndDate().toString().replaceAll("  ","    ") : "this" : "null");
	  }
}