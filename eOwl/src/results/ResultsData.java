package fr.supaero.eowl.results;


/**
*  <b>Classe abstraite ResultsData</b>
*  <p>
*  *  
*  <code>ResultsData</code> permet de factoriser des méthodes communes aux différents types de résultats (Results).
*  Elle ne possède aucune méthode abstraite. 
*  
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/


public abstract class ResultsData implements Results {
	/**
	* Nom du client(utilisateur) qui a envoyé la requête. 
	*/
	private String clientAsking;
	
	
	/** 
	 * <code>setClientAsking</code> modifie le nom du client(utilisateur) qui a envoyé la requête.
	 * @param client 
	 * 		String, le nom du client demandeur.
	*/
	public void setClientAsking(String client) {
	
	}
	
	/** 
	 * <code>getClientAsking</code> renvoie le nom du client(utilisateur) qui a envoyé la requête.
	 * @return un <code>String</code> qui est le nom du client demandeur.
	*/
	public String getClientAsking() {
		return null;
	
	}

	
}
