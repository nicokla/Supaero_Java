package fr.supaero.eowl.results;

import fr.supaero.eowl.request.AskTree;
import fr.supaero.eowl.tagmanager.Tree;

/**
*  <b>Classe ResAskTree</b>
*  <p>
*  *  
*  <code>ResAskTree</code> hérite de la classe ResultsData et définit un résultat de la requête de type <code>AskTree</code>.
*  Elle possède l'arbre demandé.
*  
*    
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/

public class ResAskTree extends ResultsData implements Results{
	/**
	* Arbre demandé. 
	*/
	private Tree resTree;
	
	/** 
	 *Créer une nouvelle instance de <code>ResAskTree</code>.
	 *@param client
	 *	String, nom du client demandeur.
	 *
	*/
	public ResAskTree(AskTree search) {
	
	}
	
	/** 
	 * <code>setResTree</code> permet de modifier l'arbre.
	 * @param newTree
	 * 		Tree, l'arbre correspondant à la requête <code>AskTree</code>.
	*/
	public void setResTree(Tree newTree) {
	
	}
	
	/** 
	 * <code>getResTree</code> renvoie l'arbre correspondant à la requête <code>AskTree</code>.
	 * @return un <code>Tree<File></code> qui est l'arbre demandé.
	*/
	public Tree getResTree() {
		return null;
	
	}
}
