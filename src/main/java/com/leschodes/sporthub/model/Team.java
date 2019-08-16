/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4607.2d2b84eb8 modeling language!*/

package com.leschodes.sporthub.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

// line 27 "../../../../../../../ump/tmp719714/model.ump"
// line 54 "../../../../../../../ump/tmp719714/model.ump"
@Entity
@Table(name = "team")
public class Team {

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------

	// Team Attributes
	private String name;
	private int id;

	// Team Associations
	private League league;

	// ------------------------
	// CONSTRUCTOR
	// ------------------------
	@JsonCreator
	public Team(@JsonProperty("name") String aName, @JsonProperty("league") League aLeague, @JsonProperty("id") int aId) {
		name = aName;
		id = aId;
		if (!setLeague(aLeague)) {
			throw new RuntimeException(
					"Unable to create Team due to aLeague. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
		}
	}

	public Team() {
	}

	// ------------------------
	// INTERFACE
	// ------------------------

	public boolean setName(String aName) {
		boolean wasSet = false;
		name = aName;
		wasSet = true;
		return wasSet;
	}

	public String getName() {
		return name;
	}

	/* Code from template association_GetOne */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinTable(name = "team_league")
	public League getLeague() {
		return league;
	}

	/* Code from template association_SetUnidirectionalOne */
	public boolean setLeague(League aNewLeague) {
		boolean wasSet = false;
		if (aNewLeague != null) {
			league = aNewLeague;
			wasSet = true;
		}
		return wasSet;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public int getId() {
		return id;
	}
	
	public boolean setId(int aId) {
		boolean wasSet = false;
		id = aId;
		wasSet = true;
		return wasSet;
	}

	public void delete() {
		league = null;
	}

	public String toString() {
		return super.toString() + "[" + "name" + ":" + getName() + "]"
				+ System.getProperties().getProperty("line.separator") + "  " + "league = "
				+ (getLeague() != null ? Integer.toHexString(System.identityHashCode(getLeague())) : "null");
	}
}