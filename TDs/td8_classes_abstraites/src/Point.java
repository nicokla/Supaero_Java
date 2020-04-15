

/**
 * <code>Point</code> definit une classe point mathematique dans un
 * plan qui peut etre considere dans un repere cartesien.<BR>
 * Un point peut etre translate. Sa distance par rapport a un autre
 * point peut etre obtenue.
 *
 * @author <a href="mailto:garion@supaero.fr">Christophe Garion</a>
 * @version 1.0
 */
public class Point extends Figure {

    private double x;

    private double y;

    /**
     * Cree un nouvelle instance de <code>Point</code>.
     *
     * @param x_ un <code>double</code> representant l'abscisse du
     *           point a creer
     * @param y_ un <code>double</code> representant l'ordonnee du
     *           point a creer
     */
    public Point(double x_, double y_, java.awt.Color col) {
        super(col);
	this.x = x_;
	this.y = y_;
    }

    /**
     * <code>getX</code> retourne l'abscisse du point
     *
     * @return un <code>double</code>  qui est l'abscisse du point
     */
    public /*@ pure @*/ double getX() {
	return this.x;
    }

    /**
     * <code>getY</code> retourne l'ordonnee du point
     *
     * @return un <code>double</code> qui est l'ordonnee du point
     */
    public /*@ pure @*/ double getY() {
	return this.y;
    }

    /**
     * <code>setX</code> permet de modifier la valeur de l'abscisse
     * du point.
     *
     * @param x_ un <code>double</code> qui est la nouvelle abscisse
     */
    public void setX(double x_) {
	this.x = x_;
    }

    /**
     * <code>setY</code> permet de modifier la valeur de l'ordonnee
     * du point.
     *
     * @param y_ un <code>double</code> qui est la nouvelle ordonnee
     */
    public void setY(double y_) {
	this.y = y_;
    }
    
    /**
     * <code>translater</code> permet de translater le point.
     *
     * @param dx un <code>double</code> qui represente l'abscisse du
     *           vecteur de translation
     * @param dy un <code>double</code> qui represente l'ordonnee du
     *           vecteur de translation
     */
    //@ ensures this.getX() == \old(this.getX()) + dx;
    //@ ensures this.getY() == \old(this.getY()) + dy;
    public void translater(double dx, double dy) {
	this.x = this.x + dx;
	this.y = this.y + dy;
    }

    /**
     * <code>afficher</code> permet d'afficher les coordonnees du point.
     *
     */
    public void afficher() {
	System.out.println(this);
    }

    /**
     * <code>toString</code> renvoie un objet de type <code>String</code>
     * qui represente une chaine de caracteres representant le point.
     *
     * @return un objet de type <code>String</code> representant
     *         le point. Pour un point de coordonnees (2,3), cet objet 
     *         representera la chaine <code>(2,3)</code>.
     */
    public String toString() {
	return("(" + this.x + "," + this.y + ")");
    }
    
    /**
     * <code>distance</code> permet de calculer la distance entre deux
     * points.
     *
     * @param p un <code>Point</code> qui est l'autre point pour calculer
     *          la distance
     * @return un <code>double</code> qui est la distance entre les deux
     *         point
     */
    //@ requires p != null;
    public /*@ pure @*/ double distance(Point p) {
	return (Math.sqrt((this.x - p.x) * (this.x - p.x) +
			  (this.y - p.y) * (this.y - p.y)));
    }

    /**
     * <code>lt</code> permet de dire si un point est strictement plus
     *  petit qu'un autre (au sens lexicographique).
     *
     * @param p le <code>Point</code> a comparer
     * @return un <code>boolean</code> qui est <code>true</code> ssi
     *         le point courant est strictement plus petit que p
     */
    //@ requires p != null;
    //@ ensures \result == (this.getX() < p.getX()) || ((this.getX() == p.getX()) && (this.getY() < p.getY()));
    public boolean lt(Point p) {
	if (this.x != p.x) {
	    return (this.x < p.x);
	} // end of if (this.x != p.x)
	else {
	    return (this.y < p.y);
	} // end of if (this.x != p.x)else
    }

    /**
     * <code>ge</code> permet de dire si un point est plus
     *  grand qu'un autre (au sens lexicographique).
     *
     * @param p le <code>Point</code> a comparer
     * @return un <code>boolean</code> qui est <code>true</code> ssi
     *         le point courant est plus grand que p
     */
    //@ requires p != null;
    //@ ensures \result == (this.getX() >= p.getX()) || ((this.getX() == p.getX()) && (this.getY() >= p.getY()));    
    public boolean ge(Point p) {
	return (!lt(p));
    }

    /**
     * <code>gt</code> permet de dire si un point est strictement plus
     *  grand qu'un autre (au sens lexicographique).
     *
     * @param p le <code>Point</code> a comparer
     * @return un <code>boolean</code> qui est <code>true</code> ssi
     *         le point courant est strictement plus grand que p
     */
    //@ requires p != null;
    //@ ensures \result == (this.getX() > p.getX()) || ((this.getX() == p.getX()) && (this.getY() > p.getY()));
    public boolean gt(Point p) {
	return (p.lt(this));
    }
    
    /**
     * <code>le</code> permet de dire si un point est plus
     *  petit qu'un autre (au sens lexicographique).
     *
     * @param p le <code>Point</code> a comparer
     * @return un <code>boolean</code> qui est <code>true</code> ssi
     *         le point courant est plus petit que p
     */
    //@ requires p != null;
    //@ ensures \result == (this.getX() <= p.getX()) || ((this.getX() == p.getX()) && (this.getY() <= p.getY()));
    public boolean le(Point p) {
	return (!p.lt(this));
    }

    public void dessiner(afficheur.Afficheur aff){
	aff.dessinerPoint(this.x,this.y, this.couleur) 	;
	
	}
    
}
