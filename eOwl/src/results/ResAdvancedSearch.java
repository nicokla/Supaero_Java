package fr.supaero.eowl.results;

import java.util.ArrayList;

import fr.supaero.eowl.tagmanager.File;

/**
*  <b>Classe ResAdvancedSearch</b>
*  <p>
*  *  
*  <code>ResAdvancedSearch</code> hérite de la classe ResultsData et définit un résultat de la requête de type <code>AdvancedSearch</code>.
*  Elle possède un ArrayList des fichiers correspondant à la recherche avancée.
*  
*    
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/

public class ResAdvancedSearch extends ResultsData implements Results{
	/**
	* ArrayList des fichiers correspondant à la recherche avancée. 
	*/
	private ArrayList<File> listFile;
	
	/** 
	 *Créer une nouvelle instance de <code>ResAdvancedSearch</code>.
	 *@param client
	 *	String, nom du client demandeur.
	 *
	*/
	public ResAdvancedSearch(String client) {
	
	}
	
	/** 
	 * <code>setListFile</code> modifie la liste des fichiers, résultat de la requête <code>AdvancedSearch</code>.
	 * @param newList
	 * 		ArrayList<File>, la liste de fichiers correspondant à la recherche avancée.
	*/
	public void setListFile(ArrayList<File> newList) {
	
	}
	
	/** 
	 * <code>getListFile</code> renvoie la liste des fichiers, résultat de la requête <code>AdvancedSearch</code>.
	 * @return un <code>ArrayList<File></code> qui est la liste des fichiers correspondant à la recherche avancée.
	*/
	public ArrayList<File> getListFile() {
		return null;
	
	}
}
