/**
 * 
 */
package views;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controllers.UserController;
import models.Routine;
import models.User;

/**
 * Tela para criar treinos
 * @author VCOliver
 *
 */
@SuppressWarnings("serial")
public class CreateRoutine extends JFrame{
	
//	private static JPanel nameBox;
	private static JLabel routineNameLabel;
	private static JTextField routineNameInput;
	private static JButton create;

	
	public CreateRoutine(User user) {
		
		//Setting up frame
		this.setTitle("Criando treino");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setLayout(new FlowLayout());
		
		//Setting up name box
		routineNameLabel = new JLabel("Insira nome do treino:");
		routineNameLabel.setFont(new Font("Arial", Font.BOLD, 14));
		routineNameInput = new JTextField(10);
		routineNameInput.setFocusable(true);
		create = new JButton("Criar");
		
		this.add(routineNameLabel);
		this.add(routineNameInput);
		this.add(create);
		this.pack();
		
		this.setVisible(true);
		
		create.addActionListener(e -> {
			
			String routineName = routineNameInput.getText();
			
			if(!routineName.trim().isEmpty()) {
				System.out.println(routineName);
			} else {
				JOptionPane.showMessageDialog(null, "Por favor preencha o nome", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			
			Routine routine = UserController.createRoutine(user, routineName);
			
			new RoutineScreen(user, routine);
			
		});
		
	}
	
}
