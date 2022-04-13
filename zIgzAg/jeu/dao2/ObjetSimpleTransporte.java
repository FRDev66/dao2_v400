// V4.0.0
// 18/03/2021
// FRDev66
// Copyright 2021 Chroniques Ludiques-  All Rights Reserved.
// Use is subject to license terms.

package zIgzAg.jeu.dao2;



import java.io.Serializable;

public class ObjetSimpleTransporte extends ObjetTransporte implements Serializable,Cloneable{

 private int nombre;

 public int getNombre(){return nombre;}
 public void setNombre(int entree){nombre=entree;}
 public void ajoutNombre(int nb){nombre=nombre+nb;}


 public Object ajout(Object o){
  if(o!=null) nombre=nombre+((ObjetSimpleTransporte)o).getNombre();
  return this;
  }

 public Object suppression(int nb){
  int nombreSupprime=Math.min(nb,nombre);
  if(nombreSupprime==0) return null;
  nombre=nombre-nombreSupprime;
  return new ObjetSimpleTransporte(getCode(),nombreSupprime);
  }

 public boolean estValide(){if (nombre==0) return false; else return true;}

 public int getNombreObjets(){return nombre;}
 public Object clone(){return new ObjetSimpleTransporte(getCode(),getNombre());}

 private ObjetSimpleTransporte(){}

 public ObjetSimpleTransporte(String type,int nb){
  super(type);
  nombre=nb;
  }

 

 }
 	   
 
       	 
       	 
       	 
       	 
       	 
       	 	
       	
