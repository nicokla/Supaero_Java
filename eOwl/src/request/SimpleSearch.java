package fr.supaero.eowl.request;


/**
*  <b>Classe SimpleSearch</b>
*  <p>
*    
*  <code>SimpleSearch</code> hérite de la classe RequestData et définit une recherche simple pour obtenir une liste de fichiers.
*  Elle se base sur un seul mot clé qui sera comparé aux noms des étiquettes du serveur interrogé.
*  Par défaut, la recherche avec le mot clé "all" signifie que l'on demande la liste de tous les fichiers du serveur interrogé.
*     
*  
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/
public class SimpleSearch extends RequestData implements Request{
	/**
	* Le mot clé de la recherche. 
	*/
	private String search;
	
	/** 
	 *Créer une nouvelle instance de <code>SimpleSearch</code>.
	 *<p>
	 *Les attributs de la superclasse <code>RequestData</code> sont fixés à : 
	 *"simple" pour <code>searchType</code>,
	 *le nom de l'utilisateur (du client) pour <code>clientAsking</code>.
	 *
	 *@param serverToAsk 
	 *	String, nom du serveur à interroger.
	 *@param askOthers
	 *  Boolean, "True" s'il faut chercher sur les serveurs voisins, "False" sinon.
	 *@param word 
	 *	String, le mot clé de la recherche.
	*/
	public SimpleSearch(String serverToAsk, Boolean askOthers, String word) {
	
	}
	
	/** 
	 * <code>getSearch</code> renvoie le mot clé de la recherche (mot qui sera comparé aux noms des étiquettes).
	 * @return un <code>String</code> qui est le mot clé de la recherche.
	*/
	public String getSearch() {
		return null;
	
	}
	
	/** 
	 * <code>setSearch</code> modifie le mot clé de la recherche (mot qui sera comparé aux noms des étiquettes).
	 * @param word 
	 * 		String, la nouvelle recherche.
	*/
	public void setSearch(String word) {
	
	}
}
