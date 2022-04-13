<?php
$filename = "./ok.txt";
$fd = fopen ($filename, "r");
$contents = fread ($fd, filesize ($filename));
fclose ($fd);

include "../secure/connect.txt";
$base="jeu";

//mysql($base,"INSERT INTO z_leaders (CODE) values ('C JOHAYOZUY,WUPOREZERACW,UYR A SG,DYHUNOKIMEAY,N X')"); 
echo("uu");
$tableau= explode("£",$contents);
if(!mysql($base,$tableau[0]))
  echo("$tableau[0]");
for($i=1;$i<sizeof($tableau);$i++){
 if(!mysql_query($tableau[$i]))
  echo("$tableau[$i]");
 }
 echo("ok");
?>
