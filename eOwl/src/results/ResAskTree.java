package fr.supaero.eowl.results;

import fr.supaero.eowl.request.AskTree;
import fr.supaero.eowl.tagmanager.Tree;

/**
*  <b>Classe ResAskTree</b>
*  <p>
*  *  
*  <code>ResAskTree</code> h�rite de la classe ResultsData et d�finit un r�sultat de la requ�te de type <code>AskTree</code>.
*  Elle poss�de l'arbre demand�.
*  
*    
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/

public class ResAskTree extends ResultsData implements Results{
	/**
	* Arbre demand�. 
	*/
	private Tree resTree;
	
	/** 
	 *Cr�er une nouvelle instance de <code>ResAskTree</code>.
	 *@param client
	 *	String, nom du client demandeur.
	 *
	*/
	public ResAskTree(AskTree search) {
	
	}
	
	/** 
	 * <code>setResTree</code> permet de modifier l'arbre.
	 * @param newTree
	 * 		Tree, l'arbre correspondant � la requ�te <code>AskTree</code>.
	*/
	public void setResTree(Tree newTree) {
	
	}
	
	/** 
	 * <code>getResTree</code> renvoie l'arbre correspondant � la requ�te <code>AskTree</code>.
	 * @return un <code>Tree<File></code> qui est l'arbre demand�.
	*/
	public Tree getResTree() {
		return null;
	
	}
}
