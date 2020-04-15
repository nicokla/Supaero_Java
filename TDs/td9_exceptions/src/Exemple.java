import java.util.Iterator;


public class Exemple {
	public static void main (String args[]) {
		Acquisition a = new Acquisition("/home/promo14/n.klarsfeld/Desktop/IN201/td9_exceptions/donnees1.txt");
		a.lireFichier();
		Iterator ite = a.iterateur();
		while(ite.hasNext()){
			System.out.println(ite.next() + "\n");
		}
		
		a = new Acquisition("/home/promo14/n.klarsfeld/Desktop/IN201/td9_exceptions/donnees2.txt");
		a.lireFichier();
		ite = a.iterateur();
		while(ite.hasNext()){
			System.out.println(ite.next() + "\n");
		}
		
		a = new Acquisition("/home/promo14/n.klarsfeld/Desktop/IN201/td9_exceptions/donnees3.txt");
		a.lireFichier();
		ite = a.iterateur();
		while(ite.hasNext()){
			System.out.println(ite.next() + "\n");
		}
	}
}
