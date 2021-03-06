// V4.0.0
// 18/03/2021
// FRDev66
// Copyright 2021 Chroniques Ludiques-  All Rights Reserved.
// Use is subject to license terms.

package zIgzAg.jeu.dao2;



import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Locale;
import java.io.Serializable;
import zIgzAg.utile.Fiche;

public class Vaisseau implements Serializable{

  static final long serialVersionUID=-4210831797673667249L;

  private String nom;
  private String type;
  private int experience;
  private int raceEquipage;
  private int moral;
  private HashMap dommages;
  private HashMap cargaison;

  private int proprietaire;
  private int tourRetourLocation;

  private int populationVilleSpatiale;

  private transient int[] boucliers;
  private transient int dommagesEffectues;

  private transient PlanDeVaisseau plan;
  private transient ArrayList listeComposantsValides;
  private transient ArrayList listeArmesValides;
  private transient int combativite;
  private boolean detruit;


 //les méthodes d'accès

 public void setType(String entree){type=entree;}
 public void setRaceEquipage(int entree){raceEquipage=entree;}
 public void setMoral(int entree){moral=entree;}
 public void setNom(String entree){nom=entree;}
 public void setExperience(int entree){experience=entree;}

 public String getType(){return type;}
 public String getNom(){return nom;}
 public int getRaceEquipage(){return raceEquipage;}
 public int getExperience(){return experience;}
 public int getNiveauExperience(){return retournerNiveauExperience(experience);}
 public String getDescriptionNiveauExperience(Locale l){return Univers.getMessage("EXPERIENCE",getNiveauExperience(),l);}
 public void augmenterExperience(int mod){
  experience=experience+mod*(Univers.getInt(Const.BASE_NIVEAU_EXPERIENCE)/Math.max(1,plan.getNombreDeComposants()));
  }

 public int getDommagesEffectues(){return dommagesEffectues;}
 public void initialiserDommagesEffectues(){dommagesEffectues=0;}
 public int getMoral(){return moral;}
 public int getNiveauMoral(){return retournerNiveauMoral(moral);}
 public String getDescriptionNiveauMoral(Locale l){return Univers.getMessage("MORAL",getNiveauMoral(),l);}
 public void augmenterMoral(){moral=moral+Univers.getInt(10);}
 public void diminuerMoral(){moral=Math.max(0,moral-Univers.getInt(10));}
 public int getCombativite(){return combativite;}
 public void diminuerCombativite(){combativite--;}
 public boolean estCombatif(){return (combativite>0);}
 public boolean estDetruit(){return detruit;}
 public void notifierDestruction(){detruit=true;}

 public void initialiserDommages(){dommages=null;}
 public void initialiserCargaison(){cargaison=null;}

 public boolean estLoue(){if(proprietaire==0) return false; else return true;}
 public void initialiserLocation(){proprietaire=0;}
 public int getVeritableProprietaire(){return proprietaire;}
 public int getTourRetourLocation(){return tourRetourLocation;}

 public boolean estDeType(String entree){return type.equals(entree);}

 private void determinerPlanDeVaisseau(){if(plan==null) plan=Univers.getPlanDeVaisseau(type);}

 private void determinerListeComposantsValides(){
  if(listeComposantsValides==null){
   listeComposantsValides=new ArrayList(plan.getNombreDeComposants()); 
   for(int i=0;i<plan.getNombreDeComposants();i++)
    if((dommages==null)||(!composantInutilisable(i)))
     listeComposantsValides.add(new Integer(i));
   }
  }

 private void determinerListeArmesValides(boolean combatSpatial){
  listeArmesValides=new ArrayList(plan.getNombreDeComposants());
  for(int i=0;i<plan.getNombreDeComposants();i++)
   if((dommages==null)||(!composantInutilisable(i)))
    if(plan.getComposant(i).estArme())
     if(!combatSpatial) listeArmesValides.add(new Integer(i));
      else if(((Arme)plan.getComposant(i)).estCombatSpatial()) listeArmesValides.add(new Integer(i));
  }

 private void determinerCaracteristiquesTemporaires(){
  determinerPlanDeVaisseau();
  determinerListeComposantsValides();
  }

 public int getNumeroBouclierValide(){        //################
  if (boucliers.length==0) return -1;
  int compteur=0;
  for(int i=0;i<plan.getNombreDeComposants();i++)
   if((plan.getComposant(i).estBouclier())&&(!composantInutilisable(i)))
     if(boucliers[compteur]<plan.getComposant(i).getNiveauBouclier()) return compteur;
     else compteur++;
  return -1;
  }

 /*public int getBouclier(){              //#################
  if (boucliers.length==0) return -1;
  int NivoProtectionBouc=0;
  int nbBouc=0;
  int protectBouc=0;
  for(int i=0;i<plan.getNombreDeComposants();i++)
   if((plan.getComposant(i).estBouclier())&&(!composantInutilisable(i)))
    if(boucliers[NivoProtectionBouc]<plan.getComposant(i).getNiveauBouclier()) return NivoProtectionBouc;
  nbBouc=getNombreBoucliers();
  protectBouc=nbBouc*NivoProtectionBouc;
  return protectBouc;
  }*/
  
 /*public int getNumeroBouclierValide(){
  if (boucliers.length==0) return -1;
  int compteur=0;
  for(int i=0;i<plan.getNombreDeComposants();i++)
   if((plan.getComposant(i).estBouclier())&&(!composantInutilisable(i)))
    if(boucliers[compteur]<plan.getComposant(i).getNiveauBouclier()) return compteur;
     else compteur++;
  return -1;
  }*/

  public void ajouterDommagesBouclier(int numBouc,int dommages){
  boucliers[numBouc]=boucliers[numBouc]+dommages;
  }

  public void ajouterDommagesBouclier2(int protecBouc,int dommages,int nbBouc){     //###############
  boucliers[protecBouc]=boucliers[protecBouc]*nbBouc+dommages;
  }

 public void calculeCombativite(Heros h){
  combativite=5+getNiveauMoral()+h.getMoralModifie();
  }

 public int nombreDeComposantsValides(){
  return listeComposantsValides.size();
  }

 public int nombreDeComposantsInutilisables(){
  return plan.getNombreDeComposants()-listeComposantsValides.size();
  }

 public int[] getNumerosComposantsInutilisables(){
  determinerCaracteristiquesTemporaires();
  int[] retour=new int[nombreDeComposantsInutilisables()];
  int j=0;
  for(int i=0;i<plan.getNombreDeComposants();i++)
   if(composantInutilisable(i)) retour[j++]=i;
  return retour;
  }

 public Integer[] listeComposantsEndomages(){
  if(dommages==null) return new Integer[0];
  else return (Integer[])dommages.keySet().toArray(new Integer[0]);
  }

 public Integer[] listePointsDeDommages2(){
  if(dommages==null) return new Integer[0];
   else return (Integer[])dommages.values().toArray(new Integer[0]);
  }

 public int[] listePointsDeDommages(){
  return Utile.transformer(listePointsDeDommages2());
  }

 public int nombreTotalPointsDeDommage(){
  int retour=0;
  Integer[] l=listePointsDeDommages2();
  for(int i=0;i<l.length;i++)
   retour=retour+l[i].intValue();
  return retour;
  }

 public int pointsDeDommagesDuComposant(int numeroComposant){
  if(dommages==null) return 0;
  Object o=dommages.get(new Integer(numeroComposant));
  if(o==null) return 0;
   else return ((Integer)o).intValue();
  }

 public boolean composantInutilisable(int numeroComposant){
  if(pointsDeDommagesDuComposant(numeroComposant)==(plan.getComposants())[numeroComposant].getNombreDeCasesPrises())
     return true;
   else return false;
  }

 public int reparer(int potentiel){
  if(dommages==null) return 0;
  determinerCaracteristiquesTemporaires();
  Integer[] liste=listeComposantsEndomages();
  int retour=0;
  for(int i=0;i<liste.length;i++)
   if(retour<potentiel){
    Integer d=(Integer)dommages.get(liste[i]);
    if(potentiel-retour>=d.intValue()) dommages.remove(liste[i]);
     else dommages.put(liste[i],new Integer(d.intValue()-potentiel+retour));
    retour=Math.min(retour+d.intValue(),potentiel);
    }
  if(nombreTotalPointsDeDommage()==0) dommages=null;
  listeArmesValides=null;

  listeComposantsValides=null;

  return retour;
  }

 private void ajouterDommage(Integer numeroComposant){
  Object o;
  if((o=dommages.get(numeroComposant))==null) dommages.put(numeroComposant,new Integer(1));
   else dommages.put(numeroComposant,new Integer(((Integer)o).intValue()+1));
  if(composantInutilisable(numeroComposant.intValue())){
   listeComposantsValides.remove(numeroComposant);
   if(listeArmesValides!=null){
    listeArmesValides.remove(numeroComposant);
    if(plan.getComposant(numeroComposant.intValue()).estMoteur())
     if(Univers.getTest(Const.CHANCE_EXPLOSION_MOTEUR)) notifierDestruction();
    }
   }
  }

 private boolean ajouterDommageAuHasard(){
  //test pour corriger bug plan de vaisseau vide ->
  if(nombreDeComposantsValides()==0) return false;
  ajouterDommage((Integer)listeComposantsValides.get(Univers.getInt(nombreDeComposantsValides())));
  if(nombreDeComposantsValides()==0) return false;
   else return true;
  }

 private boolean ajouterDommageAuHasard(String protege){
  Integer test=(Integer)listeComposantsValides.get(Univers.getInt(nombreDeComposantsValides()));
  int tempo=0;
  while(((plan.getComposants())[test.intValue()].getCorpsCode().equals(protege))&&(tempo<100)){
   test=(Integer)listeComposantsValides.get(Univers.getInt(nombreDeComposantsValides()));
   tempo++;
   }
  ajouterDommage((Integer)listeComposantsValides.get(Univers.getInt(nombreDeComposantsValides())));
  if(nombreDeComposantsValides()==0) return false;
   else return true;
  }

 public boolean ajouterDommagesAuHasard(int nb){
  determinerCaracteristiquesTemporaires();
  if(dommages==null) dommages=new HashMap(plan.getNombreDeComposants()*2,0.5F);
  for(int i=0;i<nb;i++) if(!ajouterDommageAuHasard()) return false;
  return true;
  }

 public boolean ajouterDommagesAuHasard(int nb,String protege){
  determinerCaracteristiquesTemporaires();
  if(dommages==null) dommages=new HashMap(plan.getNombreDeComposants()*2,0.5F);
  for(int i=0;i<nb;i++) if(!ajouterDommageAuHasard(protege)) return false;
  return true;
  }

 /*private void effectuerDommages(Vaisseau cible,Arme a,Heros h1,Heros h2){
  augmenterMoral();
  cible.diminuerMoral();
  int b=cible.getNombreBouclierValide();
  if(b>0){
   if(b==1)cible.ajouterDommagesBouclier(cible.getNumeroBouclierValide(),a.getDommagesBouclier());
   else{
     int c=a.getDommagesBouclier();
     while(c>0){
      int d=cible.getNombreBouclierValide();            //###########
      int g=plan.getComposant(d).getNiveauBouclier();
      if (c>d){
        int e=boucliers[d];
        cible.ajouterDommagesBouclier(d,c);
        c-=(g-e);
      }
      else{
        cible.ajouterDommagesBouclier(d,c);
        c=-1;
      };
    };
   };
  }
   else{
    if(!cible.ajouterDommagesAuHasard(a.getDommagesCoque())) cible.notifierDestruction();
    dommagesEffectues=dommagesEffectues+a.getDommagesCoque();
    augmenterExperience(1+h1.getNiveauCompetence(Const.COMPETENCE_LEADER_MAITRISE_SAVOIR));
    cible.augmenterExperience(1+h2.getNiveauCompetence(Const.COMPETENCE_LEADER_MAITRISE_SAVOIR));
    }
  }*/

 private void effectuerDommages(Vaisseau cible,Arme a,Heros h1,Heros h2){
  augmenterMoral();
  cible.diminuerMoral();
  int b=cible.getNumeroBouclierValide();
  if(b!=-1){
          cible.ajouterDommagesBouclier(b,a.getDommagesBouclier());
          //System.err.println(cible.getNombreBoucliers()*b);
          //cible.ajouterDommagesBouclier2(b,a.getDommagesBouclier(),cible.getNombreBoucliers());
          dommagesEffectues=dommagesEffectues+a.getDommagesCoque()-cible.getNombreBoucliers()*b;
          if(dommagesEffectues<0) dommagesEffectues=0;         
  }
  else{
    if(!cible.ajouterDommagesAuHasard(a.getDommagesCoque())) cible.notifierDestruction();
  dommagesEffectues=dommagesEffectues+a.getDommagesCoque();}
    augmenterExperience(1+h1.getNiveauCompetence(Const.COMPETENCE_LEADER_MAITRISE_SAVOIR));
    cible.augmenterExperience(1+h2.getNiveauCompetence(Const.COMPETENCE_LEADER_MAITRISE_SAVOIR));
  }

/*  private void effectuerDommages(Vaisseau cible,Arme a,Heros h1,Heros h2){
  augmenterMoral();
  cible.diminuerMoral();
  int b=cible.getNumeroBouclierValide();
  if(b!=-1) cible.ajouterDommagesBouclier(b,a.getDommagesBouclier());
   else{
    if(!cible.ajouterDommagesAuHasard(a.getDommagesCoque())) cible.notifierDestruction();
    dommagesEffectues=dommagesEffectues+a.getDommagesCoque();
    augmenterExperience(1+h1.getNiveauCompetence(Const.COMPETENCE_LEADER_MAITRISE_SAVOIR));
    cible.augmenterExperience(1+h2.getNiveauCompetence(Const.COMPETENCE_LEADER_MAITRISE_SAVOIR));
    }
  }*/

  public void tir(Vaisseau cible,int distance,Heros h1,Heros h2){
  int compteur=0;
  while((compteur<listeArmesValides.size())&&(!cible.estDetruit())){
   Integer a=(Integer)listeArmesValides.get(compteur);
   Arme arme=(Arme)plan.getComposant(a.intValue());
   if(!Univers.getTest(arme.getFiabilite())){
    int chance=arme.getChanceDeToucher(cible.getTaille(),distance);
    if(chance==0) compteur++;
     else{
      if(reussiteTir(chance,cible,h1,h2)) effectuerDommages(cible,arme,h1,h2);
      listeArmesValides.remove(a);
      if(h1!=null) h1.augmenterExperience();
      if(h2!=null) h2.augmenterExperience();
      }
    }
   }
  }

 private boolean reussiteTir(int chanceDepart,Vaisseau cible,Heros h1,Heros h2){
  int test=chanceDepart;
  test=test+getNiveauExperience()+h1.getAttaqueModifie()+
      Const.RACES_CARACTERISTIQUES[raceEquipage][Const.RACE_CARACTERISTIQUE_COMBAT_SPATIAL]/2;
  if(h1.estDeRace(raceEquipage)) test=test+1+h1.getNiveauCompetence(Const.COMPETENCE_LEADER_INSPIRATION_FANATIQUE);
  test=test-cible.getNiveauExperience()-h2.getDefenseModifie();
  if(h2.estDeRace(cible.getRaceEquipage()))
   test=test-1-h2.getNiveauCompetence(Const.COMPETENCE_LEADER_INSPIRATION_FANATIQUE);
  return Univers.getTest(Math.max(1,test));
  }

 public void preparerAuCombat(boolean combatSpatial){
  determinerCaracteristiquesTemporaires();
  determinerListeArmesValides(combatSpatial);
  initialiserDommagesEffectues();
  detruit=false;
  if(boucliers==null) boucliers=new int[getNombreBoucliers()];
  }

 public void tirSurConstruction(ConstructionPlanetaire[] cibles,Heros h,Gouverneur g,boolean bombe){
  for(int i=0;i<listeArmesValides.size();i++){
   Integer a=(Integer)listeArmesValides.get(i);
   Arme arme=(Arme)plan.getComposant(a.intValue());
   boolean possible=false;
   if((bombe)&&(arme.estCombatPlanetaire())) possible=true;
   if(!bombe) possible=true;
   if((possible)&&(!Univers.getTest(arme.getFiabilite()))){
    int index=Univers.getInt(cibles.length);

    int chance=50+getNiveauExperience()+h.getAttaqueModifie()+
       Const.RACES_CARACTERISTIQUES[raceEquipage][Const.RACE_CARACTERISTIQUE_COMBAT_PLANETAIRE];
    if(h.estDeRace(raceEquipage)) chance=chance+1+h.getNiveauCompetence(Const.COMPETENCE_LEADER_INSPIRATION_FANATIQUE);
    chance=chance-cibles[index].getNiveauExperience()-g.getDefenseModifie()-
      g.getNiveauCompetence(Const.COMPETENCE_LEADER_INSPIRATION_FANATIQUE);
    if(Univers.getTest(chance)){
     augmenterMoral();
     augmenterExperience(1+h.getNiveauCompetence(Const.COMPETENCE_LEADER_MAITRISE_SAVOIR));
     cibles[index].augmenterExperience(1+g.getNiveauCompetence(Const.COMPETENCE_LEADER_MAITRISE_SAVOIR));
     if(h!=null) h.augmenterExperience();
     if(g!=null) g.augmenterExperience();
     cibles[index].ajouterDommages(arme.getDommagesSol());
     dommagesEffectues=dommagesEffectues+Math.min(arme.getDommagesSol(),cibles[index].getPointsDeStructureRestants());
     }
    }
   }
  }

 public int tirSurMilices(Heros h,Gouverneur g,boolean bombe){
  int retour=0;
  for(int i=0;i<listeArmesValides.size();i++){
   Integer a=(Integer)listeArmesValides.get(i);
   Arme arme=(Arme)plan.getComposant(a.intValue());
   boolean possible=false;
   if((bombe)&&(arme.estCombatPlanetaire())) possible=true;
   if(!bombe) possible=true;
   if((possible)&&(!Univers.getTest(arme.getFiabilite()))){
    int chance=50+getNiveauExperience()+h.getAttaqueModifie()+
       Const.RACES_CARACTERISTIQUES[raceEquipage][Const.RACE_CARACTERISTIQUE_COMBAT_PLANETAIRE];
    if(h.estDeRace(raceEquipage)) chance=chance+1+h.getNiveauCompetence(Const.COMPETENCE_LEADER_INSPIRATION_FANATIQUE);
    chance=chance-g.getDefenseModifie()-g.getNiveauCompetence(Const.COMPETENCE_LEADER_INSPIRATION_FANATIQUE);
    if(Univers.getTest(chance)){
     augmenterMoral();
     augmenterExperience(1+h.getNiveauCompetence(Const.COMPETENCE_LEADER_MAITRISE_SAVOIR));
     if(h!=null) h.augmenterExperience();
     if(g!=null) g.augmenterExperience();
     retour=retour+arme.getDommagesSol();
     dommagesEffectues=dommagesEffectues+arme.getDommagesSol();
     }
    }
   }
  return retour;
  }


 public void ajouterCargaison(ObjetTransporte objet){
  if(cargaison==null) cargaison=new HashMap(1);
  Object o=cargaison.get(objet.getCode());
  if(o!=null)
    cargaison.put(objet.getCode(),objet.ajout(o));
    else cargaison.put(objet.getCode(),objet);
  }

 public ObjetTransporte supprimerCargaison(String code,int nb){
  if(cargaison==null) return null;
  Object o=cargaison.get(code);
  if(o==null) return null;
  ObjetTransporte retour=(ObjetTransporte)((ObjetTransporte)o).suppression(nb);
  if(!((ObjetTransporte)o).estValide()) cargaison.remove(code);
  return retour;
  }

 public int getNombreCargaison(String code){
  if(cargaison==null) return 0;
  Object o=cargaison.get(code);
  if(o==null) return 0;
   else return ((ObjetTransporte)o).getNombreObjets();
  }

 public String[] listeTypeCargaison(){
  if(cargaison==null) return new String[0];
   else return (String[])cargaison.keySet().toArray(new String[0]);
  }

 public ObjetTransporte[] listeCargaison(){
  if(cargaison==null) return new ObjetTransporte[0];
   else return (ObjetTransporte[])cargaison.values().toArray(new ObjetTransporte[0]);
  }

 public int capaciteCargoUtilisee(){
  String[] c=listeTypeCargaison();
  ObjetTransporte[] n=listeCargaison();
  int retour=0;
  for(int i=0;i<c.length;i++)
    retour=retour+ObjetTransporte.getEncombrementChargement(c[i])*n[i].getNombreObjets();
  return retour;
  }

 public void initialiserEquipage(){
  moral=Const.MORAL_DEPART_EQUIPAGE;
  experience=0;
  }

 //Le constructeur

 private Vaisseau(){}

 public Vaisseau(String n,String t,int equipage){
  nom=n;
  type=t;
  raceEquipage=equipage;
  initialiserEquipage();
  initialiserDommages();
  initialiserCargaison();
  }

 //les méthodes statiques

 public static Vaisseau creer(String typeDeVaisseau,int race){
  return new Vaisseau(Utile.getNom(),typeDeVaisseau,race);
  }

 //autres méthodes.

 public void planifierTransmission(int numeroDonneur,int tourRetour){
  proprietaire=numeroDonneur;
  tourRetourLocation=tourRetour;
  }

 public int getCapaciteMouvement(boolean intraGalactique){
  determinerCaracteristiquesTemporaires();
  return plan.getCapaciteMouvement(getNumerosComposantsInutilisables(),intraGalactique);
  }

 public int getCapaciteMouvementCombat(boolean intraGalactique){
  determinerCaracteristiquesTemporaires();
  return plan.getCapaciteMouvementCombat(getNumerosComposantsInutilisables(),intraGalactique);
  }
  
 public int getCapaciteMouvementFixe(boolean intraGalactique){
  determinerCaracteristiquesTemporaires();
  return Math.max(plan.getCapaciteMouvement(false),
  			plan.getCapaciteMouvement(getNumerosComposantsInutilisables(),intraGalactique));
  }

 public float getValeur(){
  determinerCaracteristiquesTemporaires();
  return plan.getPrix();
  }

 public int getPorteeScannerSysteme(){
  determinerCaracteristiquesTemporaires();
  return plan.getPorteeScannerSysteme(getNumerosComposantsInutilisables());
  }

 public int getPorteeScannerFlotte(){
  determinerCaracteristiquesTemporaires();
  return plan.getPorteeScannerFlotte(getNumerosComposantsInutilisables());
  }

 public int getBrouillageRadar(){
  determinerCaracteristiquesTemporaires();
  return plan.getBrouillageRadar(getNumerosComposantsInutilisables());
  }

/*
 public boolean estInterGalactique(){
  determinerCaracteristiquesTemporaires();
  return plan.estInterGalactique(getNumerosComposantsInutilisables());
  }
*/

 public boolean estIntraGalactique(){
  determinerCaracteristiquesTemporaires();
  return plan.estIntraGalactique(getNumerosComposantsInutilisables());
  }

 public boolean estLanceurDeMines(){
  determinerCaracteristiquesTemporaires();
  return plan.estLanceurDeMines(getNumerosComposantsInutilisables());
  }

 public boolean estTransporteur(){
  determinerCaracteristiquesTemporaires();
  return plan.estTransporteur(getNumerosComposantsInutilisables());
  }

 public int capaciteCargo(boolean aVide){
  determinerCaracteristiquesTemporaires();
  if(aVide) return plan.capaciteCargo(getNumerosComposantsInutilisables());
   else return (plan.capaciteCargo(getNumerosComposantsInutilisables())-capaciteCargoUtilisee());
  }

 public int capaciteNavireUsine(){
  determinerCaracteristiquesTemporaires();
  return plan.capaciteNavireUsine(getNumerosComposantsInutilisables());
  }

 public int niveauNavireUsine(){
  determinerCaracteristiquesTemporaires();
  return plan.niveauNavireUsine(getNumerosComposantsInutilisables());
  }

 public boolean possedeRayonTracteur(){
  determinerCaracteristiquesTemporaires();
  return plan.capaciteRayonTracteur(getNumerosComposantsInutilisables());
  }

 public int capaciteNombreChargement(int charge){
  return capaciteCargo(false)/charge;
  }

 public int lancerMines(Position pos,int numJoueur){
  Debris d=new Debris(pos);

  int nbMinesClassiques=plan.nombreLanceurMinesClassiques(getNumerosComposantsInutilisables());
  d.ajouterObstacle(Const.DEBRIS_MINES_CLASSIQUES,nbMinesClassiques);

  Univers.ajouterDebris(d);
  return nbMinesClassiques;
  }

 public int capaciteDetectionMines(){
  determinerCaracteristiquesTemporaires();
  return plan.capaciteDetectionMines(getNumerosComposantsInutilisables());
  }

 public int capaciteDraguageMines(){
  determinerCaracteristiquesTemporaires();
  return plan.capaciteDraguageMines(getNumerosComposantsInutilisables());
  }

 public boolean protectionDraguageMines(){
  determinerCaracteristiquesTemporaires();
  return plan.protectionDraguageMines();
  }

 public boolean estColonisateur(){
  determinerCaracteristiquesTemporaires();
  return plan.estColonisateur(getNumerosComposantsInutilisables());
  }

 public int capaciteVilleSpatiale(){
  determinerCaracteristiquesTemporaires();
  return plan.getCapaciteVilleSpatiale(getNumerosComposantsInutilisables());
  }

 public int getPopulationVilleSpatiale(){return populationVilleSpatiale;}

 public void augmenterPopulationVilleSpatiale(){
  populationVilleSpatiale=
    Math.min(capaciteVilleSpatiale(),populationVilleSpatiale+Math.max(10,populationVilleSpatiale/10));
  }

 public int getTaille(){
  determinerCaracteristiquesTemporaires();
  return plan.getTaille();
  }

 public int getPuissance(){
  determinerCaracteristiquesTemporaires();
  return plan.getPuissance(getNumerosComposantsInutilisables());
  }

 public int getForceSpatiale(){
  determinerCaracteristiquesTemporaires();
  return plan.getForceSpatiale(getNumerosComposantsInutilisables());
  }

 public int getForcePlanetaire(){
  determinerCaracteristiquesTemporaires();
  return plan.getForcePlanetaire(getNumerosComposantsInutilisables());
  }

 public int getNbCases(){
  determinerCaracteristiquesTemporaires();
  return plan.getNombreDeCases();
  }

 public int getNombreArmesValides(){
  return listeArmesValides.size();
  }

 public int getTempo(){
  return getCapaciteMouvement(false)*100+Univers.getInt(100)*retournerNiveauExperience(experience)+
           (plan.getVitesseArmes(getNumerosComposantsInutilisables())*100)/(getNombreArmesValides()+1);
  }

 public int getNombreBoucliers(){
  determinerCaracteristiquesTemporaires();
  return plan.getNombreBoucliers(getNumerosComposantsInutilisables());
  }

 public boolean estBombardier(){
  determinerCaracteristiquesTemporaires();
  return plan.estBombardier(getNumerosComposantsInutilisables());
  }

 public boolean estChasseur(){
  determinerCaracteristiquesTemporaires();
  return plan.estChasseur(getNumerosComposantsInutilisables());
  }

 public String getDescriptionComposantsDetruits(Locale l){
  determinerCaracteristiquesTemporaires();
  String retour=plan.descriptionComposantsDetruits(getNumerosComposantsInutilisables(),l);
  listeComposantsValides=null;
  plan=null;
  return retour;
  }

 //méthodes statiques.

 public static int retournerNiveauExperience(int entree){
  if(entree<Const.BASE_NIVEAU_EXPERIENCE*2) return 0;
  if(entree<Const.BASE_NIVEAU_EXPERIENCE*10) return 1;
  if(entree<Const.BASE_NIVEAU_EXPERIENCE*20) return 2;
  if(entree<Const.BASE_NIVEAU_EXPERIENCE*50) return 3;
  return 4;
  }

 public static int retournerNiveauMoral(int entree){
  if(entree<Const.BASE_NIVEAU_MORAL)return 0;
  if(entree<2*Const.BASE_NIVEAU_MORAL)return 1;
  if(entree<3*Const.BASE_NIVEAU_MORAL)return 2;
  if(entree<4*Const.BASE_NIVEAU_MORAL)return 3;
  if(entree<5*Const.BASE_NIVEAU_MORAL)return 4;
  if(entree<6*Const.BASE_NIVEAU_MORAL)return 5;
  if(entree<7*Const.BASE_NIVEAU_MORAL)return 6;
  if(entree<8*Const.BASE_NIVEAU_MORAL)return 7;
  if(entree<9*Const.BASE_NIVEAU_MORAL)return 8;
  if(entree<10*Const.BASE_NIVEAU_MORAL)return 9;
  if(entree<15*Const.BASE_NIVEAU_MORAL)return 10;
  return 11;
  }

 public static int retournerNiveauPuissance(int entree){
  if(entree<Const.BASE_NIVEAU_PUISSANCE)return 0;
  if(entree<5*Const.BASE_NIVEAU_PUISSANCE)return 1;
  if(entree<10*Const.BASE_NIVEAU_PUISSANCE)return 2;
  if(entree<20*Const.BASE_NIVEAU_PUISSANCE)return 3;
  if(entree<50*Const.BASE_NIVEAU_PUISSANCE)return 4;
  if(entree<100*Const.BASE_NIVEAU_PUISSANCE)return 5;
  if(entree<200*Const.BASE_NIVEAU_PUISSANCE)return 6;
  if(entree<500*Const.BASE_NIVEAU_PUISSANCE)return 7;
  if(entree<1000*Const.BASE_NIVEAU_PUISSANCE)return 8;
  if(entree<2000*Const.BASE_NIVEAU_PUISSANCE)return 9;  //gargantuesque
  if(entree<4000*Const.BASE_NIVEAU_PUISSANCE)return 10;  //cyclopéenne
  return 11;  //inimaginable
  }

 //Méthode Vaisseau.getNbCibleMax()-- nombre de tir = return+1.
  public int getNbCibleMax()
  {
	determinerCaracteristiquesTemporaires();
	if( plan.getTaille()==0) return 0;
	if( plan.getTaille()==1) return 1;
	if( plan.getTaille()==2) return 2;
	if( plan.getTaille()==3) return 5;
	if( plan.getTaille()==4) return 8;
	if( plan.getTaille()==5) return 14;
	if( plan.getTaille()==6) return 23;
	if( plan.getTaille()==7) return 35;
	if( plan.getTaille()==8) return 47;
	else return 59;
  }
  
  public int getNombreDeComposants(){
          return plan.getNombreDeComposants();
  }
  
  public ComposantDeVaisseau getComposant(int index){
          return plan.getComposant(index);
  }
  
 }
