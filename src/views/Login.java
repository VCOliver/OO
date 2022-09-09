/**
 * 
 */
package views;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

/**
 * Primeira tela a ser vista pelo usuario, responsavel pelo login
 * @author VCOliver
 */
@SuppressWarnings("serial")
public class Login extends JFrame implements KeyListener{

	//Attributes
	private static JFrame frame;
	private static JButton btn;
	private static JTextField emailInput;
	private static JPasswordField passwordInput;
	private static JLabel passwordLabel;
	private static JLabel emailLabel;
	private static JLabel createAccount;
	
	public Login() {
		
		
		//Setting up frame
		frame = new JFrame("Login");
		frame.getContentPane().setBackground(new Color(17, 192, 102));
		frame.setTitle("Login");
		frame.setSize(500, 500);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null); // Centers frame on the screen
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		//Setting up email box
		emailLabel = new JLabel("Insira seu email:");
		emailLabel.setFont(new Font("Arial", Font.BOLD, 16));
		emailLabel.setBounds(100, 90, 300, 30);
		emailInput = new JTextField(10);
		emailInput.setBounds(100, 130, 300, 30);
		emailInput.setFocusable(true);
		
		//Setting up password box
		passwordLabel = new JLabel("Insira sua senha:");
		passwordLabel.setFont(new Font("Arial", Font.BOLD, 16));
		passwordLabel.setBounds(100, 170, 300, 30);
		passwordInput = new JPasswordField(10);
		passwordInput.setBounds(100, 210, 300, 30);
		
		//Setting up button
		btn = new JButton("Login");
		btn.setBounds(190,320,120,30);
		
		//Setting up Create account box
		createAccount = new JLabel("Crie sua conta aqui!");
		createAccount.setFont(new Font("Arial", Font.BOLD, 14));
		createAccount.setForeground(Color.RED);
		createAccount.setBounds(180, 350, 300, 30);
		createAccount.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		//Adding setups to frame
		frame.add(emailLabel);
		frame.add(emailInput);
		frame.add(passwordLabel);
		frame.add(passwordInput);
		frame.add(btn);
		frame.add(createAccount);
		
		//Action listeners
		frame.addKeyListener(this);
		emailInput.addKeyListener(this);
		passwordInput.addKeyListener(this);
		
		btn.addActionListener(e -> { 		 //Button action listener
			String email = emailInput.getText();
			String password = String.valueOf(passwordInput.getPassword());
			
			System.out.println(email + " " + password);
		});
		
		createAccount.addMouseListener(new MouseAdapter() {
		      @Override
		      public void mouseClicked(MouseEvent e) {
		    	  System.out.println("Somebody wants to create a new account."); 
		      }
		    }
		);
		
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
