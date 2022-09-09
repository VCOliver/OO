/**
 * 
 */
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author VCOliver
 *
 */
public class Login implements ActionListener {

	private static JFrame frame;
	private static JButton btn;
	private static JTextField inputEmail;
	private static JPasswordField inputSenha;
	private static JLabel inserirSenha;
	private static JLabel inserirEmail;
	private static JLabel criarConta;
	
	public Login() {
		
		frame = new JFrame("Cadastro");
		btn = new JButton("Logar");
		inputEmail = new JTextField(10);
		inputSenha = new JPasswordField(10);
		inserirEmail = new JLabel("Insira seu email:");
		inserirSenha = new JLabel("Insira sua senha:");
		criarConta = new JLabel("Não tem conta? Cadastre-se!");
		
		frame.getContentPane().setBackground(Color.getHSBColor(217, 228, 241));
		frame.setTitle("Cadastro");
		frame.setSize(500, 500);
		frame.setLocation(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		inputEmail.setBounds(100, 130, 300, 30);
		
		inserirEmail.setFont(new Font("Arial", Font.BOLD, 16));
		inserirEmail.setBounds(100, 90, 300, 30);
		
		inputSenha.setBounds(100, 210, 300, 30);
		
		inserirSenha.setFont(new Font("Arial", Font.BOLD, 16));
		inserirSenha.setBounds(100, 170, 300, 30);
		
		btn.setBounds(190,320,120,30);
		
		criarConta.setFont(new Font("Arial", Font.BOLD, 14));
		criarConta.setForeground(Color.getHSBColor(226, 40, 27));
		criarConta.setBounds(130, 350, 300, 30);
		
		frame.add(inserirEmail);
		frame.add(inputEmail);
		frame.add(inserirSenha);
		frame.add(inputSenha);
		frame.add(btn);
		frame.add(criarConta);
		
		frame.setVisible(true);
		
		btn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
