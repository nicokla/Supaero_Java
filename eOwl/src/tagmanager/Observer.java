package fr.supaero.eowl.tagmanager;

/**
*  <b>Interface Observer</b>
*  <p>
*    
*  <code>Observer</code> permet d'actualiser les <code>File</code>, <code>Tag</code> et <code>Tree</code> lors de modifications sur les étiquettes.
*    
*  @author Bocquet Guillaume & Pertat Adrien
*  @version  1.0 - 14/12/2012
*/

public interface Observer {
	public void update();
}
