/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Projet
 * Classe Android : Sebene-Money
 * Date : 13/10/2024 09:30:53
 * Version de wdjava.dll  : 25.0.221.6
 */


package com.masociete.sebene_money.wdgen;


import com.masociete.sebene_money.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.api.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/





public class GWDPSebene_Money extends WDProjet
{
private static GWDPSebene_Money ms_instance = null;
/**
 * Accès au projet: Sebene-Money
 * Pour accéder au projet à partir de n'importe où: 
 * GWDPSebene_Money.getInstance()
 */
public static GWDPSebene_Money getInstance()
{
return (GWDPSebene_Money) ms_instance;
}

 // FEN_connexion
public GWDFFEN_connexion mWD_FEN_connexion = new GWDFFEN_connexion();
 // accesseur de FEN_connexion
public GWDFFEN_connexion getFEN_connexion()
{
mWD_FEN_connexion.checkOuverture();
return mWD_FEN_connexion;
}

 // FEN_Main
public GWDFFEN_Main mWD_FEN_Main = new GWDFFEN_Main();
 // accesseur de FEN_Main
public GWDFFEN_Main getFEN_Main()
{
mWD_FEN_Main.checkOuverture();
return mWD_FEN_Main;
}

 // FEN_Plus
public GWDFFEN_Plus mWD_FEN_Plus = new GWDFFEN_Plus();
 // accesseur de FEN_Plus
public GWDFFEN_Plus getFEN_Plus()
{
mWD_FEN_Plus.checkOuverture();
return mWD_FEN_Plus;
}


 // Constructeur de la classe GWDPSebene_Money
public GWDPSebene_Money()
{
ms_instance = this;
// Définition des langues du projet
setLangueProjet(new int[] {1}, new int[] {0}, 1, false);

// Palette des couleurs
setPaletteCouleurGabarit(new int[] {0xF48542, 0x313FD2, 0xA6F2, 0x4F900D, 0xA95CF8, 0xB86592, 0xB74A5E, 0xA5A595, 0x654E44, 0x383838, 0x0});
ajouterFenetre("FEN_connexion", mWD_FEN_connexion);
ajouterFenetre("FEN_Main", mWD_FEN_Main);
ajouterFenetre("FEN_Plus", mWD_FEN_Plus);



}

// Code de déclaration de Sebene-Money
public void trtInitProjet()
//  variable pour recuperer l'identité du user
{
// // variable pour recuperer l'identité du user
//MAP:0000000000000000:00030000:1:Sebene-Money:com.masociete.sebene_money.wdgen.GWDPSebene_Money:Initialisation de Sebene-Money
// gsNom		est une chaîne
//MAP:0000000000000000:00030000:2:Sebene-Money:com.masociete.sebene_money.wdgen.GWDPSebene_Money:Initialisation de Sebene-Money
vWD_gsNom = new WDChaineU();

super.ajouterVariableGlobale("gsNom",vWD_gsNom);



// gsPrenom	est une chaîne
//MAP:0000000000000000:00030000:3:Sebene-Money:com.masociete.sebene_money.wdgen.GWDPSebene_Money:Initialisation de Sebene-Money
vWD_gsPrenom = new WDChaineU();

super.ajouterVariableGlobale("gsPrenom",vWD_gsPrenom);



// gsNum 		est une chaîne
//MAP:0000000000000000:00030000:4:Sebene-Money:com.masociete.sebene_money.wdgen.GWDPSebene_Money:Initialisation de Sebene-Money
vWD_gsNum = new WDChaineU();

super.ajouterVariableGlobale("gsNum",vWD_gsNum);



}





////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
static public WDObjet vWD_gsNom = WDVarNonAllouee.ref;
static public WDObjet vWD_gsPrenom = WDVarNonAllouee.ref;
static public WDObjet vWD_gsNum = WDVarNonAllouee.ref;
public String getVersionApplication(){ return "0.0.2.0";}
public String getNomSociete(){ return "seb-conception";}
public String getNomAPK(){ return "Sebene-Money";}
public int getIdNomApplication(){return com.masociete.sebene_money.R.string.app_name;}
public boolean isModeAnsi(){ return false;}
public boolean isAffectationTableauParCopie(){ return true;}
public boolean isAssistanceAutoHFActive(){ return true;}
public String getPackageRacine(){ return "com.masociete.sebene_money";}
public int getIdIconeApplication(){ return com.masociete.sebene_money.R.drawable.capture_d_ecran_2024_09_21_110129_2;}
public int getInfoPlateforme(EWDInfoPlateforme info)
{
switch(info)
{
case DPI_ECRAN : return 160;
case HAUTEUR_BARRE_SYSTEME : return 25;
case HAUTEUR_BARRE_TITRE : return 25;
case HAUTEUR_ACTION_BAR : return 48;
case HAUTEUR_BARRE_BAS : return 0;
case HAUTEUR_ECRAN : return 568;
case LARGEUR_ECRAN : return 320;
default : return 0;
}
}
public boolean isActiveThemeMaterialDesign()
{
return true;
}
////////////////////////////////////////////////////////////////////////////
public String getAdresseEmail() 
{
return "sebconception@gmail.com";
}
public boolean isIgnoreErreurCertificatHTTPS()
{
return false;
}
////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}
public String getNomProjet()
{
return "Sebene-Money";
}
public String getNomConfiguration()
{
return "Application Android";
}
public String getNomAnalyse()
{
return "sebene_money";
}
public String getMotDePasseAnalyse()
{
return "";
}
public boolean isModeGestionFichierMultiUtilisateur()
{
return true;
}
public boolean isCreationAutoFichierDonnees()
{
return true;
}

////////////////////////////////////////////////////////////////////////////
// Formats des masques du projet
////////////////////////////////////////////////////////////////////////////
//Retourne le format des masques de type heures définis au niveau du projet
public String getFormatMasqueHeure()
{
return "HH:MM:SS";
}
public String getSeparateurMillierMonetaire()
{
return " ";
}
public String getSeparateurDecimaleMonetaire()
{
return ",";
}
public String getSymboleMonetaire()
{
return "FC";
}
public int getNombreDecimaleMonetaire()
{
return 2;
}
public String getFichierWDM()
{
return null;
}
protected void declarerRessources()
{
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\SEBENE-MONEY\\FLS01315B.PNG",com.masociete.sebene_money.R.drawable.fls01315b_26, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\SEBENE-MONEY\\CAPTURE D’ÉCRAN 2024-09-21 110147.PNG",com.masociete.sebene_money.R.drawable.capture_d_ecran_2024_09_21_110147_25, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\SEBENE-MONEY\\USER.PNG",com.masociete.sebene_money.R.drawable.user_23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\SEBENE-MONEY\\GABARITS\\WM\\250 PHOENIX\\PHOENIX_PICT_CORRECT_16_5.PNG",com.masociete.sebene_money.R.drawable.phoenix_pict_correct_16_5_22, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\SEBENE-MONEY\\CLE1.PNG",com.masociete.sebene_money.R.drawable.cle1_21, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\SEBENE-MONEY\\SIGN-OUT-ALT.PNG",com.masociete.sebene_money.R.drawable.sign_out_alt_19, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\SEBENE-MONEY\\MONEY-WINGS.PNG",com.masociete.sebene_money.R.drawable.money_wings_18, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\SEBENE-MONEY\\MENU.PNG",com.masociete.sebene_money.R.drawable.menu_17, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\SEBENE-MONEY\\INFO.PNG",com.masociete.sebene_money.R.drawable.info_16, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\SEBENE-MONEY\\HOME.PNG",com.masociete.sebene_money.R.drawable.home_15, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\SEBENE-MONEY\\GABARITS\\WM\\250 PHOENIX\\PHOENIX_BG_SHEET_SELECT.PNG?_3NP_10_10_10_10",com.masociete.sebene_money.R.drawable.phoenix_bg_sheet_select_14_np3_10_10_10_10, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\SEBENE-MONEY\\FERMER.PNG",com.masociete.sebene_money.R.drawable.fermer_13, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\SEBENE-MONEY\\DOCUMENT-SIGNED (2).PNG",com.masociete.sebene_money.R.drawable.document_signed__2__12, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\SEBENE-MONEY\\CREDIT-CARD-BUYER.PNG",com.masociete.sebene_money.R.drawable.credit_card_buyer_11, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\SEBENE-MONEY\\CLOCHE.PNG",com.masociete.sebene_money.R.drawable.cloche_10, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\SEBENE-MONEY\\CLIENT.PNG",com.masociete.sebene_money.R.drawable.client_9, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\SEBENE-MONEY\\CLE.PNG",com.masociete.sebene_money.R.drawable.cle_8, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\SEBENE-MONEY\\CHART-PIE-SIMPLE-CIRCLE-DOLLAR (1).PNG",com.masociete.sebene_money.R.drawable.chart_pie_simple_circle_dollar__1__7, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\SEBENE-MONEY\\CARD.PNG",com.masociete.sebene_money.R.drawable.card_6, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\SEBENE-MONEY\\ANL02067.PNG",com.masociete.sebene_money.R.drawable.anl02067_5, "");
super.ajouterFichierAssocie("Sebene-Money.wda",com.masociete.sebene_money.R.raw.sebene_money_4, "##FILES##/Sebene-Money.wda");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\SEBENE-MONEY\\HEADER.PNG",com.masociete.sebene_money.R.drawable.header_27, "");
}

////////////////////////////////////////////////////////////////////////////
// Dialogues avec Question
////////////////////////////////////////////////////////////////////////////
public WDObjet afficherDialogue(int nIdQuestion, String... params)
{
switch(nIdQuestion)
{
case 0 : return WDAPIDialogue.dialogue("Voulez-vous quitté l'application ?", new String[] {"Oui"} , new int[] {1} , 0, 0, 1, "", 1, com.masociete.sebene_money.R.raw.question_1557456348148979249_1_20, params);
case 1 : return WDAPIDialogue.dialogue("Voulez-vous enregistrer ?", new String[] {"Oui", "Nom"} , new int[] {1, 2} , 0, 1, 1, "", 1, com.masociete.sebene_money.R.raw.question_1613130110827752717_1_24, params);

default: return super.afficherDialogue(nIdQuestion, params);
}
}

////////////////////////////////////////////////////////////////////////////
// Saisies avec Question
////////////////////////////////////////////////////////////////////////////
public WDObjet afficherSaisie(int nIdQuestion, WDObjet variable, String... params)
{
switch(nIdQuestion)
{
case 0 : return WDAPIDialogue.saisie("Voulez-vous quitté l'application ?", new String[] {"Oui"} , new int[] {1} , 0, 0, 1, "", 1, com.masociete.sebene_money.R.raw.question_1557456348148979249_1_20, variable, params);
case 1 : return WDAPIDialogue.saisie("Voulez-vous enregistrer ?", new String[] {"Oui", "Nom"} , new int[] {1, 2} , 0, 1, 1, "", 1, com.masociete.sebene_money.R.raw.question_1613130110827752717_1_24, variable, params);

default: return super.afficherSaisie(nIdQuestion, variable, params);
}
}



/**
 * Lancer de l'application Android
 */
public static class WDLanceur extends WDAbstractLanceur
{
public Class<? extends WDProjet> getClasseProjet()
{
return GWDPSebene_Money.class;
}
}
}
