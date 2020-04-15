package figure;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *  Unit Test for class Segment
 *
 *
 * Created: Tue Oct 31 13:39:51 2006
 *
 * @author <a href="mailto:garion@supaero.fr">Christophe Garion</a>
 * @version 1.0
 */
public class SegmentTest {
    private Segment s;

    /**
     * Setup for the tests
     */
    @Before public void setUp() {
        s = new Segment(new Point(1, 2.5), new Point(0, -3));
    }

    /**
     * Cleanup for the tests
     */
    @After public void tearDown() {
    }

    /**
     * Test method for getLongueur
     */
    @Test public void testLongeur() {
        assertEquals(5.59016994, s.getLongueur(), 10E-9);
        assertEquals((new Point(1, 2.5)).distance(new Point(0, -3)),
            s.getLongueur(), 10E-9);
    }

    /**
     * Test method for translater
     */
    @Test public void testTranslater() {
        double l = s.getLongueur();
        Point ext1 = s.getExtremite1();
        Point ext2 = s.getExtremite2();

        Point ext1Old = new Point(ext1.getX(), ext1.getY());
        Point ext2Old = new Point(ext2.getX(), ext2.getY());

        s.translater(-4, 8);

        assertEquals(ext1Old.getX() - 4, ext1.getX(), 10E-9);
        assertEquals(ext2Old.getX() - 4, ext2.getX(), 10E-9);
        assertEquals(ext1Old.getY() + 8, ext1.getY(), 10E-9);
        assertEquals(ext2Old.getY() + 8, ext2.getY(), 10E-9);
        assertEquals(l, s.getLongueur(), 10E-9);
    }

    /**
     * Test method for toString
     */
    @Test public void testToString() {
        assertEquals("[(1.0,2.5);(0.0,-3.0)]", s.toString());
    }
} // SegmentTest
