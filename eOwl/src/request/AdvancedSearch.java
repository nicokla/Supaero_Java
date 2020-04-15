package fr.supaero.eowl.request;


/**
*  <b>Classe AdvancedSearch</b>
*  <p>
*  
*  
*  <code>AdvancedSearch</code> hérite de la classe RequestData et définit une recherche avancée pour obtenir une liste de fichiers.
*  Elle se base sur deux mots clés et un lien logique AND,OR,NAND (listé dans l'énumération LogicWord).
*     
*  
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/

public class AdvancedSearch extends RequestData implements Request{
	/**
	* Premier mot clé de la recherche avancée. 
	*/
	private String search1;
	/**
	* Second mot clé de la recherche avancée. 
	*/
	private String search2;
	/**
	* Lien logique de la recherche avancée (AND,OR,NAND). 
	*/
	private LogicWord logicWord;
	
	/** 
	 *Créer une nouvelle instance de <code>AdvancedSearch</code>.
	 *<p>
	 *Les attributs de la superclasse <code>RequestData</code> sont fixés à : 
	 *"advanced" pour <code>searchType</code>,
	 *le nom de l'utilisateur (du client) pour <code>clientAsking</code>.
	 *
	 *@param serverToAsk 
	 *	String, nom du serveur à interroger.
	 *@param askOthers
	 *  Boolean, "True" s'il faut chercher sur les serveurs voisins, "False" sinon.
	 *@param word1 
	 *	String, le premier mot clé de la recherche avancée.
	 *@param word2
	 *	String, le second mot clé de la recherche avancée.
	 *@param logic
	 *  LogicWord, le lien logique de la recherche avancée.
	 *
	*/
	public AdvancedSearch(String serverToAsk, Boolean askOthers, String word1, String word2, String logic) {
	
	}
	
	/** 
	 * <code>getSearch2</code> renvoie le premier mot clé de la recherche avancée.
	 * @return un <code>String</code> qui est le premier mot clé de la recherche.
	*/
	public String getSearch1() {
		return null;
	
	}
	
	/** 
	 * <code>getSearch2</code> renvoie le second mot clé de la recherche avancée.
	 * @return un <code>String</code> qui est le second mot clé de la recherche.
	*/
	public String getSearch2() {
		return null;
	
	}
	
	/** 
	 * <code>setSearch1</code> modifie le premier mot clé de la recherche avancée.
	 * @param word 
	 * 		String, le premier mot clé de la recherche avancée.
	*/
	public void setSearch1(String word) {
	
	}
	
	/** 
	 * <code>setSearch2</code> modifie le second mot clé de la recherche avancée.
	 * @param word 
	 * 		String, le second mot clé de la recherche avancée.
	*/
	public void setSearch2(String word) {
	
	}
	
	/** 
	 * <code>getLogicWord</code> renvoie le lien logique de la recherche avancée.
	 * @return un <code>LogicWord</code> qui le lien logique (AND,OR,NAND).
	*/
	public LogicWord getLogicWord() {
		return null;
			
	}
	
	/** 
	 * <code>setLogicWord</code> modifie le lien logique de la recherche avancée.
	 * @param logic 
	 * 		String, le lien logique de la recherche avancée.
	*/
	public void setLogicWord(LogicWord logic) {
	
	}
}
