/**
 * <code>EnsembleEntierTab</code> represente un ensemble d'entiers sous la forme
 * d'un tableau.
 *
 * @author <a href="mailto:cregut@enseeiht.fr">Xavier Cregut</a>
 * @author <a href="mailto:garion@supaero.fr">Christophe Garion</a>
 * @version 1.0
 */
public class EnsembleEntierTab {

    // Remarque : Certains invariants pourraient etre exprimes sous la forme de
    // postconditions sur des methodes (par exemple getMin() ou
    // getCardinal()) mais elles ne seraient alors dynamiquement
    // verifiees que lors de l'utilisation de ces methodes (getMin() ou
    // getCardinal()). En tant qu'invariant, elles le sont apres toute
    // application de methode sur un ensemble !

    //@ public invariant estVide() <==> getCardinal() == 0;

    // Caracterisation du min (quand il existe !).
    //
    //@ public invariant !estVide() ==> contient(getMin());
    //@ public invariant !estVide() ==> getMin() == (\min int x; contient(x); x);

    // Proprietes de getCardinal() et getCapacite()
    //
    //@ public invariant getCapacite() > 0;
    //@ public invariant 0 <= getCardinal() && getCardinal() <= getCapacite();
    
    // Remarque : Un invariant peut (doit !) etre defini private s'il porte
    // sur des elements prives de la classe.  Il ne peut alors pas etre verifie
    // par un utilisateur de l'ensemble. Il traduit donc un choix
    // d'implantation et non une specification de l'ensemble !

    // Le tableau existe.
    //@ private invariant tab != null;

    // Tous les elements compris dans les indices [0..getCardinal()[ du
    // tableau sont dans dans l'ensemble.
    //
    //@ private invariant (\forall int i; 0 <= i && i < getCardinal(); contient(tab[i]));

    // Deux elements a des indices differents sont differents (les doubles ne
    // sont pas stockes !).
    //
    //@ private invariant (\forall int i; 0 <= i && i < getCardinal(); (\forall int j; 0 <= j && j < i; tab[i] != tab[j]));

    // Tout element dans l'ensemble a un indice dans le tableau compris entre
    // [0..getCardinal()[.  Cette propriete peut se deduire des deux
    // precedentes !
    //
    //@ private invariant (\forall int x; contient(x); (\exists int i; 0 <= i && i < getCardinal(); tab[i] == x));

    // On peut alors en deduire une nouvelle definition du min (encore
    // redondante !).
    //
    //@ private invariant !estVide() ==> getMin() == (\min int i; 0 <= i && i < getCardinal(); tab[i]);

    private int[] tab;	// stockage des elements de l'ensemble
    private int nb;	// taille effective de tab

    /** Construction d'un ensemble de capacite taille_.
      * @param taille_ contenance de l'ensemble
      */
    //@ requires taille_ > 0;
    //@ ensures getCardinal() == 0;
    //@ ensures getCapacite() == taille_;
    public EnsembleEntierTab(int taille_)
    {
	tab = new int[taille_];
    }

    /**
     * <code>getCapacite</code> renvoie la capacite de l'ensemble.
     *
     * @return un entier qui est la capacite maximale de l'ensemble
     */
    public /*@ pure @*/ int getCapacite() {
        return tab.length;
    }
    
    /**
     * <code>getCardinal</code> renvoie le cardinal de l'ensemble.
     *
     * @return un entier qui est le nombre d'elements de l'ensemble
     */
    public /*@ pure @*/ int getCardinal() {
        return nb;
    }
    
    /**
     * Est-ce que l'ensemble est vide ?
     *
     * @return un booleen qui vaut <code>true</code> si l'ensemble est vide
     */
    public /*@ pure @*/ boolean estVide() {
        return (nb==0);
    }
    
    /**
     * Est-ce que <code>x</code> appartient a l'ensemble ?
     *
     * @param x un <code>int</code> qui est l'element cherche
     * @return un booleen qui est <code>true</code> si <code>x</code>
     *  appartient a l'ensemble
     */
    public /*@ pure @*/ boolean contient(int x) {
        for(int i = 0; i < nb; i++) {
	   if(x == tab[i]){
	      return true;
	   }
        }
        return false;
    }

    /**
     * Ajouter l'element x dans l'ensemble.
     *
     * @param x l'element a ajouter
     */
    //@ requires !contient(x) ==> getCardinal() < getCapacite();
    //@ ensures contient(x);	// element ajoute
    //@ ensures !\old(contient(x)) ==> getCardinal() == \old(getCardinal()) + 1;
    //@ ensures \old(contient(x)) ==> getCardinal() == \old(getCardinal());
    public void ajouter(int x) {
	if (!contient(x)){
	  tab[nb] = x;
	  nb=nb+1;
	}		
    }

    /**
     * Enlever l'element x de l'ensemble.
     * 
     * @param x l'element a supprimer
     */
    //@ ensures !contient(x);	// element supprime
    //@ ensures !\old(contient(x)) ==> getCardinal() == \old(getCardinal());
    //@ ensures \old(contient(x)) ==> getCardinal() == \old(getCardinal()) - 1;
    public void oter(int x) {
	boolean b = false;
	for(int i = 0; i < nb; i++) {
	    if (!b) {
               b = (tab[i]==x); 
            }
	    else {
               tab[i-1] = tab[i];
            }
        }
 	if (b){
	 nb=nb-1; 
	}       
    }

    /**
     * Le plus petit element de l'ensemble.
     *
     * @return un entier qui est le plus petit element de l'ensemble
     */
    //@ requires !estVide();
    //@ ensures contient(\result);	// le min est un element de l'ensemble
    //@ ensures \result == (\min int x; contient(x); x); // c'est le plus petit
    // Les deux postconditions sont redondantes par rapport a l'invariant !
    public /*@ pure @*/ int getMin() {
	int m=tab[0];
	for(int i = 1; i < nb; i++){
		if (tab[i]<m){
			m=tab[i];
		}
	}       
	return m;
    }
}
