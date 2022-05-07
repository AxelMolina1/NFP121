import java.awt.GridLayout;

import javax.swing.JFrame;

public class ApplicationCLI extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public ApplicationCLI() {
    	
        this.setTitle("IHM pour CLI");
        this.setLayout(new GridLayout(1, 1));
        this.add(new VueCLI());
        this.setSize(500, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
	
	public static void main(String[] args) {
		new ApplicationCLI();
	}

}
