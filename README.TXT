// DAO2 V4 - v1.0.0-dev
// 17/03/2021
// FRDev66

**************************
INFORMATIONS :
**************************

Cette versio est d�sign�e comme Version DEV.

C'est dans cette version que les Evolutions / Corrections / Modifications seront d�velopp�es.

Apr�s validation des Tests de DEV, l'ensemble des fichiers du CODE sera d�plac� dans la Version RECETTE ou PREX pour proc�der aux diff�rentes phases de test.

Si ces tests sont concluant et valid�s, l'ensemble des fichiers du CODE sera d�plac� dans la Version PROD et utiliser pour faire tourner le JEU.





Attention dans certains .bat sous linux, n'oubliez pas de remplacer les ";" par des ":"

**************************
Proc�dure d'installation :
**************************

1)Cr�er les galaxies.

Le programme est param�tr� par d�faut pour comporter deux galaxies.
Si vous voulez changer cela, vous devrez modifier les sources et recompiler grace �
la commande co.bat. Pour la premi�re installation, je vous conseille de proc�der
� une installation standard.

	a) lancer i1.bat -> initialise l'univers.
	b) lancer g1 et g2 -> cr�e les galaxies 1 et 2
	c) lancer image_g1 et image_g2 -> cr�e les images des galaxies
	d) lancer image_secteur1 et image_secteur2 -> cr�e les images des secteurs des galaxies.
			notez que des probl�mes "appara�tront". c'est li� aux chargements des images,
			ce n'est pas grave normallement.
	e) lancer html_secteur1 et html_secteur2 -> cr�e les fichiers html de pr�sentation de l'atlas.
		normallement pas n�cessaire �) lancer car ca exsite d�j� dans l'atlas.
		
Et voil� vous avez maintenant des donn�es dans le r�pertoire Univers (l� o� seront stock�es 
	toutes vos donn�es du jeu)!
Vous pouvez transvaser les donn�es de Univers/atlas vers site/atlas -> votre atlas est cr��
	
2)Installer la base en locale

Vous avez install� sur votre ordinateur une base mysql et un sevreur apache.
Transf�rer le contenu du r�pertoire "localhost" dans le r�pertoire d'ex�cution de script
Si il y a un mot de passe � votre base, modifiez le fichier secure/connect.txt
Ensuite cr�er � la main une base "jeu"
puis lancer le script mJ/creer_tables.php3
Si tout se passe bien un certain nombre de tables sont cr��es et c'est tout ce que vous avez besoin
de faire pour l'instant ici.

3)Installer le site sur le web.

Vous pouvez transvaser l'ensemble du contenu du r�pertoire "site" sur le web.
Attention, le site actuel pr�suppose plusieurs choses :

	1) il utilise un script perl propre � free pour s'identifier dans .htaccess.
		A vous de modifier cela si vous n'utilisez pas free.
	2) modifier les fichiers site/secure/connect.txt & site/secure/mj.txt & site/secure/mj2.txt
	3)la base mysql sur le site doit s'appeler "jeu.oceane. Si ce n'est pas le cas,
		il vous faut modifier la variable $base dans certains scripts de
		site/mj site/mj2 site/ordres
		
	4) vous devez cr�er cette base jeu.oceane puis lancer le script mj/creer_tables.php3 pour
		cr�er les tables.
		
		
L'installation est maintenant termin�e, on peut passer � la phase :

**************************
Proc�dure du tour de jeu :
**************************
	

1)vous avez du r�cup�rer un certain nombre d'inscription dans la base du site, puis plus tard des ordres.

lancer les scripts suivant :

- site/mj/transferer_fichier.php3
- site/mj/transferer_fichier2.php3
- site/mj/transferer_fichier3.php3

Ces trois scripts vont sauver les donn�es importantes de la base dans 3 fichier, ok.txt, ok2.txt et ok3.txt

Vous pouvez ensuite lancer les scripts

-site/mj/supprimer_tables.php3 -> efface le contenu des tables
-site/mj/actu.php3 -> efface certains fichiers temporaires

2)t�l�charger en ftp les fichier "ok" et mettez les dans le m�me repertoire o� se trouve vos fichiers
localhost/mj.

vous pouvez nettoyer la base avec 
localhost/mj/supprimer_tables.php3

puis charegz le contenu de la base avec 
localhost/mj/chargement.php3
localhost/mj/chargement2.php3
localhost/mj/chargement3.php3

3)lancer la r�solution avec o2.bat

4)zipper les rapports avec z.bat

5)envoyez les mails avec m.bat

6)t�l�charger en ftp le contenu de Univers/tourX/secure2 dans le r�pertoire correspondant sur le site
puis
t�l�charger en ftp le contenu de Univers/tourX/zip dans le r�pertoire rapports/
puis t�l�charger le contenu de Univers/tourX/ordres dans mj/ sur le site

7)lancer les scripts suivants � partir du site pour charger les ordres :
mj/chargement.php3
mj/chargement2.php3
mj/chargement3.php3
mj/chargement4.php3

La proc�dure du tour est termin�e!

Bonne chance!



