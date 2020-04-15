package fr.supaero.eowl.request;


/**
*  <b>Classe AskTree</b>
*  <p>
*  
*  
*  <code>AskFile</code> h�rite de la classe RequestData et d�finit une requ�te pour obtenir l'arbre d'une serveur.
*  Lors de l'ajout d'un serveur � la liste des serveurs connus, son arbre est demand� puis stock� dans le TagManager.
*  Il permettra de faire des recherches en local ou hors connexion. Il permettra aussi � l'utilisateur d'y ajouter ses propres �tiquettes.
*  Cet arbre sera sauvegard� et charg� au d�marrage du logiciel, tout comme l'arbre de l'utilisateur.
*  
*  Cette requ�te sera aussi utilis�e lors de la mise � jour des arbres pour en demander les derni�res versions.
*   
*  
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/

public class AskTree extends RequestData implements Request{
	
	/** 
	 *Cr�er une nouvelle instance de <code>AskTree</code>.
	 *<p>
	 *Les attributs de la superclasse <code>RequestData</code> sont fix�s � : 
	 *false pour <code>askOtherServer</code>,
	 *"tree" pour <code>searchType</code>,
	 *le nom de l'utilisateur (du client) pour <code>clientAsking</code>.
	 *
	 *@param serverToAsk 
	 *	String, nom du serveur � interroger.
	*/	
	public AskTree(String serverToAsk) {
	
	}
}
