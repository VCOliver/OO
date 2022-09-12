/**
 * 
 */
package controllers;

import java.util.ArrayList;

import models.DataBase;
import models.Exercise;
import models.Muscles;

/**
 * @author VCOliver
 *
 */
public class ExerciseController {
	
	
	/**
	 * Coloca dados pre setados no banco de dados
	 */
	public static void InitExerciseDataBase(){
		
		if(DataBase.getExercises().isEmpty()) {
			for(Muscles muscle : Muscles.values()) {
				DataBase.getExercises().put(muscle.getValue(), new ArrayList<>());
				
				if(muscle.getIndex() != 0 && muscle.getIndex() != 2) {
					DataBase.getExercises().get(muscle.getValue()).add(new Exercise(null, null, null, null));
				}
			}
			
			DataBase.getExercises().get("Costas").add(new Exercise("Puxada aberta", 
					new String[] {"Costas"}, 
					"sentado de frente para o aparelho pulley, realizar uma flexão de cotovelo, levando a barra em direção ao queixo, e estendê-lo novamente, realizando assim o movimento completo.", 
					null));
			DataBase.getExercises().get("Biceps").add(new Exercise("Rosca martelo", new String[] {"Biceps"}, "Exercício feito em pé com o auxílio de dois halteres", null));
					
			
		}
		
	}
	
	
	/** 
	 * Retorna lista de exercicios relacionado a certo musculo
	 * @param muscle
	 * @return
	 * @see Exercise
	 */
	public static ArrayList<Exercise> getExercisesFromMuscle(String muscle){
		return DataBase.getExercises().get(muscle);
	}
	
	/**
	 * Edita exercicio
	 * @param exercise
	 * @param sets
	 * @param reps
	 * @param weight
	 * @param rest
	 * 
	 * @see Exercise
	 */
	/**
	 * Edita exercicio selecionado caso usuario logado
	 * @param exercise
	 * @param sets
	 * @param reps
	 * @param weight
	 * @param rest
	 * 
	 * @see Exercise
	 */
	public static void editExercise(Exercise exercise, int sets, int reps, double weight, int rest) {
		exercise.setReps(reps);
		exercise.setSets(sets);
		exercise.setWeight(weight);
		exercise.setRest(rest);
	}
	
	/**
	 * Edita exercicio selecionado caso admin logado
	 * @param exercise
	 * @param name
	 * @param muscles
	 * @param description
	 * 
	 * @see Exercise
	 */
	public static void editExercise(Exercise exercise, String name, String[] muscles, String description) {
		exercise.setName(name);
		exercise.setMuscles(muscles);
		exercise.setDescription(description);
	}
	
}
