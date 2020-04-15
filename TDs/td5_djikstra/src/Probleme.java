import java.util.*;

class Probleme {

	private Noeud depart;

	private Noeud arrivee;

//-------------------------------

	public Probleme (Noeud depart_, Noeud arrivee_) {
		this.depart = depart_ ;
		this.arrivee = arrivee_ ;
	}

	public Noeud getDepart () {
		return this.depart;
	}

	public Noeud getArrivee () {
		return this.arrivee;
	}

	public String toString () {
		return (this.depart +" ; "+ this.arrivee);
	}

}
