import java.util.*;

class Arc {

	private Noeud origine;
	
	private Noeud destination;

	private double poids;

//--------------------------------

	public Arc ( Noeud origine_, Noeud destination_, double poids_ ) {
		this.origine = origine_ ;
		this.destination = destination_ ;
		this.poids = poids_ ;
	}

	public Noeud getOrigine () {
		return this.origine;
	}

	public Noeud getDestination () {
		return this.destination;
	}

	public double getPoids () {
		return this.poids;
	}

	public String toString () {
		return (this.origine + " ; " + this.destination + " ; " + this.poids);		
	}

}
