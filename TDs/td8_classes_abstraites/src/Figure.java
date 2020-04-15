/**
 * <code>Figure</code> definit une classe abstraite Figure mathematique dans un
 * plan qui peut etre considere dans un repere cartesien.<BR>
 * Une figure peut etre translate. 
 * On peut connaitre sa couleur
 *
 * @author <a href="mailto:j.herault@supaero.fr">Johan Herault ou <a href="mailto:n.klarsfeld@supaero.fr">Nicolas Klarsfeld</a>
 */

public abstract class Figure {



	protected java.awt.Color couleur;

    /**
     * <code>getColor</code> retourne la couleur
     */

	public java.awt.Color getColor(){

		return this.couleur;

	}

    /**
     * <code>setColor</code> définit la couleur
     */


	public void setColor(java.awt.Color C){

		this.couleur = C;

	}

  /**
     * <code>dessiner</code> dessine la figure
     */

	public abstract void dessiner(afficheur.Afficheur aff);

	public abstract void translater(double dx , double dy);

	public Figure(java.awt.Color col){

		this.couleur = col;

	}

}

