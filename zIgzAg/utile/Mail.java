// v 1.00 01/01/01
// Copyright 2001 Julien Buret All Rights Reserved.
// Use is subject to license terms.


package zIgzAg.utile;

import java.util.*;
import java.io.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import java.net.*;

public class Mail {

 public static final String CHARSET="ISO8859_1";
 public static final String ENCODING="Q";

 public static final String ERREUR_CODAGE_TEXTE="Erreur dans le codage norme RFC822 du texte suivant:";

 public static boolean envoyerMessageFichiersAttaches(String nomDestinataire,String adresseDestinataire,
  String adresseEnvoi,String host,String sujet,String corpsMessage,String[] fichiers){
  /*try{
 System.out.println(InetAddress.getLocalHost());
  }catch(Exception e){e.printStackTrace();}*/
  Properties props = System.getProperties();
  props.setProperty("mail.transport.protocol", "smtp");
  props.put("mail.smtp.host", "smtp.ionos.fr");
  props.put("mail.smtp.user", "frdev66@amp66.fr");
  props.put("mail.smtp.password", "Lenems66!!");
  //props.put("mail.smtp.starttls.enable", "true");
  //props.put("mail.smtp.port", "587");
  props.put("mail.smtp.auth", "true");
  props.put("mail.debug", "true");
  props.put("mail.smtp.ssl.enable", "true");
  props.put("mail.smtp.port","465");
  //props.put("mail.smtp.localhost","213.228.54.130");


  //Session session = Session.getDefaultInstance(props, null);
  //session.setDebug(true);
  Session session = Session.getDefaultInstance(props,  
          new javax.mail.Authenticator(){
        protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
            return new javax.mail.PasswordAuthentication(
                "frdev66@amp66.fr", "Lenems66!!");// Specify the Username and the PassWord
        }
});
  
  try{
   MimeMessage msg = new MimeMessage(session);
   msg.setFrom(new InternetAddress(adresseEnvoi));
   InternetAddress[] adresse=new InternetAddress[1];
   try{
    adresse[0]=new InternetAddress(adresseDestinataire,nomDestinataire/*,CHARSET*/);
    }catch(UnsupportedEncodingException e){System.out.println(ERREUR_CODAGE_TEXTE+nomDestinataire);e.printStackTrace();return false;}

   msg.setRecipients(Message.RecipientType.TO, adresse);
   try{
    msg.setSubject(MimeUtility.encodeText(sujet/*,CHARSET,ENCODING*/));
    }catch(UnsupportedEncodingException e){System.out.println(ERREUR_CODAGE_TEXTE+sujet);e.printStackTrace();return false;}

   Multipart mp = new MimeMultipart();

   MimeBodyPart mbp1 = new MimeBodyPart();
   //mbp1.setText(corpsMessage/*,CHARSET*/);
   mbp1.setText(corpsMessage, "ISO8859_1");
   mp.addBodyPart(mbp1);

   for(int i=0;i<fichiers.length;i++){
    MimeBodyPart mbp2 = new MimeBodyPart();
    FileDataSource fds = new FileDataSource(fichiers[i]);
    mbp2.setDataHandler(new DataHandler(fds));
   // File inter=new File(fichiers[i]);
    mbp2.setFileName(fds.getName());
    mp.addBodyPart(mbp2);
    }

   msg.setContent(mp);

   msg.setSentDate(new Date());


   Transport.send(msg);

   }catch(MessagingException e){e.printStackTrace();return false;}
  return true;
  }


 }