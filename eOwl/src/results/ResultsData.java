package fr.supaero.eowl.results;


/**
*  <b>Classe abstraite ResultsData</b>
*  <p>
*  *  
*  <code>ResultsData</code> permet de factoriser des m�thodes communes aux diff�rents types de r�sultats (Results).
*  Elle ne poss�de aucune m�thode abstraite. 
*  
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/


public abstract class ResultsData implements Results {
	/**
	* Nom du client(utilisateur) qui a envoy� la requ�te. 
	*/
	private String clientAsking;
	
	
	/** 
	 * <code>setClientAsking</code> modifie le nom du client(utilisateur) qui a envoy� la requ�te.
	 * @param client 
	 * 		String, le nom du client demandeur.
	*/
	public void setClientAsking(String client) {
	
	}
	
	/** 
	 * <code>getClientAsking</code> renvoie le nom du client(utilisateur) qui a envoy� la requ�te.
	 * @return un <code>String</code> qui est le nom du client demandeur.
	*/
	public String getClientAsking() {
		return null;
	
	}

	
}
