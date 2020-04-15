package fr.supaero.eowl.request;


/**
*  <b>Classe abstraite RequestData</b>
*  <p>
*  *  
*  <code>RequestData</code> permet de factoriser des méthodes communes aux différents types de recherches (request).
*  Elle ne possède aucune méthode abstraite. 
*  
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/

public abstract class RequestData implements Request {
	/**
	* Nom du serveur à interroger. 
	*/
	private String serverToAsk;
	/**
	* Interroger les serveurs voisins? True or False.
	*/
	private Boolean askOtherServer;
	/**
	* Type de la recherche (simple, advance, date, file, tree, yesOrNo).
	*/
	private String searchType;
	/**
	* Nom du client(utilisateur) qui émet la requête. 
	*/
	private String clientAsking;
	
	
	/** 
	 * <code>getServerName</code> renvoie le nom du serveur interrogé.
	 * @return un <code>String</code> qui est le nom du serveur.
	*/
	public String getServerName() {
		return null;
	
	}
	
	/** 
	 * <code>setServerName</code> modifie le nom du serveur interrogé.
	 * @param name 
	 * 		String, le nom du srveur interrogé.
	*/
	public void setServerName(String name) {
	
	}
	
	/** 
	 * <code>getAskOS</code> renvoie le booléen qui détermine si la recherche doit aussi être menée sur les serveurs voisins.
	 * @return un <code>Boolean</code> qui est "True" s'il faut chercher sur les serveurs voisins, "False" sinon.
	*/
	public Boolean getAskOS() {
		return null;
	
	}
	
	/** 
	 * <code>setAskOS</code> modifie la recherche sur les serveurs voisins.
	 * @param yesOrNo 
	 * 		Boolean, "True" pour rechercher sur les serveurs voisins, "False" sinon.
	*/
	public void setAskOS(Boolean yesOrNo) {
	
	}
	
	/** 
	 * <code>setType</code> modifie le type de la recherche.
	 * @param type 
	 * 		String, le type de la recherche (simple, advance, date, file, tree, yesOrNo).
	*/
	public void setType(String type) {
	
	}
	
	/** 
	 * <code>getType</code> renvoie le type de la recherche.
	 * @return un <code>String</code> qui est le type de la recherche (simple, advance, date, file, tree, yesOrNo).
	*/
	public String getType() {
		return null;
	
	}
	
	/** 
	 * <code>setClientAsking</code> modifie le nom du client(utilisateur) qui envoie la recherche.
	 * @param client 
	 * 		String, le nom du client demandeur.
	*/
	public void setClientAsking(String client) {
	
	}
	/** 
	 * <code>getClientAsking</code> renvoie le nom du client(utilisateur) qui envoie la recherche.
	 * @return un <code>String</code> qui est le nom du client demandeur.
	*/
	public String getClientAsking() {
		return null;
	
	}
}
