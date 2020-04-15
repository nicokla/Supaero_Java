package fr.supaero.figure;

import java.awt.Color;

/**
 * <code>TestSegment</code> est une classe de test pour la classe
 * <code>Segment</code>.
 *
 * @author Xavier Cregut
 * @author <a href="mailto:garion@supaero.fr">Christophe Garion</a>
 * @version 1.0
 */
public class TestSegment {

    public static void main(String[] args) {
        Point p1 = new Point(0, 0, Color.BLUE);
        Point p2 = new Point(5, 0, Color.BLUE);
        Segment s = new Segment(p1, p2, Color.RED);

        System.out.print("p2 = ");
        p2.afficher();
        System.out.println();
        System.out.print("s = ");
        s.afficher();
        System.out.println();
        System.out.println("longueur de s = " + s.getLongueur());
        System.out.println();
	
        p2.translater(-2, 0);
        
        System.out.print("p2 = ");
        p2.afficher();
        System.out.println();
        System.out.print("s = ");
        s.afficher();
        System.out.println();
        System.out.println("longueur de s = " + s.getLongueur());
    }
}
