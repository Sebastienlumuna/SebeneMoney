/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_connexion
 * Date : 13/10/2024 09:30:53
 * Version de wdjava.dll  : 25.0.221.6
 */


package com.masociete.sebene_money.wdgen;


import com.masociete.sebene_money.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.superchamp.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_connexion extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des groupes de champs de FEN_connexion
////////////////////////////////////////////////////////////////////////////
 public WDGroupe mWD_GR_connexion;
 public WDGroupe mWD_GR_inscription;

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_connexion
////////////////////////////////////////////////////////////////////////////

/**
 * IMG_logo
 */
class GWDIMG_logo extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_connexion.IMG_logo
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2809503765555458474l);

super.setChecksum("1007393972");

super.setNom("IMG_logo");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(8, -40);

super.setTailleInitiale(304, 170);

super.setValeurInitiale("C:\\Mes Projets Mobile\\Sebene-Money\\Capture d’écran 2024-09-21 110147.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

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
public GWDIMG_logo mWD_IMG_logo;

/**
 * IMG_header1
 */
class GWDIMG_header1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_connexion.IMG_header1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2809503765555524010l);

super.setChecksum("1007459508");

super.setNom("IMG_header1");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(23, 328);

super.setTailleInitiale(331, 374);

super.setValeurInitiale("C:\\Mes Projets Mobile\\Sebene-Money\\header.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(5, 1000, 1000, 1000, 1000, 0);

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
public GWDIMG_header1 mWD_IMG_header1;

/**
 * BTN_sing_in
 */
class GWDBTN_sing_in extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_connexion.BTN_sing_in
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2809614699937878504l);

super.setChecksum("679549623");

super.setNom("BTN_sing_in");

super.setType(4);

super.setBulle("");

super.setLibelle("Connexion");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(32, 261);

super.setTailleInitiale(257, 48);

super.setPlan(1);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 500, 500, 0);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 1, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setStyleLibelleEnfonce(0xF3800000, creerPolice_GEN("Roboto", -9.000000, 0), 0, 0xFFFFFF);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xF48542, 2.000000, 2.000000, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xF48542, 2.000000, 2.000000, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0xF48542, 10.000000, 10.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_sing_in
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 
//MAP:26fdc1af018351e8:00000012:1:FEN_connexion.BTN_sing_in:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDBTN_sing_in:Clic sur BTN_sing_in
// FEN_connexion..Plan= 2
//MAP:26fdc1af018351e8:00000012:2:FEN_connexion.BTN_sing_in:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDBTN_sing_in:Clic sur BTN_sing_in
GWDPSebene_Money.getInstance().mWD_FEN_connexion.setProp(EWDPropriete.PROP_PLAN,2);

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
public GWDBTN_sing_in mWD_BTN_sing_in;

/**
 * BTN_sing_up
 */
class GWDBTN_sing_up extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_connexion.BTN_sing_up
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2809615348478745747l);

super.setChecksum("680355321");

super.setNom("BTN_sing_up");

super.setType(4);

super.setBulle("");

super.setLibelle("Inscription");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(32, 325);

super.setTailleInitiale(257, 48);

super.setPlan(1);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(8, 1000, 1000, 500, 500, 0);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 1, 1, null, null, null);

super.setStyleLibelleRepos(0xF5000000, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setStyleLibelleSurvol(0xF5000000, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setStyleLibelleEnfonce(0xF3800000, creerPolice_GEN("Roboto", -9.000000, 0), 0, 0xFFFFFF);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xF4800000, 2.000000, 2.000000, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xF4800000, 2.000000, 2.000000, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0xF1000000, 10.000000, 10.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_sing_up
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// FEN_connexion..Plan= 3
//MAP:26fdc246018f9c93:00000012:1:FEN_connexion.BTN_sing_up:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDBTN_sing_up:Clic sur BTN_sing_up
// FEN_connexion..Plan= 3
//MAP:26fdc246018f9c93:00000012:1:FEN_connexion.BTN_sing_up:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDBTN_sing_up:Clic sur BTN_sing_up
GWDPSebene_Money.getInstance().mWD_FEN_connexion.setProp(EWDPropriete.PROP_PLAN,3);

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
public GWDBTN_sing_up mWD_BTN_sing_up;

/**
 * LIB_ifno
 */
class GWDLIB_ifno extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_connexion.LIB_ifno
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2809629521902696556l);

super.setChecksum("712232174");

super.setNom("LIB_ifno");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(139, 111);

super.setTailleInitiale(160, 28);

super.setPlan(3);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(false);

super.setAltitude(5);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFF, 0xFFFFFFFF, creerPolice_GEN("Roboto", -5.000000, 2), 3, 0, 0x0);

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
public GWDLIB_ifno mWD_LIB_ifno;

/**
 * IMG_SansNom3
 */
class GWDIMG_SansNom3 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_connexion.IMG_SansNom3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2809852967543810592l);

super.setChecksum("679826115");

super.setNom("IMG_SansNom3");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(11, 82);

super.setTailleInitiale(37, 46);

super.setValeurInitiale("C:\\Mes Projets Mobile\\Sebene-Money\\FLS01315b.png");

super.setPlan(2);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

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

/**
 * Traitement: Clic sur IMG_SansNom3
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// FEN_connexion..Plan = 1
//MAP:26fe9a630186aa20:00000012:1:FEN_connexion.IMG_SansNom3:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDIMG_SansNom3:Clic sur IMG_SansNom3
// FEN_connexion..Plan = 1
//MAP:26fe9a630186aa20:00000012:1:FEN_connexion.IMG_SansNom3:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDIMG_SansNom3:Clic sur IMG_SansNom3
GWDPSebene_Money.getInstance().mWD_FEN_connexion.setProp(EWDPropriete.PROP_PLAN,1);

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
public GWDIMG_SansNom3 mWD_IMG_SansNom3;

/**
 * SC_connexion1
 */
class GWDSC_connexion1 extends WDSuperChamp
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_connexion.SC_connexion1
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_connexion
 */
class GWDBTN_connexion extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_connexion.SC_connexion1.BTN_connexion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2809852967544465952l);

super.setChecksum("680479651");

super.setNom("BTN_connexion");

super.setType(4);

super.setBulle("");

super.setLibelle("Se connecter");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(10, 147);

super.setTailleInitiale(280, 48);

super.setPlan(2);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 500, 500, 0);

super.setNumTab(3);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 1, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -7.000000, 0), 0, 0xFFFFFF);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -7.000000, 1), 0, 0xFFFFFF);

super.setStyleLibelleEnfonce(0xF48542, creerPolice_GEN("Roboto", -7.000000, 1), 0, 0xF5800000);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0xF48542, 20.000000, 20.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0xF48542, 20.000000, 20.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0xF1000000, 20.000000, 20.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_connexion ( SC_connexion1 )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// connexion()
//MAP:26fe9a630190aa20:00000012:1:FEN_connexion.SC_connexion1.BTN_connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDSC_connexion1$GWDBTN_connexion:Clic sur BTN_connexion ( SC_connexion1 )
// connexion()
//MAP:26fe9a630190aa20:00000012:1:FEN_connexion.SC_connexion1.BTN_connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDSC_connexion1$GWDBTN_connexion:Clic sur BTN_connexion ( SC_connexion1 )
fWD_connexion();

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
public GWDBTN_connexion mWD_BTN_connexion = new GWDBTN_connexion();

/**
 * SAI_numero
 */
class GWDSAI_numero extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_connexion.SC_connexion1.SAI_numero
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,280,44);
super.setGroupe(mWD_GR_connexion);
super.setGroupe(mWD_GR_inscription);
super.setQuid(2809852967544531488l);

super.setChecksum("680544275");

super.setNom("SAI_numero");

super.setType(20001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(10, 21);

super.setTailleInitiale(280, 48);

super.setValeurInitiale("");

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("5"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 500, 500, 0);

super.setEllipse(0);

super.setIndication("Téléphone");

super.setNumTab(1);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(false);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(27, 0xF1000000, 0xF2000000, 0xFFFFFF, 14.000000, 14.000000, 1, 1));

super.setStyleSaisie(0x0, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8B8680, creerPolice_GEN("Roboto", -7.000000, 2), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(27, 0xF48542, 0x740500, 0xFFFFFFFF, 6.000000, 4.000000, 1, 1), 0x68635F, "", 1);

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
public GWDSAI_numero mWD_SAI_numero = new GWDSAI_numero();

/**
 * SAI_mdp
 */
class GWDSAI_mdp extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_connexion.SC_connexion1.SAI_mdp
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,280,44);
super.setGroupe(mWD_GR_connexion);
super.setGroupe(mWD_GR_inscription);
super.setQuid(2809852967544597024l);

super.setChecksum("680609898");

super.setNom("SAI_mdp");

super.setType(20001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(10, 79);

super.setTailleInitiale(280, 48);

super.setValeurInitiale("");

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setMotDePasse(true);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 500, 500, 0);

super.setEllipse(0);

super.setIndication("Mot de passe");

super.setNumTab(2);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(27, 0xF1000000, 0xF2000000, 0xFFFFFF, 14.000000, 14.000000, 1, 1));

super.setStyleSaisie(0x0, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8B8680, creerPolice_GEN("Roboto", -7.000000, 2), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(27, 0xF48542, 0x740500, 0xFFFFFFFF, 6.000000, 4.000000, 1, 1), 0x68635F, "", 1);

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
public GWDSAI_mdp mWD_SAI_mdp = new GWDSAI_mdp();


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de FEN_connexion.SC_connexion1
////////////////////////////////////////////////////////////////////////////
//  Résumé : <indiquez ici ce que fait la procédure>
//  Syntaxe :
//  connexion ()
// 
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_connexion()
{
// PROCÉDURE connexion()
//MAP:16fe9a64000aaa4f:00070000:d:FEN_connexion.SC_connexion1.PROCEDURE.connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDSC_connexion1:connexion
initExecProcLocale("connexion");

try
{
// SI SAI_numero = "" ET SAI_mdp ="" ALORS
//MAP:16fe9a64000aaa4f:00070000:10:FEN_connexion.SC_connexion1.PROCEDURE.connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDSC_connexion1:connexion
if((mWD_SC_connexion1.mWD_SAI_numero.opEgal("") & mWD_SC_connexion1.mWD_SAI_mdp.opEgal("")))
{
// 	Erreur("saisissez votre identifiant ")
//MAP:16fe9a64000aaa4f:00070000:11:FEN_connexion.SC_connexion1.PROCEDURE.connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDSC_connexion1:connexion
WDAPIDialogue.erreur("saisissez votre identifiant ");

// 	DonneFocus(SAI_numero)
//MAP:16fe9a64000aaa4f:00070000:12:FEN_connexion.SC_connexion1.PROCEDURE.connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDSC_connexion1:connexion
WDAPIDivers.donneFocus(mWD_SC_connexion1.mWD_SAI_numero);

}
else
{
// 	HLitRecherchePremier(Utilisateur,Numt,SAI_numero)
//MAP:16fe9a64000aaa4f:00070000:14:FEN_connexion.SC_connexion1.PROCEDURE.connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDSC_connexion1:connexion
WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"),WDAPIHF.getRubriqueSansCasseNiAccent("numt"),mWD_SC_connexion1.mWD_SAI_numero);

// 	SI  HTrouve( Utilisateur) ALORS
//MAP:16fe9a64000aaa4f:00070000:16:FEN_connexion.SC_connexion1.PROCEDURE.connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDSC_connexion1:connexion
if(WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("utilisateur")).getBoolean())
{
// 		SI Utilisateur.Mdp<>SAI_mdp ALORS
//MAP:16fe9a64000aaa4f:00070000:19:FEN_connexion.SC_connexion1.PROCEDURE.connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDSC_connexion1:connexion
if(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("mdp").opDiff(mWD_SC_connexion1.mWD_SAI_mdp))
{
// 			Erreur("Le numéro ou le mot de passe est incorrect")
//MAP:16fe9a64000aaa4f:00070000:1a:FEN_connexion.SC_connexion1.PROCEDURE.connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDSC_connexion1:connexion
WDAPIDialogue.erreur("Le numéro ou le mot de passe est incorrect");

// 			RAZ(GR_connexion)
//MAP:16fe9a64000aaa4f:00070000:1c:FEN_connexion.SC_connexion1.PROCEDURE.connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDSC_connexion1:connexion
WDAPIDivers.raz(mWD_GR_connexion);

// 			DonneFocus(SAI_nomutil)
//MAP:16fe9a64000aaa4f:00070000:1d:FEN_connexion.SC_connexion1.PROCEDURE.connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDSC_connexion1:connexion
WDAPIDivers.donneFocus(mWD_SAI_nomutil);

}
else
{
// 			gsNom		= Utilisateur.Nomutil
//MAP:16fe9a64000aaa4f:00070000:1f:FEN_connexion.SC_connexion1.PROCEDURE.connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDSC_connexion1:connexion
GWDPSebene_Money.getInstance().vWD_gsNom.setValeur(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("nomutil"));

// 			gsPrenom	= Utilisateur.Prenomutil
//MAP:16fe9a64000aaa4f:00070000:20:FEN_connexion.SC_connexion1.PROCEDURE.connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDSC_connexion1:connexion
GWDPSebene_Money.getInstance().vWD_gsPrenom.setValeur(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("prenomutil"));

// 			gsNum 		= SAI_numero
//MAP:16fe9a64000aaa4f:00070000:21:FEN_connexion.SC_connexion1.PROCEDURE.connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDSC_connexion1:connexion
GWDPSebene_Money.getInstance().vWD_gsNum.setValeur(mWD_SC_connexion1.mWD_SAI_numero);

// 			Utilise(FEN_Main)
//MAP:16fe9a64000aaa4f:00070000:24:FEN_connexion.SC_connexion1.PROCEDURE.connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDSC_connexion1:connexion
WDAPIFenetre.utilise(GWDPSebene_Money.getInstance().mWD_FEN_Main);

}

}
else
{
// 		Erreur("Le nom d'utilisateur ou le mot de passe est incorrect")
//MAP:16fe9a64000aaa4f:00070000:2a:FEN_connexion.SC_connexion1.PROCEDURE.connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDSC_connexion1:connexion
WDAPIDialogue.erreur("Le nom d'utilisateur ou le mot de passe est incorrect");

// 		RAZ(GR_connexion)
//MAP:16fe9a64000aaa4f:00070000:2b:FEN_connexion.SC_connexion1.PROCEDURE.connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDSC_connexion1:connexion
WDAPIDivers.raz(mWD_GR_connexion);

// 		DonneFocus(SAI_numero)
//MAP:16fe9a64000aaa4f:00070000:2c:FEN_connexion.SC_connexion1.PROCEDURE.connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDSC_connexion1:connexion
WDAPIDivers.donneFocus(mWD_SC_connexion1.mWD_SAI_numero);

}

}

}
finally
{
finExecProcLocale();
}

}



/**
 * Initialise tous les champs de FEN_connexion.SC_connexion1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_connexion.SC_connexion1
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_BTN_connexion.initialiserObjet();
super.ajouter("BTN_connexion", mWD_BTN_connexion);
mWD_SAI_numero.initialiserObjet();
super.ajouter("SAI_numero", mWD_SAI_numero);
mWD_SAI_mdp.initialiserObjet();
super.ajouter("SAI_mdp", mWD_SAI_mdp);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2809852967544400416l);

super.setChecksum("680430531");

super.setNom("SC_connexion1");

super.setType(40);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setNumTab(3);

super.setEtatInitial(0);

super.setPositionInitiale(11, 209);

super.setTailleInitiale(301, 212);

super.setValeurInitiale("");

super.setPlan(2);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setPersistant(false);

super.setTailleUtile(301, 212);

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
public GWDSC_connexion1 mWD_SC_connexion1;

/**
 * IMG_SansNom2
 */
class GWDIMG_SansNom2 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_connexion.IMG_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2809853092098808508l);

super.setChecksum("680772476");

super.setNom("IMG_SansNom2");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(7, 72);

super.setTailleInitiale(37, 46);

super.setValeurInitiale("C:\\Mes Projets Mobile\\Sebene-Money\\FLS01315b.png");

super.setPlan(3);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(8);

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

/**
 * Traitement: Clic sur IMG_SansNom2
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// FEN_connexion..Plan = 1
//MAP:26fe9a8001951abc:00000012:1:FEN_connexion.IMG_SansNom2:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDIMG_SansNom2:Clic sur IMG_SansNom2
// FEN_connexion..Plan = 1
//MAP:26fe9a8001951abc:00000012:1:FEN_connexion.IMG_SansNom2:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDIMG_SansNom2:Clic sur IMG_SansNom2
GWDPSebene_Money.getInstance().mWD_FEN_connexion.setProp(EWDPropriete.PROP_PLAN,1);

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
public GWDIMG_SansNom2 mWD_IMG_SansNom2;

/**
 * SAI_nomutil
 */
class GWDSAI_nomutil extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_connexion.SAI_nomutil
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,280,21);
super.setRectCompPrincipal(0,21,280,43);
super.setGroupe(mWD_GR_inscription);
super.setQuid(2809853092099070668l);

super.setChecksum("681031900");

super.setNom("SAI_nomutil");

super.setType(20001);

super.setBulle("");

super.setLibelle("Nom *");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(19, 130);

super.setTailleInitiale(280, 66);

super.setValeurInitiale("");

super.setPlan(3);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setLiaisonFichier("utilisateur", "nomutil");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("7"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("Nom");

super.setNumTab(4);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4000000, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(27, 0xE0E0E0, 0x606060, 0xFFFFFF, 8.000000, 8.000000, 1, 1));

super.setStyleSaisie(0x0, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8B8680, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xF48542, 0x740500, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1), 0x68635F, "", 1);

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
public GWDSAI_nomutil mWD_SAI_nomutil;

/**
 * SAI_prenom
 */
class GWDSAI_prenom extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de FEN_connexion.SAI_prenom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,280,21);
super.setRectCompPrincipal(0,21,280,43);
super.setGroupe(mWD_GR_inscription);
super.setQuid(2809853092099201755l);

super.setChecksum("681162987");

super.setNom("SAI_prenom");

super.setType(20001);

super.setBulle("");

super.setLibelle("Prénom *");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(19, 196);

super.setTailleInitiale(280, 66);

super.setValeurInitiale("");

super.setPlan(3);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setLiaisonFichier("utilisateur", "prenomutil");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("1"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(10);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("Votre Prénom ");

super.setNumTab(5);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4000000, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(27, 0xE0E0E0, 0x606060, 0xFFFFFF, 8.000000, 8.000000, 1, 1));

super.setStyleSaisie(0x0, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8B8680, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xF48542, 0x740500, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1), 0x68635F, "", 1);

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
public GWDSAI_prenom mWD_SAI_prenom;

/**
 * SAI_mot_de_passe
 */
class GWDSAI_mot_de_passe extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de FEN_connexion.SAI_mot_de_passe
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,280,21);
super.setRectCompPrincipal(0,21,280,43);
super.setGroupe(mWD_GR_inscription);
super.setQuid(2809853092099463930l);

super.setChecksum("681425249");

super.setNom("SAI_mot_de_passe");

super.setType(20001);

super.setBulle("");

super.setLibelle("Mot de passe *");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(19, 355);

super.setTailleInitiale(280, 66);

super.setValeurInitiale("");

super.setPlan(3);

super.setCadrageHorizontal(0);

super.setMotDePasse(true);

super.setLiaisonFichier("utilisateur", "mdp");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(11);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(7);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4000000, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(27, 0xE0E0E0, 0x606060, 0xFFFFFF, 8.000000, 8.000000, 1, 1));

super.setStyleSaisie(0x0, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8B8680, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xF48542, 0x740500, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1), 0x68635F, "", 1);

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
public GWDSAI_mot_de_passe mWD_SAI_mot_de_passe;

/**
 * SAI_confirm
 */
class GWDSAI_confirm extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°12 de FEN_connexion.SAI_confirm
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,280,21);
super.setRectCompPrincipal(0,21,280,43);
super.setGroupe(mWD_GR_inscription);
super.setQuid(2809853092099595018l);

super.setChecksum("681556337");

super.setNom("SAI_confirm");

super.setType(20001);

super.setBulle("");

super.setLibelle("Confirmation");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(19, 430);

super.setTailleInitiale(280, 66);

super.setValeurInitiale("");

super.setPlan(3);

super.setCadrageHorizontal(0);

super.setMotDePasse(true);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(12);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(8);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4000000, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(27, 0xE0E0E0, 0x606060, 0xFFFFFF, 8.000000, 8.000000, 1, 1));

super.setStyleSaisie(0x0, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8B8680, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xF48542, 0x740500, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1), 0x68635F, "", 1);

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
public GWDSAI_confirm mWD_SAI_confirm;

/**
 * BTN_inscrire
 */
class GWDBTN_inscrire extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°13 de FEN_connexion.BTN_inscrire
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2809853092099726106l);

super.setChecksum("681688250");

super.setNom("BTN_inscrire");

super.setType(4);

super.setBulle("");

super.setLibelle("S\"inscrire ");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(19, 531);

super.setTailleInitiale(280, 52);

super.setPlan(3);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(13);

super.setAncrageInitial(8, 1000, 1000, 500, 500, 0);

super.setNumTab(9);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 1, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -7.000000, 0), 0, 0xFFFFFF);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -7.000000, 1), 0, 0xFFFFFF);

super.setStyleLibelleEnfonce(0xF48542, creerPolice_GEN("Roboto", -7.000000, 1), 0, 0xF5800000);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0xF48542, 20.000000, 20.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0xF48542, 20.000000, 20.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0xF1000000, 20.000000, 20.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_inscrire
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 
//MAP:26fe9a8001a31b1a:00000012:1:FEN_connexion.BTN_inscrire:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDBTN_inscrire:Clic sur BTN_inscrire
// insciption()
//MAP:26fe9a8001a31b1a:00000012:3:FEN_connexion.BTN_inscrire:com.masociete.sebene_money.wdgen.GWDFFEN_connexion$GWDBTN_inscrire:Clic sur BTN_inscrire
fWD_insciption();

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
public GWDBTN_inscrire mWD_BTN_inscrire;

/**
 * SAI_telephone
 */
class GWDSAI_telephone extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°14 de FEN_connexion.SAI_telephone
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,280,21);
super.setRectCompPrincipal(0,21,280,43);
super.setQuid(2813291063230648026l);

super.setChecksum("816817083");

super.setNom("SAI_telephone");

super.setType(20001);

super.setBulle("");

super.setLibelle("Téléphone ");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(10);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(19, 274);

super.setTailleInitiale(280, 66);

super.setValeurInitiale("");

super.setPlan(3);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setLiaisonFichier("utilisateur", "numt");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("5"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(14);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(6);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(true);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4000000, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(27, 0xE0E0E0, 0x606060, 0xFFFFFF, 5.000000, 6.000000, 1, 1));

super.setStyleSaisie(0x0, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8B8680, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xF48542, 0x740500, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1), 0x68635F, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
public int getModeSaisieAssistee()
{
return 1;
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_telephone mWD_SAI_telephone;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de FEN_connexion
////////////////////////////////////////////////////////////////////////////
//  Résumé : <indiquez ici ce que fait la procédure>
//  Syntaxe :
//  insciption ()
// 
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_insciption()
{
// PROCEDURE insciption()
//MAP:16fdcb7b0026939b:00070000:d:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
initExecProcLocale("insciption");

try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sName = new WDChaineU();

WDObjet vWD_sMdp = new WDChaineU();



// sName est une chaîne
//MAP:16fdcb7b0026939b:00070000:e:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption


// sMdp est une chaîne
//MAP:16fdcb7b0026939b:00070000:f:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption


// if SAI_nomutil  = ""  Et SAI_mot_de_passe = "" et SAI_telephone = "" et SAI_prenom = "" THEN
//MAP:16fdcb7b0026939b:00070000:16:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
if((((mWD_SAI_nomutil.opEgal("") & mWD_SAI_mot_de_passe.opEgal("")) & mWD_SAI_telephone.opEgal("")) & mWD_SAI_prenom.opEgal("")))
{
// 	Erreur("vous devez saisir vos information")
//MAP:16fdcb7b0026939b:00070000:17:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
WDAPIDialogue.erreur("vous devez saisir vos information");

// 	DonneFocus(SAI_nomutil)
//MAP:16fdcb7b0026939b:00070000:18:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
WDAPIDivers.donneFocus(mWD_SAI_nomutil);

// 	RAZ(GR_inscription)
//MAP:16fdcb7b0026939b:00070000:19:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
WDAPIDivers.raz(mWD_GR_inscription);

}
else
{
// 		if SAI_nomutil <> "" et   SAI_telephone = "" et SAI_prenom <> "" et SAI_mot_de_passe = "" THEN
//MAP:16fdcb7b0026939b:00070000:1c:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
if((((mWD_SAI_nomutil.opDiff("") & mWD_SAI_telephone.opEgal("")) & mWD_SAI_prenom.opDiff("")) & mWD_SAI_mot_de_passe.opEgal("")))
{
// 			Info("mettez un mot de passe pour le compte")
//MAP:16fdcb7b0026939b:00070000:1d:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
WDAPIDialogue.info("mettez un mot de passe pour le compte");

// 			DonneFocus(SAI_mot_de_passe)
//MAP:16fdcb7b0026939b:00070000:1e:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
WDAPIDivers.donneFocus(mWD_SAI_mot_de_passe);

}
else
{
// 				if SAI_nomutil ="" ET   SAI_telephone = "" ET SAI_prenom =""  ET SAI_mot_de_passe <> ""     THEN
//MAP:16fdcb7b0026939b:00070000:21:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
if((((mWD_SAI_nomutil.opEgal("") & mWD_SAI_telephone.opEgal("")) & mWD_SAI_prenom.opEgal("")) & mWD_SAI_mot_de_passe.opDiff("")))
{
// 					Info("vous devez saisir vos information")
//MAP:16fdcb7b0026939b:00070000:22:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
WDAPIDialogue.info("vous devez saisir vos information");

// 					RAZ(GR_inscription)
//MAP:16fdcb7b0026939b:00070000:23:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
WDAPIDivers.raz(mWD_GR_inscription);

// 					DonneFocus(SAI_nomutil)
//MAP:16fdcb7b0026939b:00070000:24:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
WDAPIDivers.donneFocus(mWD_SAI_nomutil);

}
else
{
// 						if SAI_nomutil <>"" ET   SAI_telephone = "" ET SAI_prenom <>""  ET SAI_mot_de_passe <> "" THEN
//MAP:16fdcb7b0026939b:00070000:28:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
if((((mWD_SAI_nomutil.opDiff("") & mWD_SAI_telephone.opEgal("")) & mWD_SAI_prenom.opDiff("")) & mWD_SAI_mot_de_passe.opDiff("")))
{
// 							Info("vous devez saisir vos information")
//MAP:16fdcb7b0026939b:00070000:29:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
WDAPIDialogue.info("vous devez saisir vos information");

// 							DonneFocus(SAI_telephone)
//MAP:16fdcb7b0026939b:00070000:2a:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
WDAPIDivers.donneFocus(mWD_SAI_telephone);

}
else
{
// 								IF  SAI_mot_de_passe <> SAI_confirm THEN
//MAP:16fdcb7b0026939b:00070000:2e:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
if(mWD_SAI_mot_de_passe.opDiff(mWD_SAI_confirm))
{
// 									Erreur("Mot de passe non identique")
//MAP:16fdcb7b0026939b:00070000:2f:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
WDAPIDialogue.erreur("Mot de passe non identique");

// 									DonneFocus(SAI_confirm)
//MAP:16fdcb7b0026939b:00070000:30:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
WDAPIDivers.donneFocus(mWD_SAI_confirm);

}
else
{
// 										HLitRecherchePremier(Utilisateur,Numt,SAI_telephone)
//MAP:16fdcb7b0026939b:00070000:34:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"),WDAPIHF.getRubriqueSansCasseNiAccent("numt"),mWD_SAI_telephone);

// 											IF  HTrouve(Utilisateur) THEN
//MAP:16fdcb7b0026939b:00070000:36:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
if(WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("utilisateur")).getBoolean())
{
// 													Erreur("Le numéro existe déjà veiller changer")
//MAP:16fdcb7b0026939b:00070000:37:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
WDAPIDialogue.erreur("Le numéro existe déjà veiller changer");

// 													DonneFocus(SAI_telephone)
//MAP:16fdcb7b0026939b:00070000:38:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
WDAPIDivers.donneFocus(mWD_SAI_telephone);

}
else
{
// 													EcranVersFichier(FEN_connexion,Utilisateur)
//MAP:16fdcb7b0026939b:00070000:3b:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
WDAPIFenetre.ecranVersFichier(GWDPSebene_Money.getInstance().mWD_FEN_connexion,WDAPIHF.getFichierSansCasseNiAccent("utilisateur"));

// 													sName = SAI_numero
//MAP:16fdcb7b0026939b:00070000:3c:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
vWD_sName.setValeur(mWD_SC_connexion1.mWD_SAI_numero);

// 													sMdp = SAI_mot_de_passe
//MAP:16fdcb7b0026939b:00070000:3d:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
vWD_sMdp.setValeur(mWD_SAI_mot_de_passe);

// 													gsNom		= SAI_nomutil
//MAP:16fdcb7b0026939b:00070000:3e:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
GWDPSebene_Money.getInstance().vWD_gsNom.setValeur(mWD_SAI_nomutil);

// 													gsPrenom	= SAI_prenom
//MAP:16fdcb7b0026939b:00070000:3f:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
GWDPSebene_Money.getInstance().vWD_gsPrenom.setValeur(mWD_SAI_prenom);

// 													gsNum = SAI_telephone
//MAP:16fdcb7b0026939b:00070000:40:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
GWDPSebene_Money.getInstance().vWD_gsNum.setValeur(mWD_SAI_telephone);

// 													HAjoute(Utilisateur) 
//MAP:16fdcb7b0026939b:00070000:41:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"));

// 													Info(sName, sMdp)
//MAP:16fdcb7b0026939b:00070000:43:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
WDAPIDialogue.info(vWD_sName.getString(),new String[] {vWD_sMdp.getString()} );

// 													RAZ(GR_inscription)
//MAP:16fdcb7b0026939b:00070000:44:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
WDAPIDivers.raz(mWD_GR_inscription);

// 												Utilise(FEN_Main)
//MAP:16fdcb7b0026939b:00070000:45:FEN_connexion.PROCEDURE.insciption:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:insciption
WDAPIFenetre.utilise(GWDPSebene_Money.getInstance().mWD_FEN_Main);

}

}

}

}

}

}

}
finally
{
finExecProcLocale();
}

}




/**
 * Traitement: Déclarations globales de FEN_connexion
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCÉDURE MaFenêtre()
//MAP:26fd5cca150d31aa:00000000:1:FEN_connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:Déclarations globales de FEN_connexion
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;





}





/**
 * Traitement: Fin d'initialisation de FEN_connexion
 */
public void init()
{
super.init();

// 
//MAP:26fd5cca150d31aa:00000022:1:FEN_connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:Fin d'initialisation de FEN_connexion
// MoiMême..Plan = 1
//MAP:26fd5cca150d31aa:00000022:2:FEN_connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:Fin d'initialisation de FEN_connexion
WDContexte.getMoiMeme().setProp(EWDPropriete.PROP_PLAN,1);

// RAZ(GR_inscription)
//MAP:26fd5cca150d31aa:00000022:3:FEN_connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:Fin d'initialisation de FEN_connexion
WDAPIDivers.raz(mWD_GR_inscription);

// RAZ(GR_connexion)
//MAP:26fd5cca150d31aa:00000022:4:FEN_connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:Fin d'initialisation de FEN_connexion
WDAPIDivers.raz(mWD_GR_connexion);

}





/**
 * Traitement: Fermeture de FEN_connexion
 */
public void fermetureFenetre()
{
super.fermetureFenetre();

// 
//MAP:26fd5cca150d31aa:00000002:1:FEN_connexion:com.masociete.sebene_money.wdgen.GWDFFEN_connexion:Fermeture de FEN_connexion
try
{
}
finally
{
// Générer les appels aux ancêtres
}

}









// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_connexion
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_GR_connexion = new WDGroupe();
mWD_GR_inscription = new WDGroupe();
mWD_IMG_logo = new GWDIMG_logo();
mWD_IMG_header1 = new GWDIMG_header1();
mWD_BTN_sing_in = new GWDBTN_sing_in();
mWD_BTN_sing_up = new GWDBTN_sing_up();
mWD_LIB_ifno = new GWDLIB_ifno();
mWD_IMG_SansNom3 = new GWDIMG_SansNom3();
mWD_SC_connexion1 = new GWDSC_connexion1();
mWD_IMG_SansNom2 = new GWDIMG_SansNom2();
mWD_SAI_nomutil = new GWDSAI_nomutil();
mWD_SAI_prenom = new GWDSAI_prenom();
mWD_SAI_mot_de_passe = new GWDSAI_mot_de_passe();
mWD_SAI_confirm = new GWDSAI_confirm();
mWD_BTN_inscrire = new GWDBTN_inscrire();
mWD_SAI_telephone = new GWDSAI_telephone();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_connexion
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2809503765555392938l);

super.setChecksum("1013994797");

super.setNom("FEN_connexion");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xF4F0EF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 635);

super.setTitre("");

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
// Initialisation des groupes de champs de FEN_connexion
////////////////////////////////////////////////////////////////////////////
mWD_GR_connexion.init("GR_connexion");
ajouter("GR_connexion", mWD_GR_connexion);
mWD_GR_inscription.init("GR_inscription");
ajouter("GR_inscription", mWD_GR_inscription);


////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_connexion
////////////////////////////////////////////////////////////////////////////
mWD_IMG_logo.initialiserObjet();
super.ajouter("IMG_logo", mWD_IMG_logo);
mWD_IMG_header1.initialiserObjet();
super.ajouter("IMG_header1", mWD_IMG_header1);
mWD_BTN_sing_in.initialiserObjet();
super.ajouter("BTN_sing_in", mWD_BTN_sing_in);
mWD_BTN_sing_up.initialiserObjet();
super.ajouter("BTN_sing_up", mWD_BTN_sing_up);
mWD_LIB_ifno.initialiserObjet();
super.ajouter("LIB_ifno", mWD_LIB_ifno);
mWD_IMG_SansNom3.initialiserObjet();
super.ajouter("IMG_SansNom3", mWD_IMG_SansNom3);
mWD_SC_connexion1.initialiserObjet();
super.ajouter("SC_connexion1", mWD_SC_connexion1);
mWD_IMG_SansNom2.initialiserObjet();
super.ajouter("IMG_SansNom2", mWD_IMG_SansNom2);
mWD_SAI_nomutil.initialiserObjet();
super.ajouter("SAI_nomutil", mWD_SAI_nomutil);
mWD_SAI_prenom.initialiserObjet();
super.ajouter("SAI_prenom", mWD_SAI_prenom);
mWD_SAI_mot_de_passe.initialiserObjet();
super.ajouter("SAI_mot_de_passe", mWD_SAI_mot_de_passe);
mWD_SAI_confirm.initialiserObjet();
super.ajouter("SAI_confirm", mWD_SAI_confirm);
mWD_BTN_inscrire.initialiserObjet();
super.ajouter("BTN_inscrire", mWD_BTN_inscrire);
mWD_SAI_telephone.initialiserObjet();
super.ajouter("SAI_telephone", mWD_SAI_telephone);

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
return GWDPSebene_Money.getInstance().mWD_FEN_connexion;
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
