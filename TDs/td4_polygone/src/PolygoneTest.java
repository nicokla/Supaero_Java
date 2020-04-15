import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class PolygoneTest {
    private Point a, b, c, d;
    private Polygone p;

    @Before public void setUp() { 
		this.a = new Point(0,0);
		this.b = new Point(0,1); 
		this.c = new Point(1,1);
		this.d = new Point(1,0);
        this.p = new Polygone(new ArrayList<Point> (a,b,c,d));
    }

    @Test public void testAire() {
		assertEquals(1.0, p.aire(), 0.0);
    }

    @Test public void testPerimetre () {
        assertEquals(4, p.perimetre(), 0.0);
    }
}
