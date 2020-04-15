package fr.supaero.eowl.request;


/**
*  <b>Classe YesOrNoSearch</b>
*  <p>
*  
*  
*  <code>YesOrNoSearch</code> h�rite de la classe RequestData et d�finit une requ�te sur la possession d'une �tiquette.
*  La classe "r�sultat" <code>ResYorN</code>, correspondant � cette requ�te poss�de un bool�en permettant de savoir si le mot cl� de la recherche correspond � un nom d'�tiquette sur le serveur interrog�.
*  
*  Cette requ�te sera utile dans le cas d'une recherche sur des serveurs voisins pour savoir s'ils poss�dent ou non l'�tiquette recherch�e.
*   
*  
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/

public class YesOrNoSearch extends RequestData implements Request{
	/**
	* Mot cl� de la recherche (correspond � un nom d'�tiquette). 
	*/
	private String search;
	
	/** 
	 *Cr�er une nouvelle instance de <code>YesOrNoSearch</code>.
	 *<p>
	 *Les attributs de la superclasse <code>RequestData</code> sont fix�s � : 
	 *false pour <code>askOtherServer</code>,
	 *"yesOrNo" pour <code>searchType</code>,
	 *le nom de l'utilisateur (du client) pour <code>clientAsking</code>.
	 *
	 *@param serverToAsk 
	 *	String, nom du serveur � interroger.
	 *@param word 
	 *	String, le mot cl� de la recherche (sera compar� aux noms des �tiquettes).
	*/
	public YesOrNoSearch(String serverToAsk, String word) {
	
	}
	
	/** 
	 * <code>getSearch</code> renvoie le mot cl� de la recherche (mot qui sera compar� aux noms des �tiquettes).
	 * @return un <code>String</code> qui est le mot cl� de la recherche.
	*/
	public String getSearch() {
		return null;
	
	}
	
	/** 
	 * <code>setSearch</code> modifie le mot cl� de la recherche (mot qui sera compar� aux noms des �tiquettes).
	 * @param word 
	 * 		String, la nouvelle recherche.
	*/
	public void setSearch(String word) {
	
	}
}

