import java.util.ArrayList;
import java.util.HashSet;

import fr.supaero.figure.Observable;
import fr.supaero.figure.Observateur;



public class Chat implements Observable {
	HashSet<VueChat> listObs = new HashSet();
	
	private ArrayList<String> chaines = new ArrayList();
	
	public void ajouter(String s){
		chaines.add(s);
	}
	
	public String getLast(){
		return chaines.get(chaines.size() - 1);
	}
	
	public void annuler(Observateur o){
		listObs.remove(o);
	}
	
	public void avertir(){
		for (VueChat o : listObs){
			o.miseAJour();
		}
	}
	
	public void inscrire(VueChat o){
		listObs.add(o);
	}
}
