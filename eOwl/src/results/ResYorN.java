package fr.supaero.eowl.results;


/**
*  <b>Classe ResYorN</b>
*  <p>
*  
*  
*  <code>ResYorN</code> hérite de la classe ResultsData et définit un résultat de la requête de type <code>YesOrNoSearch</code>.
*  Elle possède un booléen permettant de savoir si le mot clé de la recherche correspond à un nom d'étiquette sur le serveur interrogé.
*  
*    
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/

public class ResYorN extends ResultsData implements Results{
	/**
	* Booléen qui indique si le serveur interrogé possède une étiquette de même nom que le mot clé de la requête. 
	*/
	private Boolean res;
	
	/** 
	 *Créer une nouvelle instance de <code>ResYorN</code>.
	 *@param client
	 *	String, nom du client demandeur.
	 *
	*/
	public ResYorN(String client) {
	
	}
	
	/** 
	 * <code>setRes</code> modifie le résultat correspondant à la requête <code>YesOrNoSearch</code>.
	 * @param newres
	 * 		Boolean, indique si le serveur interrogé possède une étiquette de même nom que le mot clé de la requête.
	*/
	public void setRes(Boolean newres) {
	
	}
	
	/** 
	 * <code>getRes</code> renvoie le résultat correspondant à la requête <code>YesOrNoSearch</code>.
	 * @return un <code>Boolean</code> qui indique si le serveur interrogé possède une étiquette de même nom que le mot clé de la requête.
	*/
	public Boolean getRes() {
		return null;
	
	}
	
}
