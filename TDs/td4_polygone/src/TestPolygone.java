import java.util.*;

class TestPolygone {
    public static void main (String[] args) {
        Point a,b,c,d;              
        a = new Point(0,0);
        b = new Point(1,0);
        c = new Point(1,1);
        d = new Point(0,1);
        
	ArrayList<Point> l = new ArrayList<Point>();
        Polygone p = new Polygone(l);
	p.add(0,a);
	p.add(0,b);
	p.add(0,c);
	p.add(0,d);
        
        p.afficher();
        p.translate(5,0);
	p.afficher();
        System.out.println(p.aire());
	System.out.println(p.perimetre());

    } // end of main ()
}
