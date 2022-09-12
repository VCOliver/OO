/**
 * 
 */
package views;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controllers.ExerciseController;
import controllers.MuscleController;
import controllers.RoutineController;
import models.Exercise;
import models.Routine;
import models.User;

/**
 * Tela com informacoes das rotinas
 * @author VCOliver
 *
 */
@SuppressWarnings("serial")
public class RoutineScreen extends JFrame{
	
	private static JPanel exercisesBox;
	private static JLabel exercisesLabel;
	private static JPanel muscleExerciseBox;
	private static JComboBox musclesCB;
	private static JLabel currentExercisesLabel;
	private static JList currentExerciseList;
	private static JList exercisesToChoose;
	private static JTextField setsInput;
	private static JTextField repsInput;
	private static JTextField weightInput;
	private static JTextField restInput;
	private static JButton btn;
	private static String[] muscles = MuscleController.getMuscleArray();
	
	private DefaultListModel dExercises = new DefaultListModel();
	private DefaultListModel dMuscleExercise = new DefaultListModel();
	private ArrayList<Exercise> exercises = new ArrayList<>();
	private ArrayList<Exercise> exercisesFromMuscle = new ArrayList<>();
	private Exercise exercise;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public RoutineScreen(User user, Routine routine) {
		
		initialExercisesToChoose();
		
		exercises.addAll(RoutineController.getExercises(routine));
		setDExercises();
		
		//Setting up frame
		this.setTitle("Treino " + routine.getName());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setLayout(new GridLayout(7,1));
		
		//Setting up current exercises label
		currentExercisesLabel = new JLabel("Exercicios:");
		currentExercisesLabel.setFont(new Font("Arial", Font.BOLD, 14));
		
		//Setting up current exercise list
		currentExerciseList = new JList(dExercises);
//		exercisesBox = new JPanel();
//		exercisesBox.setLayout(new FlowLayout());
//		exercisesBox.add(currentExerciseList);
		
		//Setting up exercises label
		exercisesLabel = new JLabel("Deseja adicionar exercícios?");
		exercisesLabel.setFont(new Font("Arial", Font.BOLD, 14));
		
		//Setting up exercises box
		musclesCB = new JComboBox(muscles);
//		muscleExerciseBox = new JPanel();
		exercisesToChoose = new JList(dMuscleExercise);
//		exercisesToChoose = new JList(exercisesFromMuscle.toArray());
		btn = new JButton("Adicionar exercício");
//		muscleExerciseBox.setLayout(new FlowLayout());
//		muscleExerciseBox.add(musclesCB);
//		muscleExerciseBox.add(exercisesToChoose);
		
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
		
		//Adding to the frame
		this.add(currentExercisesLabel);
		this.add(currentExerciseList);
		this.add(exercisesLabel);
		this.add(musclesCB);
		this.add(exercisesToChoose);
//		this.add(exercisesToChoose);
//		this.add(muscleExerciseBox);
		this.add(exercisesBox);
		this.add(btn);
		this.pack();
		
		this.setVisible(true);
		
		musclesCB.addActionListener(e -> {
			String muscle = musclesCB.getSelectedItem().toString();
			exercisesFromMuscle.clear();
			dMuscleExercise.clear();
			exercisesFromMuscle.addAll(ExerciseController.getExercisesFromMuscle(muscle));
			
			for(Exercise exercise : exercisesFromMuscle) {
				dMuscleExercise.addElement(exercise);
			}
			
			this.pack();
			

		});
		
		currentExerciseList.addListSelectionListener(e -> {
			if(!e.getValueIsAdjusting()) {
				int i = currentExerciseList.getSelectedIndex();
				exercise = exercises.get(i);
				
				new ExerciseScreen(exercise);

			}
		});
		
		exercisesToChoose.addListSelectionListener(e -> {
			if(!e.getValueIsAdjusting()) {
				int i = exercisesToChoose.getSelectedIndex();
				exercise = exercisesFromMuscle.get(i);

				new ExerciseOptionsScreen(exercise);

			}
		});
		
		btn.addActionListener(e -> {
//			String muscle = musclesCB.getSelectedItem().toString();
			
			int sets = Integer.valueOf(setsInput.getText().trim().isEmpty() ? "0" : setsInput.getText());
			int reps = Integer.valueOf(repsInput.getText().trim().isEmpty() ? "0" : repsInput.getText());
			double weight = Double.valueOf(weightInput.getText().trim().isEmpty() ? "0" : weightInput.getText());
			int rest = Integer.valueOf(restInput.getText().trim().isEmpty() ? "0" : restInput.getText());
					
			try {
				Exercise newExercise = RoutineController.addExercise(routine, exercise, rest, rest, weight, rest);
				exercises.add(newExercise);
				dExercises.addElement(newExercise);
			} catch (Exception err) {
				JOptionPane.showMessageDialog(null, "Exercicio não foi selecionado", "ERROR", JOptionPane.ERROR_MESSAGE);
			}

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
	
	private void setDExercises() {
		for(Exercise exercise : exercises) {
			dExercises.addElement(exercise);
		}
	}
	
	private void initialExercisesToChoose() {
		exercisesFromMuscle.addAll(ExerciseController.getExercisesFromMuscle("Biceps"));
		
		for(Exercise exercise : exercisesFromMuscle) {
			dMuscleExercise.addElement(exercise);
		}
	}
	
}
