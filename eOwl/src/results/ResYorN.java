package fr.supaero.eowl.results;


/**
*  <b>Classe ResYorN</b>
*  <p>
*  
*  
*  <code>ResYorN</code> h�rite de la classe ResultsData et d�finit un r�sultat de la requ�te de type <code>YesOrNoSearch</code>.
*  Elle poss�de un bool�en permettant de savoir si le mot cl� de la recherche correspond � un nom d'�tiquette sur le serveur interrog�.
*  
*    
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/

public class ResYorN extends ResultsData implements Results{
	/**
	* Bool�en qui indique si le serveur interrog� poss�de une �tiquette de m�me nom que le mot cl� de la requ�te. 
	*/
	private Boolean res;
	
	/** 
	 *Cr�er une nouvelle instance de <code>ResYorN</code>.
	 *@param client
	 *	String, nom du client demandeur.
	 *
	*/
	public ResYorN(String client) {
	
	}
	
	/** 
	 * <code>setRes</code> modifie le r�sultat correspondant � la requ�te <code>YesOrNoSearch</code>.
	 * @param newres
	 * 		Boolean, indique si le serveur interrog� poss�de une �tiquette de m�me nom que le mot cl� de la requ�te.
	*/
	public void setRes(Boolean newres) {
	
	}
	
	/** 
	 * <code>getRes</code> renvoie le r�sultat correspondant � la requ�te <code>YesOrNoSearch</code>.
	 * @return un <code>Boolean</code> qui indique si le serveur interrog� poss�de une �tiquette de m�me nom que le mot cl� de la requ�te.
	*/
	public Boolean getRes() {
		return null;
	
	}
	
}
