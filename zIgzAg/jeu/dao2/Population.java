// V4.0.0
// 18/03/2021
// FRDev66
// Copyright 2021 Chroniques Ludiques-  All Rights Reserved.
// Use is subject to license terms.

package zIgzAg.jeu.dao2;



import java.io.Serializable;

 public class Population implements Serializable{

  private int race;
  private int popActuelle;

  // les méthodes d'accès.

  public int getRace(){return race;}
  public int getPopActuelle(){return popActuelle;}

  public void setRace(int entree){race=entree;}
  public void setPopActuelle(int entree){popActuelle=entree;}

  public Population(){}


  }
