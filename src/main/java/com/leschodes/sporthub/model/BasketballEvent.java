/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4529.a212bcccf modeling language!*/

package com.leschodes.sporthub.model;
import java.sql.Date;

// line 15 "../../../../../../../ump/tmp930352/model.ump"
// line 30 "../../../../../../../ump/tmp930352/model.ump"
public class BasketballEvent extends SportEvent
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public BasketballEvent(String aLocation, Date aTimeAndDate, String aTeamHome, String aTeamAway, float aPrice, String aLevel)
  {
    super(aLocation, aTimeAndDate, aTeamHome, aTeamAway, aPrice, aLevel);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public void delete()
  {
    super.delete();
  }

}