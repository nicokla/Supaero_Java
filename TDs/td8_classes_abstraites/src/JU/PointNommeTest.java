package figure;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *  Unit Test for class PointNomme
 *
 *
 * Created: Tue Oct 31 13:05:14 2006
 *
 * @author <a href="mailto:garion@supaero.fr">Christophe Garion</a>
 * @version 1.0
 */
public class PointNommeTest extends PointTest{

    private PointNomme pn;

    /**
     * Setup for the tests
     */
    @Before public void setUp() {
        super.setUp();
        this.pn = new PointNomme(2, -4, "Point nomme");
    }

    protected Point createPoint(double x_, double y_) {
        return new PointNomme(x_, y_, "Point nomme");
    }

    @Test public void testToString() {
        assertEquals("Point nomme:(2.0,-4.0)", pn.toString());
    }
} // PointNommeTest
