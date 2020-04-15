package fr.supaero.eowl.results;

import java.util.Date;


/**
*  <b>Classe ResAskDate</b>
*  <p>
*  *  
*  <code>ResAskDate</code> h�rite de la classe ResultsData et d�finit un r�sultat de la requ�te de type <code>AskDate</code>.
*  Elle poss�de la date de derni�re modification d'un arbre.
*  
*    
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/

public class ResAskDate extends ResultsData implements Results{
	/**
	* La date demand�e. 
	*/
	private Date resDate;
	
	/** 
	 *Cr�er une nouvelle instance de <code>ResAskDate</code>.
	 *@param client
	 *	String, nom du client demandeur.
	 *
	*/
	public ResAskDate(String client) {
	
	}
	
	/** 
	 * <code>setResDate</code> permet de modifier la date.
	 * @param newDate
	 * 		Date, la date de derni�re modification d'un arbre, correspondant � la requ�te <code>AskDate</code>.
	*/
	public void setResDate(Date newDate) {
	
	}
	
	/** 
	 * <code>getResDate</code> renvoie la date de derni�re modification d'un arbre, correspondant � la requ�te <code>AskDate</code>.
	 * @return un <code>Date<File></code> la date de derni�re modification d'un arbre.
	*/
	public Date getResDate() {
		return null;
	
	}
	

}
