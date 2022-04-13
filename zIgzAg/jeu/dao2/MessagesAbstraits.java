// V4.0.0
// 18/03/2021
// FRDev66
// Copyright 2021 Chroniques Ludiques-  All Rights Reserved.
// Use is subject to license terms.

package zIgzAg.jeu.dao2;



import java.lang.reflect.Field;
import java.util.ListResourceBundle;

public abstract class MessagesAbstraits extends ListResourceBundle {

  public Object[][] getContents() {
  Object[][] retour=null;
  try{Field[] champs=getClass().getFields();
      retour=new Object[champs.length][2];
      for(int i=0;i<champs.length;i++){
       retour[i][0]=champs[i].getName();
       retour[i][1]=champs[i].get(null);
       }
     }
  catch(IllegalAccessException e){}
  return retour;
  }

 }      	 
       	 
       	 
       	 	
       	
