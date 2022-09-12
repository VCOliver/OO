/**
 * 
 */
package views;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import controllers.UserController;
import models.Routine;
import models.User;

/**
 * Primeira tela vista pelo usuario quando faz login
 * @author VCOliver
 *
 */
@SuppressWarnings("serial")
public class UserScreen extends JFrame{
	
	private ArrayList<Routine> routines = new ArrayList<>();
	
	private JList<String> routineList;
	private static JLabel listLabel;
	private static JPanel listPanel;
	private static JPanel panel;
	private static JButton btn;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public UserScreen(User user) {
		
		routines.addAll(UserController.getRoutines(user));
		
		//Setting up frame
		this.setTitle("Meus treinos");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(300, 300);
		this.setResizable(true);
		this.setLayout(new GridLayout(2,1));
		
		//Setting up List label
		listLabel = new JLabel("Sua lista de treinos:");
		listLabel.setFont(new Font("Arial", Font.BOLD, 14));
		
		//Setting up List
		routineList = new JList(routines.toArray());
		routineList.setBackground(Color.LIGHT_GRAY);
		
		//Setting up List Panel
		listPanel = new JPanel();
//		panel.setPreferredSize(new Dimension(500, 30));
//		listPanel.setBackground(Color.LIGHT_GRAY);
		listPanel.setLayout(new FlowLayout());
//		panel.setBounds(0, 380, 500, 30);
//		
//		
//		//Setting up Panel
		panel = new JPanel();
//		panel.setPreferredSize(new Dimension(500, 30));
//		panel.setBackground(Color.WHITE);
		panel.setLayout(new FlowLayout());
//		panel.setBounds(0, 380, 500, 30);
//		
		//Setting up button
		btn = new JButton("Novo treino");
//		btn.setSize(120, 30);
		btn.setBounds(190,320,120,30);
		
//		//Adding to list panel
		listPanel.add(listLabel);
		listPanel.add(routineList);
//		
		//Adding to panel
		panel.add(btn);
//		
		//Adding to frame
		this.add(listPanel);
		this.add(panel);
		
		this.setVisible(true);
		
		btn.addActionListener(e -> {
			
			new CreateRoutine(user);
			
		});
		
		routineList.addListSelectionListener(e -> {
			if(!e.getValueIsAdjusting()) {
				int i = routineList.getSelectedIndex();
				System.out.println(routines.get(i));
			}
		});
		
	}

}
