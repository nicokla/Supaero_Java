package fr.supaero.eowl.request;


/**
*  <b>Classe YesOrNoSearch</b>
*  <p>
*  
*  
*  <code>YesOrNoSearch</code> hérite de la classe RequestData et définit une requête sur la possession d'une étiquette.
*  La classe "résultat" <code>ResYorN</code>, correspondant à cette requête possède un booléen permettant de savoir si le mot clé de la recherche correspond à un nom d'étiquette sur le serveur interrogé.
*  
*  Cette requête sera utile dans le cas d'une recherche sur des serveurs voisins pour savoir s'ils possèdent ou non l'étiquette recherchée.
*   
*  
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/

public class YesOrNoSearch extends RequestData implements Request{
	/**
	* Mot clé de la recherche (correspond à un nom d'étiquette). 
	*/
	private String search;
	
	/** 
	 *Créer une nouvelle instance de <code>YesOrNoSearch</code>.
	 *<p>
	 *Les attributs de la superclasse <code>RequestData</code> sont fixés à : 
	 *false pour <code>askOtherServer</code>,
	 *"yesOrNo" pour <code>searchType</code>,
	 *le nom de l'utilisateur (du client) pour <code>clientAsking</code>.
	 *
	 *@param serverToAsk 
	 *	String, nom du serveur à interroger.
	 *@param word 
	 *	String, le mot clé de la recherche (sera comparé aux noms des étiquettes).
	*/
	public YesOrNoSearch(String serverToAsk, String word) {
	
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

