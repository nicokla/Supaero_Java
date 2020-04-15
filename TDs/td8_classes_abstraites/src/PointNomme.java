

/**
 * <code>PointNomme</code> decrit un point nomme qui est un point avec un nom.
 *
 * @author <a href="mailto:cregut@enseeiht.fr">Xavier Cregut</a>
 * @version 1.0
 */
public class PointNomme extends Point {

    /** Nom du point nomme */
    private String nom;

    /**
      *  Construire un point a partir de son abscisse, de son ordonnee et de son
      *  nom.
      *  @param	x_	abscisse
      *  @param	y_	ordonnee
      *  @param	nom_	nom
      */
    public PointNomme(double x_, double y_, String nom_, java.awt.Color col) {
        super(x_, y_,col);	// toujours en premiere ligne !
        setNom(nom_);
    }

    /** Nom du point nomme  */
    public /*@ pure @*/ String getNom() {
        return nom;
    }

    /** Changer le nom du point nomme
     *  @param	nom_	le nouveau nom
     */
    public void setNom(String nom_) {
        this.nom = nom_;
    }

    /**
     * <code>toString</code> renvoie un objet de type <code>String</code>
     * qui represente une chaine de caracteres representant le point nomme.
     *
     * @return un objet de type <code>String</code> representant
     *         le point. Pour un point de coordonnees (2,3) et de nom "X", 
     *         cet objet representera la chaine <code>X:(2,3)</code>.
     */
    @Override public String toString() {
        return ("" + getNom() + ":" + super.toString()); // utilisation du toString de Point
    }
}
