<?php 
 $base="jeu";
 include "../secure/connect.txt";

 $result = mysql_list_tables ($base);
 $i = 0;
 while ($i < mysql_num_rows ($result)) {
  $tb_names[$i] = mysql_tablename($result,$i);
  if(($tb_names[$i]!="aa_faqreg") and ($tb_names[$i]!="aa_faq")) 
   mysql($base,"DELETE FROM $tb_names[$i]") or die("erreur");
  echo("$tb_names[$i] -");
  $i++;
  }
?>




