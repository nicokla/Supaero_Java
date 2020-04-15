package fr.supaero.figure;

import java.awt.Color;
import afficheur.Afficheur;

/**
 * <code>Figure</code> est une classe abstraite regroupant les proprietes
 * des figures geometriques developpees precedemment.
 *
 * @author <a href="mailto:garion@supaero.fr">Christophe Garion</a>
 * @version 1.0
 */
abstract public class Figure {

    private Color couleur;

    /**
     * Creer un nouvel objet de type <code>Figure</code>.<br>
     * On utilise comme argument un attribut statique de la classe
     * <code>Color</code>, par exemple <code>Color.blue</code>.
     *
     * @param couleur_ la couleur de la figure
     */
    //@ requires couleur_ != null;
    //@ ensures this.getCouleur() == couleur_;
    public Figure(Color couleur_) {
        this.couleur = couleur_;
    }

    /**
     * Acces a la couleur de la figure
     *
     * @return la couleur de la figure
     */
    public /*@ pure @*/ Color getCouleur() {
        return couleur;
    }

    /**
     * Modification de la couleur de la figure
     *
     * @param couleur_ la nouvelle couleur
     */
    //@ requires couleur_ != null;
    //@ ensures this.getCouleur() == couleur_;
    public void setCouleur(Color couleur_) {
        this.couleur=couleur_;
    }

    /**
     * Affichage de la figure vers la sortie console
     */
    public void afficher() {
        System.out.println(this);
    }

    /**
     * <code>toString</code> renvoie une representation de l'objet
     * sous forme de chaine de caracteres.
     *
     * @return une instance de <code>String</code> qui represente l'objet
     */
    abstract public String toString();
    
    /**
     * Translater la figure.
     *
     * @param dx deplacement en x
     * @param dy deplacement en y
     */
    abstract public void translater (double dx, double dy);

    /**
     * <code>dessiner</code> permet de dessiner la figure
     * sur un afficheur.
     *
     * @param a  l'objet de type <code>Afficheur</code> sur lequel
     *           on veut dessiner la figure
     */
    //@ requires e != null;
    abstract public void dessiner(Afficheur a);
}
