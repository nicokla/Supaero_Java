package fr.supaero.eowl.results;

import fr.supaero.eowl.tagmanager.File;

/**
*  <b>Classe ResAskFile</b>
*  <p>
*  *  
*  <code>ResAskFile</code> h�rite de la classe ResultsData et d�finit un r�sultat de la requ�te de type <code>AskFile</code>.
*  Elle poss�de le fichier demand�.
*  
*    
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/

public class ResAskFile extends ResultsData implements Results{
	/**
	* Le fichier demand�. 
	*/
	public File resFile;
	
	/** 
	 *Cr�er une nouvelle instance de <code>ResAskFile</code>.
	 *@param client
	 *	String, nom du client demandeur.
	 *
	*/
	public ResAskFile(String client) {
	
	}

	/** 
	 * <code>setResFile</code> permet de modifier le fichier.
	 * @param newFile
	 * 		File, le fichier correspondant � la requ�te <code>AskFile</code>.
	*/
	public void setResFile(File newFile) {
	
	}
	
	/** 
	 * <code>getResFile</code> renvoie le fichier correspondant � la requ�te <code>AskFile</code>.
	 * @return un <code>File<File></code> qui est le fichier demand� (l'objet de type File associ� au fichier demand�).
	*/
	public File getResFile() {
		return null;
	
	}
	
}