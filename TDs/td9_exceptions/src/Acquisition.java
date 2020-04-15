import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Acquisition {

	private ArrayList<Double> donnees;
	private String fichier;
	
	public Acquisition (String f){
		this.fichier = f;
		this.donnees = new ArrayList<Double> () ;
	}
	
	public void lireFichier(){
		try {
			String s = new String(""); double x;
			BufferedReader in = new BufferedReader(new FileReader(this.fichier));
			while( (s = in.readLine()) != null ){
				s = s.trim();
				x = Double.parseDouble(s);
				if (x<0)
					throw new ReelNegatifException("");
				else
					this.donnees.add(new Double(x));
			}
			in.close();
		}
		catch (ReelNegatifException e){				
			System.out.println("Ce n’est pas un reel positif !");
		}
		catch (NumberFormatException e) {
			System.out.println("Ce n’est pas un double !");
		}
		catch (IOException e) {
			System.out.println("Erreur d’entree/sortie !");
		}
	}
	
	public Iterator iterateur(){
		return ( donnees.iterator() );
	}
}