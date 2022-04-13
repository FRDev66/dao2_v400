// V4.0.0
// 18/03/2021
// FRDev66
// Copyright 2021 Chroniques Ludiques-  All Rights Reserved.
// Use is subject to license terms.

package zIgzAg.jeu.dao2;



public interface ListeParents{

 public static final String[] laserI={"moteurI"};
 public static final String[] laserII={"laserI"};
 public static final String[] laserIII={"laserII","moteurII"};
 public static final String[] laserIV={"laserIII","moteurIII"};
 public static final String[] laserV={"laserIV","moteurIV"};
 public static final String[] laserVI={"laserV","moteurV"};
 public static final String[] laserVII={"laserVI","moteurVI"};
 public static final String[] laserVIII={"laserVII","moteurVII"};
 public static final String[] laserIX={"laserVIII","moteurVIII"};
 public static final String[] laserX={"laserIX","moteurIX"};

 public static final String[] plasmaI={"moteurI"};
 public static final String[] plasmaII={"plasmaI"};
 public static final String[] plasmaIII={"plasmaII","moteurII"};
 public static final String[] plasmaIV={"plasmaIII","moteurIII"};
 public static final String[] plasmaV={"plasmaIV","moteurIV"};
 public static final String[] plasmaVI={"plasmaV","moteurV"};
 public static final String[] plasmaVII={"plasmaVI","moteurVI"};
 public static final String[] plasmaVIII={"plasmaVII","moteurVII"};
 public static final String[] plasmaIX={"plasmaVIII","moteurVIII"};
 public static final String[] plasmaX={"plasmaIX","moteurIX"};

 public static final String[] torpI={"moteurI"};
 public static final String[] torpII={"torpI"};
 public static final String[] torpIII={"torpII","moteurII"};
 public static final String[] torpIV={"torpIII","moteurIII"};
 public static final String[] torpV={"torpIV","moteurIV"};
 public static final String[] torpVI={"torpV","moteurV"};
 public static final String[] torpVII={"torpVI","moteurVI"};
 public static final String[] torpVIII={"torpVII","moteurVII"};
 public static final String[] torpIX={"torpVIII","moteurVIII"};
 public static final String[] torpX={"torpIX","moteurIX"};

 public static final String[] missI={"moteurI"};
 public static final String[] missII={"missI"};
 public static final String[] missIII={"missII","moteurII"};
 public static final String[] missIV={"missIII","moteurIII"};
 public static final String[] missV={"missIV","moteurIV"};
 public static final String[] missVI={"missV","moteurV"};
 public static final String[] missVII={"missVI","moteurVI"};
 public static final String[] missVIII={"missVII","moteurVII"};
 public static final String[] missIX={"missVIII","moteurVIII"};
 public static final String[] missX={"missIX","moteurIX"};
 
 public static final String[] bombeI={"moteurI"};
 public static final String[] bombeII={"bombeI"};
 public static final String[] bombeIII={"bombeII","moteurII"};
 public static final String[] bombeIV={"bombeIII","moteurIII"};
 public static final String[] bombeV={"bombeIV","moteurIV"};
 public static final String[] bombeVI={"bombeV","moteurV"};
 public static final String[] bombeVII={"bombeVI","moteurVI"};
 public static final String[] bombeVIII={"bombeVII","moteurVII"};
 public static final String[] bombeIX={"bombeVIII","moteurVIII"};
 public static final String[] bombeX={"bombeIX","moteurIX"};

 public static final String[] moteurII={"moteurI"};
 public static final String[] moteurIII={"moteurII"};
 public static final String[] moteurIV={"moteurIII"};
 public static final String[] moteurV={"moteurIV"};
 public static final String[] moteurVI={"moteurV"};
 public static final String[] moteurVII={"moteurVI"};
 public static final String[] moteurVIII={"moteurVII"};
 public static final String[] moteurIX={"moteurVIII"};
 public static final String[] moteurX={"moteurIX"};

 public static final String[] intraI={"moteurX","bouclierV","hscanV"};

 //public static final String[] interI={"moteurX"};

 public static final String[] scanII={"scanI","moteurI"};
 public static final String[] scanIII={"scanII","moteurII"};
 public static final String[] scanIV={"scanIII","moteurIII"};
 public static final String[] scanV={"scanIV","moteurIV"};
 public static final String[] scanVI={"scanV","moteurV"};
 public static final String[] scanVII={"scanVI","moteurVI"};
 public static final String[] scanVIII={"scanVII","moteurVII"};
 public static final String[] scanIX={"scanVIII","moteurVIII"};
 public static final String[] scanX={"scanIX","moteurIX"};
 
 public static final String[] bouclierI={"scanI"};
 public static final String[] bouclierII={"bouclierI","moteurI"};
 public static final String[] bouclierIII={"bouclierII","moteurII"};
 public static final String[] bouclierIV={"bouclierIII","moteurIII"};
 public static final String[] bouclierV={"bouclierIV","moteurIV"};
 public static final String[] bouclierVI={"bouclierV","moteurV"};
 public static final String[] bouclierVII={"bouclierVI","moteurVI"};
 public static final String[] bouclierVIII={"bouclierVII","moteurVII"};
 public static final String[] bouclierIX={"bouclierVIII","moteurVIII"};
 public static final String[] bouclierX={"bouclierIX","moteurIX"};

 public static final String[] lmineI={"bouclierI"};
 public static final String[] lmineII={"lmineI","moteurI"};
 public static final String[] lmineIII={"lmineII","moteurII"};
 public static final String[] lmineIV={"lmineIII","moteurIII"};
 public static final String[] lmineV={"lmineIV","moteurIV"};
 public static final String[] lmineVI={"lmineV","moteurV"};
 public static final String[] lmineVII={"lmineVI","moteurVI"};
 public static final String[] lmineVIII={"lmineVII","moteurVII"};
 public static final String[] lmineIX={"lmineVIII","moteurVIII"};
 public static final String[] lmineX={"lmineIX","moteurIX"};

 public static final String[] dmineI={"lmineI"};
 public static final String[] dmineII={"dmineI","moteurI"};
 public static final String[] dmineIII={"dmineII","moteurII"};
 public static final String[] dmineIV={"dmineIII","moteurIII"};
 public static final String[] dmineV={"dmineIV","moteurIV"};
 public static final String[] dmineVI={"dmineV","moteurV"};
 public static final String[] dmineVII={"dmineVI","moteurVI"};
 public static final String[] dmineVIII={"dmineVII","moteurVII"};
 public static final String[] dmineIX={"dmineVIII","moteurVIII"};
 public static final String[] dmineX={"dmineIX","moteurIX"};

 //public static final String[] mconstruI={"robocoI"};
 //public static final String[] mconstruII={"mconstruI","moteurI"};
 //public static final String[] mconstruIII={"mconstruII","moteurII"};
 //public static final String[] mconstruIV={"mconstruIII","moteurIII"};
 //public static final String[] mconstruV={"mconstruIV","moteurIV"};
 //public static final String[] mconstruVI={"mconstruV","moteurV"};
 //public static final String[] mconstruVII={"mconstruVI","moteurVI"};
 //public static final String[] mconstruVIII={"mconstruVII","moteurVII"};
 //public static final String[] mconstruIX={"mconstruVIII","moteurVIII"};

 public static final String[] bscanI={"scanI"};
 public static final String[] bscanII={"bscanI","moteurI"};
 public static final String[] bscanIII={"bscanII","moteurII"};
 public static final String[] bscanIV={"bscanIII","moteurIII"};
 public static final String[] bscanV={"bscanIV","moteurIV"};
 public static final String[] bscanVI={"bscanV","moteurV"};
 public static final String[] bscanVII={"bscanVI","moteurVI"};
 public static final String[] bscanVIII={"bscanVII","moteurVII"};
 public static final String[] bscanIX={"bscanVIII","moteurVIII"};
 public static final String[] bscanX={"bscanIX","moteurIX"};

 public static final String[] tractI={"cargoI"};
 
 public static final String[] cargoII={"cargoI","moteurI"};
 public static final String[] cargoIII={"cargoII","moteurII"};
 public static final String[] cargoIV={"cargoIII","moteurIII"};
 public static final String[] cargoV={"cargoIV","moteurIV"};
 public static final String[] cargoVI={"cargoV","moteurV"};
 public static final String[] cargoVII={"cargoVI","moteurVI"};
 public static final String[] cargoVIII={"cargoVII","moteurVII"};
 public static final String[] cargoIX={"cargoVIII","moteurVIII"};
 public static final String[] cargoX={"cargoIX","moteurIX"};

 public static final String[] villeI={"agroI","chantierI","pharmaI","culturelI","modeI"};
 public static final String[] villeII={"villeI"};
 public static final String[] villeIII={"villeII"};
 public static final String[] villeIV={"villeIII"};
 public static final String[] villeV={"villeIV"};
 public static final String[] villeVI={"villeV"};
 public static final String[] villeVII={"villeVI"};
 public static final String[] villeVIII={"villeVII"};
 public static final String[] villeIX={"villeVIII"};
 public static final String[] villeX={"villeIX"};

 public static final String[] robocoI={"scanI"};

 public static final String[] hscanI={"scanIV"};
 public static final String[] hscanII={"hscanI","moteurI"};
 public static final String[] hscanIII={"hscanII","moteurII"};
 public static final String[] hscanIV={"hscanIII","moteurIII"};
 public static final String[] hscanV={"hscanIV","moteurIV"};
 public static final String[] hscanVI={"hscanV","moteurV"};
 public static final String[] hscanVII={"hscanVI","moteurVI"};
 public static final String[] hscanVIII={"hscanVII","moteurVII"};
 public static final String[] hscanIX={"hscanVIII","moteurVIII"};
 public static final String[] hscanX={"hscanIX","moteurIX"};

 public static final String[] draminI={"dmineI"};
 public static final String[] draminII={"draminI"};
 public static final String[] draminIII={"draminII","dmineII"};
 public static final String[] draminIV={"draminIII","dmineIII"};
 public static final String[] draminV={"draminIV","dmineIV"};
 public static final String[] draminVI={"draminV","dmineV"};
 public static final String[] draminVII={"draminVI","dmineVI"};
 public static final String[] draminVIII={"draminVII","dmineVII"};
 public static final String[] draminIX={"draminVIII","dmineVIII"};
 public static final String[] draminX={"draminIX","dmineIX"};

 //les batiments -->

 public static final String[] retraiteI={"mineI","optpI"};

 public static final String[] optpI={"boucplaI"};

 public static final String[] optsI={"optpI","boucplaII"};

 public static final String[] repareI={"lourdeI","robotI"};

 public static final String[] boucplaII={"boucplaI"};
 public static final String[] boucplaIII={"boucplaII"};
 public static final String[] boucplaIV={"boucplaIII"};
 public static final String[] boucplaV={"boucplaIV"};
 public static final String[] boucplaVI={"boucplaV"};
 public static final String[] boucplaVII={"boucplaVI"};
 public static final String[] boucplaVIII={"boucplaVII"};
 public static final String[] boucplaIX={"boucplaVIII"};
 public static final String[] boucplaX={"boucplaIX"};

 public static final String[] radarII={"radarI","boucplaII"};
 public static final String[] radarIII={"radarII","boucplaIII"};
 public static final String[] radarIV={"radarIII","boucplaIV"};
 public static final String[] radarV={"radarIV","boucplaV"};
 public static final String[] radarVI={"radarV","boucplaVI"};
 public static final String[] radarVII={"radarVI","boucplaVII"};
 public static final String[] radarVIII={"radarVII","boucplaVIII"};
 public static final String[] radarIX={"radarVIII","boucplaIX"};
 public static final String[] radarX={"radarIX","boucplaX"};

 public static final String[] extraI={"boucplaI","robotI","optsI"};
 public static final String[] extraII={"extraI","boucplaII"};
 public static final String[] extraIII={"extraII","boucplaIII"};
 public static final String[] extraIV={"extraIII","boucplaIV"};
 public static final String[] extraV={"extraIV","boucplaV"};

 public static final String[] agroI={"agricoleI","pharmaI"};
 public static final String[] agricoleI={"boucplaI"};
 public static final String[] modeI={"metauxI","culturelI"};
 public static final String[] culturelI={"boucplaIII"};
 public static final String[] energieI={"mineI"};
 public static final String[] pharmaI={"boucplaI"};
 public static final String[] infoI={"boucplaIII"};
 public static final String[] robotI={"infoI","technoI"};
 public static final String[] technoI={"metauxI","infoI"};
 public static final String[] armeI={"boucplaIII"};
 public static final String[] raffineI={"mineI","boucplaI"};
 public static final String[] lourdeI={"boucplaIII","robotI"};
 public static final String[] metauxI={"boucplaI"};

/*
 public static final String[] gravitI={"infoI","technoI","robotI","lourdeI","energieI"};
 public static final String[] gravitII={"gravitI"};
 public static final String[] gravitIII={"gravitII"};
 public static final String[] gravitIV={"gravitIII"};
 public static final String[] gravitV={"gravitIV"};
 public static final String[] gravitVI={"gravitV"};
 public static final String[] gravitVII={"gravitVI"};
 public static final String[] gravitVIII={"gravitVII"};
 public static final String[] gravitIX={"gravitVIII"};
 public static final String[] gravitX={"gravitIX"};
*/
 
 public static final String[] battlaII={"battlaI","boucplaII"};
 public static final String[] battlaIII={"battlaII","boucplaIII"};
 public static final String[] battlaIV={"battlaIII","boucplaIV"};
 public static final String[] battlaV={"battlaIV","boucplaV"};
 public static final String[] battlaVI={"battlaV","boucplaVI"};
 public static final String[] battlaVII={"battlaVI","boucplaVII"};
 public static final String[] battlaVIII={"battlaVII","boucplaVIII"};
 public static final String[] battlaIX={"battlaVIII","boucplaIX"};
 public static final String[] battlaX={"battlaIX","boucplaX"};

 public static final String[] battplaI={"battlaI"};
 public static final String[] battplaII={"battplaI","boucplaII"};
 public static final String[] battplaIII={"battplaII","boucplaIII"};
 public static final String[] battplaIV={"battplaIII","boucplaIV"};
 public static final String[] battplaV={"battplaIV","boucplaV"};
 public static final String[] battplaVI={"battplaV","boucplaVI"};
 public static final String[] battplaVII={"battplaVI","boucplaVII"};
 public static final String[] battplaVIII={"battplaVII","boucplaVIII"};
 public static final String[] battplaIX={"battplaVIII","boucplaIX"};
 public static final String[] battplaX={"battplaIX","boucplaX"};

 public static final String[] rampemisI={"battplaI"};
 public static final String[] rampemisII={"rampemisI","boucplaII"};
 public static final String[] rampemisIII={"rampemisII","boucplaIII"};
 public static final String[] rampemisIV={"rampemisIII","boucplaIV"};
 public static final String[] rampemisV={"rampemisIV","boucplaV"};
 public static final String[] rampemisVI={"rampemisV","boucplaVI"};
 public static final String[] rampemisVII={"rampemisVI","boucplaVII"};
 public static final String[] rampemisVIII={"rampemisVII","boucplaVIII"};
 public static final String[] rampemisIX={"rampemisVIII","boucplaIX"};
 public static final String[] rampemisX={"rampemisIX","boucplaX"};

 public static final String[] lancetorI={"rampemisI"};
 public static final String[] lancetorII={"lancetorI","boucplaII"};
 public static final String[] lancetorIII={"lancetorII","boucplaIII"};
 public static final String[] lancetorIV={"lancetorIII","boucplaIV"};
 public static final String[] lancetorV={"lancetorIV","boucplaV"};
 public static final String[] lancetorVI={"lancetorV","boucplaVI"};
 public static final String[] lancetorVII={"lancetorVI","boucplaVII"};
 public static final String[] lancetorVIII={"lancetorVII","boucplaVIII"};
 public static final String[] lancetorIX={"lancetorVIII","boucplaIX"};
 public static final String[] lancetorX={"lancetorIX","boucplaX"};

}
       	 
       	 
       	 
       	 
       	 
       	 	
       	
