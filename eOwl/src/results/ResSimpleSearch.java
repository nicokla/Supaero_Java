package fr.supaero.eowl.results;

import java.util.ArrayList;

import fr.supaero.eowl.tagmanager.File;

/**
*  <b>Classe ResSimpleSearch</b>
*  <p>
*  *  
*  <code>ResSimpleSearch</code> h�rite de la classe ResultsData et d�finit un r�sultat de la requ�te de type <code>SimpleSearch</code>.
*  Elle poss�de un ArrayList des fichiers li�s � l'�tiquette recherch�e.
*  
*    
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/
public class ResSimpleSearch extends ResultsData implements Results{
	
	/**
	* ArrayList des fichiers correspondant � l'�tiquette recherch�e. 
	*/
	private ArrayList<File> listFiles;
	
	/** 
	 *Cr�er une nouvelle instance de <code>ResSimpleSearch</code>.
	 *@param client
	 *	String, nom du client demandeur.
	 *
	*/
	public ResSimpleSearch(String client) {
	
	}
	
	/** 
	 * <code>setListFile</code> modifie la liste des fichiers correspondant � l'�tiquette recherch�e (requ�te <code>SimpleSearch</code>).
	 * @param newList
	 * 		ArrayList<File>, la liste de fichiers correspondant � l'�tiquette recherch�e.
	*/
	public void setListFile(ArrayList<File> newList) {
	
	}
	
	/** 
	 * <code>getListFile</code> renvoie la liste des fichiers correspondant � l'�tiquette recherch�e (requ�te <code>SimpleSearch</code>).
	 * @return un <code>ArrayList<File></code> qui est la liste des fichiers correspondant � l'�tiquette recherch�e.
	*/
	public ArrayList<File> getListFile() {
		return null;
	
	}

}

