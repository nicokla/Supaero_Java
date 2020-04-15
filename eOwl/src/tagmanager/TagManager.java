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
*  Chaque utilisateur possède un (et un seul)  <code>TagManager</code>.
*  <code>TagManager</code> permet de gérer l'ensemble des arbres de l'utilisateur. 
*  C'est à dire son arbre personnel et les arbres des serveurs connus.
*  <p>
*  <code>TagManager</code> permet de créer un <code>Tree</code> lors de la première utilisation du logiciel et de sauvegarder et charger les <code>Tree</code>, <code>Tag</code> et <code>File</code> par la suite.
*  Au démarrage du logiciel, il va charger les arbres enregistrés et faire une campagne de mise à jour pour les arbres des serveurs connus, sauvegardés en local.
*  Les mises à jour seront effectuées avec des requêtes de type <code>AskDate</code> et <code>AskTree</code>.
*  <p>
*  <code>TagManager</code> permet aussi de parcourir le dossier des fichiers du serveur au lancement du programme et sur demande de l'utilisateur pour effectuer la mise à jour des fichiers.
*  <p>
*  Enfin, il sert d'intermédiaire entre les arbres, le client et le serveur. Il reçoit les requêtes, effectue les recherches dans les arbres et renvoie les résultats sous forme de <code>Results</code>.
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
	 *Créer une nouvelle instance de <code>TagManager</code>.
	 *@param cuser
	 *	String, nom de l'utilisateur.
	 *
	*/
	public TagManager(String user) {
	
	}
	
	/** 
	 * <code>updateFile</code> permet de faire une mise à jour des fichiers <code>File</code> du serveur de l'utilisateur.
	 * @param oldMap
	 * 		HashMap<String, File>, la liste des fichiers de l'utilisateur, qui est donnée par l'arbre de l'utilisateur. Elle doit être mise à jour.
	 * @param listFile
	 * 		ArrayList<String>, la liste des fichiers effectivement présents dans le répertoire du serveur de l'utilisateur.
	 * 		Elle est générée par la méthode browseDirectory du serveur.
	 * 
	 * <code>updateFile</code> compare les noms du HashMap avec l'ArrayList et supprime les objets <code>File</code> dont les fichiers ont été supprimés du répertoire.
	 * Il crée les objets <code>File</code> des nouveaux fichiers du répertoire. Par défaut, un changement de nom d'un des fichiers se traduit par la suppression du <code>File</code> avec l'ancien nom et la création du <code>File</code> du fichier renommé.
	*/
	public void updateFile(HashMap<String, File> oldMap, ArrayList<String> listFile) {
	
	}
	
	/** 
	 * <code>updateTree</code> permet de faire la mise à jour d'un arbre <code>Tree</code> de l'utilisateur.
	 * Il s'agit d'un arbres d'un serveur connu, enregistré en local et non de l'arbre personnel de l'utilisateur.
	 * Cette méthode permet à l'utilisateur d'ajouter ses propres étiquettes sur l'arbre d'un serveur connu (stockés en local) et de mettre à jour cet arbre sans perdre ses étiquettes personnelles.
	 * Dans le cas où la réponse <code>AskDate</code> donne un résultats "false", l'arbre du serveur distant à été modifié par rapport à sa version stockée en local. Il y a donc envoi d'une requète Dans le cas où la réponse <code>AskTree</code> pour que le serveur retourne la dernière version de son arbre.
	 * L'ancien arbre et le nouveau seront alors comparés.
	 * @param oldTree
	 * 		Tree, l'arbre à mettre à jour.
	 * @param newTree
	 * 		Tree, le nouvel arbre, envoyé par le serveur distants. 
	 * <p>
	 * Après comparaison, c'est l'ancien arbre qui est modifié, le nouvel arbre ne sert plus.
	 * Lors de la comparaison, les fichiers qui ne sont plus dans le nouvel arbre (par rapport à l'ancien) sont supprimés de l'ancien arbre.
	 * Les étiquettes qui ont été ajoutées sur le nouvel arbre sont ajoutées également à l'ancien. 
	 * En cas de déplacement d'étiquettes sur le nouvel arbre, les étiquettes sont aussi déplacées sur l'ancien.
	 * 
	 * Pour ne pas supprimer les étiquettes personnelles de l'utilisateur, seules les étiquettes de l'ancien arbre qui ne sont liées à aucun fichier sont supprimées.
	
	*/
	public void updateTree(Tree oldTree, Tree newTree) {
	
	}
	
	/** 
	 * <code>catchTree</code> renvoie à arbre connaissant son nom.
	 * @return un <code>Tree</code> dont le nom est celui passé en paramètre.
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
	 * <code>loadTree</code> permet de chargé un arbre sauvegardé (via l'interface <code>serializable</code>) lors du démarrage de eOwl.
	*/
	public Tree loadTree(String fileName) {
		return null;
	
	}
	
	/** 
	 * <code>getListTree</code> renvoie la liste des arbres de l'utilisateur (arbre personnel et arbres des serveurs connus).
	 * @return un <code>HashMap<String, Tree></code> qui est la liste des arbres.
	 * La clé du Hashmap est le nom de l'arbre (String), l'élément est l'arbre (Tree).
	*/
	public HashMap<String, Tree> getListTree() {
		return null;
	
	}
	
	/** 
	 * <code>getResults</code> renvoie un résultats <code>Results</code> relatifs à une requête <code>Request</code> passée en paramètre.
	 * @return un <code>Results></code> qui est le résultat de la requête (encore appelée recherche).
	 * 
	 * Il faudra faire une boucle ou un switch sur les différents types de <code>Request</code> pour faire appel aux bonnes méthodes de <code>Tree</code> et générer le type de <code>Results</code> associé au type de la <code>Request</code>.
	*/
	public Results getResults(Request search) {
		return null;
	
	}
	
	/** 
	 * <code>addTree</code> permet d'ajouter un arbre à la liste des arbres des serveurs connus.
	 * Exemple: Lors de la recherche sur serveurs voisins, on récupère de nouvelles adresses de serveurs. On leur demande leur arbre lors de la première connexion à ces serveurs et on l'ajoute à la liste des arbres.
	 * @param newTree
	 * 		Tree, le nouvel arbre à ajouter à la liste.
	*/
	public void addTree(Tree newtree) {
	
	}
}



