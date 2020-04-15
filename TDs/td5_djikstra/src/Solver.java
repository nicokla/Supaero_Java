import java.util.*;

class Solver {

	private Probleme probleme;

//-----------------------

	public Solver ( Probleme probleme_ ) {
		this.probleme = probleme_ ;
	}
	
	public String toString () {
		return ( "" + this.probleme );
	}

//---------------------------

    public Vector<Noeud> plusCourtChemin() {
        return null;
    }
    
    public Vector<Noeud> plusCourtCheminGen(Noeud nd, Noeud na) {

        // on trouve l'ensemble des noeuds du graphe
		
        // initialisation des distances et des noeuds precedents

        // boucle principale

            // on trouve le noeud avec la plus petite distance

            // si la plus petite distance est infinie, on n'a pas de
            // solution

            // on est arrive sur le noeud que l'on veut atteindre
            
            // coeur de l'algo

        return null;
    }

    public void prochainsNoeuds(HashSet<Noeud> sn, Noeud n) {
		
    }

    private void construireSolution(HashMap<Noeud, Noeud> precedent,
                                    Vector<Noeud> vsol, Noeud n) {
		
    }


//-----------------------
// fait avant de voir le squelette

	public Vector<Noeud> plusCourtChemin2 () {
		Vector<Noeud> chemin = new Vector<Noeud>();	
		HashSet<Noeud> ensemble = new HashSet<Noeud>();
		HashMap<Noeud,Double> distance = new HashMap<Noeud,Double> ();
		HashMap<Noeud,Noeud> precedent = new HashMap<Noeud,Noeud> ();	
		
		ensemble.add(probleme.getDepart());
		distance.put(probleme.getDepart(), 0.0);

		boolean trouve_nouveau = true;
		Noeud nouveau_noeud = new Noeud("faux_nom");
		Noeud precedent_actuel = new Noeud("faux_nom2");
		double d = Double.POSITIVE_INFINITY; // distance du noeud le plus proche de l'ensemble parmi ceux regardés
	
		while( ! (ensemble.contains(probleme.getArrivee())) && trouve_nouveau) {

			trouve_nouveau = false;
			d = Double.POSITIVE_INFINITY;

			// on cherche le noeud le plus proche de l'ensemble.
			for (Noeud n : ensemble) { 
				for ( int i = 0; i < n.getArcs().size(); i++ ) {
					if ( !ensemble.contains(n.getArcs().get(i).getDestination()) && (distance.get(n) + n.getArcs().get(i).getPoids() < d) )
					{
						d = distance.get(n) + n.getArcs().get(i).getPoids();
						nouveau_noeud = n.getArcs().get(i).getDestination();
						precedent_actuel = n;
					}
				}
			}

			if( d != Double.POSITIVE_INFINITY ) {
			// si on a pas fini de parcourir la composante connexe, on rajoute ce qu'on vient de trouver
			// dans l'ensemble, et on note là où il faut sa distance au noeud de depart 
			// et le sommet qui le precede.
				trouve_nouveau = true;
				ensemble.add(nouveau_noeud);
				precedent.put(nouveau_noeud, precedent_actuel);
				distance.put(nouveau_noeud, d);
			}
		}
		
		if(ensemble.contains(probleme.getArrivee())) {
			Noeud n = probleme.getArrivee();
			chemin.add(0, n);
			while ( chemin.get(0) != probleme.getDepart() ) {
				chemin.add(0, precedent.get(n));
			}
		}
		
		return chemin; // celui-ci est vide s' il n'y a pas de chemin, sinon il contient le chemin.
	}
        
}
