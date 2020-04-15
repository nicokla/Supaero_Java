package fr.supaero.eowl.results;

import java.util.ArrayList;

import fr.supaero.eowl.tagmanager.File;

/**
*  <b>Classe ResAdvancedSearch</b>
*  <p>
*  *  
*  <code>ResAdvancedSearch</code> h�rite de la classe ResultsData et d�finit un r�sultat de la requ�te de type <code>AdvancedSearch</code>.
*  Elle poss�de un ArrayList des fichiers correspondant � la recherche avanc�e.
*  
*    
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/

public class ResAdvancedSearch extends ResultsData implements Results{
	/**
	* ArrayList des fichiers correspondant � la recherche avanc�e. 
	*/
	private ArrayList<File> listFile;
	
	/** 
	 *Cr�er une nouvelle instance de <code>ResAdvancedSearch</code>.
	 *@param client
	 *	String, nom du client demandeur.
	 *
	*/
	public ResAdvancedSearch(String client) {
	
	}
	
	/** 
	 * <code>setListFile</code> modifie la liste des fichiers, r�sultat de la requ�te <code>AdvancedSearch</code>.
	 * @param newList
	 * 		ArrayList<File>, la liste de fichiers correspondant � la recherche avanc�e.
	*/
	public void setListFile(ArrayList<File> newList) {
	
	}
	
	/** 
	 * <code>getListFile</code> renvoie la liste des fichiers, r�sultat de la requ�te <code>AdvancedSearch</code>.
	 * @return un <code>ArrayList<File></code> qui est la liste des fichiers correspondant � la recherche avanc�e.
	*/
	public ArrayList<File> getListFile() {
		return null;
	
	}
}
