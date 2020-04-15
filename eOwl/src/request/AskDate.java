package fr.supaero.eowl.request;


/**
*  <b>Classe AskDate</b>
*  <p>
*  
*  
*  <code>AskDate</code> hérite de la classe RequestData et définit une requête portant sur une date. 
*  *  
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/

public class AskDate extends RequestData implements Request {
	
	/**
	 *  
	 *Créer une nouvelle instance de <code>AskDate</code>.
	 *<p>
	 *Seul le nom du serveur à interroger est passé en paramètre.
	 *Les attributs de la superclasse <code>RequestData</code> sont fixés à : 
	 *false pour <code>askOtherServer</code>, 
	 *"date" pour <code>searchType</code>,
	 *le nom de l'utilisateur (du client) pour <code>clientAsking</code>.
	 *
	 *@param serverToAsk 
	 *	String, nom du serveur à interroger.
	*/
	public AskDate(String serverToAsk) {
	
	}
}