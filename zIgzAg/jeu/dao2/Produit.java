// V4.0.0
// 18/03/2021
// FRDev66
// Copyright 2021 Chroniques Ludiques-  All Rights Reserved.
// Use is subject to license terms.

package zIgzAg.jeu.dao2;



import java.io.Serializable;
import java.util.Locale;
import zIgzAg.utile.Mdt;

public class Produit extends Technologie implements Serializable{

 static final long serialVersionUID = 5083537388848753024L;

 private int mineraiNecessaire;
 private float prix;
 private int[][] marchandisesNecessaires;

//méthode provisoire

public void setPrix(float p){prix=p;}

//fin méthode provisoire


 //les méthodes d'accès

 public int getMineraiNecessaire(){return mineraiNecessaire;}
 public float getPrix(){return prix;}
 public int[][] getMarchandises(){return marchandisesNecessaires;}

 public int getQuantiteMarchandise(int marchandise){
  return Mdt.valeurCorrespondante(marchandisesNecessaires,marchandise);
  }

 public String getListeMarchandises(Locale l){
  if(marchandisesNecessaires==null) return "&nbsp;";
  String retour=new String();
  for(int i=0;i<marchandisesNecessaires.length;i++){
   retour=retour+Utile.maj(Univers.getMessage("MARCHANDISES",marchandisesNecessaires[i][0],l))+" : "+
       Integer.toString(marchandisesNecessaires[i][1]);
   if(i!=marchandisesNecessaires.length-1) retour=retour+"<BR>";
   }
  return retour;
  }

 public int getNombreMarchandises(){
  if (marchandisesNecessaires==null) return 0;
   else return marchandisesNecessaires.length;
  }

 //Le constructeur

 protected Produit(){}

 public Produit(String code,int niv,String[] parent,int recherche,int[][] caracS,int minerai,float pri,int[][] mar){
  super(code,niv,parent,recherche,caracS);
  mineraiNecessaire=minerai;
  prix=pri;
  marchandisesNecessaires=mar;
  }


 //les autres méthodes






 }
