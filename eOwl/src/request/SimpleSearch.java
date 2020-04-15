package fr.supaero.eowl.request;


/**
*  <b>Classe SimpleSearch</b>
*  <p>
*    
*  <code>SimpleSearch</code> h�rite de la classe RequestData et d�finit une recherche simple pour obtenir une liste de fichiers.
*  Elle se base sur un seul mot cl� qui sera compar� aux noms des �tiquettes du serveur interrog�.
*  Par d�faut, la recherche avec le mot cl� "all" signifie que l'on demande la liste de tous les fichiers du serveur interrog�.
*     
*  
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/
public class SimpleSearch extends RequestData implements Request{
	/**
	* Le mot cl� de la recherche. 
	*/
	private String search;
	
	/** 
	 *Cr�er une nouvelle instance de <code>SimpleSearch</code>.
	 *<p>
	 *Les attributs de la superclasse <code>RequestData</code> sont fix�s � : 
	 *"simple" pour <code>searchType</code>,
	 *le nom de l'utilisateur (du client) pour <code>clientAsking</code>.
	 *
	 *@param serverToAsk 
	 *	String, nom du serveur � interroger.
	 *@param askOthers
	 *  Boolean, "True" s'il faut chercher sur les serveurs voisins, "False" sinon.
	 *@param word 
	 *	String, le mot cl� de la recherche.
	*/
	public SimpleSearch(String serverToAsk, Boolean askOthers, String word) {
	
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
