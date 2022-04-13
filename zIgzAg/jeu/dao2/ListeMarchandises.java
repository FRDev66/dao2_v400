// V4.0.0
// 18/03/2021
// FRDev66
// Copyright 2021 Chroniques Ludiques-  All Rights Reserved.
// Use is subject to license terms.

package zIgzAg.jeu.dao2;

/*
 public static final int PRODUIT_NOURRITURE=0;
 public static final int PRODUIT_MATERIEL_AGRICOLE=1;
 public static final int PRODUIT_LUXE=2;
 public static final int PRODUIT_HOLOFILM=3;
 public static final int PRODUIT_ENERGIE=4;
 public static final int PRODUIT_MEDICAMENT=5;
 public static final int PRODUIT_LOGICIEL=6;
 public static final int PRODUIT_ROBOT=7;
 public static final int PRODUIT_COMPOSANT_ELECTRONIQUE=8;
 public static final int PRODUIT_ARMEMENT=9;
 public static final int PRODUIT_CARBURANT=10;
 public static final int PRODUIT_PIECE_INDUSTRIELLE=11;
 public static final int PRODUIT_METAUX_PRECIEUX=12;
 public static final int PRODUIT_TIXIUM=13;
 public static final int PRODUIT_LIXIAM=14;
 public static final int PRODUIT_OXOLE=15;
 //Les différents produits commerciaux.
*/

public interface ListeMarchandises{

 public static final int[][] laserIV={{8,1}};
 public static final int[][] laserV={{8,1}};
 public static final int[][] laserVI={{8,2}};
 public static final int[][] laserVII={{8,2}};
 public static final int[][] laserVIII={{8,2},{6,1}};
 public static final int[][] laserIX={{8,2},{6,2}};
 public static final int[][] laserX={{8,2},{6,2}};

 public static final int[][] plasmaIV={{11,1}};
 public static final int[][] plasmaV={{11,1}};
 public static final int[][] plasmaVI={{11,2}};
 public static final int[][] plasmaVII={{11,2}};
 public static final int[][] plasmaVIII={{11,2},{6,1}};
 public static final int[][] plasmaIX={{11,2},{6,2}};
 public static final int[][] plasmaX={{11,2},{6,2}};

 public static final int[][] torpIV={{9,1}};
 public static final int[][] torpV={{9,1}};
 public static final int[][] torpVI={{9,1},{6,1}};
 public static final int[][] torpVII={{6,2},{9,1}};
 public static final int[][] torpVIII={{6,2},{9,2}};
 public static final int[][] torpIX={{6,2},{9,2}};
 public static final int[][] torpX={{6,2},{9,2}};

 public static final int[][] missI={{8,1}};
 public static final int[][] missII={{8,1}};
 public static final int[][] missIII={{8,1}};
 public static final int[][] missIV={{8,1},{6,1}};
 public static final int[][] missV={{8,1},{6,2}};
 public static final int[][] missVI={{8,2},{6,2}};
 public static final int[][] missVII={{8,2},{6,3}};
 public static final int[][] missVIII={{8,3},{6,3}};
 public static final int[][] missIX={{8,3},{6,3}};
 public static final int[][] missX={{8,3},{6,3}};

 public static final int[][] bombeIV={{9,1}};
 public static final int[][] bombeV={{9,1}};
 public static final int[][] bombeVI={{9,2}};
 public static final int[][] bombeVII={{9,2}};
 public static final int[][] bombeVIII={{9,2}};
 public static final int[][] bombeIX={{9,2}};
 public static final int[][] bombeX={{9,2}};
 
 public static final int[][] moteurIII={{10,1},{14,1}};
 public static final int[][] moteurIV={{10,2},{14,2}};
 public static final int[][] moteurV={{10,3},{14,3}};
 public static final int[][] moteurVI={{10,3},{11,1},{14,4}};
 public static final int[][] moteurVII={{10,3},{11,2},{14,5}};
 public static final int[][] moteurVIII={{10,4},{11,2},{14,6}};
 public static final int[][] moteurIX={{10,5},{11,3},{14,7}};
 public static final int[][] moteurX={{10,10},{11,10},{14,8}};

public static final int[][] intraI={{8,10},{14,10},{6,10},{12,10}};

 //public static final int[][] interI={{10,5},{14,2}};

 public static final int[][] scanII={{8,1}};
 public static final int[][] scanIII={{8,2}};
 public static final int[][] scanIV={{8,3},{12,1}};
 public static final int[][] scanV={{8,4},{12,2}};
 public static final int[][] scanVI={{8,5},{12,3}};
 public static final int[][] scanVII={{8,6},{12,4}};
 public static final int[][] scanVIII={{8,7},{12,5}};
 public static final int[][] scanIX={{8,8},{12,6}};
 public static final int[][] scanX={{8,10},{12,8}};

 public static final int[][] bouclierIII={{13,1}};
 public static final int[][] bouclierIV={{13,3}};
 public static final int[][] bouclierV={{13,5}};
 public static final int[][] bouclierVI={{13,7}};
 public static final int[][] bouclierVII={{13,9}};
 public static final int[][] bouclierVIII={{13,11}};
 public static final int[][] bouclierIX={{13,13}};
 public static final int[][] bouclierX={{13,15}};

 public static final int[][] lmineI={{9,1}};
 public static final int[][] lmineII={{9,2}};
 public static final int[][] lmineIII={{9,3},{11,1}};
 public static final int[][] lmineIV={{9,4},{11,2}};
 public static final int[][] lmineV={{9,5},{11,3}};
 public static final int[][] lmineVI={{9,6},{11,4}};
 public static final int[][] lmineVII={{9,7},{11,5}};
 public static final int[][] lmineVIII={{9,8},{11,6}};
 public static final int[][] lmineIX={{9,9},{11,7}};
 public static final int[][] lmineX={{9,10},{11,8}};
 
 public static final int[][] dmineIII={{8,1}};
 public static final int[][] dmineIV={{8,2}};
 public static final int[][] dmineV={{8,3},{7,1}};
 public static final int[][] dmineVI={{8,4},{7,2}};
 public static final int[][] dmineVII={{8,5},{7,3}};
 public static final int[][] dmineVIII={{8,6},{7,4}};
 public static final int[][] dmineIX={{8,7},{7,5}};
 public static final int[][] dmineX={{8,10},{7,10}};

 //public static final int[][] mconstruI={{11,1}};
 //public static final int[][] mconstruII={{11,2}};
 //public static final int[][] mconstruIII={{11,3},{13,1}};
 //public static final int[][] mconstruIV={{11,4},{7,1},{13,2}};
 //public static final int[][] mconstruV={{11,5},{7,3},{13,3}};
 //public static final int[][] mconstruVI={{11,7},{7,5},{13,4}};
 //public static final int[][] mconstruVII={{11,10},{7,8},{13,6}};
 //public static final int[][] mconstruVIII={{11,15},{7,10},{13,8}};
 //public static final int[][] mconstruIX={{11,20},{7,15},{13,10}};

 public static final int[][] bscanII={{6,1}};
 public static final int[][] bscanIII={{6,2}};
 public static final int[][] bscanIV={{6,3},{12,1}};
 public static final int[][] bscanV={{6,4},{12,2}};
 public static final int[][] bscanVI={{6,5},{12,3}};
 public static final int[][] bscanVII={{6,6},{12,4}};
 public static final int[][] bscanVIII={{6,7},{12,5}};
 public static final int[][] bscanIX={{6,8},{12,6}};
 public static final int[][] bscanX={{6,10},{12,8}};

 public static final int[][] cargoIV={{7,1}};
 public static final int[][] cargoV={{7,2}};
 public static final int[][] cargoVI={{7,3}};
 public static final int[][] cargoVII={{7,4}};
 public static final int[][] cargoVIII={{7,5}};
 public static final int[][] cargoIX={{7,6}};
 public static final int[][] cargoX={{7,7}};

 public static final int[][] villeI={{15,1},{0,1},{4,2}};
 public static final int[][] villeII={{15,2},{0,3},{4,4}};
 public static final int[][] villeIII={{15,3},{0,4},{4,6}};
 public static final int[][] villeIV={{15,4},{0,8},{4,8}};
 public static final int[][] villeV={{15,6},{0,16},{4,10}};
 public static final int[][] villeVI={{15,7},{0,32},{4,12}};
 public static final int[][] villeVII={{15,8},{0,64},{4,14}};
 public static final int[][] villeVIII={{15,9},{0,128},{4,16}};
 public static final int[][] villeIX={{15,10},{0,256},{4,18}};
 public static final int[][] villeX={{15,11},{0,512},{4,20}};

 //public static final int[][] hscanI={{8,1},{12,1}};
 public static final int[][] hscanII={{8,2},{12,2}};
 public static final int[][] hscanIII={{8,3},{12,3}};
 public static final int[][] hscanIV={{8,4},{12,4}};
 public static final int[][] hscanV={{8,5},{12,5}};
 public static final int[][] hscanVI={{8,6},{12,6}};
 public static final int[][] hscanVII={{8,7},{12,7}};
 public static final int[][] hscanVIII={{8,8},{12,8}};
 public static final int[][] hscanIX={{8,9},{12,9}};
 public static final int[][] hscanX={{8,10},{12,10}};

 public static final int[][] draminI={{7,1}};
 public static final int[][] draminII={{7,2}};
 public static final int[][] draminIII={{7,3}};
 public static final int[][] draminIV={{7,4}};
 public static final int[][] draminV={{7,5}};
 public static final int[][] draminVI={{7,6}};
 public static final int[][] draminVII={{7,7}};
 public static final int[][] draminVIII={{7,8}};
 public static final int[][] draminIX={{7,9}};
 public static final int[][] draminX={{7,10}};

 public static final int[][] robocoI={{7,1},{11,1}};
 
  //les batiments -->

 public static final int[][] retraiteI={{11,2},{4,10}};  
 public static final int[][] mineI={{4,1}};  
 public static final int[][] chantierI={{4,10}};  

 public static final int[][] optpI={{7,1},{4,5}};  

 public static final int[][] optsI={{7,2},{4,5}};  

 public static final int[][] repareI={{11,1},{4,20}};

 public static final int[][] boucplaI={{4,5}};
 public static final int[][] boucplaII={{7,1},{13,1},{4,10}};
 public static final int[][] boucplaIII={{7,2},{6,1},{13,3},{4,15}};
 public static final int[][] boucplaIV={{7,3},{6,2},{13,5},{4,20}};
 public static final int[][] boucplaV={{7,4},{6,3},{13,7},{4,25}};
 public static final int[][] boucplaVI={{7,5},{6,4},{13,9},{4,30}};
 public static final int[][] boucplaVII={{7,6},{6,5},{13,11},{4,35}};
 public static final int[][] boucplaVIII={{7,7},{6,6},{13,13},{4,40}};
 public static final int[][] boucplaIX={{7,8},{6,7},{13,15},{4,45}};
 public static final int[][] boucplaX={{7,9},{6,8},{13,17},{4,50}};

 public static final int[][] radarI={{4,10}};
 public static final int[][] radarII={{6,1},{4,15}};
 public static final int[][] radarIII={{6,2},{4,20}};
 public static final int[][] radarIV={{6,2},{4,25}};
 public static final int[][] radarV={{6,3},{4,30}};
 public static final int[][] radarVI={{6,4},{4,35}};
 public static final int[][] radarVII={{6,5},{4,40}};
 public static final int[][] radarVIII={{6,6},{13,1},{4,45}};
 public static final int[][] radarIX={{6,7},{13,2},{4,50}};
 public static final int[][] radarX={{6,8},{13,3},{4,55}};

 public static final int[][] extraI={{7,1},{4,10}};
 public static final int[][] extraII={{7,2},{4,15}};
 public static final int[][] extraIII={{7,3},{4,20}};
 public static final int[][] extraIV={{7,4},{4,25}};
 public static final int[][] extraV={{7,5},{13,1},{4,30}};

 public static final int[][] battlaI={{4,5}};
 public static final int[][] battlaII={{9,1},{4,10}};
 public static final int[][] battlaIII={{9,2},{4,20}};
 public static final int[][] battlaIV={{9,2},{4,25}};
 public static final int[][] battlaV={{9,3},{4,30}};
 public static final int[][] battlaVI={{9,4},{4,35}};
 public static final int[][] battlaVII={{9,5},{4,40}};
 public static final int[][] battlaVIII={{9,6},{13,1},{4,45}};
 public static final int[][] battlaIX={{9,7},{13,2},{4,50}};
 public static final int[][] battlaX={{9,8},{13,3},{4,55}};

 public static final int[][] battplaI={{4,5}};
 public static final int[][] battplaII={{9,1},{4,15}};
 public static final int[][] battplaIII={{9,2},{4,20}};
 public static final int[][] battplaIV={{9,2},{4,25}};
 public static final int[][] battplaV={{9,3},{4,30}};
 public static final int[][] battplaVI={{9,4},{4,35}};
 public static final int[][] battplaVII={{9,5},{4,40}};
 public static final int[][] battplaVIII={{9,6},{13,1},{4,45}};
 public static final int[][] battplaIX={{9,7},{13,2},{4,50}};
 public static final int[][] battplaX={{9,8},{13,3},{4,55}};

 public static final int[][] rampemisI={{4,5}};
 public static final int[][] rampemisII={{9,1},{6,1},{4,15}};
 public static final int[][] rampemisIII={{9,2},{6,2},{4,20}};
 public static final int[][] rampemisIV={{9,2},{6,3},{4,25}};
 public static final int[][] rampemisV={{9,3},{6,4},{4,30}};
 public static final int[][] rampemisVI={{9,4},{6,5},{4,35}};
 public static final int[][] rampemisVII={{9,5},{6,6},{4,40}};
 public static final int[][] rampemisVIII={{9,6},{13,1},{6,7},{4,45}};
 public static final int[][] rampemisIX={{9,7},{13,2},{6,8},{4,50}};
 public static final int[][] rampemisX={{9,8},{13,3},{6,9},{4,55}};

 public static final int[][] lancetorI={{4,5}};
 public static final int[][] lancetorII={{9,2},{4,15}};
 public static final int[][] lancetorIII={{9,3},{4,20}};
 public static final int[][] lancetorIV={{9,4},{4,25}};
 public static final int[][] lancetorV={{9,5},{4,30}};
 public static final int[][] lancetorVI={{9,6},{4,35}};
 public static final int[][] lancetorVII={{9,7},{4,40}};
 public static final int[][] lancetorVIII={{9,8},{13,2},{4,45}};
 public static final int[][] lancetorIX={{9,9},{13,3},{4,50}};
 public static final int[][] lancetorX={{9,10},{13,4},{4,55}};

/*
 public static final int[][] gravitI={{4,10},{7,2}};
 public static final int[][] gravitII={{4,15},{7,3}};
 public static final int[][] gravitIII={{4,20},{7,3}};
 public static final int[][] gravitIV={{4,25},{7,3},{11,2}};
 public static final int[][] gravitV={{4,30},{7,4},{11,2}};
 public static final int[][] gravitVI={{4,35},{7,4},{11,3}};
 public static final int[][] gravitVII={{4,40},{7,4},{11,3}};
 public static final int[][] gravitVIII={{4,45},{7,5},{11,3}};
 public static final int[][] gravitIX={{4,50},{7,5},{11,4}};
 public static final int[][] gravitX={{4,55},{7,6},{11,5}};
*/
 
 public static final int[][] agroI={{4,5}};
 public static final int[][] agricoleI={{4,5}};
 public static final int[][] modeI={{4,5}};
 public static final int[][] culturelI={{4,5}};
 //public static final int[][] energieI={{4,5}};
 public static final int[][] pharmaI={{4,5}};
 public static final int[][] infoI={{4,5}};
 public static final int[][] robotI={{4,5}};
 public static final int[][] technoI={{4,5}};
 public static final int[][] armeI={{4,5}};
 public static final int[][] raffineI={{4,5}};
 public static final int[][] lourdeI={{4,5}};
 public static final int[][] metauxI={{4,5}};
 
}
       	 
       	 
       	 
       	 
       	 
       	 	
       	
