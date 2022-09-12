/**
 * 
 */
package views;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controllers.ExerciseController;
import models.Exercise;

/**
 * Tela para editar exercicio
 * @author VCOliver
 *
 */
public class EditExercise extends JFrame{
	
	private static JPanel exercisesBox;
	private static JTextField setsInput;
	private static JTextField repsInput;
	private static JTextField weightInput;
	private static JTextField restInput;
	private static JButton btn;
	
	public EditExercise(Exercise exercise){
		
		//Setting up frame
		this.setTitle("Exercicio: " + exercise.getName());
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setLayout(new GridLayout(2,1));
		
		exercisesBox = new JPanel();
		exercisesBox.setLayout(new FlowLayout());
		exercisesBox.add(new JLabel("Sets: "));
		setsInput = new JTextField();
		setsInput.setPreferredSize(new Dimension(40, 30));
		exercisesBox.add(setsInput);
		exercisesBox.add(new JLabel("Reps: "));
		repsInput = new JTextField();
		repsInput.setPreferredSize(new Dimension(40, 30));
		exercisesBox.add(repsInput);
		exercisesBox.add(new JLabel("Peso: "));
		weightInput = new JTextField();
		weightInput.setPreferredSize(new Dimension(40, 30));
		exercisesBox.add(weightInput);
		exercisesBox.add(new JLabel("Descanso: "));
		restInput = new JTextField();
		restInput.setPreferredSize(new Dimension(40, 30));
		exercisesBox.add(restInput);
		
		btn = new JButton("Confirmar");
		
		this.add(exercisesBox);
		this.add(btn);
		
		this.pack();
		this.setVisible(true);
		
		btn.addActionListener(e -> {
			int sets = Integer.valueOf(setsInput.getText());
			int reps = Integer.valueOf(repsInput.getText());
			double weight = Double.valueOf(weightInput.getText());
			int rest = Integer.valueOf(restInput.getText());
			
			ExerciseController.editExercise(exercise, sets, reps, weight, rest);
			
			this.dispose();
			
		});
		
		setsInput.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent ke) {
	            String value = setsInput.getText();
	            int l = value.length();
	            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
	            	setsInput.setEditable(true);
	            } else {
	            	setsInput.setEditable(false);
	            	JOptionPane.showMessageDialog(null, "Digite apenas números", "ERROR", JOptionPane.ERROR_MESSAGE);
	            	try {
	            		  Thread.sleep(100);
	            		} catch (InterruptedException e) {
	            		  Thread.currentThread().interrupt();
	            		}
	            	setsInput.setEditable(true);
	            }
	         }
		});
		
		repsInput.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent ke) {
	            String value = repsInput.getText();
	            int l = value.length();
	            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
	            	repsInput.setEditable(true);
	            } else {
	            	repsInput.setEditable(false);
	            	JOptionPane.showMessageDialog(null, "Digite apenas números", "ERROR", JOptionPane.ERROR_MESSAGE);
	            	try {
	            		  Thread.sleep(100);
	            		} catch (InterruptedException e) {
	            		  Thread.currentThread().interrupt();
	            		}
	            	repsInput.setEditable(true);
	            }
	         }
		});

		weightInput.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent ke) {
		        String value = weightInput.getText();
		        int l = value.length();
		        if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') || ke.getKeyChar() == '.') {
		        	weightInput.setEditable(true);
		        } else {
		        	weightInput.setEditable(false);
		        	JOptionPane.showMessageDialog(null, "Digite apenas números", "ERROR", JOptionPane.ERROR_MESSAGE);
		        	try {
		        		  Thread.sleep(100);
		        		} catch (InterruptedException e) {
		        		  Thread.currentThread().interrupt();
		        		}
		        	weightInput.setEditable(true);
		        }
		     }
		});
		
		restInput.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent ke) {
		        String value = restInput.getText();
		        int l = value.length();
		        if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
		        	restInput.setEditable(true);
		        } else {
		        	restInput.setEditable(false);
		        	JOptionPane.showMessageDialog(null, "Digite apenas números", "ERROR", JOptionPane.ERROR_MESSAGE);
		        	try {
		        		  Thread.sleep(100);
		        		} catch (InterruptedException e) {
		        		  Thread.currentThread().interrupt();
		        		}
		        	restInput.setEditable(true);
		        }
		     }
		});
		
	}
	
}
