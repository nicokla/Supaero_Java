package fr.supaero.eowl.results;

import java.util.ArrayList;

import fr.supaero.eowl.tagmanager.File;

/**
*  <b>Classe ResSimpleSearch</b>
*  <p>
*  *  
*  <code>ResSimpleSearch</code> hérite de la classe ResultsData et définit un résultat de la requête de type <code>SimpleSearch</code>.
*  Elle possède un ArrayList des fichiers liés à l'étiquette recherchée.
*  
*    
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/
public class ResSimpleSearch extends ResultsData implements Results{
	
	/**
	* ArrayList des fichiers correspondant à l'étiquette recherchée. 
	*/
	private ArrayList<File> listFiles;
	
	/** 
	 *Créer une nouvelle instance de <code>ResSimpleSearch</code>.
	 *@param client
	 *	String, nom du client demandeur.
	 *
	*/
	public ResSimpleSearch(String client) {
	
	}
	
	/** 
	 * <code>setListFile</code> modifie la liste des fichiers correspondant à l'étiquette recherchée (requête <code>SimpleSearch</code>).
	 * @param newList
	 * 		ArrayList<File>, la liste de fichiers correspondant à l'étiquette recherchée.
	*/
	public void setListFile(ArrayList<File> newList) {
	
	}
	
	/** 
	 * <code>getListFile</code> renvoie la liste des fichiers correspondant à l'étiquette recherchée (requête <code>SimpleSearch</code>).
	 * @return un <code>ArrayList<File></code> qui est la liste des fichiers correspondant à l'étiquette recherchée.
	*/
	public ArrayList<File> getListFile() {
		return null;
	
	}

}

