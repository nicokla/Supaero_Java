
public class Utilitaire {

    public int nbElements(Agregat a) {
        
        Iterateur iter = a.creeIterateur();
        int i = 0;

        while(!iter.estTermine()){
            
             iter.avancer();
             i++;
            
        }

        return i;  

    }

}

