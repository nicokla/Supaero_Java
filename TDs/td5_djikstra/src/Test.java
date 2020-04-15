import java.util.*;

class Test {

	public static void main (String[] args) {

		Noeud[] n = new Noeud[7]; // on utilise pas le numéro zero.
		for (int i=0; i<7; i++) {
			n[i] = new Noeud ("n" + i);
		} 
		
		Arc[] a = new Arc[8];
		a[0] = new Arc(n[1],n[2],3);
		n[1].ajouter(a[0]);
		a[1] = new Arc(n[1],n[4],2);
		n[1].ajouter(a[1]);
		a[2] = new Arc(n[1],n[6],1);
		n[1].ajouter(a[2]);
		a[3] = new Arc(n[2],n[4],1);
		n[2].ajouter(a[3]);
		a[4] = new Arc(n[2],n[3],1);
		n[2].ajouter(a[4]);
		a[5] = new Arc(n[4],n[5],1);
		n[4].ajouter(a[5]);
		a[6] = new Arc(n[4],n[3],5);
		n[4].ajouter(a[6]);
		a[7] = new Arc(n[6],n[5],1);
		n[6].ajouter(a[7]);

		Probleme p = new Probleme(n[1], n[3]);
		Solver s = new Solver(p);
		Vector chemin = new Vector();
		chemin = s.plusCourtChemin2();
		
		System.out.println(chemin.toString());
	}
}
