// V4.0.0
// 18/03/2021
// FRDev66
// Copyright 2021 Chroniques Ludiques-  All Rights Reserved.
// Use is subject to license terms.

package zIgzAg.jeu.dao2;

import java.util.Map;
import java.util.HashMap;
import java.util.Locale;
import zIgzAg.utile.Copie;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.lang.reflect.*;

 public class DeroulementDuTour{

  public static void main(String[] args){

   Univers univers=new Univers(true,"Déroulement du tour...");

   //Déclaration des PNJ existants.
   String sylor="Herudrakis";
   String emper="Irik";
   String arach="Nouvelle République Burlakienne";
   
   Commandant[] cL=Univers.getListeCommandants();
   for(int i=0;i<cL.length;i++) cL[i].initialiserChampsTransients();
   for(int i=0;i<cL.length;i++) {cL[i].setBudget(Const.BUDGET_COMMANDANT_TOUR_PRECEDENT,cL[i].getCentaures());
   if(sylor.equals(cL[i].getNom()))   
   //Don de 10000 centaures à chaque tour aux PNJ.
   {
    //cL[i].modifierBudget(Const.BUDGET_COMMANDANT_REVENUS_DIVERS,27000);
    //cL[i].ajouterEvenement("Evenement_0000",27000);
    //Univers.donnerFlotte(17, 97, 61, "Flotte Migalle", new String[]{"Supercroiseur ScS","Cuirassier ScS","Frégate ScS","Corvette ScS","Intercepteur ScS"}, new int[] {30,60,60,50,300},0);
    //Univers.donnerFlotte(17, 97, 61, "Flotte Scorpion", new String[]{"Supercroiseur ScS","Cuirassier ScS","Frégate ScS","Corvette ScS","Intercepteur ScS"}, new int[] {15,40,40,30,200},0);
    //Univers.donnerFlotte(17, 97, 61, "Flotte Tarentulle", new String[]{"Supercroiseur ScS","Cuirassier ScS","Frégate ScS","Corvette ScS","Intercepteur ScS"}, new int[] {15,30,30,30,200},0);
    //Univers.donnerFlotte(17, 97, 61, "Flotte Shizariyann", new String[]{"Supercroiseur ScS","Cuirassier ScS","Frégate ScS","Corvette ScS"}, new int[] {5,15,15,15},0);
    //Univers.donnerFlotte(17, 97, 61, "Toile de securite", new String[]{"Eclaireur ScS"}, new int[] {12},0);
      //cL[i].ajouterTechnologieConnue("moteurIV");
      //cL[i].ajouterTechnologieConnue("laserVI");
      //cL[i].ajouterTechnologieConnue("plasmaVI");
      //cL[i].ajouterTechnologieConnue("torpVI");
      //cL[i].ajouterTechnologieConnue("bouclierIV");
      //cL[i].ajouterTechnologieConnue("scanIII");
      //cL[i].ajouterTechnologieConnue("hscanIII");
      //cL[i].ajouterTechnologieConnue("dmineIV");
   }
   if(emper.equals(cL[i].getNom()))
   {
           //cL[i].ajouterTechnologieConnue("laserI");
           //cL[i].ajouterTechnologieConnue("laserII");
           //cL[i].ajouterTechnologieConnue("bombeI");
           cL[i].modifierBudget(Const.BUDGET_COMMANDANT_REVENUS_DIVERS,60000);
           cL[i].ajouterEvenement("Evenement_0000",60000);
   //        cL[i].ajouterTechnologieConnue("bscanI");
   //        cL[i].ajouterTechnologieConnue("dmineI");
		   //Univers.donnerFlotte(21, 122, 30, "Convois Federal Alpha", new String[]{"Cargo ScS","Chasseur ScS"}, new int[] {5,10},0);
                   //Univers.donnerFlotte(21, 123, 31, "Convois Federal Beta", new String[]{"Cargo ScS","Chasseur ScS"}, new int[] {5,10},0);
                   //Univers.donnerFlotte(21, 33, 27, "Colere de Leïetov", new String[]{"Supercroiseur ScS","Cuirassier ScS","Frégate ScS","Corvette ScS"}, new int[] {4,10,15,15},0);
                   //Univers.donnerFlotte(21, 36, 23, "Fureur de Leïetov", new String[]{"Supercroiseur ScS","Cuirassier ScS","Frégate ScS","Corvette ScS"}, new int[] {5,15,15,15},0);
                   //Univers.donnerFlotte(21, 39, 26, "Courroux de Leïetov", new String[]{"Supercroiseur ScS","Cuirassier ScS","Frégate ScS","Corvette ScS"}, new int[] {2,10,10,10},0);
                   //Univers.donnerFlotte(21, 3, 99, "FF Brise-Sud Alpha", new String[]{"Supercroiseur ScS","Cuirassier ScS","Frégate ScS","Corvette ScS"}, new int[] {5,15,15,15},0);
                   //Univers.donnerFlotte(21, 16, 99, "FF Brise-Sud Béta", new String[]{"Supercroiseur ScS","Cuirassier ScS","Frégate ScS","Corvette ScS"}, new int[] {5,15,15,15},0);
                   //Univers.donnerFlotte(21, 32, 94, "FF Brise-Sud Gamma", new String[]{"Supercroiseur ScS","Cuirassier ScS","Frégate ScS","Corvette ScS","Intercepteur ScS"}, new int[] {5,15,15,15,50},0);
                   //Univers.donnerFlotte(21, 137, 133, "Flotte Federale Principale", new String[]{"Supercroiseur ScS","Cuirassier ScS","Frégate ScS","Corvette ScS","Intercepteur ScS"}, new int[] {15,30,30,30,200},0);
                   //Univers.donnerFlotte(21, 130, 136, "Flotte Federale Klogrr", new String[]{"Supercroiseur ScS","Cuirassier ScS","Frégate ScS","Corvette ScS"}, new int[] {5,10,10,10},0);
                   //Univers.donnerFlotte(21, 57, 100, "Poing de Leïetov", new String[]{"Supercroiseur ScS","Cuirassier ScS","Frégate ScS","Corvette ScS","Intercepteur ScS"}, new int[] {5,15,15,15,200},0);
                   //Univers.donnerFlotte(21, 125, 108, "FF Ultimatum", new String[]{"Supercroiseur ScS","Cuirassier ScS","Frégate ScS","Corvette ScS","Intercepteur ScS"}, new int[] {5,15,15,15,200},0);
                   //Univers.donnerFlotte(21, 8, 30, "FF Explorer", new String[]{"Supercroiseur ScS","3MiB"}, new int[] {2,1},0);
                   //Univers.donnerFlotte(21, 14, 33, "FF Ehèlandaron", new String[]{"Supercroiseur ScS","Cuirassier ScS","Frégate ScS","Corvette ScS","Intercepteur ScS","Cargo ScS","Colonisatus Basis"}, new int[] {2,10,10,10,50,6,5},0);
   //          PlanDeVaisseau plan=new PlanDeVaisseau(67,"Haarbal Ogrim",new String[]{"moteurI","laserIII"},"totor",
   //	   		                             "Forges Techonologiques","",1,-1,0,null,0,0F,null,4,29);
   //	     Univers.ajouterPlanDeVaisseau(plan);
   //          Univers.ajouterPlanDeVaisseau(plan)   
   }
   if(arach.equals(cL[i].getNom()))
   {
   //        Univers.donnerFlotte(2, 13, 7, "TransportBanque 26", new String[]{"Intercepteur standard","Torpilleur standard","Transport standard"}, new int[] {5,5,10},0);   
   //        Univers.donnerFlotte(2, 13, 7, "Escorteur 26", new String[]{"Intercepteur standard","Frégate standard","Chasseur standard"}, new int[] {10,2,10},0);   
   //       cL[i].ajouterTechnologieConnue("progcoI");
   //        cL[i].modifierBudget(Const.BUDGET_COMMANDANT_REVENUS_DIVERS,10000);
   //        cL[i].ajouterEvenement("Evenement_0000_4",10000);
	   //PlanDeVaisseau plan=new PlanDeVaisseau(7,"Imoen",new String[]{"moteurIV","laserVI","plasmaVI","torpVI","bouclierIV","scanIII","hscanIII","dmineIV"},"Cuirassier Delivrance","Labo Technologique","",1,-1,0,null,417,702F,null,100,29);
	   //Univers.ajouterPlanDeVaisseau(plan);
	   //cL[i].creerPlanDeVaisseau("Cuirassier Delivrance","Labo Technologique","privé",0,new String[]{"moteurIV","laserVI","plasmaVI","torpVI","bouclierIV","scanIII","hscanIII","dmineIV"},int[]{1,18,18,18,2,1,1,1});
   }
   
   }
   
   //spécial pour ce tour.
   //Ajout de la technologie mine en public.
   //Univers.ajouterTechnologieAuDomainePublic("mineI");
   //Univers.ajouterTechnologieAuDomainePublic("chantierI");
   //Univers.ajouterTechnologieAuDomainePublic("moteurI");
   //Univers.ajouterTechnologieAuDomainePublic("energieI");
   
   //Suppression des plans de vaisseau.
   //Univers.supprimerPlanDeVaisseau("Mini");
   //Univers.supprimerPlanDeVaisseau("Armageddon");
   //Univers.supprimerPlanDeVaisseau("GoÃ©lette Muad'Dib");
   //Univers.supprimerPlanDeVaisseau("Goélette Muad'Dib");
   //Univers.supprimerPlanDeVaisseau("Hypercroiseur Fédéré");
   //Univers.supprimerPlanDeVaisseau("Bombardier furtif de classe I");
   //Univers.supprimerPlanDeVaisseau("Tick-Tack");
   //Univers.supprimerPlanDeVaisseau("Patrouilleur");
   //Univers.supprimerPlanDeVaisseau("Plate-Forme Radar Mikanok I");
   

   
   //for(int y=1;y<=25;y++){
   //       Univers.ajouterRelationRaces(0,y,0,3,-12000);
   //       Univers.ajouterRelationRaces(0,y,0,4,0);}
   //for(int y=1;y<=25;y++){
   //       Univers.ajouterRelationRaces(0,y,1,3,-12000);
   //       Univers.ajouterRelationRaces(0,y,1,4,12000);}
   //for(int y=1;y<=25;y++){
   //       Univers.ajouterRelationRaces(0,y,2,3,-12000);
   //       Univers.ajouterRelationRaces(0,y,2,4,12000);}
   //for(int y=1;y<=25;y++)
   //       Univers.ajouterRelationRaces(0,y,4,5,12000);
   
   //fin spécial

   System.out.println("Gestion des collisions...");
   for(int i=0;i<cL.length;i++) cL[i].resolutionCollisions();
   Univers.phaseSuivante();


   System.out.println("Reception des ordres et gestion de ces ordres...");
   ReceptionOrdres ro=new ReceptionOrdres();
   Map m=ro.deroulementOrdres();
   ro=null;

   Integer[] listeOrdresRendus=(Integer[])m.keySet().toArray(new Integer[0]);
   System.out.println("");

   System.out.println("Debut des combats...");
   Combat.resolutionCombats();
   System.out.println("Gestion fin du tour...");




   Alliance.gererAlliances1();
   gestionFinDeTour(cL);
   Technologie.testDevenirTechnologiesPubliques();

   Univers.augmenterNumeroTour();
   System.out.println("Mise à jour de la base des commandants...");
   ProductionOrdres.produireRegistre(Utile.transformer(listeOrdresRendus));
   
   //Suppression de la liste des heros et gouverneur du tour précédent.
   Leader[] l = Univers.listeLeadersEnVente();
   for(int i=0;i<l.length;i++) Univers.retirerLeaderEnVente(l[i]);
   
   Leader.produireEncheres();
   Alliance.gererAlliances2();
   
   //Suppression des plans de vaisseau.
   //Univers.supprimerPlanDeVaisseau("Torpilleur extreme");


   cL=null;m=null;listeOrdresRendus=null;
   
   Rapport.ecrireMessagesSystemes();
   Stats.afficher(Locale.FRENCH);
   ProductionOrdres.produireOrdresGeneraux();
   ProductionOrdres.productionDonneeRaces(Locale.FRENCH);

   Commandant[] cL2=Univers.getListeCommandantsHumains();
   Map tran=new HashMap();
   Map tran2=new HashMap();

   for(int i=cL2.length-1;i>=0;i--){

    System.out.print(cL2[i].toString()+"-");

    cL2[i].determinerFlottesDetectes();
    cL2[i].determinerSystemesDetectes();

     tran.put(new Integer(cL2[i].getNumero()),cL2[i].stockerChampsTransients());



    }


   for(int i=cL2.length-1;i>=0;i--)
     {

    System.out.print(cL2[i].toString()+"-");

    cL2[i].chargerChampsTransients((List)tran.get(new Integer(cL2[i].getNumero())));

    Rapport r=new Rapport(cL2[i]);
    r.creation();
    r.ecriture();

    ProductionOrdres prod=new ProductionOrdres(cL2[i]);
    prod.creation();
    cL2[i].initialiserChampsTransients();
    tran.remove(new Integer(cL2[i].getNumero()));
    }

   univers.sauvegarder();

   }



 public static void gestionFinDeTour(Commandant[] c){
  for(int i=0;i<c.length;i++){


   c[i].progressionNiveauLieutenant();Univers.phaseSuivante();
   c[i].resolutionGestionSystemes();Univers.phaseSuivante();

   c[i].resolutionGestionFlottes();Univers.phaseSuivante();

   if(c[i].estJoueurHumain()) c[i].resolutionEvenements();Univers.phaseSuivante();
   c[i].resolutionProgressionRecherche();Univers.phaseSuivante();
   c[i].finaliserBudget();Univers.phaseSuivante();
   c[i].ajouterReputation(Univers.getInt(50)+50);




   }
  }

 }