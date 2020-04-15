package fr.supaero.eowl.request;


/**
*  <b>Classe AskFile</b>
*  <p>
*  
*  
*  <code>AskFile</code> h�rite de la classe RequestData et d�finit une requ�te pour le t�l�chargement d'un fichier dont on connait la pr�sence sur le serveur interrog�.
*   
*  
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/


public class AskFile extends RequestData implements Request{
	/**
	* Nom du fichier demand�. 
	*/
		private String fileName;
			
	/** 
	 *Cr�er une nouvelle instance de <code>AskFile</code>.
	 *<p>
	 *Les attributs de la superclasse <code>RequestData</code> sont fix�s � : 
	 *false pour <code>askOtherServer</code>, car on sait que le fichier est pr�sent sur le serveur interrog�,
	 *"file" pour <code>searchType</code>,
	 *le nom de l'utilisateur (du client) pour <code>clientAsking</code>.
	 *
	 *@param serverToAsk 
	 *	String, nom du serveur � interroger.
	 *@param search 
	 *	String, le nom du fichier � rechercher.
	*/
	public AskFile(String serverToAsk, String search) {
	
	}
	
	/** 
	 * <code>setFileName</code> modifie le mot cl� de la recherche (qui est le nom du fichier demand�).
	 * @param name 
	 * 		String, la nouvelle recherche (nom du fichier demand�).
	*/
	public void setFileName(String name) {
		
	}
	
	/** 
	 * <code>getFileName</code> renvoie le mot cl� de la recherche (qui est le nom du fichier demand�).
	 * @return un <code>String</code> qui est le nom du fichier demand�.
	*/
	public String getFileName() {
		return null;
	
	}
}