package fr.supaero.figure;

import java.awt.Color;
import afficheur.Afficheur;

/**
 * <code>Segment</code> est une classe permettant de modeliser un
 * segment geometrique. Ce segment est compose de deux points et on
 * peut recuperer sa longueur et le translater.
 *
 * @author <a href="mailto:garion@supaero.fr">Christophe Garion</a>
 * @version 1.0
 */
public class Segment extends Figure implements Observateur {

    private Point extremite1;
    private Point extremite2;
    private double longueur;
    
    
    
    public void miseAjour(){
    	this.longueur = extremite1.distance(extremite2);
    	
    }
    /**
     * Cree une nouvelle instance de <code>Segment</code>. Attention,
     * les points passes en parametre sont affectes directement aux 
     * attributs de l'objet a creer.
     *
     * <p> On aurait pu egalement creer de nouveaux points a partir des
     * points passes en parametre.
     *
     * @param p1 un <code>Point</code> representant la premiere extremite
     *           du segment
     * @param p2 un <code>Point</code> representant la seconde extremite
     *           du segment
     * @param couleur_ la couleur du segment
     */
    //@ requires couleur_ != null;
    //@ requires p1 != null;
    //@ requires p2 != null;
    //@ requires (p1.getX() == p2.getX()) ==> (p1.getY() != p2.getY());
    //@ requires (p1.getY() == p2.getY()) ==> (p1.getX() != p2.getX());
    public Segment(Point p1, Point p2, Color couleur_) {
        super(couleur_);
        this.extremite1 = p1;
        this.extremite2 = p2;
        p1.inscrire (this);
        p2.inscrire (this);
        this.longueur = p1.distance(p2);
    }

    /**
     * <code>getExtremite1</code> retourne le point correspondant a
     * la premiere extremite du segment.
     *
     * @return le <code>Point</code> qui est la premiere extremite
     */
    public Point getExtremite1() {
        return this.extremite1;
    }

    /**
     * <code>getExtremite2</code> retourne le point correspondant a
     * la seconde extremite du segment.
     *
     * @return le <code>Point</code> qui est la seconde extremite
     */
    public Point getExtremite2() {
        return this.extremite2;
    }

    /**
     * <code>getLongueur</code> renvoie la longueur du segment.
     *
     * @return un <code>double</code> qui est la longueur du segment
     */
    public double getLongueur() {
        return this.longueur;
    }

    /**
     * <code>translater</code> permet de translater le segment.
     *
     * @param dx l'abscisse du vecteur de translation
     * @param dy l'ordonnee du vecteur de translation
     */
    @Override public void translater(double dx, double dy) {
        this.extremite1.translater(dx, dy);
        this.extremite2.translater(dx, dy);
        miseAjour();
    }

    /**
     * <code>toString</code> renvoie une chaine de caracteres (un
     * objet de type <code>String</code>) representant le segment.
     *
     * @return un objet de type <code>String</code> representant
     *         le segment. Pour un segment compose des deux points
     *         <code>(1,0)</code> et <code>(2,3)</code>, cet objet
     *         representera la chaine <code>[(1,0);(2,3)]</code>
     */
    @Override public String toString() {
        return ("[" + this.extremite1 + ";" + this.extremite2 + "]");
    }

    /**
     * <code>dessiner</code> permet de dessiner le segment
     * sur un afficheur.
     *
     * @param a  l'objet de type <code>Afficheur</code> sur lequel
     *           on veut dessiner le segment
     */
    @Override public void dessiner(Afficheur a) {
        a.dessinerLigne(extremite1.getX(),
                        extremite1.getY(),
                        extremite2.getX(),
                        extremite2.getY(),
                        this.getCouleur());
        a.dessinerPoint(extremite1.getX(),
                        extremite1.getY(),
                        extremite1.getCouleur());
        a.dessinerPoint(extremite2.getX(),
                        extremite2.getY(),
                        extremite2.getCouleur());
    }
}
