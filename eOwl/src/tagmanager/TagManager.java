package fr.supaero.eowl.tagmanager;

import fr.supaero.eowl.request.*;
import fr.supaero.eowl.results.*;
import fr.supaero.eowl.client.*;
import fr.supaero.eowl.server.*;
import fr.supaero.eowl.user.*;

import java.util.ArrayList;
import java.util.HashMap;


/**
*  <b>Classe TagManager</b>
*  <p>
*  Chaque utilisateur poss�de un (et un seul)  <code>TagManager</code>.
*  <code>TagManager</code> permet de g�rer l'ensemble des arbres de l'utilisateur. 
*  C'est � dire son arbre personnel et les arbres des serveurs connus.
*  <p>
*  <code>TagManager</code> permet de cr�er un <code>Tree</code> lors de la premi�re utilisation du logiciel et de sauvegarder et charger les <code>Tree</code>, <code>Tag</code> et <code>File</code> par la suite.
*  Au d�marrage du logiciel, il va charger les arbres enregistr�s et faire une campagne de mise � jour pour les arbres des serveurs connus, sauvegard�s en local.
*  Les mises � jour seront effectu�es avec des requ�tes de type <code>AskDate</code> et <code>AskTree</code>.
*  <p>
*  <code>TagManager</code> permet aussi de parcourir le dossier des fichiers du serveur au lancement du programme et sur demande de l'utilisateur pour effectuer la mise � jour des fichiers.
*  <p>
*  Enfin, il sert d'interm�diaire entre les arbres, le client et le serveur. Il re�oit les requ�tes, effectue les recherches dans les arbres et renvoie les r�sultats sous forme de <code>Results</code>.
*  
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/


public class TagManager {
	/**
	* Nom de l'utilisateur
	*/
	private String userName;
	/**
	* Liste des arbres. Il s'agit de l'arbre personnel de l'utilisateur et des arbres des serveurs connus.
	*/
	private HashMap<String, Tree> listTree;
	
	/** 
	 *Cr�er une nouvelle instance de <code>TagManager</code>.
	 *@param cuser
	 *	String, nom de l'utilisateur.
	 *
	*/
	public TagManager(String user) {
	
	}
	
	/** 
	 * <code>updateFile</code> permet de faire une mise � jour des fichiers <code>File</code> du serveur de l'utilisateur.
	 * @param oldMap
	 * 		HashMap<String, File>, la liste des fichiers de l'utilisateur, qui est donn�e par l'arbre de l'utilisateur. Elle doit �tre mise � jour.
	 * @param listFile
	 * 		ArrayList<String>, la liste des fichiers effectivement pr�sents dans le r�pertoire du serveur de l'utilisateur.
	 * 		Elle est g�n�r�e par la m�thode browseDirectory du serveur.
	 * 
	 * <code>updateFile</code> compare les noms du HashMap avec l'ArrayList et supprime les objets <code>File</code> dont les fichiers ont �t� supprim�s du r�pertoire.
	 * Il cr�e les objets <code>File</code> des nouveaux fichiers du r�pertoire. Par d�faut, un changement de nom d'un des fichiers se traduit par la suppression du <code>File</code> avec l'ancien nom et la cr�ation du <code>File</code> du fichier renomm�.
	*/
	public void updateFile(HashMap<String, File> oldMap, ArrayList<String> listFile) {
	
	}
	
	/** 
	 * <code>updateTree</code> permet de faire la mise � jour d'un arbre <code>Tree</code> de l'utilisateur.
	 * Il s'agit d'un arbres d'un serveur connu, enregistr� en local et non de l'arbre personnel de l'utilisateur.
	 * Cette m�thode permet � l'utilisateur d'ajouter ses propres �tiquettes sur l'arbre d'un serveur connu (stock�s en local) et de mettre � jour cet arbre sans perdre ses �tiquettes personnelles.
	 * Dans le cas o� la r�ponse <code>AskDate</code> donne un r�sultats "false", l'arbre du serveur distant � �t� modifi� par rapport � sa version stock�e en local. Il y a donc envoi d'une requ�te Dans le cas o� la r�ponse <code>AskTree</code> pour que le serveur retourne la derni�re version de son arbre.
	 * L'ancien arbre et le nouveau seront alors compar�s.
	 * @param oldTree
	 * 		Tree, l'arbre � mettre � jour.
	 * @param newTree
	 * 		Tree, le nouvel arbre, envoy� par le serveur distants. 
	 * <p>
	 * Apr�s comparaison, c'est l'ancien arbre qui est modifi�, le nouvel arbre ne sert plus.
	 * Lors de la comparaison, les fichiers qui ne sont plus dans le nouvel arbre (par rapport � l'ancien) sont supprim�s de l'ancien arbre.
	 * Les �tiquettes qui ont �t� ajout�es sur le nouvel arbre sont ajout�es �galement � l'ancien. 
	 * En cas de d�placement d'�tiquettes sur le nouvel arbre, les �tiquettes sont aussi d�plac�es sur l'ancien.
	 * 
	 * Pour ne pas supprimer les �tiquettes personnelles de l'utilisateur, seules les �tiquettes de l'ancien arbre qui ne sont li�es � aucun fichier sont supprim�es.
	
	*/
	public void updateTree(Tree oldTree, Tree newTree) {
	
	}
	
	/** 
	 * <code>catchTree</code> renvoie � arbre connaissant son nom.
	 * @return un <code>Tree</code> dont le nom est celui pass� en param�tre.
	*/
	public Tree catchTree(String treeName) {
		return null;
	
	}
	
	/** 
	 * <code>saveTree</code> permet de sauvegarder un arbre (via l'interface <code>serializable</code>) pour pouvoir le recharger lors d'une prochaine utilisation de eOwl.
	*/
	public void saveTree(Tree data) {
	
	}
	
	/** 
	 * <code>loadTree</code> permet de charg� un arbre sauvegard� (via l'interface <code>serializable</code>) lors du d�marrage de eOwl.
	*/
	public Tree loadTree(String fileName) {
		return null;
	
	}
	
	/** 
	 * <code>getListTree</code> renvoie la liste des arbres de l'utilisateur (arbre personnel et arbres des serveurs connus).
	 * @return un <code>HashMap<String, Tree></code> qui est la liste des arbres.
	 * La cl� du Hashmap est le nom de l'arbre (String), l'�l�ment est l'arbre (Tree).
	*/
	public HashMap<String, Tree> getListTree() {
		return null;
	
	}
	
	/** 
	 * <code>getResults</code> renvoie un r�sultats <code>Results</code> relatifs � une requ�te <code>Request</code> pass�e en param�tre.
	 * @return un <code>Results></code> qui est le r�sultat de la requ�te (encore appel�e recherche).
	 * 
	 * Il faudra faire une boucle ou un switch sur les diff�rents types de <code>Request</code> pour faire appel aux bonnes m�thodes de <code>Tree</code> et g�n�rer le type de <code>Results</code> associ� au type de la <code>Request</code>.
	*/
	public Results getResults(Request search) {
		return null;
	
	}
	
	/** 
	 * <code>addTree</code> permet d'ajouter un arbre � la liste des arbres des serveurs connus.
	 * Exemple: Lors de la recherche sur serveurs voisins, on r�cup�re de nouvelles adresses de serveurs. On leur demande leur arbre lors de la premi�re connexion � ces serveurs et on l'ajoute � la liste des arbres.
	 * @param newTree
	 * 		Tree, le nouvel arbre � ajouter � la liste.
	*/
	public void addTree(Tree newtree) {
	
	}
}



