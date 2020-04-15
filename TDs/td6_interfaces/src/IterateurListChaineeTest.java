

class IterateurListChaineeTest {
	public static void main (String[] args) {
		Agregat a = new ListeChainee();
		ajouter(0, 1);
		ajouter(0, 2);
		ajouter(0, 3);
		ajouter(0, 4);// les chiffres seront décroissantds de 4 à 1
		
		Iterateur iter = new IterateurListeChainee( a );

		System.out.println ( iter.elementCourant() );
		iter.avancer();
		System.out.println ( iter.elementCourant() );
		iter.avancer();
		System.out.println ( iter.elementCourant() );
		
	}
}
