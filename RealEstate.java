package realEstate;

import javax.swing.SwingUtilities;
public class RealEstate {

	public static void main(String[] args) {		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				WelcomeFrame frame = new WelcomeFrame("Welcome"); // MainFrame Class doesn't currently work
		    }
		});
    }

}