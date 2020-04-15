import java.util.*;

class Noeud {

	private String nom;
	
	private Vector<Arc> arcs;
	
//---------------------------------

	public Noeud (String nom_) {
		this.nom = nom_ ;
		this.arcs = new Vector<Arc>();
	}
	
	public void ajouter (Arc arc) {
		this.arcs.add(arc);
	}
	
	public Vector<Arc> getArcs () {
		return this.arcs;
	}
	
	public String toString () {
		return this.nom;
	}

}
