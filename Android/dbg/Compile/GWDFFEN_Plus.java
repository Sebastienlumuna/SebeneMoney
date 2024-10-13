/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Plus
 * Date : 13/10/2024 09:30:53
 * Version de wdjava.dll  : 25.0.221.6
 */


package com.masociete.sebene_money.wdgen;


import com.masociete.sebene_money.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Plus extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des groupes de champs de FEN_Plus
////////////////////////////////////////////////////////////////////////////
 public WDGroupe mWD_GR_inscription;
 public WDGroupe mWD_GR_modif_mdp;
 public WDGroupe mWD_GR_profil;

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Plus
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_card
 */
class GWDLIB_card extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Plus.LIB_card
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813316489483527052l);

super.setChecksum("863310165");

super.setNom("LIB_card");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("PROFIL");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 8);

super.setTailleInitiale(304, 38);

super.setPlan(1);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4800000, 0xE47400, creerPolice_GEN("Roboto", -9.000000, 1), 3, 0, 0x0);

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
public GWDLIB_card mWD_LIB_card;

/**
 * IMG_Picto_Amis
 */
class GWDIMG_Picto_Amis extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Plus.IMG_Picto_Amis
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813316489483658139l);

super.setChecksum("863443532");

super.setNom("IMG_Picto_Amis");

super.setType(8);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(14, 16);

super.setTailleInitiale(20, 20);

super.setValeurInitiale("C:\\Mes Projets Mobile\\Sebene-Money\\USER.png");

super.setPlan(1);

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
public GWDIMG_Picto_Amis mWD_IMG_Picto_Amis;

/**
 * SAI_Nomutil
 */
class GWDSAI_Nomutil extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Plus.SAI_Nomutil
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,294,21);
super.setRectCompPrincipal(0,21,294,51);
super.setGroupe(mWD_GR_profil);
super.setQuid(2813316489483920283l);

super.setChecksum("863702940");

super.setNom("SAI_Nomutil");

super.setType(20001);

super.setBulle("");

super.setLibelle("Nom");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(15);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(13, 86);

super.setTailleInitiale(294, 74);

super.setValeurInitiale("");

super.setPlan(1);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setLiaisonFichier("utilisateur", "nomutil");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(1);

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

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(15, 0xE0E0E0, 0x606060, 0xFFFFFF, 2.000000, 2.000000, 1, 1));

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
public GWDSAI_Nomutil mWD_SAI_Nomutil;

/**
 * SAI_Prenomutil
 */
class GWDSAI_Prenomutil extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Plus.SAI_Prenomutil
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,294,21);
super.setRectCompPrincipal(0,21,294,49);
super.setGroupe(mWD_GR_profil);
super.setQuid(2813316489484051355l);

super.setChecksum("863834012");

super.setNom("SAI_Prenomutil");

super.setType(20001);

super.setBulle("");

super.setLibelle("Prénom");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(15);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(13, 180);

super.setTailleInitiale(294, 72);

super.setValeurInitiale("");

super.setPlan(1);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setLiaisonFichier("utilisateur", "prenomutil");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

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

super.setMiseABlancSiZero(true);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4000000, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(15, 0xE0E0E0, 0x606060, 0xFFFFFF, 2.000000, 2.000000, 1, 1));

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
public GWDSAI_Prenomutil mWD_SAI_Prenomutil;

/**
 * SAI_Numt
 */
class GWDSAI_Numt extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Plus.SAI_Numt
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,294,21);
super.setRectCompPrincipal(0,21,294,49);
super.setGroupe(mWD_GR_profil);
super.setQuid(2813316489484182443l);

super.setChecksum("863965100");

super.setNom("SAI_Numt");

super.setType(20001);

super.setBulle("");

super.setLibelle("Téléphone ");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(10);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(13, 264);

super.setTailleInitiale(294, 72);

super.setValeurInitiale("");

super.setPlan(1);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setLiaisonFichier("utilisateur", "numt");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(3);

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

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(15, 0xE0E0E0, 0x606060, 0xFFFFFF, 2.000000, 2.000000, 1, 1));

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
public GWDSAI_Numt mWD_SAI_Numt;

/**
 * BTN_Appliquer
 */
class GWDBTN_Appliquer extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Plus.BTN_Appliquer
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813316489484313515l);

super.setChecksum("864097084");

super.setNom("BTN_Appliquer");

super.setType(4);

super.setBulle("");

super.setLibelle("Appliquer");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 501);

super.setTailleInitiale(304, 48);

super.setPlan(1);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(9, 1000, 1000, 1000, 1000, 0);

super.setNumTab(4);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("C:\\Mes Projets Mobile\\Sebene-Money\\Gabarits\\WM\\250 Phoenix\\Phoenix_Pict_Correct_16_5@dpi1x.png", 0, 1, 1, null, null, null);

super.setStyleLibelleRepos(0xF1000000, creerPolice_GEN("Roboto", -8.000000, 1), 0, 0x0);

super.setStyleLibelleSurvol(0xF1000000, creerPolice_GEN("Roboto", -8.000000, 1), 0, 0x0);

super.setStyleLibelleEnfonce(0xF3800000, creerPolice_GEN("Roboto", -9.000000, 1), 0, 0x0);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(27, 0xF48542, 0x740500, 0xF48542, 6.000000, 6.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(27, 0xF48542, 0x740500, 0xF48542, 6.000000, 6.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(27, 0xE8C6B0, 0x684630, 0xE8C6B0, 6.000000, 6.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Appliquer
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 
//MAP:270ae8710c7623ab:00000012:1:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_phone = new WDChaineU();



// phone est une chaîne
//MAP:270ae8710c7623ab:00000012:2:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer


// phone = Utilisateur.Numt
//MAP:270ae8710c7623ab:00000012:3:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
vWD_phone.setValeur(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("numt"));

// SELON Dialogue("Voulez-vous enregistrer ?")
//MAP:270ae8710c7623ab:00000012:7:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// SELON Dialogue("Voulez-vous enregistrer ?")
//MAP:270ae8710c7623ab:00000012:7:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
WDObjet _WDExpSelon0 = WDAPIDialogue.dialogue(1);
if(_WDExpSelon0.opEgal(1))
{
// 		IF SAI_Numt = phone THEN
//MAP:270ae8710c7623ab:00000012:c:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
if(mWD_SAI_Numt.opEgal(vWD_phone))
{
// 		EcranVersFichier(FEN_Plus,Utilisateur)
//MAP:270ae8710c7623ab:00000012:d:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
WDAPIFenetre.ecranVersFichier(GWDPSebene_Money.getInstance().mWD_FEN_Plus,WDAPIHF.getFichierSansCasseNiAccent("utilisateur"));

// 		HEnregistre(Utilisateur)
//MAP:270ae8710c7623ab:00000012:e:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
WDAPIHF.hEnregistre(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"));

// 		Info("modification effecuté")
//MAP:270ae8710c7623ab:00000012:f:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
WDAPIDialogue.info("modification effecuté");

// 		gsNom = SAI_Nomutil
//MAP:270ae8710c7623ab:00000012:10:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
GWDPSebene_Money.getInstance().vWD_gsNom.setValeur(mWD_SAI_Nomutil);

// 		gsPrenom = SAI_Prenomutil
//MAP:270ae8710c7623ab:00000012:11:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
GWDPSebene_Money.getInstance().vWD_gsPrenom.setValeur(mWD_SAI_Prenomutil);

// 		gsNum = SAI_Numt
//MAP:270ae8710c7623ab:00000012:12:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
GWDPSebene_Money.getInstance().vWD_gsNum.setValeur(mWD_SAI_Numt);

// 		RAZ(GR_profil)
//MAP:270ae8710c7623ab:00000012:13:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
WDAPIDivers.raz(mWD_GR_profil);

}
else
{
// 			HLitRecherchePremier(Utilisateur,Numt,SAI_Numt)
//MAP:270ae8710c7623ab:00000012:16:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"),WDAPIHF.getRubriqueSansCasseNiAccent("numt"),mWD_SAI_Numt);

// 			SI  HTrouve( Utilisateur) ALORS
//MAP:270ae8710c7623ab:00000012:18:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
if(WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("utilisateur")).getBoolean())
{
// 				Erreur("Le numéro existe déjà veiller changer")
//MAP:270ae8710c7623ab:00000012:19:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
WDAPIDialogue.erreur("Le numéro existe déjà veiller changer");

// 				DonneFocus(SAI_Numt)
//MAP:270ae8710c7623ab:00000012:1a:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
WDAPIDivers.donneFocus(mWD_SAI_Numt);

}
else
{
// 				EcranVersFichier(FEN_Plus,Utilisateur)
//MAP:270ae8710c7623ab:00000012:1c:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
WDAPIFenetre.ecranVersFichier(GWDPSebene_Money.getInstance().mWD_FEN_Plus,WDAPIHF.getFichierSansCasseNiAccent("utilisateur"));

// 				HEnregistre(Utilisateur)
//MAP:270ae8710c7623ab:00000012:1d:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
WDAPIHF.hEnregistre(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"));

// 				Info("modification effecuté")
//MAP:270ae8710c7623ab:00000012:1e:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
WDAPIDialogue.info("modification effecuté");

// 				gsNom		= SAI_Nomutil
//MAP:270ae8710c7623ab:00000012:1f:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
GWDPSebene_Money.getInstance().vWD_gsNom.setValeur(mWD_SAI_Nomutil);

// 				gsPrenom	= SAI_Prenomutil
//MAP:270ae8710c7623ab:00000012:20:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
GWDPSebene_Money.getInstance().vWD_gsPrenom.setValeur(mWD_SAI_Prenomutil);

// 				gsNum		= SAI_Numt
//MAP:270ae8710c7623ab:00000012:21:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
GWDPSebene_Money.getInstance().vWD_gsNum.setValeur(mWD_SAI_Numt);

// 				RAZ(GR_profil)
//MAP:270ae8710c7623ab:00000012:22:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
WDAPIDivers.raz(mWD_GR_profil);

}

}

}
else if(_WDExpSelon0.opEgal(2))
{
// 		RETOUR
//MAP:270ae8710c7623ab:00000012:29:FEN_Plus.BTN_Appliquer:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_Appliquer:Clic sur BTN_Appliquer
return;

}

}

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
public GWDBTN_Appliquer mWD_BTN_Appliquer;

/**
 * LIB_mdp
 */
class GWDLIB_mdp extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_Plus.LIB_mdp
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813316618333755627l);

super.setChecksum("864519890");

super.setNom("LIB_mdp");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("CONFIDENTIALITÉ");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 8);

super.setTailleInitiale(304, 38);

super.setPlan(2);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF4800000, 0xE47400, creerPolice_GEN("Roboto", -9.000000, 1), 3, 0, 0x0);

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
public GWDLIB_mdp mWD_LIB_mdp;

/**
 * IMG_Picto_Amis1
 */
class GWDIMG_Picto_Amis1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_Plus.IMG_Picto_Amis1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813316618333886699l);

super.setChecksum("864653242");

super.setNom("IMG_Picto_Amis1");

super.setType(8);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(14, 16);

super.setTailleInitiale(20, 20);

super.setValeurInitiale("C:\\Mes Projets Mobile\\Sebene-Money\\cle1.png");

super.setPlan(2);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(8);

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
public GWDIMG_Picto_Amis1 mWD_IMG_Picto_Amis1;

/**
 * SAI_mot_de_passeactuelle
 */
class GWDSAI_mot_de_passeactuelle extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_Plus.SAI_mot_de_passeactuelle
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,280,21);
super.setRectCompPrincipal(0,21,280,43);
super.setGroupe(mWD_GR_inscription);
super.setGroupe(mWD_GR_modif_mdp);
super.setQuid(2813319276923718668l);

super.setChecksum("869726957");

super.setNom("SAI_mot_de_passeactuelle");

super.setType(20001);

super.setBulle("");

super.setLibelle("Mot de passe actuelle*");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(14, 119);

super.setTailleInitiale(280, 66);

super.setValeurInitiale("");

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setMotDePasse(true);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

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
public GWDSAI_mot_de_passeactuelle mWD_SAI_mot_de_passeactuelle;

/**
 * SAI_mdpnouveau
 */
class GWDSAI_mdpnouveau extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de FEN_Plus.SAI_mdpnouveau
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,280,21);
super.setRectCompPrincipal(0,21,280,43);
super.setGroupe(mWD_GR_inscription);
super.setGroupe(mWD_GR_modif_mdp);
super.setQuid(2813319358528378514l);

super.setChecksum("870008198");

super.setNom("SAI_mdpnouveau");

super.setType(20001);

super.setBulle("");

super.setLibelle("Nouveau Mot de passe *");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(14, 211);

super.setTailleInitiale(280, 66);

super.setValeurInitiale("");

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setMotDePasse(true);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(10);

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
public GWDSAI_mdpnouveau mWD_SAI_mdpnouveau;

/**
 * SAI_confirmation
 */
class GWDSAI_confirmation extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de FEN_Plus.SAI_confirmation
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,280,21);
super.setRectCompPrincipal(0,21,280,43);
super.setGroupe(mWD_GR_inscription);
super.setGroupe(mWD_GR_modif_mdp);
super.setQuid(2813319380003481591l);

super.setChecksum("870274800");

super.setNom("SAI_confirmation");

super.setType(20001);

super.setBulle("");

super.setLibelle("Confirmation ");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(14, 314);

super.setTailleInitiale(280, 66);

super.setValeurInitiale("");

super.setPlan(2);

super.setCadrageHorizontal(0);

super.setMotDePasse(true);

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
public GWDSAI_confirmation mWD_SAI_confirmation;

/**
 * BTN_modif_mdp
 */
class GWDBTN_modif_mdp extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°12 de FEN_Plus.BTN_modif_mdp
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2813319848156206112l);

super.setChecksum("871564991");

super.setNom("BTN_modif_mdp");

super.setType(4);

super.setBulle("");

super.setLibelle("Appliquer");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 512);

super.setTailleInitiale(304, 48);

super.setPlan(2);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(12);

super.setAncrageInitial(9, 1000, 1000, 1000, 1000, 0);

super.setNumTab(8);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("C:\\Mes Projets Mobile\\Sebene-Money\\Gabarits\\WM\\250 Phoenix\\Phoenix_Pict_Correct_16_5@dpi1x.png", 0, 1, 1, null, null, null);

super.setStyleLibelleRepos(0xF1000000, creerPolice_GEN("Roboto", -8.000000, 1), 0, 0x0);

super.setStyleLibelleSurvol(0xF1000000, creerPolice_GEN("Roboto", -8.000000, 1), 0, 0x0);

super.setStyleLibelleEnfonce(0xF3800000, creerPolice_GEN("Roboto", -9.000000, 1), 0, 0x0);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(27, 0xF48542, 0x740500, 0xF48542, 6.000000, 6.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(27, 0xF48542, 0x740500, 0xF48542, 6.000000, 6.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(27, 0xE8C6B0, 0x684630, 0xE8C6B0, 6.000000, 6.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_modif_mdp
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 
//MAP:270aeb7f0ce81420:00000012:1:FEN_Plus.BTN_modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_modif_mdp:Clic sur BTN_modif_mdp
// if SAI_mot_de_passeactuelle = "" et SAI_mdpnouveau = "" et SAI_confirmation = "" THEN
//MAP:270aeb7f0ce81420:00000012:2:FEN_Plus.BTN_modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_modif_mdp:Clic sur BTN_modif_mdp
if(((mWD_SAI_mot_de_passeactuelle.opEgal("") & mWD_SAI_mdpnouveau.opEgal("")) & mWD_SAI_confirmation.opEgal("")))
{
// 	Info("impossible de modifier le mot de passe")
//MAP:270aeb7f0ce81420:00000012:3:FEN_Plus.BTN_modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_modif_mdp:Clic sur BTN_modif_mdp
WDAPIDialogue.info("impossible de modifier le mot de passe");

// 	DonneFocus(SAI_mot_de_passeactuelle)
//MAP:270aeb7f0ce81420:00000012:4:FEN_Plus.BTN_modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_modif_mdp:Clic sur BTN_modif_mdp
WDAPIDivers.donneFocus(mWD_SAI_mot_de_passeactuelle);

}
else
{
// 	if SAI_mot_de_passeactuelle <> "" et  SAI_mdpnouveau = "" ET SAI_confirmation = "" THEN
//MAP:270aeb7f0ce81420:00000012:6:FEN_Plus.BTN_modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_modif_mdp:Clic sur BTN_modif_mdp
if(((mWD_SAI_mot_de_passeactuelle.opDiff("") & mWD_SAI_mdpnouveau.opEgal("")) & mWD_SAI_confirmation.opEgal("")))
{
// 		Info("mettez le nouveau mot de passe")
//MAP:270aeb7f0ce81420:00000012:7:FEN_Plus.BTN_modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_modif_mdp:Clic sur BTN_modif_mdp
WDAPIDialogue.info("mettez le nouveau mot de passe");

// 		DonneFocus(SAI_mdpnouveau)
//MAP:270aeb7f0ce81420:00000012:8:FEN_Plus.BTN_modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_modif_mdp:Clic sur BTN_modif_mdp
WDAPIDivers.donneFocus(mWD_SAI_mdpnouveau);

}
else
{
// 		if SAI_mot_de_passeactuelle = "" ET  SAI_mdpnouveau <> "" ET SAI_confirmation = "" THEN
//MAP:270aeb7f0ce81420:00000012:b:FEN_Plus.BTN_modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_modif_mdp:Clic sur BTN_modif_mdp
if(((mWD_SAI_mot_de_passeactuelle.opEgal("") & mWD_SAI_mdpnouveau.opDiff("")) & mWD_SAI_confirmation.opEgal("")))
{
// 			Info("mettez votre ancien mot de passe")
//MAP:270aeb7f0ce81420:00000012:d:FEN_Plus.BTN_modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_modif_mdp:Clic sur BTN_modif_mdp
WDAPIDialogue.info("mettez votre ancien mot de passe");

// 			RAZ(GR_modif_mdp)
//MAP:270aeb7f0ce81420:00000012:e:FEN_Plus.BTN_modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_modif_mdp:Clic sur BTN_modif_mdp
WDAPIDivers.raz(mWD_GR_modif_mdp);

// 			DonneFocus(SAI_mot_de_passeactuelle)
//MAP:270aeb7f0ce81420:00000012:f:FEN_Plus.BTN_modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_modif_mdp:Clic sur BTN_modif_mdp
WDAPIDivers.donneFocus(mWD_SAI_mot_de_passeactuelle);

}
else
{
// 			if SAI_mot_de_passeactuelle = "" ET  SAI_mdpnouveau = "" ET SAI_confirmation <> "" THEN
//MAP:270aeb7f0ce81420:00000012:13:FEN_Plus.BTN_modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_modif_mdp:Clic sur BTN_modif_mdp
if(((mWD_SAI_mot_de_passeactuelle.opEgal("") & mWD_SAI_mdpnouveau.opEgal("")) & mWD_SAI_confirmation.opDiff("")))
{
// 				Info("mettez votre ancien mot de passe")
//MAP:270aeb7f0ce81420:00000012:14:FEN_Plus.BTN_modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_modif_mdp:Clic sur BTN_modif_mdp
WDAPIDialogue.info("mettez votre ancien mot de passe");

// 				RAZ(GR_modif_mdp)
//MAP:270aeb7f0ce81420:00000012:15:FEN_Plus.BTN_modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_modif_mdp:Clic sur BTN_modif_mdp
WDAPIDivers.raz(mWD_GR_modif_mdp);

// 				DonneFocus(SAI_mot_de_passeactuelle)
//MAP:270aeb7f0ce81420:00000012:16:FEN_Plus.BTN_modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_modif_mdp:Clic sur BTN_modif_mdp
WDAPIDivers.donneFocus(mWD_SAI_mot_de_passeactuelle);

}
else
{
// 				modif_mdp()
//MAP:270aeb7f0ce81420:00000012:18:FEN_Plus.BTN_modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus$GWDBTN_modif_mdp:Clic sur BTN_modif_mdp
fWD_modif_mdp();

}

}

}

}

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
public GWDBTN_modif_mdp mWD_BTN_modif_mdp;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de FEN_Plus
////////////////////////////////////////////////////////////////////////////
//  Résumé : <indiquez ici ce que fait la procédure>
//  Syntaxe :
//  modif_mdp ()
// 
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_modif_mdp()
{
// PROCEDURE modif_mdp()
//MAP:170b7a8e0131e5dd:00070000:d:FEN_Plus.PROCEDURE.modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:modif_mdp
initExecProcLocale("modif_mdp");

try
{
// HLitRecherchePremier(Utilisateur,Numt,gsNum)
//MAP:170b7a8e0131e5dd:00070000:17:FEN_Plus.PROCEDURE.modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:modif_mdp
WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"),WDAPIHF.getRubriqueSansCasseNiAccent("numt"),GWDPSebene_Money.getInstance().vWD_gsNum);

// si HTrouve(Utilisateur) ALORS
//MAP:170b7a8e0131e5dd:00070000:18:FEN_Plus.PROCEDURE.modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:modif_mdp
if(WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("utilisateur")).getBoolean())
{
// 	if Utilisateur.Mdp<>SAI_mot_de_passeactuelle THEN
//MAP:170b7a8e0131e5dd:00070000:19:FEN_Plus.PROCEDURE.modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:modif_mdp
if(WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("mdp").opDiff(mWD_SAI_mot_de_passeactuelle))
{
// 		Info("mot de passe incorrect")
//MAP:170b7a8e0131e5dd:00070000:1a:FEN_Plus.PROCEDURE.modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:modif_mdp
WDAPIDialogue.info("mot de passe incorrect");

// 		DonneFocus(SAI_mot_de_passeactuelle)
//MAP:170b7a8e0131e5dd:00070000:1b:FEN_Plus.PROCEDURE.modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:modif_mdp
WDAPIDivers.donneFocus(mWD_SAI_mot_de_passeactuelle);

// 		RAZ(GR_modif_mdp)
//MAP:170b7a8e0131e5dd:00070000:1c:FEN_Plus.PROCEDURE.modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:modif_mdp
WDAPIDivers.raz(mWD_GR_modif_mdp);

}
else
{
// 		if SAI_mdpnouveau = SAI_mot_de_passeactuelle THEN
//MAP:170b7a8e0131e5dd:00070000:1e:FEN_Plus.PROCEDURE.modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:modif_mdp
if(mWD_SAI_mdpnouveau.opEgal(mWD_SAI_mot_de_passeactuelle))
{
// 			Info("vous devez saisir un nouveau mot de passe different")
//MAP:170b7a8e0131e5dd:00070000:1f:FEN_Plus.PROCEDURE.modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:modif_mdp
WDAPIDialogue.info("vous devez saisir un nouveau mot de passe different");

// 			DonneFocus(SAI_mdpnouveau)
//MAP:170b7a8e0131e5dd:00070000:20:FEN_Plus.PROCEDURE.modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:modif_mdp
WDAPIDivers.donneFocus(mWD_SAI_mdpnouveau);

}
else
{
// 			if SAI_mdpnouveau<>SAI_confirmation THEN
//MAP:170b7a8e0131e5dd:00070000:22:FEN_Plus.PROCEDURE.modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:modif_mdp
if(mWD_SAI_mdpnouveau.opDiff(mWD_SAI_confirmation))
{
// 				Info("mot de passe n'est pas identique")
//MAP:170b7a8e0131e5dd:00070000:23:FEN_Plus.PROCEDURE.modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:modif_mdp
WDAPIDialogue.info("mot de passe n'est pas identique");

}
else
{
// 				EcranVersFichier(FEN_Plus,Utilisateur)
//MAP:170b7a8e0131e5dd:00070000:25:FEN_Plus.PROCEDURE.modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:modif_mdp
WDAPIFenetre.ecranVersFichier(GWDPSebene_Money.getInstance().mWD_FEN_Plus,WDAPIHF.getFichierSansCasseNiAccent("utilisateur"));

// 				Utilisateur.Mdp = SAI_mdpnouveau
//MAP:170b7a8e0131e5dd:00070000:26:FEN_Plus.PROCEDURE.modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:modif_mdp
WDAPIHF.getFichierSansCasseNiAccent("utilisateur").getRubriqueSansCasseNiAccent("mdp").setValeur(mWD_SAI_mdpnouveau);

// 				HEnregistre(Utilisateur)
//MAP:170b7a8e0131e5dd:00070000:27:FEN_Plus.PROCEDURE.modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:modif_mdp
WDAPIHF.hEnregistre(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"));

// 				Info("modification effectué !")
//MAP:170b7a8e0131e5dd:00070000:29:FEN_Plus.PROCEDURE.modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:modif_mdp
WDAPIDialogue.info("modification effectué !");

// 			RAZ(GR_modif_mdp)
//MAP:170b7a8e0131e5dd:00070000:2a:FEN_Plus.PROCEDURE.modif_mdp:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:modif_mdp
WDAPIDivers.raz(mWD_GR_modif_mdp);

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
 * Traitement: Déclarations globales de FEN_Plus
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MaFenêtre()
//MAP:2709667c0448fe85:00000000:1:FEN_Plus:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:Déclarations globales de FEN_Plus
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}




/**
 * Traitement: Fin d'initialisation de FEN_Plus
 */
public void init()
{
super.init();

// 
//MAP:2709667c0448fe85:00000022:1:FEN_Plus:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:Fin d'initialisation de FEN_Plus
// MoiMême..Plan = 1
//MAP:2709667c0448fe85:00000022:2:FEN_Plus:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:Fin d'initialisation de FEN_Plus
WDContexte.getMoiMeme().setProp(EWDPropriete.PROP_PLAN,1);

// HLitRecherchePremier(Utilisateur,Numt,gsnum)
//MAP:2709667c0448fe85:00000022:4:FEN_Plus:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:Fin d'initialisation de FEN_Plus
WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("utilisateur"),WDAPIHF.getRubriqueSansCasseNiAccent("numt"),GWDPSebene_Money.getInstance().vWD_gsNum);

// si HTrouve(Utilisateur) ALORS
//MAP:2709667c0448fe85:00000022:5:FEN_Plus:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:Fin d'initialisation de FEN_Plus
if(WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("utilisateur")).getBoolean())
{
// 	FichierVersEcran(FEN_Plus,Utilisateur)
//MAP:2709667c0448fe85:00000022:6:FEN_Plus:com.masociete.sebene_money.wdgen.GWDFFEN_Plus:Fin d'initialisation de FEN_Plus
WDAPIFenetre.fichierVersEcran(GWDPSebene_Money.getInstance().mWD_FEN_Plus,WDAPIHF.getFichierSansCasseNiAccent("utilisateur"));

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
// Création des champs de la fenêtre FEN_Plus
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_GR_inscription = new WDGroupe();
mWD_GR_modif_mdp = new WDGroupe();
mWD_GR_profil = new WDGroupe();
mWD_LIB_card = new GWDLIB_card();
mWD_IMG_Picto_Amis = new GWDIMG_Picto_Amis();
mWD_SAI_Nomutil = new GWDSAI_Nomutil();
mWD_SAI_Prenomutil = new GWDSAI_Prenomutil();
mWD_SAI_Numt = new GWDSAI_Numt();
mWD_BTN_Appliquer = new GWDBTN_Appliquer();
mWD_LIB_mdp = new GWDLIB_mdp();
mWD_IMG_Picto_Amis1 = new GWDIMG_Picto_Amis1();
mWD_SAI_mot_de_passeactuelle = new GWDSAI_mot_de_passeactuelle();
mWD_SAI_mdpnouveau = new GWDSAI_mdpnouveau();
mWD_SAI_confirmation = new GWDSAI_confirmation();
mWD_BTN_modif_mdp = new GWDBTN_modif_mdp();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Plus
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2812892125103455877l);

super.setChecksum("732820106");

super.setNom("FEN_Plus");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xF4F0EF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 568);

super.setTitre("Plus");

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
// Initialisation des groupes de champs de FEN_Plus
////////////////////////////////////////////////////////////////////////////
mWD_GR_inscription.init("GR_inscription");
ajouter("GR_inscription", mWD_GR_inscription);
mWD_GR_modif_mdp.init("GR_modif_mdp");
ajouter("GR_modif_mdp", mWD_GR_modif_mdp);
mWD_GR_profil.init("GR_profil");
ajouter("GR_profil", mWD_GR_profil);


////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Plus
////////////////////////////////////////////////////////////////////////////
mWD_LIB_card.initialiserObjet();
super.ajouter("LIB_card", mWD_LIB_card);
mWD_IMG_Picto_Amis.initialiserObjet();
super.ajouter("IMG_Picto_Amis", mWD_IMG_Picto_Amis);
mWD_SAI_Nomutil.initialiserObjet();
super.ajouter("SAI_Nomutil", mWD_SAI_Nomutil);
mWD_SAI_Prenomutil.initialiserObjet();
super.ajouter("SAI_Prenomutil", mWD_SAI_Prenomutil);
mWD_SAI_Numt.initialiserObjet();
super.ajouter("SAI_Numt", mWD_SAI_Numt);
mWD_BTN_Appliquer.initialiserObjet();
super.ajouter("BTN_Appliquer", mWD_BTN_Appliquer);
mWD_LIB_mdp.initialiserObjet();
super.ajouter("LIB_mdp", mWD_LIB_mdp);
mWD_IMG_Picto_Amis1.initialiserObjet();
super.ajouter("IMG_Picto_Amis1", mWD_IMG_Picto_Amis1);
mWD_SAI_mot_de_passeactuelle.initialiserObjet();
super.ajouter("SAI_mot_de_passeactuelle", mWD_SAI_mot_de_passeactuelle);
mWD_SAI_mdpnouveau.initialiserObjet();
super.ajouter("SAI_mdpnouveau", mWD_SAI_mdpnouveau);
mWD_SAI_confirmation.initialiserObjet();
super.ajouter("SAI_confirmation", mWD_SAI_confirmation);
mWD_BTN_modif_mdp.initialiserObjet();
super.ajouter("BTN_modif_mdp", mWD_BTN_modif_mdp);

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
return GWDPSebene_Money.getInstance().mWD_FEN_Plus;
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
