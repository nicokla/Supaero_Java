package fr.supaero.banque;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *  Unit Test for class CompteSimple
 *
 *
 * Created: Wed Nov 30 22:42:37 2005
 *
 * @author <a href="mailto:garion@supaero.fr">Christophe Garion</a>
 * @version 1.0
 */
public class CompteSimpleTest {

    private CompteSimple c;

    protected CompteSimple createCompte(Personne p, double solde) {
        return new CompteSimple(p, solde);
    }

    @Before public void setUp() {
        this.c = this.createCompte(new Personne ("Christophe", "Garion", true),
                                   1000);
    }

    @Test public void testGetSolde() {
        Assert.assertEquals(1000, this.c.getSolde(), 0.0);
    }

    @Test public void testCrediter() {
        this.c.crediter(100);
        Assert.assertEquals(1100, this.c.getSolde(), 0.0);
    }

    @Test public void testDebiter() {
        this.c.debiter(300);
        Assert.assertEquals(700, this.c.getSolde(), 0.0);
    }
}// CompteSimpleTest
