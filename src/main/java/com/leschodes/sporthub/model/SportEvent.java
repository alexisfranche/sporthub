/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4529.a212bcccf modeling language!*/

package com.leschodes.sporthub.model;
import java.sql.Date;

// line 4 "../../../../../../../ump/tmp930352/model.ump"
// line 25 "../../../../../../../ump/tmp930352/model.ump"
public abstract class SportEvent
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //SportEvent Attributes
  private String location;
  private Date timeAndDate;
  private String teamHome;
  private String teamAway;
  private float price;
  private String level;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public SportEvent(String aLocation, Date aTimeAndDate, String aTeamHome, String aTeamAway, float aPrice, String aLevel)
  {
    location = aLocation;
    timeAndDate = aTimeAndDate;
    teamHome = aTeamHome;
    teamAway = aTeamAway;
    price = aPrice;
    level = aLevel;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setLocation(String aLocation)
  {
    boolean wasSet = false;
    location = aLocation;
    wasSet = true;
    return wasSet;
  }

  public boolean setTimeAndDate(Date aTimeAndDate)
  {
    boolean wasSet = false;
    timeAndDate = aTimeAndDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setTeamHome(String aTeamHome)
  {
    boolean wasSet = false;
    teamHome = aTeamHome;
    wasSet = true;
    return wasSet;
  }

  public boolean setTeamAway(String aTeamAway)
  {
    boolean wasSet = false;
    teamAway = aTeamAway;
    wasSet = true;
    return wasSet;
  }

  public boolean setPrice(float aPrice)
  {
    boolean wasSet = false;
    price = aPrice;
    wasSet = true;
    return wasSet;
  }

  public boolean setLevel(String aLevel)
  {
    boolean wasSet = false;
    level = aLevel;
    wasSet = true;
    return wasSet;
  }

  public String getLocation()
  {
    return location;
  }

  public Date getTimeAndDate()
  {
    return timeAndDate;
  }

  public String getTeamHome()
  {
    return teamHome;
  }

  public String getTeamAway()
  {
    return teamAway;
  }

  public float getPrice()
  {
    return price;
  }

  public String getLevel()
  {
    return level;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "location" + ":" + getLocation()+ "," +
            "teamHome" + ":" + getTeamHome()+ "," +
            "teamAway" + ":" + getTeamAway()+ "," +
            "price" + ":" + getPrice()+ "," +
            "level" + ":" + getLevel()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "timeAndDate" + "=" + (getTimeAndDate() != null ? !getTimeAndDate().equals(this)  ? getTimeAndDate().toString().replaceAll("  ","    ") : "this" : "null");
  }
}