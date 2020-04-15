package fr.supaero.banque;

/**
 * Programme utilisant les comptes bancaires.
 *
 * @author <a href="mailto:cregut@enseeiht.fr">Xavier Cregut</a>
 * @author <a href="mailto:garion@isae.fr">Christophe Garion</a>
 * @version 1.0
 */
public class ExempleComptes {
    public static void main(String[] args) {
        Personne p1 = new Personne("Christophe", "Garion", true);
        CompteSimple cs1 = new CompteSimple(p1);
        CompteCourant cc1 = new CompteCourant(p1, 100);

        cs1.crediter(1000);
        System.out.println("Solde de cs1 = " + cs1.getSolde());
        cc1.crediter(1000);
        System.out.println("Solde de cc1 = " + cc1.getSolde());
        cc1.editerReleve();
        System.out.println();
        
        CompteSimple cs = cc1;
        cs.debiter(500);
        System.out.println("Solde de cs = " + cs.getSolde());
        System.out.println("Solde de cc1 = " + cc1.getSolde());
        cc1.editerReleve();
    } // end of main()    
}
