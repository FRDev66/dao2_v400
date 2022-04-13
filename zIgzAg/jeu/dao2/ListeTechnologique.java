// V4.0.0
// 18/03/2021
// FRDev66
// Copyright 2021 Chroniques Ludiques-  All Rights Reserved.
// Use is subject to license terms.

package zIgzAg.jeu.dao2;

// public static final [Type] [techno][LVL]=new [Type]("[nom]",9,ListeParents.[technoLVL],[seuil],ListeCaracSpeciales.[technoLVL],[pts const],
//                      [prix]F,ListeMarchandises.[technoLVL],Const.CV_AUTRE,[variable correspondante]);


public interface ListeTechnologique{

 public static final Arme laserI=new Arme("laser",0,ListeParents.laserI,50,null,1,5F,null,1,Const.CV_ARME_CS);
 public static final Arme laserII=new Arme("laser",1,ListeParents.laserII,100,null,2,6F,null,1,Const.CV_ARME_CS);
 public static final Arme laserIII=new Arme("laser",2,ListeParents.laserIII,200,null,3,7F,null,1,Const.CV_ARME_CS);
 public static final Arme laserIV=new Arme("laser",3,ListeParents.laserIV,400,null,4,8F,ListeMarchandises.laserIV,1,Const.CV_ARME_CS);
 public static final Arme laserV=new Arme("laser",4,ListeParents.laserV,1000,null,5,9F,ListeMarchandises.laserV,1,Const.CV_ARME_CS);
 public static final Arme laserVI=new Arme("laser",5,ListeParents.laserVI,2000,null,6,10F,ListeMarchandises.laserVI,1,Const.CV_ARME_CS);
 public static final Arme laserVII=new Arme("laser",6,ListeParents.laserVII,4000,null,7,11F,ListeMarchandises.laserVII,1,Const.CV_ARME_CS);
 public static final Arme laserVIII=new Arme("laser",7,ListeParents.laserVIII,8000,null,8,12F,ListeMarchandises.laserVIII,1,Const.CV_ARME_CS);
 public static final Arme laserIX=new Arme("laser",8,ListeParents.laserIX,20000,null,9,13F,ListeMarchandises.laserIX,1,Const.CV_ARME_CS);
 public static final Arme laserX=new Arme("laser",9,ListeParents.laserX,50000,null,10,15F,ListeMarchandises.laserX,1,Const.CV_ARME_CS);

 public static final Arme plasmaI=new Arme("plasma",0,ListeParents.plasmaI,70,null,2,6F,null,1,Const.CV_ARME_CS);
 public static final Arme plasmaII=new Arme("plasma",1,ListeParents.plasmaII,140,null,3,7F,null,1,Const.CV_ARME_CS);
 public static final Arme plasmaIII=new Arme("plasma",2,ListeParents.plasmaIII,280,null,4,8F,null,1,Const.CV_ARME_CS);
 public static final Arme plasmaIV=new Arme("plasma",3,ListeParents.plasmaIV,560,null,5,9F,ListeMarchandises.plasmaIV,1,Const.CV_ARME_CS);
 public static final Arme plasmaV=new Arme("plasma",4,ListeParents.plasmaV,1400,null,6,10F,ListeMarchandises.plasmaV,1,Const.CV_ARME_CS);
 public static final Arme plasmaVI=new Arme("plasma",5,ListeParents.plasmaVI,2800,null,7,11F,ListeMarchandises.plasmaVI,1,Const.CV_ARME_CS);
 public static final Arme plasmaVII=new Arme("plasma",6,ListeParents.plasmaVII,5600,null,8,12F,ListeMarchandises.plasmaVII,1,Const.CV_ARME_CS);
 public static final Arme plasmaVIII=new Arme("plasma",7,ListeParents.plasmaVIII,11200,null,9,13F,ListeMarchandises.plasmaVIII,1,Const.CV_ARME_CS);
 public static final Arme plasmaIX=new Arme("plasma",8,ListeParents.plasmaIX,28000,null,10,14F,ListeMarchandises.plasmaIX,1,Const.CV_ARME_CS);
 public static final Arme plasmaX=new Arme("plasma",9,ListeParents.plasmaX,70000,null,12,15F,ListeMarchandises.plasmaX,1,Const.CV_ARME_CS);

 public static final Arme torpI=new Arme("torp",0,ListeParents.torpI,100,null,3,7F,null,1,Const.CV_ARME_CS);
 public static final Arme torpII=new Arme("torp",1,ListeParents.torpII,200,null,4,8F,null,1,Const.CV_ARME_CS);
 public static final Arme torpIII=new Arme("torp",2,ListeParents.torpIII,400,null,5,9F,null,1,Const.CV_ARME_CS);
 public static final Arme torpIV=new Arme("torp",3,ListeParents.torpIV,800,null,6,10F,ListeMarchandises.torpIV,1,Const.CV_ARME_CS);
 public static final Arme torpV=new Arme("torp",4,ListeParents.torpV,2000,null,7,11F,ListeMarchandises.torpV,1,Const.CV_ARME_CS);
 public static final Arme torpVI=new Arme("torp",5,ListeParents.torpVI,4000,null,8,12F,ListeMarchandises.torpVI,1,Const.CV_ARME_CS);
 public static final Arme torpVII=new Arme("torp",6,ListeParents.torpVII,8000,null,9,13F,ListeMarchandises.torpVII,1,Const.CV_ARME_CS);
 public static final Arme torpVIII=new Arme("torp",7,ListeParents.torpVIII,16000,null,10,14F,ListeMarchandises.torpVIII,1,Const.CV_ARME_CS);
 public static final Arme torpIX=new Arme("torp",8,ListeParents.torpIX,40000,null,11,15F,ListeMarchandises.torpIX,1,Const.CV_ARME_CS);
 public static final Arme torpX=new Arme("torp",9,ListeParents.torpX,100000,null,13,16F,ListeMarchandises.torpX,1,Const.CV_ARME_CS);

 public static final Arme missI=new Arme("miss",0,ListeParents.missI,70,null,2,5F,ListeMarchandises.missI,1,Const.CV_ARME_CS);
 public static final Arme missII=new Arme("miss",1,ListeParents.missII,140,null,3,6F,ListeMarchandises.missII,1,Const.CV_ARME_CS);
 public static final Arme missIII=new Arme("miss",2,ListeParents.missIII,280,null,4,7F,ListeMarchandises.missIII,1,Const.CV_ARME_CS);
 public static final Arme missIV=new Arme("miss",3,ListeParents.missIV,560,null,5,8F,ListeMarchandises.missIV,1,Const.CV_ARME_CS);
 public static final Arme missV=new Arme("miss",4,ListeParents.missV,1400,null,6,9F,ListeMarchandises.missV,1,Const.CV_ARME_CS);
 public static final Arme missVI=new Arme("miss",5,ListeParents.missVI,2800,null,7,10F,ListeMarchandises.missVI,1,Const.CV_ARME_CS);
 public static final Arme missVII=new Arme("miss",6,ListeParents.missVII,5600,null,8,11F,ListeMarchandises.missVII,1,Const.CV_ARME_CS);
 public static final Arme missVIII=new Arme("miss",7,ListeParents.missVIII,11200,null,9,12F,ListeMarchandises.missVIII,1,Const.CV_ARME_CS);
 public static final Arme missIX=new Arme("miss",8,ListeParents.missIX,28000,null,10,13F,ListeMarchandises.missIX,1,Const.CV_ARME_CS);
 public static final Arme missX=new Arme("miss",9,ListeParents.missX,70000,null,11,15F,ListeMarchandises.missX,1,Const.CV_ARME_CS);

 public static final Arme bombeI=new Arme("bombe",0,ListeParents.bombeI,85,null,3,7F,null,1,Const.CV_ARME_CP);
 public static final Arme bombeII=new Arme("bombe",1,ListeParents.bombeII,170,null,4,8F,null,1,Const.CV_ARME_CP);
 public static final Arme bombeIII=new Arme("bombe",2,ListeParents.bombeIII,240,null,5,9F,null,1,Const.CV_ARME_CP);
 public static final Arme bombeIV=new Arme("bombe",3,ListeParents.bombeIV,480,null,6,10F,ListeMarchandises.bombeIV,1,Const.CV_ARME_CP);
 public static final Arme bombeV=new Arme("bombe",4,ListeParents.bombeV,960,null,7,11F,ListeMarchandises.bombeV,1,Const.CV_ARME_CP);
 public static final Arme bombeVI=new Arme("bombe",5,ListeParents.bombeVI,1920,null,8,12F,ListeMarchandises.bombeVI,1,Const.CV_ARME_CP);
 public static final Arme bombeVII=new Arme("bombe",6,ListeParents.bombeVII,3840,null,9,13F,ListeMarchandises.bombeVII,1,Const.CV_ARME_CP);
 public static final Arme bombeVIII=new Arme("bombe",7,ListeParents.bombeVIII,7680,null,10,14F,ListeMarchandises.bombeVIII,1,Const.CV_ARME_CP);
 public static final Arme bombeIX=new Arme("bombe",8,ListeParents.bombeIX,15360,null,11,15F,ListeMarchandises.bombeIX,1,Const.CV_ARME_CP);
 public static final Arme bombeX=new Arme("bombe",9,ListeParents.bombeX,30720,null,12,16F,ListeMarchandises.bombeX,1,Const.CV_ARME_CP);

 public static final ComposantDeVaisseau moteurI=new ComposantDeVaisseau("moteur",0,null,40,ListeCaracSpeciales.moteurI,1,4F,null,Const.CV_MOTEUR,1);
 public static final ComposantDeVaisseau moteurII=new ComposantDeVaisseau("moteur",1,ListeParents.moteurII,80,ListeCaracSpeciales.moteurII,4,8F,null,Const.CV_MOTEUR,4);
 public static final ComposantDeVaisseau moteurIII=new ComposantDeVaisseau("moteur",2,ListeParents.moteurIII,160,ListeCaracSpeciales.moteurIII,8,12F,ListeMarchandises.moteurIII,Const.CV_MOTEUR,8);
 public static final ComposantDeVaisseau moteurIV=new ComposantDeVaisseau("moteur",3,ListeParents.moteurIV,320,ListeCaracSpeciales.moteurIV,15,16F,ListeMarchandises.moteurIV,Const.CV_MOTEUR,15);
 public static final ComposantDeVaisseau moteurV=new ComposantDeVaisseau("moteur",4,ListeParents.moteurV,640,ListeCaracSpeciales.moteurV,30,30F,ListeMarchandises.moteurV,Const.CV_MOTEUR,30);
 public static final ComposantDeVaisseau moteurVI=new ComposantDeVaisseau("moteur",5,ListeParents.moteurVI,1280,ListeCaracSpeciales.moteurVI,60,60F,ListeMarchandises.moteurVI,Const.CV_MOTEUR,60);
 public static final ComposantDeVaisseau moteurVII=new ComposantDeVaisseau("moteur",6,ListeParents.moteurVII,2560,ListeCaracSpeciales.moteurVII,120,120F,ListeMarchandises.moteurVII,Const.CV_MOTEUR,120);
 public static final ComposantDeVaisseau moteurVIII=new ComposantDeVaisseau("moteur",7,ListeParents.moteurVIII,5120,ListeCaracSpeciales.moteurVIII,250,250F,ListeMarchandises.moteurVIII,Const.CV_MOTEUR,250);
 public static final ComposantDeVaisseau moteurIX=new ComposantDeVaisseau("moteur",8,ListeParents.moteurIX,10240,ListeCaracSpeciales.moteurIX,500,500F,ListeMarchandises.moteurIX,Const.CV_MOTEUR,500);
 public static final ComposantDeVaisseau moteurX=new ComposantDeVaisseau("moteur",9,ListeParents.moteurX,20480,ListeCaracSpeciales.moteurX,1000,1000F,ListeMarchandises.moteurX,Const.CV_MOTEUR,1000);

 public static final ComposantDeVaisseau intraI=new ComposantDeVaisseau("intra",0,ListeParents.intraI,500000,ListeCaracSpeciales.intraI,50,250F,ListeMarchandises.intraI,Const.CV_MOTEUR,4);

 //public static final ComposantDeVaisseau interI=new ComposantDeVaisseau("inter",0,ListeParents.interI,200000,ListeCaracSpeciales.interI,20,50F,ListeMarchandises.interI,Const.CV_MOTEUR,2);

 public static final ComposantDeVaisseau scanI=new ComposantDeVaisseau("scan",0,null,50,ListeCaracSpeciales.scanI,5,10F,null,Const.CV_AUTRE,1);
 public static final ComposantDeVaisseau scanII=new ComposantDeVaisseau("scan",1,ListeParents.scanII,100,ListeCaracSpeciales.scanII,10,15F,ListeMarchandises.scanII,Const.CV_AUTRE,2);
 public static final ComposantDeVaisseau scanIII=new ComposantDeVaisseau("scan",2,ListeParents.scanIII,200,ListeCaracSpeciales.scanIII,15,20F,ListeMarchandises.scanIII,Const.CV_AUTRE,3);
 public static final ComposantDeVaisseau scanIV=new ComposantDeVaisseau("scan",3,ListeParents.scanIV,400,ListeCaracSpeciales.scanIV,20,25F,ListeMarchandises.scanIV,Const.CV_AUTRE,4);
 public static final ComposantDeVaisseau scanV=new ComposantDeVaisseau("scan",4,ListeParents.scanV,800,ListeCaracSpeciales.scanV,25,30F,ListeMarchandises.scanV,Const.CV_AUTRE,5);
 public static final ComposantDeVaisseau scanVI=new ComposantDeVaisseau("scan",5,ListeParents.scanVI,1600,ListeCaracSpeciales.scanVI,30,35F,ListeMarchandises.scanVI,Const.CV_AUTRE,6);
 public static final ComposantDeVaisseau scanVII=new ComposantDeVaisseau("scan",6,ListeParents.scanVII,3200,ListeCaracSpeciales.scanVII,35,40F,ListeMarchandises.scanVII,Const.CV_AUTRE,7);
 public static final ComposantDeVaisseau scanVIII=new ComposantDeVaisseau("scan",7,ListeParents.scanVIII,6400,ListeCaracSpeciales.scanVIII,40,45F,ListeMarchandises.scanVIII,Const.CV_AUTRE,8);
 public static final ComposantDeVaisseau scanIX=new ComposantDeVaisseau("scan",8,ListeParents.scanIX,12800,ListeCaracSpeciales.scanIX,45,50F,ListeMarchandises.scanIX,Const.CV_AUTRE,9);
 public static final ComposantDeVaisseau scanX=new ComposantDeVaisseau("scan",9,ListeParents.scanX,25600,ListeCaracSpeciales.scanX,50,55F,ListeMarchandises.scanX,Const.CV_AUTRE,10);

 public static final ComposantDeVaisseau bouclierI=new ComposantDeVaisseau("bouclier",0,ListeParents.bouclierI,90,ListeCaracSpeciales.bouclierI,10,15F,null,Const.CV_AUTRE,4);
 public static final ComposantDeVaisseau bouclierII=new ComposantDeVaisseau("bouclier",1,ListeParents.bouclierII,180,ListeCaracSpeciales.bouclierII,10,20F,null,Const.CV_AUTRE,6);
 public static final ComposantDeVaisseau bouclierIII=new ComposantDeVaisseau("bouclier",2,ListeParents.bouclierIII,360,ListeCaracSpeciales.bouclierIII,15,25F,ListeMarchandises.bouclierIII,Const.CV_AUTRE,9);
 public static final ComposantDeVaisseau bouclierIV=new ComposantDeVaisseau("bouclier",3,ListeParents.bouclierIV,720,ListeCaracSpeciales.bouclierIV,15,30F,ListeMarchandises.bouclierIV,Const.CV_AUTRE,14);
 public static final ComposantDeVaisseau bouclierV=new ComposantDeVaisseau("bouclier",4,ListeParents.bouclierV,1440,ListeCaracSpeciales.bouclierV,20,35F,ListeMarchandises.bouclierV,Const.CV_AUTRE,20);
 public static final ComposantDeVaisseau bouclierVI=new ComposantDeVaisseau("bouclier",5,ListeParents.bouclierVI,2880,ListeCaracSpeciales.bouclierVI,20,40F,ListeMarchandises.bouclierVI,Const.CV_AUTRE,30);
 public static final ComposantDeVaisseau bouclierVII=new ComposantDeVaisseau("bouclier",6,ListeParents.bouclierVII,5760,ListeCaracSpeciales.bouclierVII,30,50F,ListeMarchandises.bouclierVII,Const.CV_AUTRE,45);
 public static final ComposantDeVaisseau bouclierVIII=new ComposantDeVaisseau("bouclier",7,ListeParents.bouclierVIII,11520,ListeCaracSpeciales.bouclierVIII,30,60F,ListeMarchandises.bouclierVIII,Const.CV_AUTRE,70);
 public static final ComposantDeVaisseau bouclierIX=new ComposantDeVaisseau("bouclier",8,ListeParents.bouclierIX,23640,ListeCaracSpeciales.bouclierIX,40,70F,ListeMarchandises.bouclierIX,Const.CV_AUTRE,100);
 public static final ComposantDeVaisseau bouclierX=new ComposantDeVaisseau("bouclier",9,ListeParents.bouclierX,46080,ListeCaracSpeciales.bouclierX,40,80F,ListeMarchandises.bouclierX,Const.CV_AUTRE,160);

 public static final ComposantDeVaisseau lmineI=new ComposantDeVaisseau("lmine",0,ListeParents.lmineI,80,ListeCaracSpeciales.lmineI,10,10F,ListeMarchandises.lmineI,Const.CV_AUTRE,1);
 public static final ComposantDeVaisseau lmineII=new ComposantDeVaisseau("lmine",1,ListeParents.lmineII,160,ListeCaracSpeciales.lmineII,15,20F,ListeMarchandises.lmineII,Const.CV_AUTRE,2);
 public static final ComposantDeVaisseau lmineIII=new ComposantDeVaisseau("lmine",2,ListeParents.lmineIII,320,ListeCaracSpeciales.lmineIII,20,30F,ListeMarchandises.lmineIII,Const.CV_AUTRE,3);
 public static final ComposantDeVaisseau lmineIV=new ComposantDeVaisseau("lmine",3,ListeParents.lmineIV,640,ListeCaracSpeciales.lmineIV,25,40F,ListeMarchandises.lmineIV,Const.CV_AUTRE,4);
 public static final ComposantDeVaisseau lmineV=new ComposantDeVaisseau("lmine",4,ListeParents.lmineV,1280,ListeCaracSpeciales.lmineV,30,50F,ListeMarchandises.lmineV,Const.CV_AUTRE,5);
 public static final ComposantDeVaisseau lmineVI=new ComposantDeVaisseau("lmine",5,ListeParents.lmineVI,2560,ListeCaracSpeciales.lmineVI,35,55F,ListeMarchandises.lmineVI,Const.CV_AUTRE,6);
 public static final ComposantDeVaisseau lmineVII=new ComposantDeVaisseau("lmine",6,ListeParents.lmineVII,5120,ListeCaracSpeciales.lmineVII,40,60F,ListeMarchandises.lmineVII,Const.CV_AUTRE,7);
 public static final ComposantDeVaisseau lmineVIII=new ComposantDeVaisseau("lmine",7,ListeParents.lmineVIII,10240,ListeCaracSpeciales.lmineVIII,45,70F,ListeMarchandises.lmineVIII,Const.CV_AUTRE,8);
 public static final ComposantDeVaisseau lmineIX=new ComposantDeVaisseau("lmine",8,ListeParents.lmineIX,20480,ListeCaracSpeciales.lmineIX,50,80F,ListeMarchandises.lmineIX,Const.CV_AUTRE,9);
 public static final ComposantDeVaisseau lmineX=new ComposantDeVaisseau("lmine",9,ListeParents.lmineX,40960,ListeCaracSpeciales.lmineX,55,85F,ListeMarchandises.lmineX,Const.CV_AUTRE,10);

 public static final ComposantDeVaisseau dmineI=new ComposantDeVaisseau("dmine",0,ListeParents.dmineI,70,ListeCaracSpeciales.dmineI,5,10F,null,Const.CV_AUTRE,1);
 public static final ComposantDeVaisseau dmineII=new ComposantDeVaisseau("dmine",1,ListeParents.dmineII,140,ListeCaracSpeciales.dmineII,10,20F,null,Const.CV_AUTRE,2);
 public static final ComposantDeVaisseau dmineIII=new ComposantDeVaisseau("dmine",2,ListeParents.dmineIII,280,ListeCaracSpeciales.dmineIII,15,30F,ListeMarchandises.dmineIII,Const.CV_AUTRE,3);
 public static final ComposantDeVaisseau dmineIV=new ComposantDeVaisseau("dmine",3,ListeParents.dmineIV,560,ListeCaracSpeciales.dmineIV,20,40F,ListeMarchandises.dmineIV,Const.CV_AUTRE,4);
 public static final ComposantDeVaisseau dmineV=new ComposantDeVaisseau("dmine",4,ListeParents.dmineV,1120,ListeCaracSpeciales.dmineV,25,50F,ListeMarchandises.dmineV,Const.CV_AUTRE,5);
 public static final ComposantDeVaisseau dmineVI=new ComposantDeVaisseau("dmine",5,ListeParents.dmineVI,2240,ListeCaracSpeciales.dmineVI,30,60F,ListeMarchandises.dmineVI,Const.CV_AUTRE,6);
 public static final ComposantDeVaisseau dmineVII=new ComposantDeVaisseau("dmine",6,ListeParents.dmineVII,4480,ListeCaracSpeciales.dmineVII,35,70F,ListeMarchandises.dmineVII,Const.CV_AUTRE,7);
 public static final ComposantDeVaisseau dmineVIII=new ComposantDeVaisseau("dmine",7,ListeParents.dmineVIII,8960,ListeCaracSpeciales.dmineVIII,40,80F,ListeMarchandises.dmineVIII,Const.CV_AUTRE,8);
 public static final ComposantDeVaisseau dmineIX=new ComposantDeVaisseau("dmine",8,ListeParents.dmineIX,17920,ListeCaracSpeciales.dmineIX,45,90F,ListeMarchandises.dmineIX,Const.CV_AUTRE,9);
 public static final ComposantDeVaisseau dmineX=new ComposantDeVaisseau("dmine",9,ListeParents.dmineX,35840,ListeCaracSpeciales.dmineX,50,100F,ListeMarchandises.dmineX,Const.CV_AUTRE,10);

 //public static final ComposantDeVaisseau mconstruI=new ComposantDeVaisseau("mconstru",0,ListeParents.mconstruI,400,ListeCaracSpeciales.mconstruI,10,50F,ListeMarchandises.mconstruI,Const.CV_AUTRE,4);
 //public static final ComposantDeVaisseau mconstruII=new ComposantDeVaisseau("mconstru",1,ListeParents.mconstruII,600,ListeCaracSpeciales.mconstruII,20,100F,ListeMarchandises.mconstruII,Const.CV_AUTRE,8);
 //public static final ComposantDeVaisseau mconstruIII=new ComposantDeVaisseau("mconstru",2,ListeParents.mconstruIII,800,ListeCaracSpeciales.mconstruIII,40,150F,ListeMarchandises.mconstruIII,Const.CV_AUTRE,12);
 //public static final ComposantDeVaisseau mconstruIV=new ComposantDeVaisseau("mconstru",3,ListeParents.mconstruIV,4000,ListeCaracSpeciales.mconstruIV,80,200F,ListeMarchandises.mconstruIV,Const.CV_AUTRE,16);
 //public static final ComposantDeVaisseau mconstruV=new ComposantDeVaisseau("mconstru",4,ListeParents.mconstruV,10000,ListeCaracSpeciales.mconstruV,160,1000F,ListeMarchandises.mconstruV,Const.CV_AUTRE,20);
 //public static final ComposantDeVaisseau mconstruVI=new ComposantDeVaisseau("mconstru",5,ListeParents.mconstruVI,20000,ListeCaracSpeciales.mconstruVI,300,2000F,ListeMarchandises.mconstruVI,Const.CV_AUTRE,30);
 //public static final ComposantDeVaisseau mconstruVII=new ComposantDeVaisseau("mconstru",6,ListeParents.mconstruVII,40000,ListeCaracSpeciales.mconstruVII,600,5000F,ListeMarchandises.mconstruVII,Const.CV_AUTRE,40);
 //public static final ComposantDeVaisseau mconstruVIII=new ComposantDeVaisseau("mconstru",7,ListeParents.mconstruVIII,100000,ListeCaracSpeciales.mconstruVIII,1200,10000F,ListeMarchandises.mconstruVIII,Const.CV_AUTRE,60);
 //public static final ComposantDeVaisseau mconstruIX=new ComposantDeVaisseau("mconstru",8,ListeParents.mconstruIX,200000,ListeCaracSpeciales.mconstruIX,2400,15000F,ListeMarchandises.mconstruIX,Const.CV_AUTRE,80);

 public static final ComposantDeVaisseau bscanI=new ComposantDeVaisseau("bscan",0,ListeParents.bscanI,100,ListeCaracSpeciales.bscanI,5,10F,null,Const.CV_AUTRE,1);
 public static final ComposantDeVaisseau bscanII=new ComposantDeVaisseau("bscan",1,ListeParents.bscanII,200,ListeCaracSpeciales.bscanII,10,20F,ListeMarchandises.bscanII,Const.CV_AUTRE,2);
 public static final ComposantDeVaisseau bscanIII=new ComposantDeVaisseau("bscan",2,ListeParents.bscanIII,400,ListeCaracSpeciales.bscanIII,15,30F,ListeMarchandises.bscanIII,Const.CV_AUTRE,3);
 public static final ComposantDeVaisseau bscanIV=new ComposantDeVaisseau("bscan",3,ListeParents.bscanIV,800,ListeCaracSpeciales.bscanIV,20,40F,ListeMarchandises.bscanIV,Const.CV_AUTRE,4);
 public static final ComposantDeVaisseau bscanV=new ComposantDeVaisseau("bscan",4,ListeParents.bscanV,1600,ListeCaracSpeciales.bscanV,25,50F,ListeMarchandises.bscanV,Const.CV_AUTRE,5);
 public static final ComposantDeVaisseau bscanVI=new ComposantDeVaisseau("bscan",5,ListeParents.bscanVI,3200,ListeCaracSpeciales.bscanVI,30,60F,ListeMarchandises.bscanVI,Const.CV_AUTRE,6);
 public static final ComposantDeVaisseau bscanVII=new ComposantDeVaisseau("bscan",6,ListeParents.bscanVII,9600,ListeCaracSpeciales.bscanVII,35,70F,ListeMarchandises.bscanVII,Const.CV_AUTRE,7);
 public static final ComposantDeVaisseau bscanVIII=new ComposantDeVaisseau("bscan",7,ListeParents.bscanVIII,28800,ListeCaracSpeciales.bscanVIII,40,100F,ListeMarchandises.bscanVIII,Const.CV_AUTRE,8);
 public static final ComposantDeVaisseau bscanIX=new ComposantDeVaisseau("bscan",8,ListeParents.bscanIX,115200,ListeCaracSpeciales.bscanIX,45,200F,ListeMarchandises.bscanIX,Const.CV_AUTRE,9);
 public static final ComposantDeVaisseau bscanX=new ComposantDeVaisseau("bscan",9,ListeParents.bscanX,460800,ListeCaracSpeciales.bscanX,50,500F,ListeMarchandises.bscanX,Const.CV_AUTRE,10);

 public static final ComposantDeVaisseau tractI=new ComposantDeVaisseau("tract",0,ListeParents.tractI,200,ListeCaracSpeciales.tractI,5,10F,null,Const.CV_AUTRE,1);

 public static final ComposantDeVaisseau cargoI=new ComposantDeVaisseau("cargo",0,null,60,ListeCaracSpeciales.cargoI,1,5F,null,Const.CV_AUTRE,1);
 public static final ComposantDeVaisseau cargoII=new ComposantDeVaisseau("cargo",1,ListeParents.cargoII,120,ListeCaracSpeciales.cargoII,2,10F,null,Const.CV_AUTRE,2);
 public static final ComposantDeVaisseau cargoIII=new ComposantDeVaisseau("cargo",2,ListeParents.cargoIII,240,ListeCaracSpeciales.cargoIII,4,20F,null,Const.CV_AUTRE,3);
 public static final ComposantDeVaisseau cargoIV=new ComposantDeVaisseau("cargo",3,ListeParents.cargoIV,480,ListeCaracSpeciales.cargoIV,6,30F,ListeMarchandises.cargoIV,Const.CV_AUTRE,4);
 public static final ComposantDeVaisseau cargoV=new ComposantDeVaisseau("cargo",4,ListeParents.cargoV,960,ListeCaracSpeciales.cargoV,8,40F,ListeMarchandises.cargoV,Const.CV_AUTRE,5);
 public static final ComposantDeVaisseau cargoVI=new ComposantDeVaisseau("cargo",5,ListeParents.cargoVI,1920,ListeCaracSpeciales.cargoVI,10,50F,ListeMarchandises.cargoVI,Const.CV_AUTRE,6);
 public static final ComposantDeVaisseau cargoVII=new ComposantDeVaisseau("cargo",6,ListeParents.cargoVII,3840,ListeCaracSpeciales.cargoVII,12,60F,ListeMarchandises.cargoVII,Const.CV_AUTRE,7);
 public static final ComposantDeVaisseau cargoVIII=new ComposantDeVaisseau("cargo",7,ListeParents.cargoVIII,7680,ListeCaracSpeciales.cargoVIII,15,70F,ListeMarchandises.cargoVIII,Const.CV_AUTRE,8);
 public static final ComposantDeVaisseau cargoIX=new ComposantDeVaisseau("cargo",8,ListeParents.cargoIX,15360,ListeCaracSpeciales.cargoIX,30,150F,ListeMarchandises.cargoIX,Const.CV_AUTRE,9);
 public static final ComposantDeVaisseau cargoX=new ComposantDeVaisseau("cargo",9,ListeParents.cargoX,30720,ListeCaracSpeciales.cargoX,50,250F,ListeMarchandises.cargoX,Const.CV_AUTRE,10);

 public static final ComposantDeVaisseau villeI=new ComposantDeVaisseau("ville",0,ListeParents.villeI,120,ListeCaracSpeciales.villeI,10,3F,ListeMarchandises.villeI,Const.CV_AUTRE,1);
 public static final ComposantDeVaisseau villeII=new ComposantDeVaisseau("ville",1,ListeParents.villeII,240,ListeCaracSpeciales.villeII,15,5F,ListeMarchandises.villeII,Const.CV_AUTRE,2);
 public static final ComposantDeVaisseau villeIII=new ComposantDeVaisseau("ville",2,ListeParents.villeIII,480,ListeCaracSpeciales.villeIII,17,6F,ListeMarchandises.villeIII,Const.CV_AUTRE,3);
 public static final ComposantDeVaisseau villeIV=new ComposantDeVaisseau("ville",3,ListeParents.villeIV,960,ListeCaracSpeciales.villeIV,20,7F,ListeMarchandises.villeIV,Const.CV_AUTRE,4);
 public static final ComposantDeVaisseau villeV=new ComposantDeVaisseau("ville",4,ListeParents.villeV,1920,ListeCaracSpeciales.villeV,32,10F,ListeMarchandises.villeV,Const.CV_AUTRE,8);
 public static final ComposantDeVaisseau villeVI=new ComposantDeVaisseau("ville",5,ListeParents.villeVI,3840,ListeCaracSpeciales.villeVI,53,20F,ListeMarchandises.villeVI,Const.CV_AUTRE,16);
 public static final ComposantDeVaisseau villeVII=new ComposantDeVaisseau("ville",6,ListeParents.villeVII,7680,ListeCaracSpeciales.villeVII,91,30F,ListeMarchandises.villeVII,Const.CV_AUTRE,32);
 public static final ComposantDeVaisseau villeVIII=new ComposantDeVaisseau("ville",7,ListeParents.villeVIII,15360,ListeCaracSpeciales.villeVIII,160,55F,ListeMarchandises.villeVIII,Const.CV_AUTRE,64);
 public static final ComposantDeVaisseau villeIX=new ComposantDeVaisseau("ville",8,ListeParents.villeIX,30720,ListeCaracSpeciales.villeIX,285,90F,ListeMarchandises.villeIX,Const.CV_AUTRE,128);
 public static final ComposantDeVaisseau villeX=new ComposantDeVaisseau("ville",9,ListeParents.villeX,61440,ListeCaracSpeciales.villeX,515,160F,ListeMarchandises.villeX,Const.CV_AUTRE,256);

 public static final ComposantDeVaisseau robocoI=new ComposantDeVaisseau("roboco",0,ListeParents.robocoI,100,ListeCaracSpeciales.robocoI,10,10F,ListeMarchandises.robocoI,Const.CV_AUTRE,1);

 public static final ComposantDeVaisseau hscanI=new ComposantDeVaisseau("hscan",0,ListeParents.hscanI,80,ListeCaracSpeciales.hscanI,5,10F,null,Const.CV_AUTRE,1);
 public static final ComposantDeVaisseau hscanII=new ComposantDeVaisseau("hscan",1,ListeParents.hscanII,160,ListeCaracSpeciales.hscanII,10,20F,ListeMarchandises.hscanII,Const.CV_AUTRE,2);
 public static final ComposantDeVaisseau hscanIII=new ComposantDeVaisseau("hscan",2,ListeParents.hscanIII,320,ListeCaracSpeciales.hscanIII,20,30F,ListeMarchandises.hscanIII,Const.CV_AUTRE,3);
 public static final ComposantDeVaisseau hscanIV=new ComposantDeVaisseau("hscan",3,ListeParents.hscanIV,640,ListeCaracSpeciales.hscanIV,25,40F,ListeMarchandises.hscanIV,Const.CV_AUTRE,4);
 public static final ComposantDeVaisseau hscanV=new ComposantDeVaisseau("hscan",4,ListeParents.hscanV,1280,ListeCaracSpeciales.hscanV,30,60F,ListeMarchandises.hscanV,Const.CV_AUTRE,5);
 public static final ComposantDeVaisseau hscanVI=new ComposantDeVaisseau("hscan",5,ListeParents.hscanVI,2560,ListeCaracSpeciales.hscanVI,40,70F,ListeMarchandises.hscanVI,Const.CV_AUTRE,6);
 public static final ComposantDeVaisseau hscanVII=new ComposantDeVaisseau("hscan",6,ListeParents.hscanVII,5120,ListeCaracSpeciales.hscanVII,70,80F,ListeMarchandises.hscanVII,Const.CV_AUTRE,7);
 public static final ComposantDeVaisseau hscanVIII=new ComposantDeVaisseau("hscan",7,ListeParents.hscanVIII,10240,ListeCaracSpeciales.hscanVIII,140,90F,ListeMarchandises.hscanVIII,Const.CV_AUTRE,8);
 public static final ComposantDeVaisseau hscanIX=new ComposantDeVaisseau("hscan",8,ListeParents.hscanIX,20480,ListeCaracSpeciales.hscanIX,320,100F,ListeMarchandises.hscanIX,Const.CV_AUTRE,9);
 public static final ComposantDeVaisseau hscanX=new ComposantDeVaisseau("hscan",9,ListeParents.hscanX,40960,ListeCaracSpeciales.hscanX,600,110F,ListeMarchandises.hscanX,Const.CV_AUTRE,10);

 public static final ComposantDeVaisseau draminI=new ComposantDeVaisseau("dramin",0,ListeParents.draminI,100,ListeCaracSpeciales.draminI,5,5F,ListeMarchandises.draminI,Const.CV_AUTRE,1);
 public static final ComposantDeVaisseau draminII=new ComposantDeVaisseau("dramin",1,ListeParents.draminII,200,ListeCaracSpeciales.draminII,10,15F,ListeMarchandises.draminII,Const.CV_AUTRE,2);
 public static final ComposantDeVaisseau draminIII=new ComposantDeVaisseau("dramin",2,ListeParents.draminIII,400,ListeCaracSpeciales.draminIII,15,25F,ListeMarchandises.draminIII,Const.CV_AUTRE,3);
 public static final ComposantDeVaisseau draminIV=new ComposantDeVaisseau("dramin",3,ListeParents.draminIV,800,ListeCaracSpeciales.draminIV,20,35F,ListeMarchandises.draminIV,Const.CV_AUTRE,4);
 public static final ComposantDeVaisseau draminV=new ComposantDeVaisseau("dramin",4,ListeParents.draminV,1600,ListeCaracSpeciales.draminV,25,45F,ListeMarchandises.draminV,Const.CV_AUTRE,5);
 public static final ComposantDeVaisseau draminVI=new ComposantDeVaisseau("dramin",5,ListeParents.draminVI,3200,ListeCaracSpeciales.draminVI,30,55F,ListeMarchandises.draminVI,Const.CV_AUTRE,6);
 public static final ComposantDeVaisseau draminVII=new ComposantDeVaisseau("dramin",6,ListeParents.draminVII,6400,ListeCaracSpeciales.draminVII,35,65F,ListeMarchandises.draminVII,Const.CV_AUTRE,7);
 public static final ComposantDeVaisseau draminVIII=new ComposantDeVaisseau("dramin",7,ListeParents.draminVIII,12800,ListeCaracSpeciales.draminVIII,40,75F,ListeMarchandises.draminVIII,Const.CV_AUTRE,8);
 public static final ComposantDeVaisseau draminIX=new ComposantDeVaisseau("dramin",8,ListeParents.draminIX,25600,ListeCaracSpeciales.draminIX,45,85F,ListeMarchandises.draminIX,Const.CV_AUTRE,9);
 public static final ComposantDeVaisseau draminX=new ComposantDeVaisseau("dramin",9,ListeParents.draminX,51200,ListeCaracSpeciales.draminX,50,95F,ListeMarchandises.draminX,Const.CV_AUTRE,10);

 public static final Batiment chantierI=new Batiment("chantier",0,null,100,ListeCaracSpeciales.chantierI,10,100F,ListeMarchandises.chantierI,200,10,null);
 public static final Batiment mineI=new Batiment("mine",0,null,100,ListeCaracSpeciales.mineI,1,10F,ListeMarchandises.mineI,20,1,null);
 public static final Batiment retraiteI=new Batiment("retraite",0,ListeParents.retraiteI,40,ListeCaracSpeciales.retraiteI,10,50F,ListeMarchandises.retraiteI,50,10,null);
 public static final Batiment optpI=new Batiment("optp",0,ListeParents.optpI,160,ListeCaracSpeciales.optpI,5,20F,ListeMarchandises.optpI,50,5,null);
 public static final Batiment optsI=new Batiment("opts",0,ListeParents.optsI,240,ListeCaracSpeciales.optsI,5,50F,ListeMarchandises.optsI,50,5,null);
 public static final Batiment repareI=new Batiment("repare",0,ListeParents.repareI,200,ListeCaracSpeciales.repareI,20,200F,ListeMarchandises.repareI,100,20,null);

 public static final Batiment boucplaI=new Batiment("boucpla",0,null,100,ListeCaracSpeciales.boucplaI,10,50F,ListeMarchandises.boucplaI,100,5,null);
 public static final Batiment boucplaII=new Batiment("boucpla",1,ListeParents.boucplaII,200,ListeCaracSpeciales.boucplaII,15,100F,ListeMarchandises.boucplaII,200,10,null);
 public static final Batiment boucplaIII=new Batiment("boucpla",2,ListeParents.boucplaIII,400,ListeCaracSpeciales.boucplaIII,20,150F,ListeMarchandises.boucplaIII,300,15,null);
 public static final Batiment boucplaIV=new Batiment("boucpla",3,ListeParents.boucplaIV,800,ListeCaracSpeciales.boucplaIV,25,200F,ListeMarchandises.boucplaIV,400,20,null);
 public static final Batiment boucplaV=new Batiment("boucpla",4,ListeParents.boucplaV,1600,ListeCaracSpeciales.boucplaV,30,250F,ListeMarchandises.boucplaV,500,25,null);
 public static final Batiment boucplaVI=new Batiment("boucpla",5,ListeParents.boucplaVI,3000,ListeCaracSpeciales.boucplaVI,35,300F,ListeMarchandises.boucplaVI,600,30,null);
 public static final Batiment boucplaVII=new Batiment("boucpla",6,ListeParents.boucplaVII,5000,ListeCaracSpeciales.boucplaVII,40,350F,ListeMarchandises.boucplaVII,700,35,null);
 public static final Batiment boucplaVIII=new Batiment("boucpla",7,ListeParents.boucplaVIII,10000,ListeCaracSpeciales.boucplaVIII,45,400F,ListeMarchandises.boucplaVIII,800,40,null);
 public static final Batiment boucplaIX=new Batiment("boucpla",8,ListeParents.boucplaIX,15000,ListeCaracSpeciales.boucplaIX,50,450F,ListeMarchandises.boucplaIX,900,45,null);
 public static final Batiment boucplaX=new Batiment("boucpla",9,ListeParents.boucplaX,30000,ListeCaracSpeciales.boucplaX,55,500F,ListeMarchandises.boucplaX,1000,50,null);

 public static final Batiment radarI=new Batiment("radar",0,null,100,ListeCaracSpeciales.radarI,10,100F,ListeMarchandises.radarI,100,10,null);
 public static final Batiment radarII=new Batiment("radar",1,ListeParents.radarII,200,ListeCaracSpeciales.radarII,15,150F,ListeMarchandises.radarII,100,15,null);
 public static final Batiment radarIII=new Batiment("radar",2,ListeParents.radarIII,400,ListeCaracSpeciales.radarIII,20,200F,ListeMarchandises.radarIII,100,20,null);
 public static final Batiment radarIV=new Batiment("radar",3,ListeParents.radarIV,800,ListeCaracSpeciales.radarIV,25,250F,ListeMarchandises.radarIV,100,25,null);
 public static final Batiment radarV=new Batiment("radar",4,ListeParents.radarV,1600,ListeCaracSpeciales.radarV,30,300F,ListeMarchandises.radarV,100,30,null);
 public static final Batiment radarVI=new Batiment("radar",5,ListeParents.radarVI,3000,ListeCaracSpeciales.radarVI,35,350F,ListeMarchandises.radarVI,100,35,null);
 public static final Batiment radarVII=new Batiment("radar",6,ListeParents.radarVII,5000,ListeCaracSpeciales.radarVII,40,400F,ListeMarchandises.radarVII,100,40,null);
 public static final Batiment radarVIII=new Batiment("radar",7,ListeParents.radarVIII,10000,ListeCaracSpeciales.radarVIII,45,450F,ListeMarchandises.radarVIII,100,45,null);
 public static final Batiment radarIX=new Batiment("radar",8,ListeParents.radarIX,15000,ListeCaracSpeciales.radarIX,50,500F,ListeMarchandises.radarIX,100,50,null);
 public static final Batiment radarX=new Batiment("radar",9,ListeParents.radarX,30000,ListeCaracSpeciales.radarX,55,550F,ListeMarchandises.radarX,100,55,null);

 public static final Batiment extraI=new Batiment("extra",0,ListeParents.extraI,1500,ListeCaracSpeciales.extraI,2,50F,ListeMarchandises.extraI,200,10,null);
 public static final Batiment extraII=new Batiment("extra",1,ListeParents.extraII,3000,ListeCaracSpeciales.extraII,4,100F,ListeMarchandises.extraII,200,15,null);
 public static final Batiment extraIII=new Batiment("extra",2,ListeParents.extraIII,9000,ListeCaracSpeciales.extraIII,8,150F,ListeMarchandises.extraIII,200,20,null);
 public static final Batiment extraIV=new Batiment("extra",3,ListeParents.extraIV,18000,ListeCaracSpeciales.extraIV,15,200F,ListeMarchandises.extraIV,200,25,null);
 public static final Batiment extraV=new Batiment("extra",4,ListeParents.extraV,45000,ListeCaracSpeciales.extraV,30,250F,ListeMarchandises.extraV,200,30,null);


 public static final Batiment agroI=new Batiment("agro",0,ListeParents.agroI,240,ListeCaracSpeciales.agroI,5,50F,ListeMarchandises.agroI,10,5,null);
 public static final Batiment agricoleI=new Batiment("agricole",0,ListeParents.agricoleI,160,ListeCaracSpeciales.agricoleI,5,50F,ListeMarchandises.agricoleI,10,5,null);
 public static final Batiment modeI=new Batiment("mode",0,ListeParents.modeI,180,ListeCaracSpeciales.modeI,5,50F,ListeMarchandises.modeI,10,5,null);
 public static final Batiment culturelI=new Batiment("culturel",0,ListeParents.culturelI,160,ListeCaracSpeciales.culturelI,5,50F,ListeMarchandises.culturelI,10,5,null);
 public static final Batiment energieI=new Batiment("energie",0,ListeParents.energieI,160,ListeCaracSpeciales.energieI,5,50F,null,10,5,null);
 public static final Batiment pharmaI=new Batiment("pharma",0,ListeParents.pharmaI,160,ListeCaracSpeciales.pharmaI,5,50F,ListeMarchandises.pharmaI,10,5,null);
 public static final Batiment infoI=new Batiment("info",0,ListeParents.infoI,200,ListeCaracSpeciales.infoI,5,50F,ListeMarchandises.infoI,10,5,null);
 public static final Batiment robotI=new Batiment("robot",0,ListeParents.robotI,300,ListeCaracSpeciales.robotI,5,50F,ListeMarchandises.robotI,10,5,null);
 public static final Batiment technoI=new Batiment("techno",0,ListeParents.technoI,240,ListeCaracSpeciales.technoI,5,50F,ListeMarchandises.technoI,10,5,null);
 public static final Batiment armeI=new Batiment("arme",0,ListeParents.armeI,120,ListeCaracSpeciales.armeI,5,50F,ListeMarchandises.armeI,10,5,null);
 public static final Batiment raffineI=new Batiment("raffine",0,ListeParents.raffineI,120,ListeCaracSpeciales.raffineI,5,50F,ListeMarchandises.raffineI,10,5,null);
 public static final Batiment lourdeI=new Batiment("lourde",0,ListeParents.lourdeI,160,ListeCaracSpeciales.lourdeI,5,50F,ListeMarchandises.lourdeI,10,5,null);
 public static final Batiment metauxI=new Batiment("metaux",0,ListeParents.metauxI,200,ListeCaracSpeciales.metauxI,5,50F,ListeMarchandises.metauxI,10,5,null);

/*
 public static final Batiment gravitI=new Batiment("gravit",0,ListeParents.gravitI,800,ListeCaracSpeciales.gravitI,20,150F,ListeMarchandises.gravitI,30,10,null);
 public static final Batiment gravitII=new Batiment("gravit",1,ListeParents.gravitII,1600,ListeCaracSpeciales.gravitII,25,200F,ListeMarchandises.gravitII,40,15,null);
 public static final Batiment gravitIII=new Batiment("gravit",2,ListeParents.gravitIII,3200,ListeCaracSpeciales.gravitIII,30,250F,ListeMarchandises.gravitIII,50,20,null);
 public static final Batiment gravitIV=new Batiment("gravit",3,ListeParents.gravitIV,6400,ListeCaracSpeciales.gravitIV,35,300F,ListeMarchandises.gravitIV,60,25,null);
 public static final Batiment gravitV=new Batiment("gravit",4,ListeParents.gravitV,12800,ListeCaracSpeciales.gravitV,40,350F,ListeMarchandises.gravitV,70,30,null);
 public static final Batiment gravitVI=new Batiment("gravit",5,ListeParents.gravitVI,25600,ListeCaracSpeciales.gravitVI,45,400F,ListeMarchandises.gravitVI,80,35,null);
 public static final Batiment gravitVII=new Batiment("gravit",6,ListeParents.gravitVII,51200,ListeCaracSpeciales.gravitVII,50,450F,ListeMarchandises.gravitVII,90,40,null);
 public static final Batiment gravitVIII=new Batiment("gravit",7,ListeParents.gravitVIII,102400,ListeCaracSpeciales.gravitVIII,55,500F,ListeMarchandises.gravitVIII,100,45,null);
 public static final Batiment gravitIX=new Batiment("gravit",8,ListeParents.gravitIX,204800,ListeCaracSpeciales.gravitIX,60,550F,ListeMarchandises.gravitIX,120,50,null);
 public static final Batiment gravitX=new Batiment("gravit",9,ListeParents.gravitX,409600,ListeCaracSpeciales.gravitX,65,600F,ListeMarchandises.gravitX,150,55,null);
*/
 
 public static final Batiment battlaI=new Batiment("battla",0,null,100,null,5,80F,ListeMarchandises.battlaI,25,5,"laser");
 public static final Batiment battlaII=new Batiment("battla",1,ListeParents.battlaII,100,null,15,150F,ListeMarchandises.battlaII,50,10,"laser");
 public static final Batiment battlaIII=new Batiment("battla",2,ListeParents.battlaIII,200,null,20,200F,ListeMarchandises.battlaIII,100,20,"laser");
 public static final Batiment battlaIV=new Batiment("battla",3,ListeParents.battlaIV,400,null,25,250F,ListeMarchandises.battlaIV,150,25,"laser");
 public static final Batiment battlaV=new Batiment("battla",4,ListeParents.battlaV,800,null,30,300F,ListeMarchandises.battlaV,200,30,"laser");
 public static final Batiment battlaVI=new Batiment("battla",5,ListeParents.battlaVI,2000,null,35,350F,ListeMarchandises.battlaVI,250,35,"laser");
 public static final Batiment battlaVII=new Batiment("battla",6,ListeParents.battlaVII,4000,null,40,400F,ListeMarchandises.battlaVII,300,40,"laser");
 public static final Batiment battlaVIII=new Batiment("battla",7,ListeParents.battlaVIII,8000,null,45,450F,ListeMarchandises.battlaVIII,350,45,"laser");
 public static final Batiment battlaIX=new Batiment("battla",8,ListeParents.battlaIX,20000,null,50,500F,ListeMarchandises.battlaIX,400,50,"laser");
 public static final Batiment battlaX=new Batiment("battla",9,ListeParents.battlaX,50000,null,55,550F,ListeMarchandises.battlaX,450,55,"laser");

 public static final Batiment battplaI=new Batiment("battpla",0,ListeParents.battplaI,80,null,5,80F,ListeMarchandises.battplaI,25,5,"plasma");
 public static final Batiment battplaII=new Batiment("battpla",1,ListeParents.battplaII,140,null,15,150F,ListeMarchandises.battplaII,50,15,"plasma");
 public static final Batiment battplaIII=new Batiment("battpla",2,ListeParents.battplaIII,280,null,20,200F,ListeMarchandises.battplaIII,100,20,"plasma");
 public static final Batiment battplaIV=new Batiment("battpla",3,ListeParents.battplaIV,560,null,25,250F,ListeMarchandises.battplaIV,150,25,"plasma");
 public static final Batiment battplaV=new Batiment("battpla",4,ListeParents.battplaV,1120,null,30,300F,ListeMarchandises.battplaV,200,30,"plasma");
 public static final Batiment battplaVI=new Batiment("battpla",5,ListeParents.battplaVI,2800,null,35,350F,ListeMarchandises.battplaVI,250,35,"plasma");
 public static final Batiment battplaVII=new Batiment("battpla",6,ListeParents.battplaVII,5600,null,40,400F,ListeMarchandises.battplaVII,300,40,"plasma");
 public static final Batiment battplaVIII=new Batiment("battpla",7,ListeParents.battplaVIII,10200,null,45,450F,ListeMarchandises.battplaVIII,350,45,"plasma");
 public static final Batiment battplaIX=new Batiment("battpla",8,ListeParents.battplaIX,25500,null,50,500F,ListeMarchandises.battplaIX,400,50,"plasma");
 public static final Batiment battplaX=new Batiment("battpla",9,ListeParents.battplaX,63750,null,55,550F,ListeMarchandises.battplaX,500,55,"plasma");

 public static final Batiment rampemisI=new Batiment("rampemis",0,ListeParents.rampemisI,100,null,5,80F,ListeMarchandises.rampemisI,25,5,"miss");
 public static final Batiment rampemisII=new Batiment("rampemis",1,ListeParents.rampemisII,200,null,15,150F,ListeMarchandises.rampemisII,50,15,"miss");
 public static final Batiment rampemisIII=new Batiment("rampemis",2,ListeParents.rampemisIII,400,null,20,200F,ListeMarchandises.rampemisIII,100,20,"miss");
 public static final Batiment rampemisIV=new Batiment("rampemis",3,ListeParents.rampemisIV,800,null,25,250F,ListeMarchandises.rampemisIV,150,25,"miss");
 public static final Batiment rampemisV=new Batiment("rampemis",4,ListeParents.rampemisV,1600,null,30,300F,ListeMarchandises.rampemisV,200,30,"miss");
 public static final Batiment rampemisVI=new Batiment("rampemis",5,ListeParents.rampemisVI,4000,null,35,350F,ListeMarchandises.rampemisVI,250,35,"miss");
 public static final Batiment rampemisVII=new Batiment("rampemis",6,ListeParents.rampemisVII,8000,null,40,400F,ListeMarchandises.rampemisVII,300,40,"miss");
 public static final Batiment rampemisVIII=new Batiment("rampemis",7,ListeParents.rampemisVIII,16000,null,45,450F,ListeMarchandises.rampemisVIII,350,45,"miss");
 public static final Batiment rampemisIX=new Batiment("rampemis",8,ListeParents.rampemisIX,40000,null,50,500F,ListeMarchandises.rampemisIX,400,50,"miss");
 public static final Batiment rampemisX=new Batiment("rampemis",9,ListeParents.rampemisX,100000,null,55,550F,ListeMarchandises.rampemisX,500,55,"miss");

 public static final Batiment lancetorI=new Batiment("lancetor",0,ListeParents.lancetorI,100,null,5,80F,ListeMarchandises.lancetorI,25,5,"torp");
 public static final Batiment lancetorII=new Batiment("lancetor",1,ListeParents.lancetorII,200,null,15,150F,ListeMarchandises.lancetorII,50,15,"torp");
 public static final Batiment lancetorIII=new Batiment("lancetor",2,ListeParents.lancetorIII,400,null,20,200F,ListeMarchandises.lancetorIII,100,20,"torp");
 public static final Batiment lancetorIV=new Batiment("lancetor",3,ListeParents.lancetorIV,800,null,25,250F,ListeMarchandises.lancetorIV,150,25,"torp");
 public static final Batiment lancetorV=new Batiment("lancetor",4,ListeParents.lancetorV,1600,null,30,300F,ListeMarchandises.lancetorV,200,30,"torp");
 public static final Batiment lancetorVI=new Batiment("lancetor",5,ListeParents.lancetorVI,4000,null,35,350F,ListeMarchandises.lancetorVI,250,35,"torp");
 public static final Batiment lancetorVII=new Batiment("lancetor",6,ListeParents.lancetorVII,8000,null,40,400F,ListeMarchandises.lancetorVII,300,40,"torp");
 public static final Batiment lancetorVIII=new Batiment("lancetor",7,ListeParents.lancetorVIII,16000,null,45,450F,ListeMarchandises.lancetorVIII,350,45,"torp");
 public static final Batiment lancetorIX=new Batiment("lancetor",8,ListeParents.lancetorIX,40000,null,50,500F,ListeMarchandises.lancetorIX,400,50,"torp");
 public static final Batiment lancetorX=new Batiment("lancetor",9,ListeParents.lancetorX,100000,null,55,550F,ListeMarchandises.lancetorX,500,55,"torp");

 public static final Technologie stratcoI=new Technologie("stratco",0,null,80,null);
 public static final Technologie diploI=new Technologie("diplo",0,null,60,null);
 public static final Technologie progcoI=new Technologie("progco",0,null,40,null);
 public static final Technologie gestplaI=new Technologie("gestpla",0,null,80,null);
 public static final Technologie creplanI=new Technologie("creplan",0,null,80,null);

}






