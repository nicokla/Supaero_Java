package fr.supaero.eowl.results;

import java.util.Date;


/**
*  <b>Classe ResAskDate</b>
*  <p>
*  *  
*  <code>ResAskDate</code> hérite de la classe ResultsData et définit un résultat de la requête de type <code>AskDate</code>.
*  Elle possède la date de dernière modification d'un arbre.
*  
*    
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/

public class ResAskDate extends ResultsData implements Results{
	/**
	* La date demandée. 
	*/
	private Date resDate;
	
	/** 
	 *Créer une nouvelle instance de <code>ResAskDate</code>.
	 *@param client
	 *	String, nom du client demandeur.
	 *
	*/
	public ResAskDate(String client) {
	
	}
	
	/** 
	 * <code>setResDate</code> permet de modifier la date.
	 * @param newDate
	 * 		Date, la date de dernière modification d'un arbre, correspondant à la requête <code>AskDate</code>.
	*/
	public void setResDate(Date newDate) {
	
	}
	
	/** 
	 * <code>getResDate</code> renvoie la date de dernière modification d'un arbre, correspondant à la requête <code>AskDate</code>.
	 * @return un <code>Date<File></code> la date de dernière modification d'un arbre.
	*/
	public Date getResDate() {
		return null;
	
	}
	

}
