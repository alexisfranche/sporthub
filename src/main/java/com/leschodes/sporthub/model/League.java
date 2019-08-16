/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4607.2d2b84eb8 modeling language!*/

package com.leschodes.sporthub.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

// line 34 "../../../../../../../ump/tmp719714/model.ump"
// line 59 "../../../../../../../ump/tmp719714/model.ump"
@Entity
@Table(name = "league")
public class League {

	// ------------------------
	// MEMBER VARIABLES
	// ------------------------

	// League Attributes
	private String name;
	private int id;

	// ------------------------
	// CONSTRUCTOR
	// ------------------------
	@JsonCreator
	public League(@JsonProperty("name") String aName, @JsonProperty("id") int aId) {
		name = aName;
		id = aId;
	}

	public League() {
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
	}

	public String toString() {
		return super.toString() + "[" + "name" + ":" + getName() + "]";
	}
}