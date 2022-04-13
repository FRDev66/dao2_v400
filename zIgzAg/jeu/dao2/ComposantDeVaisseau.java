// V4.0.0
// 18/03/2021
// FRDev66
// Copyright 2021 Chroniques Ludiques-  All Rights Reserved.
// Use is subject to license terms.

package zIgzAg.jeu.dao2;





public class ComposantDeVaisseau extends Produit{

 private String type;
 private int nombreDeCasesPrises;

 //les méthodes d'accès

 public boolean estArme(){if(type.equals(Const.CV_ARME)) return true; else return false;}
 public boolean estMoteur(){if(type.equals(Const.CV_MOTEUR)) return true; else return false;}
 public boolean estBouclier(){if(getCorpsCode().equals("bouclier")) return true; else return false;}
 //public boolean estUsineVaisseaux(){if(getCorpsCode().equals("mconstru")) return true; else return false;}

 public int getNombreDeCasesPrises(){return nombreDeCasesPrises;}

 public int getNiveauBouclier(){
  return getValeurCaracteristiqueSpeciale(Const.COMPOSANT_CAPACITE_BOUCLIER_MAGNETIQUE);
  }

 //les méthodes statiques

 //Le constructeur

 protected ComposantDeVaisseau(){}

 public ComposantDeVaisseau(String code,int niv,String[] parent,int recherche,int[][] caracS,int minerai,
                 float pri,int[][] mar,String typ,int nbCases){

  super(code,niv,parent,recherche,caracS,minerai,pri,mar);
  type=typ;
  nombreDeCasesPrises=nbCases;
  }

 //les autres méthodes





 }

