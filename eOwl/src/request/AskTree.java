package fr.supaero.eowl.request;


/**
*  <b>Classe AskTree</b>
*  <p>
*  
*  
*  <code>AskFile</code> hérite de la classe RequestData et définit une requête pour obtenir l'arbre d'une serveur.
*  Lors de l'ajout d'un serveur à la liste des serveurs connus, son arbre est demandé puis stocké dans le TagManager.
*  Il permettra de faire des recherches en local ou hors connexion. Il permettra aussi à l'utilisateur d'y ajouter ses propres étiquettes.
*  Cet arbre sera sauvegardé et chargé au démarrage du logiciel, tout comme l'arbre de l'utilisateur.
*  
*  Cette requête sera aussi utilisée lors de la mise à jour des arbres pour en demander les dernières versions.
*   
*  
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/

public class AskTree extends RequestData implements Request{
	
	/** 
	 *Créer une nouvelle instance de <code>AskTree</code>.
	 *<p>
	 *Les attributs de la superclasse <code>RequestData</code> sont fixés à : 
	 *false pour <code>askOtherServer</code>,
	 *"tree" pour <code>searchType</code>,
	 *le nom de l'utilisateur (du client) pour <code>clientAsking</code>.
	 *
	 *@param serverToAsk 
	 *	String, nom du serveur à interroger.
	*/	
	public AskTree(String serverToAsk) {
	
	}
}
