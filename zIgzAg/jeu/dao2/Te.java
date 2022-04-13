// V4.0.0
// 18/03/2021
// FRDev66
// Copyright 2021 Chroniques Ludiques-  All Rights Reserved.
// Use is subject to license terms.

package zIgzAg.jeu.dao2;



import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.io.*;
import java.awt.image.*;
 import java.util.*;

 public class Te extends Frame  {
     static int G;


     Toolkit to;
     Image mage1,mage2,mage3,mage4,mage5,mage6;
     Image image1,image2,image3,image4,image5,image6;
     Image imageG;
     File fiche,ficheP;

     String C=Chemin.ATLAS;
     String CI=C;
     String Cim=Chemin.IMAGES_RESERVE;
     GifEncoder ge;
     OutputStream os;
     BufferedImage bi;
     boolean finEcriture=true;
     static int larg = 16;
     static int haut = 16;
     Graphics2D screen2D;
     Random ra;

      public Te(){
           ra=new Random();
           to=getToolkit();
           mage1=to.getImage(Cim+"etoile1.gif");
           mage2=to.getImage(Cim+"etoile2.gif");
           mage3=to.getImage(Cim+"etoile3.gif");
           mage4=to.getImage(Cim+"etoile4.gif");
           mage5=to.getImage(Cim+"etoile5.gif");
           mage6=to.getImage(Cim+"etoile6.gif");
           image1=to.getImage(Cim+"fond1.jpg");
           image2=to.getImage(Cim+"fond2.jpg");
           image3=to.getImage(Cim+"fond3.jpg");
           image4=to.getImage(Cim+"fond4.jpg");
           image5=to.getImage(Cim+"fond5.jpg");
           image6=to.getImage(Cim+"fond6.jpg");
           imageG=to.getImage(Cim+"portegal.gif");
          }

      public int[][] lsysteme(int x,int y){
       	int s=1+y+7*x;          //##### remplacé le 5 par 7.
       Position[] p=Univers.listePositionsSystemesParSecteur(G,s);
       int[][] tab=new int[p.length][2];
       for(int i=0;i<p.length;i++) tab[i]=p[i].getPos();
       System.out.println(s+"-"+tab.length);
           return tab;}


 public String espace(int numero){
        if (numero<10) return "  ";
          else if (numero==100) return "";
            else return" ";  }

  public int dessinSysteme(int ab,int aa,int a,int k,int l){
   Systeme sys=Univers.getSysteme(new Position(G,ab,aa));
   System.out.print(sys.getPosition().toString());
   int d=sys.getTypeEtoile();

           switch(d){
            case 0:
          if (screen2D.drawImage(mage1,23+(aa-1)*20-400*l,
                          18+(ab-1)*20-400*k,larg,haut, this))
             a++;
          else System.out.println("probleme avec "+
           Integer.toString(aa)+"-"+Integer.toString(ab));break;
          case 1:
          if (screen2D.drawImage(mage2,23+(aa-1)*20-400*l,
                          18+(ab-1)*20-400*k,larg,haut, this))
             a++;
          else System.out.println("probleme avec "+
           Integer.toString(aa)+"-"+Integer.toString(ab));break;
         case 2:
          if (screen2D.drawImage(mage3,23+(aa-1)*20-400*l,
                          18+(ab-1)*20-400*k,larg,haut, this))
             a++;
          else System.out.println("probleme avec "+
           Integer.toString(aa)+"-"+Integer.toString(ab));break;
         case 3:
          if (screen2D.drawImage(mage4,23+(aa-1)*20-400*l,
                          18+(ab-1)*20-400*k,larg,haut, this))
             a++;
          else System.out.println("probleme avec "+
           Integer.toString(aa)+"-"+Integer.toString(ab));break;
          case 4:
          if (screen2D.drawImage(mage5,23+(aa-1)*20-400*l,
                          18+(ab-1)*20-400*k,larg,haut, this))
             a++;
          else System.out.println("probleme avec "+
           Integer.toString(aa)+"-"+Integer.toString(ab));break;
           default:
          if (screen2D.drawImage(mage6,23+(aa-1)*20-400*l,
                          18+(ab-1)*20-400*k,larg,haut, this))
             a++;
          else System.out.println("probleme avec "+
           Integer.toString(aa)+"-"+Integer.toString(ab));break;
     }
    return a;
   }

    public void dessinFond(int aa,int ab,int k,int l){
     int d=ra.nextInt(10);boolean erreur=false;
       while (!erreur)  switch(d){
            case 0:
          if (screen2D.drawImage(image1,23+(aa-1)*20-400*l,
                          18+(ab-1)*20-400*k,larg,haut, this))
          erreur=true;
          else System.out.println("probleme avec "+
           Integer.toString(aa)+"-"+Integer.toString(ab));break;
          case 1:
          if (screen2D.drawImage(image2,23+(aa-1)*20-400*l,
                          18+(ab-1)*20-400*k,larg,haut, this))
          erreur=true;
          else System.out.println("probleme avec "+
           Integer.toString(aa)+"-"+Integer.toString(ab));break;
         case 2:
          if (screen2D.drawImage(image3,23+(aa-1)*20-400*l,
                          18+(ab-1)*20-400*k,larg,haut, this))
          erreur=true;
          else System.out.println("probleme avec "+
           Integer.toString(aa)+"-"+Integer.toString(ab));break;
         case 3:
          if (screen2D.drawImage(image4,23+(aa-1)*20-400*l,
                          18+(ab-1)*20-400*k,larg,haut, this))
           erreur=true;
          else System.out.println("probleme avec "+
           Integer.toString(aa)+"-"+Integer.toString(ab));break;
          case 4:
          if (screen2D.drawImage(image5,23+(aa-1)*20-400*l,
                          18+(ab-1)*20-400*k,larg,haut, this))
            erreur=true;
          else System.out.println("probleme avec "+
           Integer.toString(aa)+"-"+Integer.toString(ab));break;
           case 5:
          if (screen2D.drawImage(image6,23+(aa-1)*20-400*l,
                          18+(ab-1)*20-400*k,larg,haut, this))
            erreur=true;
          else System.out.println("probleme avec "+
           Integer.toString(aa)+"-"+Integer.toString(ab));break;
           default:erreur=true;break;
     }

   }




 public void paint(Graphics screen) {

    setBackground(Color.white);
    Font ecran=new Font("monospaced",Font.BOLD,20);
    screen.setFont(ecran);
    screen.setColor(Color.red);
    screen.drawString("Ecriture de la galaxie en cours...",20,50);
   if (finEcriture) {
    for (int k=0;k<7;k++)
      for (int l=0;l<7;l++) {

        bi=new BufferedImage(440,425,BufferedImage.TYPE_INT_BGR);
        screen2D = bi.createGraphics();
        screen2D.setBackground(Color.black);
        BasicStroke pen = new BasicStroke(1F,
          BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND);
        screen2D.setStroke(pen);
        int a=0;
        int[][] tabb=new int[100][2];
        int[][] tabc=new int[100][2];
        String esp=new String();

        Font f=new Font("monospaced",Font.BOLD,10);
        screen2D.setFont(f);
        screen2D.setColor(Color.gray);
        for(int i=1;i<21;i++) {esp=espace(i+20*k);
          screen2D.drawString(Integer.toString(i+20*l),5+20*i,13);
          screen2D.drawString(Integer.toString(i+20*l),5+20*i,424);
          screen2D.drawString(esp+Integer.toString(i+20*k),0,10+20*i);
          screen2D.drawString(Integer.toString(i+20*k),422,10+20*i);
          }
        screen2D.setColor(Color.blue);
        for(int i=20;i<421;i+=20){
          Line2D.Float ligne=new Line2D.Float(i,15F,i,415F);
          screen2D.draw(ligne);
          Line2D.Float ligne2=new Line2D.Float(20F,i-5,420F,i-5);
          screen2D.draw(ligne2);
	    }

	  screen2D.setColor(Color.yellow);
	  for(int i=20;i<421;i+=100){
          Line2D.Float ligne=new Line2D.Float(i,15F,i,415F);
          screen2D.draw(ligne);
          Line2D.Float ligne2=new Line2D.Float(20F,i-5,420F,i-5);
          screen2D.draw(ligne2);
	    }


         tabb=lsysteme(k,l);

         for(int i=0;i<tabb.length;)
          i=dessinSysteme(tabb[i][0],tabb[i][1],i,k,l);

         for(int n=1+(20*l);n<21+(20*l);n++)
           for(int m=1+(20*k);m<21+(20*k);m++)
             {boolean compliqueLaVie=true;
              for(int o=0;o<tabb.length;o++)
               if ((tabb[o][1]==n)&&(tabb[o][0]==m)) compliqueLaVie=false;
              if (compliqueLaVie) dessinFond(n,m,k,l);
             }

/*        for(int rajout=0;rajout<Const.NB_PORTES;rajout++)
         if((Const.PASSAGES_GALACTIQUES[rajout][0]>(20*l))&&(Const.PASSAGES_GALACTIQUES[rajout][0]<(21+20*l))&&
             (Const.PASSAGES_GALACTIQUES[rajout][1]>(20*k))&&(Const.PASSAGES_GALACTIQUES[rajout][1]<(21+20*k))) {
          boolean gogala=true;
          while (gogala)
           if (screen2D.drawImage(imageG,23+(Const.PASSAGES_GALACTIQUES[rajout][0]-1)*20-400*l,
                          18+(Const.PASSAGES_GALACTIQUES[rajout][1]-1)*20-400*k,larg,haut, this))
             gogala=false;
           else System.out.println("probleme avec les passages galactiques");
         }*/
         ImageProducer ip=bi.getSource();

         screen.clearRect(50,60,300,110);
         screen.setColor(Color.orange);
         screen.drawString("Ecriture du secteur "+
                     Integer.toString(1+l+7*k),20,100);

         esp=CI+Integer.toString(G)+"_"+Integer.toString(1+l+7*k)+".gif";
	   try {
             FileOutputStream file = new
                 FileOutputStream(esp);
             ge =new GifEncoder(ip,file);
             ge.encode();
             file.close();
             } catch (IOException e) {
                 System.out.println("Erreur -- " + e.toString());
                 }
         screen2D.dispose();

         bi.flush();
         if ((1+l+7*k)==49) finEcriture=false;
       }
    }
     screen.setColor(Color.magenta);
     screen.drawString("Ecriture de la galaxie terminée !",20,150);
}

  public static void main(String[] args) {
         if(args.length!=1) System.exit(0);
        int numG=Integer.parseInt(args[0]);
        G=numG;
        Univers u=new Univers(true,"etyrrujdf");

        Te frame = new Te();

        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        frame.addWindowListener(l);
        frame.pack();
        frame.setSize(new Dimension(500,200));
        frame.show();
    }
}


