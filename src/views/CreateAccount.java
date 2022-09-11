/**
 * 
 */
package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Page to create account
 * @author VCOliver
 */
@SuppressWarnings("serial")
public class CreateAccount extends JFrame implements KeyListener { 
	
	private static JFrame frame;
	private static JPanel panel;
	private static JLabel usernameLabel;
	private static JTextField usernameInput;
	private static JLabel emailLabel;
	private static JTextField emailInput;
	private static JPasswordField passwordInput;
	private static JLabel passwordLabel;
	private static JPasswordField password2Input;
	private static JLabel password2Label;
	private static JButton btn;
	private static JCheckBox admCheckBox;
	
	public CreateAccount() {
		//Setting up frame
		frame = new JFrame("CreateAccount");
		frame.getContentPane().setBackground(new Color(17, 192, 102));
		frame.setTitle("Create Account");
		frame.setSize(500, 500);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null); // Centers frame on the screen
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		//Setting up email box
		usernameLabel = new JLabel("Insira nome de usuário:");
		usernameLabel.setFont(new Font("Arial", Font.BOLD, 16));
		usernameLabel.setBounds(100, 50, 300, 30);
		usernameInput = new JTextField(10);
		usernameInput.setBounds(100, 80, 300, 30);
		usernameInput.setFocusable(true);
		
		//Setting up email box
		emailLabel = new JLabel("Insira seu email:");
		emailLabel.setFont(new Font("Arial", Font.BOLD, 16));
		emailLabel.setBounds(100, 130, 300, 30);
		emailInput = new JTextField(10);
		emailInput.setBounds(100, 160, 300, 30);
		emailInput.setFocusable(true);
		
		//Setting up password box
		passwordLabel = new JLabel("Insira sua senha:");
		passwordLabel.setFont(new Font("Arial", Font.BOLD, 16));
		passwordLabel.setBounds(100, 210, 300, 30);
		passwordInput = new JPasswordField(10);
		passwordInput.setBounds(100, 240, 300, 30);
		
		//Setting up 2nd password box
		password2Label = new JLabel("Insira sua senha novamente:");
		password2Label.setFont(new Font("Arial", Font.BOLD, 16));
		password2Label.setBounds(100, 290, 300, 30);
		password2Input = new JPasswordField(10);
		password2Input.setBounds(100, 320, 300, 30);
		
		//Setting up Panel
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(500, 30));
		panel.setBackground(new Color(17, 192, 102));
		panel.setLayout(new FlowLayout());
		panel.setBounds(0, 380, 500, 30);
		
		//Setting up button
		btn = new JButton("Criar conta");
		btn.setBounds(190,380,120,30);
		
		//Setting up Check Box
		admCheckBox = new JCheckBox();
		admCheckBox.setText("Criar conta de administrador?");
		admCheckBox.setBackground(new Color(17, 192, 102));
		
		//Adding to panel
		panel.add(btn);
		panel.add(admCheckBox);
		
		//Adding to frame
		frame.add(usernameLabel);
		frame.add(usernameInput);
		frame.add(emailLabel);
		frame.add(emailInput);
		frame.add(passwordLabel);
		frame.add(passwordInput);
		frame.add(password2Label);
		frame.add(password2Input);
		frame.add(panel);
		
		//Action listeners
		frame.addKeyListener(this);
		emailInput.addKeyListener(this);
		passwordInput.addKeyListener(this);
		
		btn.addActionListener(e -> { 		 //Button action listener
			String username = usernameInput.getText();
			String email = emailInput.getText();
			String password = String.valueOf(passwordInput.getPassword());
			String password2 = String.valueOf(password2Input.getPassword());
			
			if(password.equals(password2) && !password.trim().isEmpty()) {
				System.out.println("Username = " + username + " | email = " + email + " | Password = " + password);
			} else {
				JOptionPane.showMessageDialog(null, "Passwords do not match", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			
//			if(admCheckBox.isSelected()) {
//				UserController.createuser();
//			}
//			
//			frame.dispose();
//			new RoutineScreen();
		});
		
		admCheckBox.addActionListener(e -> {
			if(admCheckBox.isSelected()) {
				System.out.println("Creating an admin account");
			}
		});
		
		frame.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
			if(e.getKeyCode() == 10) {
			
				String email = emailInput.getText();
				String password = String.valueOf(passwordInput.getPassword());
				
				System.out.println(email + " " + password);
			}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
