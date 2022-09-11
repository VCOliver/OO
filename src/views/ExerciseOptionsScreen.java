/**
 * 
 */
package views;

import java.awt.GridLayout;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JLabel;

import models.Exercise;

/**
 * @author VCOliver
 *
 */
public class ExerciseOptionsScreen extends JFrame{
	
	public static JLabel name;
	public static JLabel description;
	
	public ExerciseOptionsScreen(Exercise exercise) {
		
		int size = 3;
		
		//Setting up frame
		this.setTitle("Exercicio: " + exercise.getName());
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setLayout(new GridLayout(size,1));
		
		name = new JLabel(exercise.getName());
		this.add(name);
		
		String muscleLabel = "Muscles: " + Arrays.toString(exercise.getMuscles());
		this.add(new JLabel(muscleLabel));
		
		description = new JLabel(exercise.getDescription());
		this.add(description);
		
		this.pack();
		this.setVisible(true);
		
		
	}
}
