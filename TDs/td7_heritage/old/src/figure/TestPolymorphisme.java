package fr.supaero.figure;

/**
 * Tester le polymorphisme et la liaison dynamique.
 *
 * @author <a href="mailto:cregut@enseeiht.fr">Xavier Cregut</a>
 * @version 1.0
 */
public class TestPolymorphisme {

    /** Methode principale */
    public static void main(String args[]) {
        // Creer et afficher un point p1
        Point p1 = new Point(3, 4);		// Est-ce autorise ? Pourquoi ?
// C'est autorisé, car les types sont identiques
	
        p1.translater(10,10);	// Quel est le translater qui est execute ?
// celui de la classe point

        System.out.print("p1 = ");	p1.afficher ();	System.out.println ();
                         // Qu'est ce qui est affiche ?
// les coordonnes de p1, c-a-d 13,14

        // Creer et afficher un point nomme pn1
        PointNomme pn1 = new PointNomme (30, 40, "PN1");
                         // Est-ce autorise ? Pourquoi ?
// oui car les types sont les memes, et que les arguments du constructur sont dans le bon ordre.

        pn1.translater (10,10);	// Quel est le translater qui est execute ?
//celui de point car la méthode translater n'est pas redéfinie dans pointnommé

        System.out.print ("pn1 = ");	pn1.afficher();	System.out.println ();
		         // Qu'est ce qui est affiche ?
//seules les coordonnées du point sont afficher  car la méthode afficher n'est pas redéfinie dans pointnommé

        // Definir une poignee sur un point
        Point q;

        // Attacher un point a q et l'afficher
        q = p1;		// Est-ce autorise ? Pourquoi ?
// q et p1 sont de même type ,c'est autorisé

        System.out.println ("> q = p1;");
        System.out.print ("q = ");	q.afficher();	System.out.println ();
		        // Qu'est ce qui est affiche ?
// les coordonnes de q, c-a-d 13,14

        // Attacher un point nomme a q et l'afficher
        q = pn1;		// Est-ce autorise ? Pourquoi ?
//oui car pn1 est de type point nommé,sous classe de point

        System.out.println ("> q = pn1;");
        System.out.print ("q = ");	q.afficher();	System.out.println ();
		        // Qu'est ce qui est affiche ?
// les coordonnes de q, c-a-d 13,14

        // Definir une poignee sur un point nomme
        PointNomme qn;

        // Attacher un point a q et l'afficher
        qn = p1;	// Est-ce autorise ? Pourquoi ?

//non car p1 de type point super classe et qn est de type pointnommé sous classe

        System.out.println ("> qn = p1;");
        System.out.print ("qn = ");	qn.afficher();	System.out.println ();
		        // Qu'est ce qui est affiche ?
//le programme ne compile pas 

        // Attacher un point nomme a qn et l'afficher
        qn = pn1;	// Est-ce autorise ? Pourquoi ?
// qn et pn1 sont de même type ,c'est autorisé

        System.out.println ("> qn = pn1;");
        System.out.print ("qn = ");	qn.afficher();	System.out.println ();
		        // Qu'est ce qui est affiche ?
// les coordonnes de qn

        double d1 = p1.distance (pn1);	// Est-ce autorise ? Pourquoi ?
        System.out.println ("distance = " + d1);

        double d2 = pn1.distance (p1);	// Est-ce autorise ? Pourquoi ?
        System.out.println ("distance = " + d2);

        double d3 = pn1.distance (pn1);	// Est-ce autorise ? Pourquoi ?
        System.out.println ("distance = " + d3);
	
        System.out.println ("> qn = q;");
        qn = q;	// Est-ce autorise ? Pourquoi ?
        System.out.print ("qn = ");	qn.afficher();	System.out.println ();

        System.out.println ("> qn = (PointNomme) q;");
        qn = (PointNomme) q;	// Est-ce autorise ? Pourquoi ?
        System.out.print ("qn = ");	qn.afficher();	System.out.println ();

        System.out.println ("> qn = (PointNomme) p1;");
        qn = (PointNomme) p1;	// Est-ce autorise ? Pourquoi ?
        System.out.print ("qn = ");	qn.afficher();	System.out.println ();
    }
}
