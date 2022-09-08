package models;

import java.util.ArrayList;


/**
 * Classe para definir Rotinas de treinos dos usuarios
 * 
 * @author VCOliver
 * @version 1.0
 * @see Exercise
 */
public class Routine {
	
	//Attributes
	private String name;
	private String user;
	private ArrayList<Exercise> exercises = new ArrayList<>();

	public Routine(String name, String user_name) {
		this.name = name;
		user = user_name;
	}
	
	//Methods
	/**
	 * Metodo para adicionar novos exercicios a rotina
	 * @param exercises the exercises to set
	 */
	public void addExercises(Exercise newExercise) {
		if(!this.exercises.contains(newExercise)) {
			this.exercises.add(newExercise);
		}
	}

	/**
	 * metodo para remover exercicios da rotina
	 * @param exercise
	 */
	public void removeExercise(Exercise exercise) {
		this.exercises.remove(exercise);
	}
	
	
	//Getters

	/**
	 * retorna o nome da rotina
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * retorna o nome do usuario
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * Retorna lista de exercicios
	 * @return the exercises
	 */
	public ArrayList<Exercise> getExercises() {
		return exercises;
	}

	
	//Setters 
	
	/**
	 * Define novo nome para a rotina
	 * @param name the name to set
	 */
	public void rename(String name) {
		this.name = name;
	}

}
