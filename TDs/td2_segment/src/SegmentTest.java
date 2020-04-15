import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class SegmentTest {
    private Point b;
    private Point a;
    private Segment p;

    @Before public void setUp() { 
	this.a = new Point(1,1);
   	this.b = new Point(1,2); 
        this.p = new Segment(a,b);
    }

    @Test public void testTranslate() {
        p.translate(0,1);
	assertEquals(1.0, a.getCoeffX(), 0.0);
	assertEquals(2.0, a.getCoeffY(), 0.0);
	assertEquals(1.0, b.getCoeffX(), 0.0);
	assertEquals(3.0, b.getCoeffY(), 0.0);
    }

    @Test public void testLength () {
        assertEquals(1, p.length(), 0.0);
    }

}
