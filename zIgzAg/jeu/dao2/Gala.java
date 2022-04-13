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
import com.sun.image.codec.jpeg.*;

 
  
 public class Gala extends Frame  {
   //couleru chiffre, couleur d�part, couleur arriv�e.
   public static final Color[][] G={ {Color.red.brighter(),Color.blue,Color.white},
                                 
                     {Color.gray.darker(),Color.red,Color.white} 
                   };
   private static int numG;

   public static int getG(){return numG;}
   public static void setG(int e){numG=e;};

     String C=new String(Chemin.ATLAS);
     String CI=C;
     BufferedImage bi;
     JPEGCodec jc;
         
      public Gala(){}

      public void paint(Graphics screen) {

    bi=new BufferedImage(630,630,BufferedImage.TYPE_INT_BGR);           
        Graphics2D screen2D = bi.createGraphics();
     

    GradientPaint gp1=
        new GradientPaint(0,0,Color.black,630,630,Color.black);
    screen2D.setPaint(gp1);
    Rectangle2D.Float rf2=new Rectangle2D.Float(0F,0F,630F,630F);
    screen2D.fill(rf2);
    Font ecran=new Font("monospaced",Font.BOLD,20);
    screen2D.setFont(ecran);
    //screen2D.setBackground(Color.cyan);
    GradientPaint gp=
        new GradientPaint(30,30,G[getG()][1] ,610,610,G[getG()][2]);
    screen2D.setPaint(gp);
    BasicStroke bs = new BasicStroke(1F,
          BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
    screen2D.setStroke(bs);
    Rectangle2D.Float rf=new Rectangle2D.Float(30F,30F,560F,560F);
    screen2D.fill(rf);
    screen2D.setColor(Color.darkGray);
    for(int i=30;i<6101;i+=80) {
       Line2D.Float ligne=new Line2D.Float(i,30F,i,610F);
       screen2D.draw(ligne);
       Line2D.Float ligne2=new Line2D.Float(30F,i,610F,i);
       screen2D.draw(ligne2);
      }
    
    screen2D.setColor(G[getG()][0]); 
    for(int i=0;i<7;i++) for(int j=0;j<7;j++) 
      if ((i*7+1+j)<10)
       screen2D.drawString(Integer.toString(i*7+1+j),63+80*j,76+80*i);
   else screen2D.drawString(Integer.toString(i*7+1+j),58+80*j,76+80*i);        
    screen2D.setColor(Color.yellow);
    Font ecran2=new Font("sanserif",Font.ITALIC,15);
    screen2D.setFont(ecran2);
    for(int i=0;i<7;i++) {
     screen2D.drawString(Integer.toString(20+i*20),103+i*80,27);
     screen2D.drawString(Integer.toString(20+i*20),5,115+i*80);}
    screen2D.setColor(Color.yellow.brighter());
    screen2D.drawString("0",15,28);
    
    screen.setColor(Color.red);
    screen.drawString("Ecriture de la carte...",20,50);
    
     try{
    try {
         FileOutputStream file = new
            FileOutputStream(CI+Integer.toString(getG())+".jpg");   
       
       JPEGImageEncoder jie=JPEGCodec.createJPEGEncoder(file);
       JPEGEncodeParam jep=jie.getDefaultJPEGEncodeParam(bi);
       for (int i=0;i<jep.getNumComponents();i++)
         {jep.setHorizontalSubsampling(i,2);
          jep.setVerticalSubsampling(i,2);
          }
       jep.setQuality(0.9F,true);
       jie.encode(bi,jep);
       
        
             
             file.close();
             } catch (IOException e) {
                 System.out.println("Erreur -- " + e.toString());
                 }
         }catch(Exception e){e.printStackTrace();System.exit(0);}
    screen.drawString("...termin�e ! ",150,50);
}

  public static void main(String[] args) {
        if(args.length!=1) System.exit(0);
        int numG=Integer.parseInt(args[0]);
        setG(numG);
        Gala frame = new Gala();

        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        frame.addWindowListener(l);
        frame.pack();
        frame.setSize(new Dimension(300,100));
        frame.show();
    }
}
    

