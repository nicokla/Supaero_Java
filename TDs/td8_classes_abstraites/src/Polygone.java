
import java.util.ArrayList;

/**
 * <code>Polygone</code> est un classe permettant de manipuler des
 * objets representant des polygones sous forme d'un ensemble de points.
 *
 * @author <a href="mailto:garion@supaero.fr">Christophe Garion</a>
 * @version 1.0
 */
public class Polygone extends Figure  {

    //@ public invariant getNbSommets() >= 3;
    
    private ArrayList<Point> sommets;

    /**
     * Permet de creer une instance de <code>Polygone</code>.
     *
     * @param sommets_ un ensemble de points intial permettant de
     *                 construire le polygone
     */
    //@ requires sommets_.size() >= 3;
    //@ ensures getNbSommets() == sommets_.getNombrePoints();
    //@ ensures (\forall int i; (i > 0) && (i <= sommets_.size()); sommets_.get(i) != getSommet(i));
    //@ ensures (\forall int i; (i > 0) && (i <= sommets_.size()); sommets_.get(i).getX() == getSommet(i).getX());
    //@ ensures (\forall int i; (i > 0) && (i <= sommets_.size()); sommets_.get(i).getY() == getSommet(i).getY());

    public Polygone(ArrayList<Point> sommets_ ,java.awt.Color col) {
        super(col);
        this.sommets = new ArrayList<Point>();
        for (int i = sommets_.size() - 1; i >= 0; i--) {
            this.sommets.add(0, new Point(sommets_.get(i).getX(), sommets_.get(i).getY(), col));
        } // end of for (int i = sommets_.size(); i >= 1; i--)
    }

    /**
     * Permet de creer une instance de <code>Polygone</code>.
     *
     * @param sommets_ un nombre variable de points
     */
    //@ requires sommets_.length >= 3;
    //@ ensures getNbSommets() == sommets_.getNombrePoints();
    //@ ensures (\forall int i; (i > 0) && (i <= sommets_.length); sommets_[i] != getSommet(i));
    //@ ensures (\forall int i; (i > 0) && (i <= sommets_.length); sommets_[i].getX() == getSommet(i).getX());
    //@ ensures (\forall int i; (i > 0) && (i <= sommets_.length); sommets_[i].getY() == getSommet(i).getY());

    public Polygone( java.awt.Color col, Point... sommets_) {
	super(col);
        this.sommets = new ArrayList<Point>();
        for (int i = sommets_.length - 1; i >= 0; i--) {
          this.sommets.add(0, new Point(sommets_[i].getX(), sommets_[i].getY(), col));
        } // end of for (int i = sommets_.length; i >= 1; i--)
    }

    /**
     * <code>getSommet</code> permet de recuperer un point du polygone
     *  sans le retirer.
     *
     * @param i la position du point dans le polygone (comprise entre
     *          <code>1</code> et <code>this.getNbSommets()</code>)
     * @return le <code>Point</code> a recuperer
     */
    //@ requires (i > 0) && (i <= getNbSommets());
    //@ ensures \result != null;

    public /*@ pure @*/ Point getSommet(int i) {
        return this.sommets.get(i-1);
    }

    /**
     * Le nombre de sommets du polygone.
     *
     * @return un <code>int</code> qui est le nombre de sommets du
     *         polygone
     */
    public /*@ pure @*/ int getNbSommets() {
        return this.sommets.size();
    }
    
    /**
     * <code>ajouter</code> permet d'ajouter un point dans le polygone.
     * 
     * @param p le <code>Point</code> a ajouter
     * @param position un <code>int</code> representant la position du
     *                 point a ajouter dans le tableau (comprise entre
     *                 <code>1</code> et <code>this.getNbSommets()+1</code> 
     */
    //@ requires p != null;
    //@ requires (position >= 1) && (position <= this.getNbSommets() + 1);
    //@ ensures getNbSommets() == \old(getNbSommets()) + 1;
    //@ ensures getSommet(position) != p;
    //@ ensures getSommet(position).getX() == p.getX();
    //@ ensures getSommet(position).getY() == p.getY();
    //@ ensures (\forall int i; ((i >= 1) && (i < position)) ==> getSommet(i) == \old(getSommet(i)));
    //@ ensures (\forall int i; ((i > position) && (i <= getNbSommets())) ==> getSommet(i) == \old(getSommet(i-1)));    


    public void add(int position, Point p) {
        this.sommets.add(position - 1, new Point(p.getX(), p.getY(), this.couleur));
    }

    /**
     * <code>retirer</code> permet de retirer un point dans le polygone.
     *
     * @param position un <code>int</code> representant la position du
     *                 point a retirer dans le tableau (comprise entre
     *                 <code>1</code> et <code>this.getNbSommets()</code>
     */
    //@ requires (position >= 1) && (position <= getNbSommets());
    //@ ensures getNbSommets() == \old(getNbSommets()) - 1;
    //@ ensures (\forall int i; ((i >= 1) && (i < position)) ==> getSommet(i) == \old(getSommet(i)));
    //@ ensures (\forall int i; ((i > position) && (i <= getNbSommets())) ==> getSommet(i) == \old(getSommet(i+1)));


    public void retirer(int position) {
        this.sommets.remove(position - 1);
    }

    /**
     * Afficher le polygone
     */
    public void afficher() {
        System.out.println(this);
    }

    /**
     * <code>toString</code> renvoie une represention du Polygone sous forme
     * d'un objet <code>String</code>.
     *
     * @return un objet de type <code>String</code> qui a la forme suivante :
     *         <code><< Point1 ... Pointn >><\code>
     */
    public String toString() {
        String s = "<< ";
        for (Point p : sommets) {
            s = s + p + " ";
        } // end of for-each (Point p : sommets)
        s = s + ">>";
        return s;
    }
    
    /**
     * <code>translater</code> permet de translater le polygone.
     *
     * @param x_ un <code>double</code> qui est l'abscisse du vecteur
     *           de translation
     * @param y_ un <code>double</code> qui est l'ordonnee du vecteur
     *           de translation
     */
    //@ ensures (\forall int i; (i > 0) && (i <= getNbSommets()); getSommet(i).getX() == \old(getSommet(i).getX()) + x_);
    //@ ensures (\forall int i; (i > 0) && (i <= getNbSommets()); getSommet(i).getY() == \old(getSommet(i).getY()) + y_); 


    public void translater(double x_, double y_) {
        for (Point p : sommets) {
            p.translater(x_, y_);
        } // end of for-each (Point p : sommets)
    }

    /**
     * <code>getPerimetre</code> renvoie le perimetre du polygone.
     *
     * @return un <code>double</code> qui est le perimetre du polygone
     */
    public double getPerimetre() {
        double p = 0;
        for (int i = 1; i <= this.getNbSommets() - 1; i++) {
            p += this.getSommet(i).distance(this.getSommet(i+1));
        } // end of for (int i = 1; i <= this.getNbSommets() - 1; i++)
        p += this.getSommet(this.getNbSommets()).distance(this.getSommet(1));
	
        return p;
    }

    /**
     * <code>getSurface</code> renvoie la surface du polygone. Cette methode
     * utilisant le barycentre ne fonctionne qu'avec les polygones concaves !
     *
     * @return un <code>double</code> qui est la surface du polygone.
     */
    public double getSurface() {
        Point bary = this.getBarycentre();
		
        double vec1x = this.getSommet(this.getNbSommets()).getX() - bary.getX();
        double vec1y = this.getSommet(this.getNbSommets()).getY() - bary.getY();
        double vec2x = this.getSommet(1).getX() - bary.getX();
        double vec2y = this.getSommet(1).getY() - bary.getY();
        double result = Math.abs((vec1x * vec2y) - (vec2x *vec1y))/2;

        for (int i = 1; i < this.getNbSommets(); i++) {
            vec1x = this.getSommet(i).getX() - bary.getX();
            vec1y = this.getSommet(i).getY() - bary.getY();
            vec2x = this.getSommet(i+1).getX() - bary.getX();
            vec2y = this.getSommet(i+1).getY() - bary.getY();
            result += Math.abs((vec1x * vec2y) - (vec2x *vec1y))/2;
        } // end of for (int i = 1; i < this.getNbSommets(); i++)
	
        return result;
    }

    private Point getBarycentre() {
        double x = 0;
        double y = 0;
        for (int i = 1; i <= getNbSommets(); i++)
            {
                x += this.getSommet(i).getX();
                y += this.getSommet(i).getY();
            }
        return new Point((x/this.getNbSommets()), (y/this.getNbSommets()), this.couleur);
    }


    public void dessiner(afficheur.Afficheur aff){

	for(int i=1;i<this.getNbSommets();i++){

		aff.dessinerLigne(this.getSommet(i).getX(),this.getSommet(i).getY(),this.getSommet(i+1).getX(),this.getSommet(i+1).getY(),this.couleur);
		

		}
	aff.dessinerLigne(this.getSommet(this.getNbSommets()).getX(),this.getSommet(this.getNbSommets()).getY(),this.getSommet(1).getX(),this.getSommet(1).getY(),this.couleur);
	
	}
}
