package fr.supaero.eowl.results;

import fr.supaero.eowl.tagmanager.File;

/**
*  <b>Classe ResAskFile</b>
*  <p>
*  *  
*  <code>ResAskFile</code> hérite de la classe ResultsData et définit un résultat de la requête de type <code>AskFile</code>.
*  Elle possède le fichier demandé.
*  
*    
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/

public class ResAskFile extends ResultsData implements Results{
	/**
	* Le fichier demandé. 
	*/
	public File resFile;
	
	/** 
	 *Créer une nouvelle instance de <code>ResAskFile</code>.
	 *@param client
	 *	String, nom du client demandeur.
	 *
	*/
	public ResAskFile(String client) {
	
	}

	/** 
	 * <code>setResFile</code> permet de modifier le fichier.
	 * @param newFile
	 * 		File, le fichier correspondant à la requête <code>AskFile</code>.
	*/
	public void setResFile(File newFile) {
	
	}
	
	/** 
	 * <code>getResFile</code> renvoie le fichier correspondant à la requête <code>AskFile</code>.
	 * @return un <code>File<File></code> qui est le fichier demandé (l'objet de type File associé au fichier demandé).
	*/
	public File getResFile() {
		return null;
	
	}
	
}