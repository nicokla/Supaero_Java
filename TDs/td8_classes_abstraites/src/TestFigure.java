
import java.util.*;
import afficheur.*;
import java.awt.*;

class TestFigure {
    public static void main (String[] args) {
        Point a,b,c;              
        a = new Point(0,0, Color.RED );
        b = new Point(100,0, Color.RED );
        c = new Point(0,100, Color.RED );
        
	Figure fig;

	ArrayList<Point> l = new ArrayList<Point>();
        Polygone p = new Polygone(l,Color.RED);
	p.add(1,a);
	p.add(1,b);
	p.add(1,c);

	fig = p;

        Ecran aff = new Ecran("titre",400, 400, 1) ;
	aff.dessinerAxes();
        
	p.afficher();
        p.translater(100,0);
	p.afficher();
	p.dessiner(aff);
        System.out.println(p.getSurface());
	System.out.println(p.getPerimetre());

    } // end of main ()
}
