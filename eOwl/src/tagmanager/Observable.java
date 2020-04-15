package fr.supaero.eowl.tagmanager;

/**
*  <b>Interface Observable</b>
*  <p>
*    
*  <code>Observable</code> permet d'inscrire des <code>Observer</code> et de les avertir lors de modifications.
*  Les <code>Observer</code> sont des fichiers ou des arbres.
*    
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/

public interface Observable {
	
	public void warn();
}

