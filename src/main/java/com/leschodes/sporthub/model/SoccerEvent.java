/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4529.a212bcccf modeling language!*/

package com.leschodes.sporthub.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

// line 20 "../../../../../../../ump/tmp930352/model.ump"
// line 35 "../../../../../../../ump/tmp930352/model.ump"
@Entity
@Table(name = "soccer_event")
public class SoccerEvent extends SportEvent {

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------

	// ------------------------
	// CONSTRUCTOR
	// ------------------------
	@JsonCreator
	public SoccerEvent(@JsonProperty("location") String aLocation, @JsonProperty("timeAndDate") Date aTimeAndDate,
			@JsonProperty("teamHome") String aTeamHome, @JsonProperty("teamAway") String aTeamAway,
			@JsonProperty("price") float aPrice, @JsonProperty("level") String aLevel,
			@JsonProperty("longitude") double aLongitude, @JsonProperty("latitude") double aLatitude,
			@JsonProperty("id") int aId) {
		super(aLocation, aTimeAndDate, aTeamHome, aTeamAway, aPrice, aLevel, aLongitude, aLatitude);
	}

	public SoccerEvent() {
	}

	// ------------------------
	// INTERFACE
	// ------------------------

	public void delete() {
		super.delete();
	}

}