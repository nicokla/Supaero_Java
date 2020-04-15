/**
 *  <code>TestPoint</code> 
 *
 *  @author Nous</a>
 *  @version 1.0
*On cherche à concevoir une classe Point qui représente un point dans le plan (au sens géométrique). On *souhaite pouvoir
*réaliser le « programme » suivant :
*– création d’un point p1 de coordonnées cartésiennes (1, 0) ;
*– affichage des coordonnées du point p1 ;
*– translation du point p1 en utilisant le vecteur (5, 0). On pourra également translater le point en *utilisant d’autres vecteurs ;
*– affichage des coordonnées du point p1 ;
*– création d’un point p2 de coordonnées cartésiennes (−1, −5.5) ;
*– calcul et affichage de la distance entre p1 et p2 .
*/

class TestPoint {
    public static void main (String[] args) {
        Point p1;              
        p1 = new Point(1,0); 
        
        // Afficher l'equation
        p1.afficher();
        
        // Translation du point
        p1.translate(5,0);

 	// Afficher l'equation
        p1.afficher();

	Point p2;              
        p2 = new Point(-1,-5.5);  

	// calcul del la distance p1 p2
       double d = p1.distance(p2);

	// affichage de d
	System.out.println(d);

    } // end of main ()
}
