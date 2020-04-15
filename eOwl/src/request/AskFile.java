package fr.supaero.eowl.request;


/**
*  <b>Classe AskFile</b>
*  <p>
*  
*  
*  <code>AskFile</code> hérite de la classe RequestData et définit une requête pour le téléchargement d'un fichier dont on connait la présence sur le serveur interrogé.
*   
*  
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/


public class AskFile extends RequestData implements Request{
	/**
	* Nom du fichier demandé. 
	*/
		private String fileName;
			
	/** 
	 *Créer une nouvelle instance de <code>AskFile</code>.
	 *<p>
	 *Les attributs de la superclasse <code>RequestData</code> sont fixés à : 
	 *false pour <code>askOtherServer</code>, car on sait que le fichier est présent sur le serveur interrogé,
	 *"file" pour <code>searchType</code>,
	 *le nom de l'utilisateur (du client) pour <code>clientAsking</code>.
	 *
	 *@param serverToAsk 
	 *	String, nom du serveur à interroger.
	 *@param search 
	 *	String, le nom du fichier à rechercher.
	*/
	public AskFile(String serverToAsk, String search) {
	
	}
	
	/** 
	 * <code>setFileName</code> modifie le mot clé de la recherche (qui est le nom du fichier demandé).
	 * @param name 
	 * 		String, la nouvelle recherche (nom du fichier demandé).
	*/
	public void setFileName(String name) {
		
	}
	
	/** 
	 * <code>getFileName</code> renvoie le mot clé de la recherche (qui est le nom du fichier demandé).
	 * @return un <code>String</code> qui est le nom du fichier demandé.
	*/
	public String getFileName() {
		return null;
	
	}
}