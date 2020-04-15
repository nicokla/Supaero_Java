package fr.supaero.eowl.request;


/**
*  <b>Classe AskDate</b>
*  <p>
*  
*  
*  <code>AskDate</code> h�rite de la classe RequestData et d�finit une requ�te portant sur une date. 
*  *  
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/

public class AskDate extends RequestData implements Request {
	
	/**
	 *  
	 *Cr�er une nouvelle instance de <code>AskDate</code>.
	 *<p>
	 *Seul le nom du serveur � interroger est pass� en param�tre.
	 *Les attributs de la superclasse <code>RequestData</code> sont fix�s � : 
	 *false pour <code>askOtherServer</code>, 
	 *"date" pour <code>searchType</code>,
	 *le nom de l'utilisateur (du client) pour <code>clientAsking</code>.
	 *
	 *@param serverToAsk 
	 *	String, nom du serveur � interroger.
	*/
	public AskDate(String serverToAsk) {
	
	}
}