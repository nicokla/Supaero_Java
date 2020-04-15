package figure;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *  Unit Test for class Point
 *
 *
 * Created: Tue Oct 31 13:05:14 2006
 *
 * @author <a href="mailto:garion@supaero.fr">Christophe Garion</a>
 * @version 1.0
 */
public class PointTest {
    private Point p1;
    private Point p2;

    /**
     * Setup for the tests
     */
    @Before public void setUp() {
        p1 = this.createPoint(0, 0);
        p2 = this.createPoint(5, 6);
    }

    /**
     * Cleanup for the tests
     */
    @After public void tearDown() {
    }

    /**
     * Factory method for Point
     */
    protected Point createPoint(double x_, double y_) {
        return new Point(x_, y_);
    }

    /**
     * Test method for translater
     */
    @Test public void testTranslater() {
        p1.translater(2, -5);
        assertEquals(2.0, p1.getX(), 10E-9);
        assertEquals(-5.0, p1.getY(), 10E-9);
    }

    /**
     * Test method for distance
     */
    @Test public void testDistance() {
        assertEquals(7.810249676, p1.distance(p2), 10E-9);
    }

    /**
     * Test method for toString
     */
    @Test public void testToString() {
        assertEquals("(5.0,6.0)", p2.toString());
    }

    /**
     * Test method for lt
     */
    @Test public void testLt() {
        assertTrue(p1.lt(p2));
        p2.setX(0);
        p2.setY(5);
        assertTrue(p1.lt(p2));
        assertFalse(p1.lt(p1));
    }

    /**
     * Test method for le
     */
    @Test public void testLe() {
        assertTrue(p1.le(p2));
        p2.setX(0);
        p2.setY(5);
        assertTrue(p1.le(p2));
        assertTrue(p1.le(p1));
    }

    /**
     * Test method for gt
     */
    @Test public void testGt() {
        assertFalse(p1.gt(p2));
        p2.setX(0);
        p2.setY(5);
        assertFalse(p1.gt(p2));
        assertFalse(p1.gt(p1));
    }

    /**
     * Test method for ge
     */
    @Test public void testGe() {
        assertFalse(p1.ge(p2));
        p2.setX(0);
        p2.setY(5);
        assertFalse(p1.ge(p2));
        assertTrue(p1.ge(p1));
    }
} // PointTest
