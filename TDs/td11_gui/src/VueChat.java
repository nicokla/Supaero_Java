import java.awt.*;
import javax.swing.*;

import fr.supaero.figure.Observateur;

public class VueChat extends JFrame implements Observateur{
	
	private JButton bouton = new JButton("Envoyer");
	private JTextField champ = new JTextField(20);
	private JTextArea affichage = new JTextArea (30,20);
	Chat c;
	
	public VueChat(Chat c_) {
		super("Chat");
		this.c = c_;
		this.initComponents();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
	private void initComponents() {
		this.setLayout(new BorderLayout());
		this.add(this.champ,BorderLayout.WEST);
		this.add(this.bouton,BorderLayout.EAST);
		this.add(this.affichage,BorderLayout.NORTH);
		this.bouton.addActionListener(new EcouteurBouton(this.champ,this.c));
	}
	
	public void miseAJour() {
		this.affichage.append(c.getLast());
	}
}
