package fr.supaero.listes;

/**
 * <code>ListeChainee</code> est une <code>Liste</code> representee sous la forme
 * d'une liste de cellules chainees.
 *
 * @author <a href="mailto:garion@supaero.fr">Christophe Garion</a>
 * @version 1.0
 */
public class ListeChainee implements Liste, Agregat {

    private Cellule premiere;

    public ListeChainee() {
        this.premiere = null;
    }

    public int getNbElements() {
        if (premiere == null) {
            return 0;
        } // end of if (premiere == null)

        int nb = 1;
        Cellule suivante_ = premiere;

        while ((suivante_ = suivante_.getSuivante()) != null) {
            nb++;
        } // end of while ((suivante_ = suivante_.getSuivante()) != null)
        
        return nb;
    }

    /**
     * Renvoie la premiere cellule
     *
     * @return une instance de <code>Cellule</code> qui est la premiere cellule
     */
    //@ ensures ((this.getNbElements() == 0) ==> (\result == null));
    public /*@ pure @*/ Cellule getPremiereCellule() {
        return this.premiere;
    }

    public double getElement(int pos) {
        return (this.trouverCellule(pos)).getElement();
    }

    public void remplacer(int pos, double elt) {
        (this.trouverCellule(pos)).setElement(elt); 
    }

    public void ajouter(int pos, double elt) {
        Cellule ajout = new Cellule(elt);
        if (premiere == null) {
            premiere = ajout;
        } // end of if (premiere == null)
        else {
            Cellule courante = this.trouverCellule(pos);

            if (pos == 0) {
                premiere = ajout;
            } 
            else {
                (this.trouverCellule(pos - 1)).setSuivante(ajout);
            }// end of if (pos == 0) else

            ajout.setSuivante(courante);                        
        } // end of if (premiere == null) else
    }

    public void supprimer(int pos) {
        if (pos == 0) {
            if (premiere.getSuivante() == null) {
                premiere = null;
            } // end of if ()
            else {
                premiere = premiere.getSuivante();
            } // end of if (premiere.getSuivante() == null) else
        } // end of if (pos == 0)
        else {
            Cellule avant = this.trouverCellule(pos-1);
            Cellule aEnlever = avant.getSuivante();

            avant.setSuivante(aEnlever.getSuivante());

            aEnlever.setSuivante(null);
        } // end of if (pos == 0) else        
    }

    private Cellule trouverCellule(int pos) {
                int compteur = 0;
        Cellule courante = premiere;
        
        while (compteur != pos) {
            courante = courante.getSuivante();
            compteur++;
        } // end of while (compteur != pos)
        
        return courante;
    }

    public Iterateur creeIterateur () {
    	Iterateur iter = new IterateurListeChainee(this);
	return iter;
    }

}
