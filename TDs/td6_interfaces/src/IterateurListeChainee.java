import ListeChainee;

public class IterateurListeChainee implements Iterateur {
	private int indiceCourant = 0;

	ListeChainee l;



	public IterateurListeChainee ( ListeChainee l_) {
		this.l = l_;
		this.indiceCourant = 0;
	}


    //@ requires ( i <= l.getNbElements() - 1 );

	public IterateurListeChainee ( ListeChainee l_, int i) {
		this.l = l_;
		this.indiceCourant = i;
	}


    //@ ensures ( indiceCourant <= l.getNbElements() - 1 );

	public void avancer () {
		if ( ! this.estTermine() ) {
			indiceCourant++;
		}
	}


	public boolean estTermine () {
		return ( l.getNbElements() - 1 == indiceCourant );
	}
	


	public double elementCourant () {
		return l.getElement( indiceCourant );
	}

}

