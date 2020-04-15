package figure;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

/**
 *  Unit Test for class Polygone
 *
 *
 * Created: Tue Nov  8 19:46:24 2005
 *
 * @author <a href="mailto:garion@supaero.fr">Christophe Garion</a>
 * @version 1.0
 */
public class PolygoneTest {

    private Polygone poly;
    private ArrayList<Point> ens;

    /** 
     * Setup for the tests 
     */ 
    @Before public void setUp() {
        ens = new ArrayList<Point>();
        ens.add(0, new Point (1, 1));
	ens.add(1, new Point (2, 1));
	ens.add(2, new Point (3, 4));

        poly = new Polygone(ens);
    }

    /** 
     * Cleanup for the tests 
     */ 
    @After public void tearDown() {

    }

    /**
     * <code>testGetSommet</code> teste la methode getSommet.
     *
     */
    @Test public void testGetSommet() {
        assertEquals(2.0, (poly.getSommet(2)).getX(), 0.0);
        assertEquals(4.0, (poly.getSommet(3)).getY(), 0.0);
    }

    /**
     * <code>testGetNbSommets</code> teste la methode renvoyant
     * le nombre de sommets.
     *
     */
    @Test public void testGetNbSommets() {
        assertEquals(3, poly.getNbSommets());
    }

    /**
     * <code>testAjouter</code> teste la methode permettant
     * d'ajouter un point.
     *
     */
    @Test public void testAjouter() {
        Point p = new Point(-1, -2);

        Point q = poly.getSommet(3);
        poly.ajouter(p, 3);
        assertNotSame(p, poly.getSommet(3));
        assertEquals(4, poly.getNbSommets());
        assertEquals(p.getX(), (poly.getSommet(3)).getX(), 0.0);
        assertEquals(p.getY(), (poly.getSommet(3)).getY(), 0.0);
        assertSame(q, poly.getSommet(4));
    }

    /**
     * <code>testRetirer</code> teste la methode permettant
     * de retirer un point.
     *
     */
    @Test public void testRetirer() {
        Point p = poly.getSommet(1);
        Point q = poly.getSommet(3);

        poly.retirer(2);
        assertEquals(2, poly.getNbSommets());
        assertSame(p, poly.getSommet(1));
        assertSame(q, poly.getSommet(2));
    }

    /**
     * <code>testToString</code> teste la representation du
     * polygone sous forme de chaine de caracteres.
     *
     */
    @Test public void testToString() {
        assertEquals("<< (1.0,1.0) (2.0,1.0) (3.0,4.0) >>", poly.toString());
    }

    /**
     * <code>testTranslater</code> teste la translation.
     *
     */
    @Test public void testTranslater() {
        poly.translater(2,3);
        assertEquals(3, (poly.getSommet(1)).getX(), 0.0);
        assertEquals(4, (poly.getSommet(1)).getY(), 0.0);
        assertEquals(4, (poly.getSommet(2)).getX(), 0.0);
        assertEquals(4, (poly.getSommet(2)).getY(), 0.0);
        assertEquals(5, (poly.getSommet(3)).getX(), 0.0);
        assertEquals(7, (poly.getSommet(3)).getY(), 0.0);
    }

    /**
     * <code>testGetPerimetre</code> teste le perimetre du polygone.
     *
     */
    @Test public void testGetPerimetre() {
        assertEquals(7.7678289356323695, poly.getPerimetre(), 0.00000000001);
    }

    /**
     * <code>testGetSurface</code> teste la surface du polygone.
     *
     */
    @Test public void testGetSurface() {
        assertEquals(1.5, poly.getSurface(), 0.0);
    }
}// PolygoneTest
