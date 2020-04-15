import java.awt.event.*;
import javax.swing.*;


public class EcouteurBouton implements ActionListener {

		private JTextField texte;
		Chat c;
		
		public EcouteurBouton(JTextField texte_, Chat c_){
			this.texte = texte_;
			this.c=c_;
		}
		
		public void actionPerformed(ActionEvent e){
			c.ajouter(this.texte.getText() + "\n");
			c.avertir();
		}
}
