/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Main
 * Date : 13/10/2024 09:30:53
 * Version de wdjava.dll  : 25.0.221.6
 */


package com.masociete.sebene_money.wdgen;


import com.masociete.sebene_money.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.superchamp.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.style.degrade.*;
import fr.pcsoft.wdjava.ui.champs.zml.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Main extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Main
////////////////////////////////////////////////////////////////////////////

/**
 * SC_accueil
 */
class GWDSC_accueil extends WDSuperChamp
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Main.SC_accueil
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_tete
 */
class GWDLIB_tete extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Main.SC_accueil.LIB_tete
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2810256819022688976l);

super.setChecksum("678920664");

super.setNom("LIB_tete");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 82);

super.setPlan(1);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, 0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_tete mWD_LIB_tete = new GWDLIB_tete();

/**
 * IMG_notif
 */
class GWDIMG_notif extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Main.SC_accueil.IMG_notif
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2810257089606346640l);

super.setChecksum("679641023");

super.setNom("IMG_notif");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(274, 37);

super.setTailleInitiale(24, 24);

super.setValeurInitiale("C:\\Mes Projets Mobile\\Sebene-Money\\cloche.png");

super.setPlan(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_notif mWD_IMG_notif = new GWDIMG_notif();

/**
 * LIB_nom_utilisateur
 */
class GWDLIB_nom_utilisateur extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Main.SC_accueil.LIB_nom_utilisateur
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2810257759626316422l);

super.setChecksum("684710505");

super.setNom("LIB_nom_utilisateur");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(53, 42);

super.setTailleInitiale(259, 19);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4000000, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 2), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_nom_utilisateur mWD_LIB_nom_utilisateur = new GWDLIB_nom_utilisateur();

/**
 * LIB_insigne1
 */
class GWDLIB_insigne1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Main.SC_accueil.LIB_insigne1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2810258713111834038l);

super.setChecksum("687488631");

super.setNom("LIB_insigne1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 29);

super.setTailleInitiale(37, 40);

super.setPlan(1);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4800000, 0xF48542, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(31, 0xE0DCDA, 0x605C5A, 0xF48542, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_insigne1 mWD_LIB_insigne1 = new GWDLIB_insigne1();

/**
 * LIB_card
 */
class GWDLIB_card extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Main.SC_accueil.LIB_card
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2810271095508249048l);

super.setChecksum("693192156");

super.setNom("LIB_card");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 98);

super.setTailleInitiale(304, 149);

super.setPlan(1);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4800000, 0xE47400, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(0xE47400, new int[] {0x0, 0, 1, 0x0, 0, 1, 0x0, 0, 1, 0x0, 0, 1}, new int[] {15, 13, 15, 13, 15, 13, 15, 13}), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_card mWD_LIB_card = new GWDLIB_card();

/**
 * LIB_boule
 */
class GWDLIB_boule extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Main.SC_accueil.LIB_boule
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2810272392590443709l);

super.setChecksum("695263727");

super.setNom("LIB_boule");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(261, 106);

super.setTailleInitiale(37, 40);

super.setPlan(1);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4800000, 0x435BF4, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(31, 0xE0DCDA, 0x605C5A, WDDegradeFactory.creerDegrade_GEN(new int[]{0x435BF4, 0x4933EB}, 90, null), 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_boule mWD_LIB_boule = new GWDLIB_boule();

/**
 * LIB_boule1
 */
class GWDLIB_boule1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_Main.SC_accueil.LIB_boule1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2810272508556160877l);

super.setChecksum("696863930");

super.setNom("LIB_boule1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(237, 105);

super.setTailleInitiale(37, 40);

super.setPlan(1);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4800000, 0x32BD50, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(31, 0xE0DCDA, 0x605C5A, WDDegradeFactory.creerDegrade_GEN(new int[]{0x32BD50, 0x83212}, 90, null), 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_boule1 mWD_LIB_boule1 = new GWDLIB_boule1();

/**
 * LIB_SansNom1
 */
class GWDLIB_SansNom1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_Main.SC_accueil.LIB_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2810276653202467155l);

super.setChecksum("699730533");

super.setNom("LIB_SansNom1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Balance actuelle ");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(46, 109);

super.setTailleInitiale(120, 19);

super.setPlan(1);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF1000000, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 2), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_SansNom1 mWD_LIB_SansNom1 = new GWDLIB_SansNom1();

/**
 * IMG_card
 */
class GWDIMG_card extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_Main.SC_accueil.IMG_card
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2810276790641648891l);

super.setChecksum("699961109");

super.setNom("IMG_card");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(15, 107);

super.setTailleInitiale(24, 24);

super.setValeurInitiale("C:\\Mes Projets Mobile\\Sebene-Money\\card.png");

super.setPlan(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_card mWD_IMG_card = new GWDIMG_card();

/**
 * LIB_SansNom2
 */
class GWDLIB_SansNom2 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de FEN_Main.SC_accueil.LIB_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2810277211550573687l);

super.setChecksum("702088715");

super.setNom("LIB_SansNom2");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("XXX-XXX-XXX");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(16, 144);

super.setTailleInitiale(151, 20);

super.setPlan(1);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(10);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF1000000, 0xFFFFFFFF, creerPolice_GEN("Roboto", -9.000000, 3), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_SansNom2 mWD_LIB_SansNom2 = new GWDLIB_SansNom2();

/**
 * LIB_card1
 */
class GWDLIB_card1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de FEN_Main.SC_accueil.LIB_card1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2810278925245414519l);

super.setChecksum("704978842");

super.setNom("LIB_card1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 263);

super.setTailleInitiale(75, 63);

super.setPlan(1);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(11);

super.setAncrageInitial(0, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4800000, 0xF1000000, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(0xF1000000, new int[] {0x0, 0, 1, 0x0, 0, 1, 0x0, 0, 1, 0x0, 0, 1}, new int[] {15, 13, 15, 13, 15, 13, 15, 13}), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_card1 mWD_LIB_card1 = new GWDLIB_card1();

/**
 * IMG_compte
 */
class GWDIMG_compte extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°12 de FEN_Main.SC_accueil.IMG_compte
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2810279178650837274l);

super.setChecksum("707333472");

super.setNom("IMG_compte");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(24, 268);

super.setTailleInitiale(41, 30);

super.setValeurInitiale("C:\\Mes Projets Mobile\\Sebene-Money\\credit-card-buyer.png");

super.setPlan(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(12);

super.setAncrageInitial(0, 1000, 1000, 500, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_compte mWD_IMG_compte = new GWDIMG_compte();

/**
 * LIB_texte
 */
class GWDLIB_texte extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°13 de FEN_Main.SC_accueil.LIB_texte
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2810279432055146417l);

super.setChecksum("708569930");

super.setNom("LIB_texte");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Compte");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(19, 299);

super.setTailleInitiale(54, 19);

super.setPlan(1);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(13);

super.setAncrageInitial(0, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, 0xFFFFFFFF, creerPolice_GEN("Roboto", -7.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_texte mWD_LIB_texte = new GWDLIB_texte();

/**
 * LIB_card2
 */
class GWDLIB_card2 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°14 de FEN_Main.SC_accueil.LIB_card2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2812880240874407295l);

super.setChecksum("672278148");

super.setNom("LIB_card2");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(232, 263);

super.setTailleInitiale(75, 63);

super.setPlan(1);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(14);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4800000, 0xF1000000, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(0xF1000000, new int[] {0x0, 0, 1, 0x0, 0, 1, 0x0, 0, 1, 0x0, 0, 1}, new int[] {15, 13, 15, 13, 15, 13, 15, 13}), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_card2 mWD_LIB_card2 = new GWDLIB_card2();

/**
 * IMG_compte1
 */
class GWDIMG_compte1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°15 de FEN_Main.SC_accueil.IMG_compte1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2812880301005274487l);

super.setChecksum("673605490");

super.setNom("IMG_compte1");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(251, 270);

super.setTailleInitiale(31, 30);

super.setValeurInitiale("C:\\Mes Projets Mobile\\Sebene-Money\\chart-pie-simple-circle-dollar (1).png");

super.setPlan(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(15);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_compte1 mWD_IMG_compte1 = new GWDIMG_compte1();

/**
 * LIB_texte1
 */
class GWDLIB_texte1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°16 de FEN_Main.SC_accueil.LIB_texte1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2812880301005536631l);

super.setChecksum("673865354");

super.setNom("LIB_texte1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Graphe");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(242, 300);

super.setTailleInitiale(54, 19);

super.setPlan(1);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(16);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF3800000, 0xFFFFFFFF, creerPolice_GEN("Roboto", -7.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_texte1 mWD_LIB_texte1 = new GWDLIB_texte1();

/**
 * LIB_card3
 */
class GWDLIB_card3 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°17 de FEN_Main.SC_accueil.LIB_card3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2812880361136731144l);

super.setChecksum("675517737");

super.setNom("LIB_card3");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(124, 263);

super.setTailleInitiale(75, 63);

super.setPlan(1);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(17);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4800000, 0xF1000000, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(0xF1000000, new int[] {0x0, 0, 1, 0x0, 0, 1, 0x0, 0, 1, 0x0, 0, 1}, new int[] {15, 13, 15, 13, 15, 13, 15, 13}), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_card3 mWD_LIB_card3 = new GWDLIB_card3();

/**
 * IMG_compte2
 */
class GWDIMG_compte2 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°18 de FEN_Main.SC_accueil.IMG_compte2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2812885609613809837l);

super.setChecksum("702564220");

super.setNom("IMG_compte2");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(146, 267);

super.setTailleInitiale(30, 33);

super.setValeurInitiale("C:\\Mes Projets Mobile\\Sebene-Money\\document-signed (2).png");

super.setPlan(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(18);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_compte2 mWD_IMG_compte2 = new GWDIMG_compte2();

/**
 * LIB_texte3
 */
class GWDLIB_texte3 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°19 de FEN_Main.SC_accueil.LIB_texte3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2812887276063474749l);

super.setChecksum("704916392");

super.setNom("LIB_texte3");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Relevé");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(137, 300);

super.setTailleInitiale(54, 19);

super.setPlan(1);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(19);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, 0xFFFFFFFF, creerPolice_GEN("Roboto", -7.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_texte3 mWD_LIB_texte3 = new GWDLIB_texte3();
/**
 * Initialise tous les champs de FEN_Main.SC_accueil
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Main.SC_accueil
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_tete.initialiserObjet();
super.ajouter("LIB_tete", mWD_LIB_tete);
mWD_IMG_notif.initialiserObjet();
super.ajouter("IMG_notif", mWD_IMG_notif);
mWD_LIB_nom_utilisateur.initialiserObjet();
super.ajouter("LIB_nom_utilisateur", mWD_LIB_nom_utilisateur);
mWD_LIB_insigne1.initialiserObjet();
super.ajouter("LIB_insigne1", mWD_LIB_insigne1);
mWD_LIB_card.initialiserObjet();
super.ajouter("LIB_card", mWD_LIB_card);
mWD_LIB_boule.initialiserObjet();
super.ajouter("LIB_boule", mWD_LIB_boule);
mWD_LIB_boule1.initialiserObjet();
super.ajouter("LIB_boule1", mWD_LIB_boule1);
mWD_LIB_SansNom1.initialiserObjet();
super.ajouter("LIB_SansNom1", mWD_LIB_SansNom1);
mWD_IMG_card.initialiserObjet();
super.ajouter("IMG_card", mWD_IMG_card);
mWD_LIB_SansNom2.initialiserObjet();
super.ajouter("LIB_SansNom2", mWD_LIB_SansNom2);
mWD_LIB_card1.initialiserObjet();
super.ajouter("LIB_card1", mWD_LIB_card1);
mWD_IMG_compte.initialiserObjet();
super.ajouter("IMG_compte", mWD_IMG_compte);
mWD_LIB_texte.initialiserObjet();
super.ajouter("LIB_texte", mWD_LIB_texte);
mWD_LIB_card2.initialiserObjet();
super.ajouter("LIB_card2", mWD_LIB_card2);
mWD_IMG_compte1.initialiserObjet();
super.ajouter("IMG_compte1", mWD_IMG_compte1);
mWD_LIB_texte1.initialiserObjet();
super.ajouter("LIB_texte1", mWD_LIB_texte1);
mWD_LIB_card3.initialiserObjet();
super.ajouter("LIB_card3", mWD_LIB_card3);
mWD_IMG_compte2.initialiserObjet();
super.ajouter("IMG_compte2", mWD_IMG_compte2);
mWD_LIB_texte3.initialiserObjet();
super.ajouter("LIB_texte3", mWD_LIB_texte3);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2810257145442114042l);

super.setChecksum("680848182");

super.setNom("SC_accueil");

super.setType(40);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setNumTab(2);

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 495);

super.setValeurInitiale("");

super.setPlan(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(10, 1000, 1000, 500, 1000, 0);

super.setPersistant(false);

super.setTailleUtile(303, 568);

super.setTauxParallaxe(500, 500);

super.setCouleurTexteAutomatique(0xFF000001);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSC_accueil mWD_SC_accueil;

/**
 * ZM_Menu
 */
class GWDZM_Menu extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Main.ZM_Menu
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_Menu_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Main.ZM_Menu
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_profil
 */
class GWDLIB_profil extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Main.ZM_Menu.LIB_profil
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813263382049814040l);

super.setChecksum("700199828");

super.setNom("LIB_profil");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Profil");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(54, 12);

super.setTailleInitiale(116, 24);

super.setPlan(4);

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_profil mWD_LIB_profil = new GWDLIB_profil();

/**
 * IMG_Picto_Amis
 */
class GWDIMG_Picto_Amis extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Main.ZM_Menu.IMG_Picto_Amis
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813263382050076184l);

super.setChecksum("700464252");

super.setNom("IMG_Picto_Amis");

super.setType(8);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(20, 14);

super.setTailleInitiale(20, 20);

super.setValeurInitiale("C:\\Mes Projets Mobile\\Sebene-Money\\client@dpi1x.png");

super.setPlan(4);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(false);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_Picto_Amis mWD_IMG_Picto_Amis = new GWDIMG_Picto_Amis();
class GWDZM_Menu_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_Main.ZM_Menu
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Main.ZM_Menu
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_profil.initialiserObjet();
super.ajouterChamp(mWD_LIB_profil);
mWD_IMG_Picto_Amis.initialiserObjet();
super.ajouterChamp(mWD_IMG_Picto_Amis);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(48);

super.setVisibleInitial(true);

super.setModeSelection(-1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_Menu_Ligne1 mWD_ZM_Menu_Ligne1 = new GWDZM_Menu_Ligne1();

/**
 * ZM_Menu_Ligne2
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Main.ZM_Menu
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_Mdp
 */
class GWDLIB_Mdp extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Main.ZM_Menu.LIB_Mdp
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813263382050141720l);

super.setChecksum("700527508");

super.setNom("LIB_Mdp");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Confidentialité");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(53, 12);

super.setTailleInitiale(116, 24);

super.setPlan(4);

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Mdp mWD_LIB_Mdp = new GWDLIB_Mdp();

/**
 * IMG_Picto_2
 */
class GWDIMG_Picto_2 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Main.ZM_Menu.IMG_Picto_2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813263382049879576l);

super.setChecksum("700267644");

super.setNom("IMG_Picto_2");

super.setType(8);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(18, 12);

super.setTailleInitiale(20, 20);

super.setValeurInitiale("C:\\Mes Projets Mobile\\Sebene-Money\\cle.png");

super.setPlan(4);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(false);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_Picto_2 mWD_IMG_Picto_2 = new GWDIMG_Picto_2();
class GWDZM_Menu_Ligne2 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_Main.ZM_Menu
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Main.ZM_Menu
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_Mdp.initialiserObjet();
super.ajouterChamp(mWD_LIB_Mdp);
mWD_IMG_Picto_2.initialiserObjet();
super.ajouterChamp(mWD_IMG_Picto_2);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(48);

super.setVisibleInitial(true);

super.setModeSelection(-1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_Menu_Ligne2 mWD_ZM_Menu_Ligne2 = new GWDZM_Menu_Ligne2();

/**
 * ZM_Menu_Ligne3
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Main.ZM_Menu
////////////////////////////////////////////////////////////////////////////

/**
 * IMG_Picto_7
 */
class GWDIMG_Picto_7 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Main.ZM_Menu.IMG_Picto_7
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813263382050797080l);

super.setChecksum("701185148");

super.setNom("IMG_Picto_7");

super.setType(8);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(18, 13);

super.setTailleInitiale(20, 20);

super.setValeurInitiale("C:\\Mes Projets Mobile\\Sebene-Money\\info@dpi1x.png");

super.setPlan(4);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(false);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_Picto_7 mWD_IMG_Picto_7 = new GWDIMG_Picto_7();

/**
 * LIB_A_propos
 */
class GWDLIB_A_propos extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Main.ZM_Menu.LIB_A_propos
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813263382050862616l);

super.setChecksum("701248404");

super.setNom("LIB_A_propos");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("A propos");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(60, 11);

super.setTailleInitiale(116, 24);

super.setPlan(4);

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_A_propos mWD_LIB_A_propos = new GWDLIB_A_propos();
class GWDZM_Menu_Ligne3 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_Main.ZM_Menu
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Main.ZM_Menu
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_IMG_Picto_7.initialiserObjet();
super.ajouterChamp(mWD_IMG_Picto_7);
mWD_LIB_A_propos.initialiserObjet();
super.ajouterChamp(mWD_LIB_A_propos);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(46);

super.setVisibleInitial(true);

super.setModeSelection(-1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_Menu_Ligne3 mWD_ZM_Menu_Ligne3 = new GWDZM_Menu_Ligne3();

/**
 * ZM_Menu_Ligne4
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Main.ZM_Menu
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_Statistiques
 */
class GWDLIB_Statistiques extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Main.ZM_Menu.LIB_Statistiques
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813263382050338328l);

super.setChecksum("700724116");

super.setNom("LIB_Statistiques");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("se déconnecter");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(63, 14);

super.setTailleInitiale(116, 24);

super.setPlan(4);

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Statistiques mWD_LIB_Statistiques = new GWDLIB_Statistiques();

/**
 * IMG_Picto_3
 */
class GWDIMG_Picto_3 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Main.ZM_Menu.IMG_Picto_3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813263382050403864l);

super.setChecksum("700791932");

super.setNom("IMG_Picto_3");

super.setType(8);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(20, 15);

super.setTailleInitiale(20, 20);

super.setValeurInitiale("C:\\Mes Projets Mobile\\Sebene-Money\\sign-out-alt.png");

super.setPlan(4);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(false);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_Picto_3 mWD_IMG_Picto_3 = new GWDIMG_Picto_3();

/**
 * IMG_Sep_1
 */
class GWDIMG_Sep_1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Main.ZM_Menu.IMG_Sep_1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813263382050469400l);

super.setChecksum("700857468");

super.setNom("IMG_Sep_1");

super.setType(8);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(280, 2);

super.setValeurInitiale("");

super.setPlan(4);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(6, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(false);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0x616161, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_Sep_1 mWD_IMG_Sep_1 = new GWDIMG_Sep_1();
class GWDZM_Menu_Ligne4 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_Main.ZM_Menu
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Main.ZM_Menu
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_Statistiques.initialiserObjet();
super.ajouterChamp(mWD_LIB_Statistiques);
mWD_IMG_Picto_3.initialiserObjet();
super.ajouterChamp(mWD_IMG_Picto_3);
mWD_IMG_Sep_1.initialiserObjet();
super.ajouterChamp(mWD_IMG_Sep_1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(48);

super.setVisibleInitial(true);

super.setModeSelection(-1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_Menu_Ligne4 mWD_ZM_Menu_Ligne4 = new GWDZM_Menu_Ligne4();

/**
 * ZM_Menu_Ligne5
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Main.ZM_Menu
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_quitter
 */
class GWDLIB_quitter extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Main.ZM_Menu.LIB_quitter
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813263382050600472l);

super.setChecksum("700986260");

super.setNom("LIB_quitter");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Quitter");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(67, 14);

super.setTailleInitiale(116, 24);

super.setPlan(4);

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x4FD7, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_quitter mWD_LIB_quitter = new GWDLIB_quitter();

/**
 * IMG_Picto_4
 */
class GWDIMG_Picto_4 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Main.ZM_Menu.IMG_Picto_4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813263382050666008l);

super.setChecksum("701054076");

super.setNom("IMG_Picto_4");

super.setType(8);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(18, 15);

super.setTailleInitiale(20, 20);

super.setValeurInitiale("C:\\Mes Projets Mobile\\Sebene-Money\\fermer.png");

super.setPlan(4);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(false);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_Picto_4 mWD_IMG_Picto_4 = new GWDIMG_Picto_4();
class GWDZM_Menu_Ligne5 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_Main.ZM_Menu
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Main.ZM_Menu
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_quitter.initialiserObjet();
super.ajouterChamp(mWD_LIB_quitter);
mWD_IMG_Picto_4.initialiserObjet();
super.ajouterChamp(mWD_IMG_Picto_4);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(48);

super.setVisibleInitial(true);

super.setModeSelection(-1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_Menu_Ligne5 mWD_ZM_Menu_Ligne5 = new GWDZM_Menu_Ligne5();
/**
 * Initialise tous les champs de FEN_Main.ZM_Menu
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Main.ZM_Menu
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZM_Menu_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZM_Menu_Ligne1);
mWD_ZM_Menu_Ligne2.initialiserObjet();
super.ajouterLigne(mWD_ZM_Menu_Ligne2);
mWD_ZM_Menu_Ligne3.initialiserObjet();
super.ajouterLigne(mWD_ZM_Menu_Ligne3);
mWD_ZM_Menu_Ligne4.initialiserObjet();
super.ajouterLigne(mWD_ZM_Menu_Ligne4);
mWD_ZM_Menu_Ligne5.initialiserObjet();
super.ajouterLigne(mWD_ZM_Menu_Ligne5);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setPresenceLibelle(false);

super.setQuid(2813263382049682968l);

super.setChecksum("700111620");

super.setNom("ZM_Menu");

super.setType(97);

super.setBulle("");

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 226);

super.setTailleInitiale(280, 238);

super.setPlan(4);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setNumTab(3);

super.setAltitude(2);

super.setAncrageInitial(9, 1000, 1000, 500, 500, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x808080);

super.setCouleurSeparateur(0xFFFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 4.500000, 4.500000, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN("C:\\Mes Projets Mobile\\Sebene-Money\\Gabarits\\WM\\250 Phoenix\\Phoenix_Bg_Sheet_Select@dpi1x.png?_3NP_10_10_10_10", new int[] {1,2,1,2,2,2,1,2,1}, new int[] {10, 10, 10, 10}, 0xFFFFFFFF, 0, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection (clic) d'une ligne dans ZM_Menu
 */
public void selectionLigne()
{
super.selectionLigne();

// 
//MAP:270ab82402af7618:00000021:1:FEN_Main.ZM_Menu:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDZM_Menu:Sélection (clic) d'une ligne dans ZM_Menu
// SELON ZM_Menu 
//MAP:270ab82402af7618:00000021:2:FEN_Main.ZM_Menu:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDZM_Menu:Sélection (clic) d'une ligne dans ZM_Menu
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// SELON ZM_Menu 
//MAP:270ab82402af7618:00000021:2:FEN_Main.ZM_Menu:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDZM_Menu:Sélection (clic) d'une ligne dans ZM_Menu
WDObjet _WDExpSelon0 = this;
if(_WDExpSelon0.opEgal(1))
{
// 		ZM_Menu = 1
//MAP:270ab82402af7618:00000021:4:FEN_Main.ZM_Menu:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDZM_Menu:Sélection (clic) d'une ligne dans ZM_Menu
this.setValeur(1);

// 		OuvreFenêtreMobile(FEN_Plus)
//MAP:270ab82402af7618:00000021:5:FEN_Main.ZM_Menu:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDZM_Menu:Sélection (clic) d'une ligne dans ZM_Menu
WDAPIFenetre.ouvreFille(GWDPSebene_Money.getInstance().mWD_FEN_Plus);

}
else if(_WDExpSelon0.opEgal(2))
{
// 		ZM_Menu = 2
//MAP:270ab82402af7618:00000021:9:FEN_Main.ZM_Menu:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDZM_Menu:Sélection (clic) d'une ligne dans ZM_Menu
this.setValeur(2);

// 		Info("mdp")
//MAP:270ab82402af7618:00000021:a:FEN_Main.ZM_Menu:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDZM_Menu:Sélection (clic) d'une ligne dans ZM_Menu
WDAPIDialogue.info("mdp");

// 			OuvreFenêtreMobile(FEN_Plus)
//MAP:270ab82402af7618:00000021:b:FEN_Main.ZM_Menu:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDZM_Menu:Sélection (clic) d'une ligne dans ZM_Menu
WDAPIFenetre.ouvreFille(GWDPSebene_Money.getInstance().mWD_FEN_Plus);

// 			FEN_Plus..Plan = 2
//MAP:270ab82402af7618:00000021:c:FEN_Main.ZM_Menu:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDZM_Menu:Sélection (clic) d'une ligne dans ZM_Menu
GWDPSebene_Money.getInstance().mWD_FEN_Plus.setProp(EWDPropriete.PROP_PLAN,2);

}
else if(_WDExpSelon0.opEgal(3))
{
// 			ZM_Menu = 3
//MAP:270ab82402af7618:00000021:e:FEN_Main.ZM_Menu:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDZM_Menu:Sélection (clic) d'une ligne dans ZM_Menu
this.setValeur(3);

// 		Info("a propos")
//MAP:270ab82402af7618:00000021:f:FEN_Main.ZM_Menu:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDZM_Menu:Sélection (clic) d'une ligne dans ZM_Menu
WDAPIDialogue.info("a propos");

}
else if(_WDExpSelon0.opEgal(4))
{
// 			ZM_Menu = 4
//MAP:270ab82402af7618:00000021:11:FEN_Main.ZM_Menu:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDZM_Menu:Sélection (clic) d'une ligne dans ZM_Menu
this.setValeur(4);

// 		SELON Dialogue("Voulez-vous quitté l'application ?")
//MAP:270ab82402af7618:00000021:13:FEN_Main.ZM_Menu:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDZM_Menu:Sélection (clic) d'une ligne dans ZM_Menu
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// 		SELON Dialogue("Voulez-vous quitté l'application ?")
//MAP:270ab82402af7618:00000021:13:FEN_Main.ZM_Menu:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDZM_Menu:Sélection (clic) d'une ligne dans ZM_Menu
WDObjet _WDExpSelon1 = WDAPIDialogue.dialogue(0);
if(_WDExpSelon1.opEgal(1))
{
// 					Utilise(FEN_connexion)
//MAP:270ab82402af7618:00000021:15:FEN_Main.ZM_Menu:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDZM_Menu:Sélection (clic) d'une ligne dans ZM_Menu
WDAPIFenetre.utilise(GWDPSebene_Money.getInstance().mWD_FEN_connexion);

}
else {
// 					retour
//MAP:270ab82402af7618:00000021:17:FEN_Main.ZM_Menu:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDZM_Menu:Sélection (clic) d'une ligne dans ZM_Menu
return;

}

}

}
else {
// 		FinProgramme()
//MAP:270ab82402af7618:00000021:1c:FEN_Main.ZM_Menu:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDZM_Menu:Sélection (clic) d'une ligne dans ZM_Menu
WDAPIVM.finProgramme();

}

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_Menu mWD_ZM_Menu;

/**
 * LIB_tete
 */
class GWDLIB_tete extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Main.LIB_tete
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813263382051780198l);

super.setChecksum("702165986");

super.setNom("LIB_tete");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(-2, -2);

super.setTailleInitiale(325, 220);

super.setPlan(4);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, 0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_tete mWD_LIB_tete;

/**
 * LIB_insigne
 */
class GWDLIB_insigne extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Main.LIB_insigne
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813263528082668030l);

super.setChecksum("704165788");

super.setNom("LIB_insigne");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(85, 12);

super.setTailleInitiale(138, 121);

super.setPlan(4);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4800000, 0xF48542, creerPolice_GEN("Roboto", -29.000000, 1), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(31, 0xE0DCDA, 0x605C5A, 0xF48542, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_insigne mWD_LIB_insigne;

/**
 * SC_navigation
 */
class GWDSC_navigation extends WDSuperChamp
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Main.SC_navigation
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_col
 */
class GWDLIB_col extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Main.SC_navigation.LIB_col
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813272684968248134l);

super.setChecksum("719472952");

super.setNom("LIB_col");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(0, -2);

super.setTailleInitiale(320, 67);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(9, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, 0xF4800000, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xF4800000, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_col mWD_LIB_col = new GWDLIB_col();

/**
 * IMG_compte
 */
class GWDIMG_compte extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Main.SC_navigation.IMG_compte
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813272684968313670l);

super.setChecksum("719540768");

super.setNom("IMG_compte");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(271, 15);

super.setTailleInitiale(32, 27);

super.setValeurInitiale("C:\\Mes Projets Mobile\\Sebene-Money\\menu.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur IMG_compte ( SC_navigation )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 
//MAP:270ac09a03d88346:00000012:1:FEN_Main.SC_navigation.IMG_compte:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte:Clic sur IMG_compte ( SC_navigation )
// AnimationJoueSurPropriétéChamp(LIB_ligne,"x",LIB_ligne..X,MoiMême..X,50)
//MAP:270ac09a03d88346:00000012:2:FEN_Main.SC_navigation.IMG_compte:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte:Clic sur IMG_compte ( SC_navigation )
WDAPIDivers.animationJoueSurProprieteChamp(mWD_LIB_ligne,"x",mWD_LIB_ligne.getProp(EWDPropriete.PROP_X).getInt(),WDContexte.getMoiMeme().getProp(EWDPropriete.PROP_X).getInt(),new WDEntier4(50));

// LIB_vers..Couleur	=Noir
//MAP:270ac09a03d88346:00000012:3:FEN_Main.SC_navigation.IMG_compte:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte:Clic sur IMG_compte ( SC_navigation )
mWD_LIB_vers.setProp(EWDPropriete.PROP_COULEUR,0);

// LIB_texte3..Couleur	=Noir
//MAP:270ac09a03d88346:00000012:4:FEN_Main.SC_navigation.IMG_compte:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte:Clic sur IMG_compte ( SC_navigation )
mWD_LIB_texte3.setProp(EWDPropriete.PROP_COULEUR,0);

// LIB_dep..Couleur	= Noir
//MAP:270ac09a03d88346:00000012:5:FEN_Main.SC_navigation.IMG_compte:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte:Clic sur IMG_compte ( SC_navigation )
mWD_LIB_dep.setProp(EWDPropriete.PROP_COULEUR,0);

// LIB_plus..Couleur	= BleuClair
//MAP:270ac09a03d88346:00000012:6:FEN_Main.SC_navigation.IMG_compte:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte:Clic sur IMG_compte ( SC_navigation )
mWD_LIB_plus.setProp(EWDPropriete.PROP_COULEUR,16711680);

// FEN_Main..Plan = 4
//MAP:270ac09a03d88346:00000012:8:FEN_Main.SC_navigation.IMG_compte:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte:Clic sur IMG_compte ( SC_navigation )
GWDPSebene_Money.getInstance().mWD_FEN_Main.setProp(EWDPropriete.PROP_PLAN,4);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_compte mWD_IMG_compte = new GWDIMG_compte();

/**
 * LIB_plus
 */
class GWDLIB_plus extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Main.SC_navigation.LIB_plus
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813272684968379206l);

super.setChecksum("719604024");

super.setNom("LIB_plus");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Plus");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(276, 43);

super.setTailleInitiale(30, 12);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, 0xFFFFFFFF, creerPolice_GEN("Roboto", -5.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_plus mWD_LIB_plus = new GWDLIB_plus();

/**
 * IMG_compte1
 */
class GWDIMG_compte1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Main.SC_navigation.IMG_compte1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813272684968444742l);

super.setChecksum("719671840");

super.setNom("IMG_compte1");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(186, 15);

super.setTailleInitiale(32, 27);

super.setValeurInitiale("C:\\Mes Projets Mobile\\Sebene-Money\\money-wings.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur IMG_compte1 ( SC_navigation )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 
//MAP:270ac09a03da8346:00000012:1:FEN_Main.SC_navigation.IMG_compte1:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte1:Clic sur IMG_compte1 ( SC_navigation )
// AnimationJoueSurPropriétéChamp(LIB_ligne,"x",LIB_ligne..X,MoiMême..X,50)
//MAP:270ac09a03da8346:00000012:2:FEN_Main.SC_navigation.IMG_compte1:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte1:Clic sur IMG_compte1 ( SC_navigation )
WDAPIDivers.animationJoueSurProprieteChamp(mWD_LIB_ligne,"x",mWD_LIB_ligne.getProp(EWDPropriete.PROP_X).getInt(),WDContexte.getMoiMeme().getProp(EWDPropriete.PROP_X).getInt(),new WDEntier4(50));

// LIB_vers..Couleur	=Noir
//MAP:270ac09a03da8346:00000012:3:FEN_Main.SC_navigation.IMG_compte1:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte1:Clic sur IMG_compte1 ( SC_navigation )
mWD_LIB_vers.setProp(EWDPropriete.PROP_COULEUR,0);

// LIB_texte3..Couleur	=Noir
//MAP:270ac09a03da8346:00000012:4:FEN_Main.SC_navigation.IMG_compte1:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte1:Clic sur IMG_compte1 ( SC_navigation )
mWD_LIB_texte3.setProp(EWDPropriete.PROP_COULEUR,0);

// LIB_dep..Couleur	= BleuClair
//MAP:270ac09a03da8346:00000012:5:FEN_Main.SC_navigation.IMG_compte1:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte1:Clic sur IMG_compte1 ( SC_navigation )
mWD_LIB_dep.setProp(EWDPropriete.PROP_COULEUR,16711680);

// LIB_plus..Couleur	= Noir
//MAP:270ac09a03da8346:00000012:6:FEN_Main.SC_navigation.IMG_compte1:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte1:Clic sur IMG_compte1 ( SC_navigation )
mWD_LIB_plus.setProp(EWDPropriete.PROP_COULEUR,0);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_compte1 mWD_IMG_compte1 = new GWDIMG_compte1();

/**
 * LIB_dep
 */
class GWDLIB_dep extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Main.SC_navigation.LIB_dep
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813272684968510278l);

super.setChecksum("719735096");

super.setNom("LIB_dep");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Dépense");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(183, 43);

super.setTailleInitiale(49, 12);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, 0xFFFFFFFF, creerPolice_GEN("Roboto", -5.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_dep mWD_LIB_dep = new GWDLIB_dep();

/**
 * IMG_compte2
 */
class GWDIMG_compte2 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Main.SC_navigation.IMG_compte2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813272684968575814l);

super.setChecksum("719802912");

super.setNom("IMG_compte2");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(101, 15);

super.setTailleInitiale(32, 27);

super.setValeurInitiale("C:\\Mes Projets Mobile\\Sebene-Money\\ANL02067.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur IMG_compte2 ( SC_navigation )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 
//MAP:270ac09a03dc8346:00000012:1:FEN_Main.SC_navigation.IMG_compte2:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte2:Clic sur IMG_compte2 ( SC_navigation )
// AnimationJoueSurPropriétéChamp(LIB_ligne,"x",LIB_ligne..X,MoiMême..X,50)
//MAP:270ac09a03dc8346:00000012:2:FEN_Main.SC_navigation.IMG_compte2:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte2:Clic sur IMG_compte2 ( SC_navigation )
WDAPIDivers.animationJoueSurProprieteChamp(mWD_LIB_ligne,"x",mWD_LIB_ligne.getProp(EWDPropriete.PROP_X).getInt(),WDContexte.getMoiMeme().getProp(EWDPropriete.PROP_X).getInt(),new WDEntier4(50));

// LIB_vers..Couleur =BleuClair
//MAP:270ac09a03dc8346:00000012:3:FEN_Main.SC_navigation.IMG_compte2:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte2:Clic sur IMG_compte2 ( SC_navigation )
mWD_LIB_vers.setProp(EWDPropriete.PROP_COULEUR,16711680);

// LIB_texte3..Couleur =Noir
//MAP:270ac09a03dc8346:00000012:4:FEN_Main.SC_navigation.IMG_compte2:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte2:Clic sur IMG_compte2 ( SC_navigation )
mWD_LIB_texte3.setProp(EWDPropriete.PROP_COULEUR,0);

// LIB_dep..Couleur = Noir
//MAP:270ac09a03dc8346:00000012:5:FEN_Main.SC_navigation.IMG_compte2:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte2:Clic sur IMG_compte2 ( SC_navigation )
mWD_LIB_dep.setProp(EWDPropriete.PROP_COULEUR,0);

// LIB_plus..Couleur = Noir
//MAP:270ac09a03dc8346:00000012:6:FEN_Main.SC_navigation.IMG_compte2:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte2:Clic sur IMG_compte2 ( SC_navigation )
mWD_LIB_plus.setProp(EWDPropriete.PROP_COULEUR,0);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_compte2 mWD_IMG_compte2 = new GWDIMG_compte2();

/**
 * LIB_vers
 */
class GWDLIB_vers extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_Main.SC_navigation.LIB_vers
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813272684968641350l);

super.setChecksum("719866168");

super.setNom("LIB_vers");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Versement");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(91, 43);

super.setTailleInitiale(61, 12);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, 0xFFFFFFFF, creerPolice_GEN("Roboto", -5.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_vers mWD_LIB_vers = new GWDLIB_vers();

/**
 * IMG_compte3
 */
class GWDIMG_compte3 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_Main.SC_navigation.IMG_compte3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813272684968706886l);

super.setChecksum("719933984");

super.setNom("IMG_compte3");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(16, 15);

super.setTailleInitiale(32, 25);

super.setValeurInitiale("C:\\Mes Projets Mobile\\Sebene-Money\\home.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur IMG_compte3 ( SC_navigation )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// AnimationJoueSurPropriétéChamp(LIB_ligne,"x",LIB_ligne..X,MoiMême..X,50)
//MAP:270ac09a03de8346:00000012:1:FEN_Main.SC_navigation.IMG_compte3:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte3:Clic sur IMG_compte3 ( SC_navigation )
// AnimationJoueSurPropriétéChamp(LIB_ligne,"x",LIB_ligne..X,MoiMême..X,50)
//MAP:270ac09a03de8346:00000012:1:FEN_Main.SC_navigation.IMG_compte3:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte3:Clic sur IMG_compte3 ( SC_navigation )
WDAPIDivers.animationJoueSurProprieteChamp(mWD_LIB_ligne,"x",mWD_LIB_ligne.getProp(EWDPropriete.PROP_X).getInt(),WDContexte.getMoiMeme().getProp(EWDPropriete.PROP_X).getInt(),new WDEntier4(50));

// LIB_texte3..Couleur=BleuClair
//MAP:270ac09a03de8346:00000012:2:FEN_Main.SC_navigation.IMG_compte3:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte3:Clic sur IMG_compte3 ( SC_navigation )
mWD_LIB_texte3.setProp(EWDPropriete.PROP_COULEUR,16711680);

// LIB_vers..Couleur	=noir
//MAP:270ac09a03de8346:00000012:3:FEN_Main.SC_navigation.IMG_compte3:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte3:Clic sur IMG_compte3 ( SC_navigation )
mWD_LIB_vers.setProp(EWDPropriete.PROP_COULEUR,0);

// LIB_dep..Couleur	= Noir
//MAP:270ac09a03de8346:00000012:4:FEN_Main.SC_navigation.IMG_compte3:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte3:Clic sur IMG_compte3 ( SC_navigation )
mWD_LIB_dep.setProp(EWDPropriete.PROP_COULEUR,0);

// LIB_plus..Couleur	= Noir
//MAP:270ac09a03de8346:00000012:5:FEN_Main.SC_navigation.IMG_compte3:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte3:Clic sur IMG_compte3 ( SC_navigation )
mWD_LIB_plus.setProp(EWDPropriete.PROP_COULEUR,0);

// FEN_Main..Plan = 1
//MAP:270ac09a03de8346:00000012:6:FEN_Main.SC_navigation.IMG_compte3:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDIMG_compte3:Clic sur IMG_compte3 ( SC_navigation )
GWDPSebene_Money.getInstance().mWD_FEN_Main.setProp(EWDPropriete.PROP_PLAN,1);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_compte3 mWD_IMG_compte3 = new GWDIMG_compte3();

/**
 * LIB_texte3
 */
class GWDLIB_texte3 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_Main.SC_navigation.LIB_texte3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813272684968772422l);

super.setChecksum("719997240");

super.setNom("LIB_texte3");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Home");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(18, 41);

super.setTailleInitiale(30, 11);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, 0xFFFFFFFF, creerPolice_GEN("Roboto", -5.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Initialisation de LIB_texte3 ( SC_navigation )
 */
public void init()
{
super.init();

// LIB_texte3..Couleur=BleuClair
//MAP:270ac09a03df8346:0000000e:1:FEN_Main.SC_navigation.LIB_texte3:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDLIB_texte3:Initialisation de LIB_texte3 ( SC_navigation )
// LIB_texte3..Couleur=BleuClair
//MAP:270ac09a03df8346:0000000e:1:FEN_Main.SC_navigation.LIB_texte3:com.masociete.sebene_money.wdgen.GWDFFEN_Main$GWDSC_navigation$GWDLIB_texte3:Initialisation de LIB_texte3 ( SC_navigation )
this.setProp(EWDPropriete.PROP_COULEUR,16711680);

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_texte3 mWD_LIB_texte3 = new GWDLIB_texte3();

/**
 * LIB_ligne
 */
class GWDLIB_ligne extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de FEN_Main.SC_navigation.LIB_ligne
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813272684968837958l);

super.setChecksum("720062776");

super.setNom("LIB_ligne");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(18, 59);

super.setTailleInitiale(29, 1);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(10);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, 0xE47400, creerPolice_GEN("Roboto", -7.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xE47400, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_ligne mWD_LIB_ligne = new GWDLIB_ligne();
/**
 * Initialise tous les champs de FEN_Main.SC_navigation
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Main.SC_navigation
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_col.initialiserObjet();
super.ajouter("LIB_col", mWD_LIB_col);
mWD_IMG_compte.initialiserObjet();
super.ajouter("IMG_compte", mWD_IMG_compte);
mWD_LIB_plus.initialiserObjet();
super.ajouter("LIB_plus", mWD_LIB_plus);
mWD_IMG_compte1.initialiserObjet();
super.ajouter("IMG_compte1", mWD_IMG_compte1);
mWD_LIB_dep.initialiserObjet();
super.ajouter("LIB_dep", mWD_LIB_dep);
mWD_IMG_compte2.initialiserObjet();
super.ajouter("IMG_compte2", mWD_IMG_compte2);
mWD_LIB_vers.initialiserObjet();
super.ajouter("LIB_vers", mWD_LIB_vers);
mWD_IMG_compte3.initialiserObjet();
super.ajouter("IMG_compte3", mWD_IMG_compte3);
mWD_LIB_texte3.initialiserObjet();
super.ajouter("LIB_texte3", mWD_LIB_texte3);
mWD_LIB_ligne.initialiserObjet();
super.ajouter("LIB_ligne", mWD_LIB_ligne);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813272684968182598l);

super.setChecksum("719424288");

super.setNom("SC_navigation");

super.setType(40);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setNumTab(1);

super.setEtatInitial(0);

super.setPositionInitiale(0, 503);

super.setTailleInitiale(320, 65);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(9, 1000, 1000, 1000, 1000, 0);

super.setPersistant(false);

super.setTailleUtile(320, 65);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSC_navigation mWD_SC_navigation;

/**
 * LIB_non_plus
 */
class GWDLIB_non_plus extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Main.LIB_non_plus
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813485015432092518l);

super.setChecksum("885154421");

super.setNom("LIB_non_plus");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(3, 153);

super.setTailleInitiale(315, 20);

super.setPlan(4);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_non_plus mWD_LIB_non_plus;

/**
 * LIB_num
 */
class GWDLIB_num extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_Main.LIB_num
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813485642503689888l);

super.setChecksum("891526721");

super.setNom("LIB_num");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(101, 181);

super.setTailleInitiale(119, 20);

super.setPlan(4);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xC0C0C0, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_num mWD_LIB_num;

/**
 * Traitement: Déclarations globales de FEN_Main
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCÉDURE MaFenêtre()
//MAP:26fffa580364834e:00000000:1:FEN_Main:com.masociete.sebene_money.wdgen.GWDFFEN_Main:Déclarations globales de FEN_Main
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}




/**
 * Traitement: Fin d'initialisation de FEN_Main
 */
public void init()
{
super.init();

// MoiMême..Plan = 1
//MAP:26fffa580364834e:00000022:1:FEN_Main:com.masociete.sebene_money.wdgen.GWDFFEN_Main:Fin d'initialisation de FEN_Main
// MoiMême..Plan = 1
//MAP:26fffa580364834e:00000022:1:FEN_Main:com.masociete.sebene_money.wdgen.GWDFFEN_Main:Fin d'initialisation de FEN_Main
WDContexte.getMoiMeme().setProp(EWDPropriete.PROP_PLAN,1);

// LIB_nom_utilisateur = "Salut" + " " + gsPrenom
//MAP:26fffa580364834e:00000022:3:FEN_Main:com.masociete.sebene_money.wdgen.GWDFFEN_Main:Fin d'initialisation de FEN_Main
mWD_SC_accueil.mWD_LIB_nom_utilisateur.setValeur(new WDChaineU("Salut ").opPlus(GWDPSebene_Money.getInstance().vWD_gsPrenom));

// LIB_insigne =  Gauche(gsPrenom,1) +Gauche(gsNom,1)
//MAP:26fffa580364834e:00000022:4:FEN_Main:com.masociete.sebene_money.wdgen.GWDFFEN_Main:Fin d'initialisation de FEN_Main
mWD_LIB_insigne.setValeur(WDAPIChaine.gauche(GWDPSebene_Money.getInstance().vWD_gsPrenom,1).opPlus(WDAPIChaine.gauche(GWDPSebene_Money.getInstance().vWD_gsNom,1)));

// LIB_insigne1 =  Gauche(gsPrenom,1) +Gauche(gsNom,1)
//MAP:26fffa580364834e:00000022:5:FEN_Main:com.masociete.sebene_money.wdgen.GWDFFEN_Main:Fin d'initialisation de FEN_Main
mWD_SC_accueil.mWD_LIB_insigne1.setValeur(WDAPIChaine.gauche(GWDPSebene_Money.getInstance().vWD_gsPrenom,1).opPlus(WDAPIChaine.gauche(GWDPSebene_Money.getInstance().vWD_gsNom,1)));

// LIB_non_plus = gsPrenom + " " + gsNom
//MAP:26fffa580364834e:00000022:6:FEN_Main:com.masociete.sebene_money.wdgen.GWDFFEN_Main:Fin d'initialisation de FEN_Main
mWD_LIB_non_plus.setValeur(GWDPSebene_Money.getInstance().vWD_gsPrenom.opPlus(" ").opPlus(GWDPSebene_Money.getInstance().vWD_gsNom));

// LIB_num = gsNum
//MAP:26fffa580364834e:00000022:7:FEN_Main:com.masociete.sebene_money.wdgen.GWDFFEN_Main:Fin d'initialisation de FEN_Main
mWD_LIB_num.setValeur(GWDPSebene_Money.getInstance().vWD_gsNum);

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Main
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_SC_accueil = new GWDSC_accueil();
mWD_ZM_Menu = new GWDZM_Menu();
mWD_LIB_tete = new GWDLIB_tete();
mWD_LIB_insigne = new GWDLIB_insigne();
mWD_SC_navigation = new GWDSC_navigation();
mWD_LIB_non_plus = new GWDLIB_non_plus();
mWD_LIB_num = new GWDLIB_num();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Main
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2810239948423463758l);

super.setChecksum("717228847");

super.setNom("FEN_Main");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xF4F0EF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 568);

super.setTitre("Main");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(3);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0x68635F);

super.setCouleurBarreSysteme(0xFF000001);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Main
////////////////////////////////////////////////////////////////////////////
mWD_SC_accueil.initialiserObjet();
super.ajouter("SC_accueil", mWD_SC_accueil);
mWD_ZM_Menu.initialiserObjet();
super.ajouter("ZM_Menu", mWD_ZM_Menu);
mWD_LIB_tete.initialiserObjet();
super.ajouter("LIB_tete", mWD_LIB_tete);
mWD_LIB_insigne.initialiserObjet();
super.ajouter("LIB_insigne", mWD_LIB_insigne);
mWD_SC_navigation.initialiserObjet();
super.ajouter("SC_navigation", mWD_SC_navigation);
mWD_LIB_non_plus.initialiserObjet();
super.ajouter("LIB_non_plus", mWD_LIB_non_plus);
mWD_LIB_num.initialiserObjet();
super.ajouter("LIB_num", mWD_LIB_num);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}

public WDProjet getProjet()
{
return GWDPSebene_Money.getInstance();
}

public IWDEnsembleElement getEnsemble()
{
return GWDPSebene_Money.getInstance();
}
public int getModeContexteHF()
{
return 1;
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 0;
}
/**
* Retourne vrai si la fenêtre est maximisée, faux sinon.
*/
public boolean isMaximisee()
{
return true;
}
/**
* Retourne vrai si la fenêtre a une barre de titre, faux sinon.
*/
public boolean isAvecBarreDeTitre()
{
return false;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 0;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return true;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isThemeDark()
{
return false;
}
/**
* Retourne vrai si l'option de masquage automatique de l'ActionBar lorsqu'on scrolle dans un champ de la fenêtre a été activée.
*/
public boolean isMasquageAutomatiqueActionBar()
{
return false;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPSebene_Money.getInstance().mWD_FEN_Main;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "250 PHOENIX#WM";
}
}
