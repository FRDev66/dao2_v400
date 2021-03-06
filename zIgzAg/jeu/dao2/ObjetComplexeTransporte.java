// V4.0.0
// 18/03/2021
// FRDev66
// Copyright 2021 Chroniques Ludiques-  All Rights Reserved.
// Use is subject to license terms.

package zIgzAg.jeu.dao2;



import java.io.Serializable;
import java.util.ArrayList;

public class ObjetComplexeTransporte extends ObjetTransporte implements Serializable,Cloneable{

 private ArrayList contenu;

 public Object ajout(Object o){
  if(o!=null)
   contenu.addAll(((ObjetComplexeTransporte)o).getContenu());
  return this;
  }

 public Object suppression(int nb){
  int nombreSupprime=Math.min(nb,getNombreObjets());
  if(nombreSupprime<=0) return null;
  ObjetComplexeTransporte retour=new ObjetComplexeTransporte(getCode());
  for(int i=nombreSupprime-1;i>=0;i--) retour.ajouterObjet(contenu.remove(i));
  return retour;
  }

 public boolean estValide(){if (getNombreObjets()==0) return false; else return true;}
 public int getNombreObjets(){return contenu.size();}
 public Object clone(){
  ObjetComplexeTransporte o= new ObjetComplexeTransporte(getCode());
  o.setContenu((ArrayList)contenu.clone());
  return o;
  }

 public void ajouterObjet(Object o){contenu.add(o);}
 public Object getObjet(int index){return contenu.get(index);} 
 

 public void initialiserContenu(){contenu=new ArrayList();}
 public ArrayList getContenu(){return contenu;}
 public void setContenu(ArrayList v){contenu=v;}

 private ObjetComplexeTransporte(){}

 public ObjetComplexeTransporte(String type){
  super(type);
  initialiserContenu();
  }

 

 }
 	   
 
       	 
       	 
       	 
       	 
       	 
       	 	
       	
