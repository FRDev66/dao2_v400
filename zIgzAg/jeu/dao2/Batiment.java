// V4.0.0
// 18/03/2021
// FRDev66
// Copyright 2021 Chroniques Ludiques-  All Rights Reserved.
// Use is subject to license terms.

package zIgzAg.jeu.dao2;




public class Batiment extends Produit{

 private int structure;
 private int pointsDeConstructionNecessaires;
 private String codeArme;

 //les méthodes d'accès

 public int getPointsDeConstruction(){return pointsDeConstructionNecessaires;}
 public int getPointsDeStructure(){return structure;}

 public boolean estDefensePlanetaire(){return (codeArme!=null);}
 public Arme getArme(){
  if(!estDefensePlanetaire()) return null;
   else return (Arme)Univers.getTechnologie(codeArme+getRepresentationNiveau());
  }

 //les méthodes statiques

 //Le constructeur

 protected Batiment(){}

 public Batiment(String code,int niv,String[] parent,int recherche,int[][] caracS,int minerai,
                 float pri,int[][] mar,int struct,int ptConstru,String cA){

  super(code,niv,parent,recherche,caracS,minerai,pri,mar);
  structure=struct;
  pointsDeConstructionNecessaires=ptConstru;
  codeArme=cA;
  }

 //les autres méthodes





 }

