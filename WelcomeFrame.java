package realEstate;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class WelcomeFrame extends JFrame {

	private JPanel contentPane;

	public WelcomeFrame(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnLogIn = new JButton("Existing User: Log in");
		btnLogIn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLogIn.setBounds(126, 48, 161, 45);
		panel.add(btnLogIn);
		
		JButton btnRegister = new JButton("New: Register");
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnRegister.setBounds(126, 130, 161, 47);
		panel.add(btnRegister);
		
		btnLogIn.addActionListener(new ActionListener() {
	    	
	    	public void actionPerformed(ActionEvent e) {
	    	  	    SwingUtilities.invokeLater(new Runnable() {
					    public void run() {
						    logInFrame logFrame = new logInFrame("Log In"); 
			            }
			       });
	    	}
	    });
		
        btnRegister.addActionListener(new ActionListener() {
	    	
	    	public void actionPerformed(ActionEvent e) {
	    	  	    SwingUtilities.invokeLater(new Runnable() {
					    public void run() {
						    registerFrame regFrame = new registerFrame("Register"); 
			            }
			       });
	    	}
	    });

	}

}
