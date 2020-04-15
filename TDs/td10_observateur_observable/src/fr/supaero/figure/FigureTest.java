package fr.supaero.figure;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *  Unit Test for class Figure
 *
 *
 * Created: Mon Dec  5 11:34:27 2005
 *
 * @author <a href="mailto:garion@supaero.fr">Christophe Garion</a>
 * @version 1.0
 */
abstract public class FigureTest {

    private Figure f;

    /**
     * Factory method for Figure
     */
    abstract protected Figure createFigure(Color c_);

    @Before public void setUp() {
        this.f = createFigure(Color.BLUE);
    }

    /**
     * Test for getting color of figure
     */
    @Test public void testGetCouleur() {
        Assert.assertEquals(Color.blue, f.getCouleur());
    }

    /**
     * Test for setting color of figure
     */
    @Test public void testSetCouleur() {
        f.setCouleur(Color.GRAY);
        Assert.assertEquals(Color.GRAY, f.getCouleur());
    }

    /**
     * Test method for translater
     */
    @Test abstract public void testTranslater();
}// FigureTest
