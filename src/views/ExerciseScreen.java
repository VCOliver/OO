/**
 * 
 */
package views;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import models.Exercise;

/**
 * Tela com informacoes do exercicio
 * @author VCOliver
 *
 */
@SuppressWarnings("serial")
public class ExerciseScreen  extends JFrame{
	public static JLabel name;
	public static JLabel description;
	public static JPanel panel;
	public static JLabel sets;
	public static JLabel reps;
	public static JLabel weight;
	public static JLabel rest;
	public static JButton btn;
	
	public ExerciseScreen(Exercise exercise){
		
		
		//Setting up frame
		this.setTitle("Exercicio: " + exercise.getName());
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setLayout(new GridLayout(5,1));
		
		name = new JLabel(exercise.getName());
		this.add(name);
		
		String muscleLabel = "Muscles: " + Arrays.toString(exercise.getMuscles());
		this.add(new JLabel(muscleLabel));
		
		description = new JLabel(exercise.getDescription());
		this.add(description);
		
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		sets = new JLabel("Sets: " + String.valueOf(exercise.getSets()));
		panel.add(sets);
		reps = new JLabel("| Reps: " + String.valueOf(exercise.getReps()));
		panel.add(reps);
		weight = new JLabel("| Peso: " + String.valueOf(exercise.getWeight()));
		panel.add(weight);
		rest = new JLabel("| Descanso: " + String.valueOf(exercise.getRest()));
		panel.add(rest);
		
		btn = new JButton("Editar");
		btn.addActionListener(e -> {
			new EditExercise(exercise);
		});
		
		this.add(panel);
		this.add(btn);
		
		this.pack();
		this.setVisible(true);
		
		
	}
}
