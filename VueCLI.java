import java.awt.*;
import javax.swing.*;

public class VueCLI extends JPanel {

	private static final long serialVersionUID = 1L;

	public VueCLI() {
		this.setLayout(new BorderLayout());
		
		JPanel haut = new JPanel();
		haut.setLayout(new GridLayout(1,4));
		this.add(haut, BorderLayout.NORTH);
		
		JPanel milieu = new JPanel();
		milieu.setLayout(new GridLayout(3,3));
		this.add(milieu, BorderLayout.CENTER);

		
		// Boutons du haut
		JButton gauche = new JButton();
		gauche.setVisible(false);
		haut.add(gauche);
		
		JButton creuse = new JButton("Creuse (C)");
		haut.add(creuse);
		
		JButton pleine = new JButton("Pleine (P)");
		haut.add(pleine);
		
		JButton droite = new JButton();
		droite.setVisible(false);
		haut.add(droite);
		
		
		// Zone du milieu
		JLabel texteIndice = new JLabel("Valeur de l'indice (K)");
		JLabel texteAlpha = new JLabel("Valeur de alpha (A)");
		JLabel texteEpsilon = new JLabel("Valeur de epsilon (E)");
		
		JTextField indice = new JTextField("30");
		JTextField alpha = new JTextField(".90");
		JTextField epsilon = new JTextField("0.001");
		
		JButton add = new JButton("+");
		JButton add2 = new JButton("+");
		JButton add3 = new JButton("+");
		
		milieu.add(texteIndice);
		milieu.add(indice);
		milieu.add(add);
		milieu.add(texteAlpha);
		milieu.add(alpha);
		milieu.add(add2);
		milieu.add(texteEpsilon);
		milieu.add(epsilon);
		milieu.add(add3);
		
		// Affichage du bas
		JTextField affichage = new JTextField("-K 50 -P -E 0.001 -A .90 -K 30 -C");
		affichage.setEditable(false);
		this.add(affichage, BorderLayout.SOUTH);
	}
}
