// V4.0.0
// 18/03/2021
// FRDev66
// Copyright 2021 Chroniques Ludiques-  All Rights Reserved.
// Use is subject to license terms.

package zIgzAg.jeu.dao2;



import java.util.Map;
import java.util.Locale;
import java.io.Serializable;


public class Joueur implements Serializable{

 static final long serialVersionUID=7395505175740159403L;

 private String adresseElectronique;
 private String motDePasse;
 private String login;
 private int tourArrivee;
 private int dernierTourRendu;

 private String site;
 private boolean ordrePasseEnLocale;
 private boolean envoiStats;
 private boolean rapportSansBgNoir;
 private boolean detailOrdresPasses;
 private int maniereDeRecevoirSesRapports;
 //0 mail 1 ftp

 private Locale langue;

 protected String nom;
 protected int race;
 protected int numero;
 protected int typeDeJoueur;
 //0 humain 1 commandant neutre 2 robot

 //Les méthodes d'accès

  public int getNumero(){return numero;}
  public int getRace(){return race;}
  public String getNom(){return nom;}
  public String getNomNumero(){
   if(numero!=0) return nom+" ("+Integer.toString(numero)+")";
  /*public String getNomNumero(){
   if(numero!=0) return "<font color='  "+Rapport.COULEURS_RACES[getRace()]+"  '>" + nom + " (" + Integer.toString(numero) + ")"; */
    else return nom;}
  public String toString(){return getNomNumero();}
  public String getAdresseElectronique(){return adresseElectronique;}
  public String getLogin(){return login;}
  public String getMotDePasse(){return motDePasse;}
  public boolean aUnSite(){return site!=null;}
  public String getSite(){return site;}
  public int getTourArrivee(){return tourArrivee;}
  public int getDernierTourRendu(){return dernierTourRendu;}
  public Locale getLocale(){if (langue==null) return Locale.FRENCH; else return langue;}
  public boolean getModePassationOrdres(){return ordrePasseEnLocale;}
  public boolean getEnvoiStats(){return envoiStats;}
  public boolean getRapportSansBgNoir(){return rapportSansBgNoir;}
  public boolean getModeDetailOrdresPasses(){return detailOrdresPasses;}
  public int getTypeReceptionRapport(){return maniereDeRecevoirSesRapports;}
  public int hashCode(){
   return numero*10000+tourArrivee;
   }


  public void setSite(String s){site=s;}
  public void setNom(String n){nom=n;}
  public void setRace(int r){race=r;}
  public void setNumero(int n){numero=n;}
  public void setTypeDeJoueur(int t){typeDeJoueur=t;}
  public void setAdresseElectronique(String a){adresseElectronique=a;}
  public void setMotDePasse(String m){motDePasse=m;}
  public void setLogin(String l){login=l;}
  public void setTourArrivee(int t){tourArrivee=t;}
  public void setDernierTourRendu(int d){dernierTourRendu=d;}
  public void setModePassationOrdres(boolean m){ordrePasseEnLocale=m;}
  public void setEnvoiStats(boolean m){envoiStats=m;}
  public void setRapportSansBgNoir(boolean m){rapportSansBgNoir=m;}
  public void setModeDetailOrdresPasses(boolean m){detailOrdresPasses=m;}
  public void setTypeReceptionRapport(int t){maniereDeRecevoirSesRapports=t;}

  public boolean estJoueurHumain(){return !estJoueurNeutre();}
  public boolean estJoueurNeutre(){return numero==0 ? true : false;}

  //le constructeur.

  protected Joueur(){}

  public Joueur(String n,int ra,int num,String adresse,String log,String mot,int tour){
   nom=n;
   race=ra;
   numero=num;
   adresseElectronique=adresse;
   login=log;
   motDePasse=mot;
   tourArrivee=tour;
   dernierTourRendu=tour;
   }

  public boolean equals(Object o){
   if(((Joueur)o).getNumero()==numero) return true; else return false;
   }

  public static Object getJoueur(int hashCode){
   int num=hashCode/10000;
   if(!Univers.existenceCommandant(num)) return Integer.toString(num);
   Commandant c=Univers.getCommandant(num);
   if(c.getTourArrivee()==(hashCode%10000)) return c;
    else return Integer.toString(num);
   }

  public static void supprimerCommandant(Commandant c){
   Commandant neutre=Univers.getCommandant(0);

   Position[] p=c.listePossession();
   for(int i=0;i<p.length;i++){
    Systeme s=Univers.getSysteme(p[i]);
    s.changementDeProprietaire(c.getNumero(),0);
    neutre.transfererPossession(p[i],c.getPossession(p[i]));
    }

   Alliance[] a=Univers.getListeAlliances();
   for(int i=0;i<a.length;i++){
    if(a[i].estDirigeePar(c.getNumero())) a[i].setDirigeant(-1);
    if(a[i].getNumeroConcepteur()==c.getNumero()) a[i].concepteurDisparu();
    }

   Leader[] l=c.listeLieutenants();
   for(int i=0;i<l.length;i++)
    Univers.ajouterLeaderEnVente(l[i]);

   int[] pacte=c.listePactesDeNonAgression();
   for(int i=0;i<pacte.length;i++){
    Commandant com=Univers.getCommandant(pacte[i]);
    com.romprePacteDeNonAgression(c.getNumero());
    }

   PlanDeVaisseau[] plan=Univers.listePlansDeVaisseaux();
   for(int i=0;i<plan.length;i++)
    if(plan[i].estConcepteur(c.getNumero())) plan[i].concepteurDisparu();

   Flotte[] flo=c.listeFlottes();
   for(int i=0;i<flo.length;i++)
    if(flo[i].estLoueEnPartie())
     flo[i].retourLocation(c,-1,-1);

   Commandant[] listeC=Univers.getListeCommandants();
   for(int i=0;i<listeC.length;i++){
    flo=listeC[i].listeFlottes();
    for(int j=0;j<flo.length;j++)
     if(flo[j].estLoueEnPartie())
      flo[j].retourLocation(listeC[i],-1,c.getNumero());
    }

   Univers.supprimerCommandant(c.getNumero());
   Univers.ajouterEvenement("ELIMINATION_COMMANDANT_0000",c.getNomNumero());
   }

  public static Commandant creerCommandant(String n,String a,int r,Map m){
   int[] num=Univers.getNumerosCommandants();
   int numF=-1;
   for(int i=0;i<num.length;i++)
    if(num[i]!=i){
     numF=i;
     break;
     }
   if(numF==-1) numF=num.length;
   
   //Déclaration des PNJ existants.
   //String sylor="Banque intergalactique";
   String Empe="Irik";
   //Budget de départ, 15000 pour tous, 20000 pour les Vorgleshs.
   Commandant c=new Commandant(n,r,numF,a,Utile.choisirLogin(),a.substring(0,Math.min(a.length(),5)),Univers.getTour());
   //if (sylor.equals(c.getNom()) || Empe.equals(c.getNom())) c.setCentaures(40000F);
   //if (Empe.equals(c.getNom())) c.setCentaures(60000F);
   //else c.setCentaures(15000F);
   if(r==7) c.setCentaures(20000F);
   else c.setCentaures(15000F);

   String t=Const.RACE_TECHNOLOGIES[c.getRace()];
   if(r==6) c.ajouterTechnologieConnue("boucplaI");
   if(t!=null) c.ajouterTechnologieConnue(t);

   Position[] p=Univers.listePositionsSystemesDisponibles(c.getRace());
   if(p.length==0) p=Univers.listePositionsSystemesDisponibles(-1);
   if(p.length==0){System.out.println("Systeme nouveau commandant non trouvé");System.exit(0);}
   Position choix1=p[Univers.getInt(p.length)];
   Position choix2=p[Univers.getInt(p.length)];
   /*Position choix3=p[Univers.getInt(p.length)];
   Position choix4=p[Univers.getInt(p.length)];
   Position choix5=p[Univers.getInt(p.length)];
   Position choix6=p[Univers.getInt(p.length)];
   Position choix7=p[Univers.getInt(p.length)];
   Position choix8=p[Univers.getInt(p.length)];
   Position choix9=p[Univers.getInt(p.length)];*/
   
   if(Empe.equals(c.getNom())) {
	   Position p_1=new Position(0,137,133); choix1=p_1;
	   Position p_2=new Position(0,57,100); choix2=p_2;
	   /*Position p_3=new Position(0,98,128); choix3=p_3;
	   Position p_4=new Position(0,97,128); choix4=p_4;
	   Position p_5=new Position(0,98,126); choix5=p_5;
	   Position p_6=new Position(0,98,132); choix6=p_6;
	   Position p_7=new Position(0,99,128); choix7=p_7;
	   Position p_8=new Position(0,100,127); choix8=p_8;
	   Position p_9=new Position(0,100,129); choix9=p_9;*/
   }


   Commandant neutre=Univers.getCommandant(0);
   Systeme s1=Univers.getSysteme(choix1);
   Systeme s2=Univers.getSysteme(choix2);
   /*Systeme s3=Univers.getSysteme(choix3);
   Systeme s4=Univers.getSysteme(choix4);
   Systeme s5=Univers.getSysteme(choix5);
   Systeme s6=Univers.getSysteme(choix6);
   Systeme s7=Univers.getSysteme(choix7);
   Systeme s8=Univers.getSysteme(choix8);
   Systeme s9=Univers.getSysteme(choix9);*/
   
   s1.changementDeProprietaire(0,c.getNumero());
   s2.changementDeProprietaire(0,c.getNumero());
   /*s3.changementDeProprietaire(0,c.getNumero());
   s4.changementDeProprietaire(0,c.getNumero());
   s5.changementDeProprietaire(0,c.getNumero());
   s6.changementDeProprietaire(0,c.getNumero());
   s7.changementDeProprietaire(0,c.getNumero());
   s8.changementDeProprietaire(0,c.getNumero());
   s9.changementDeProprietaire(0,c.getNumero());*/
   c.transfererPossession(choix1,neutre.getPossession(choix1));
   c.transfererPossession(choix2,neutre.getPossession(choix2));
   /*c.transfererPossession(choix3,neutre.getPossession(choix3));
   c.transfererPossession(choix4,neutre.getPossession(choix4));
   c.transfererPossession(choix5,neutre.getPossession(choix5));
   c.transfererPossession(choix6,neutre.getPossession(choix6));
   c.transfererPossession(choix7,neutre.getPossession(choix7));
   c.transfererPossession(choix8,neutre.getPossession(choix8));
   c.transfererPossession(choix9,neutre.getPossession(choix9));*/
   neutre.eliminerPossession(choix1);
   neutre.eliminerPossession(choix2);
   /*neutre.eliminerPossession(choix3);
   neutre.eliminerPossession(choix4);
   neutre.eliminerPossession(choix5);
   neutre.eliminerPossession(choix6);
   neutre.eliminerPossession(choix7);
   neutre.eliminerPossession(choix8);
   neutre.eliminerPossession(choix9);*/
   c.setCapitale(choix1);
   ObjetSimpleTransporte ost=new ObjetSimpleTransporte(Messages.MINERAI,50);
   s1.ajouterRichesses(c.getNumero(),ost,Integer.MIN_VALUE);
   s2.ajouterRichesses(c.getNumero(),ost,Integer.MIN_VALUE);
   /*s3.ajouterRichesses(c.getNumero(),ost,Integer.MIN_VALUE);
   s4.ajouterRichesses(c.getNumero(),ost,Integer.MIN_VALUE);
   s5.ajouterRichesses(c.getNumero(),ost,Integer.MIN_VALUE);
   s6.ajouterRichesses(c.getNumero(),ost,Integer.MIN_VALUE);
   s7.ajouterRichesses(c.getNumero(),ost,Integer.MIN_VALUE);
   s8.ajouterRichesses(c.getNumero(),ost,Integer.MIN_VALUE);
   s9.ajouterRichesses(c.getNumero(),ost,Integer.MIN_VALUE);*/


   Flotte.choixFlotteDeDepart(c,m);
   c.setBudget(Const.BUDGET_COMMANDANT_TOUR_PRECEDENT,c.getCentaures());
   c.setBudget(Const.BUDGET_COMMANDANT_TOTAL_DISPONIBLE,c.getCentaures());

   Univers.setCommandant(c);
   Univers.ajouterEvenement("APPARITION_COMMANDANT_0000",c.getNomNumero());

   return c;
   }

 }