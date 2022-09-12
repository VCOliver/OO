/**
 * 
 */
package controllers;

import java.util.ArrayList;

import models.Exercise;
import models.Routine;

/**
 * @author VCOliver
 *
 */
public class RoutineController {
	
	/**
	 * Funcao para pegar lista de exercicios do treino
	 * @param routine
	 * @return ArrayList de exercicios
	 * 
	 * @see Exercise
	 */
	public static ArrayList<Exercise> getExercises(Routine routine){
		return routine.getExercises();
	}
	
	/**
	 * Funcao para adicionar exercicio ao treino
	 * @param routine
	 * @param e
	 * @param sets
	 * @param reps
	 * @param weight
	 * @param rest
	 * @return exercicio adicionado
	 * @see Exercise
	 */
	public static Exercise addExercise(Routine routine, Exercise e, int sets, int reps, double weight, int rest) {
		
		Exercise exercise = e;
		
		exercise.setReps(reps);
		exercise.setSets(sets);
		exercise.setWeight(weight);
		exercise.setRest(rest);
		routine.addExercises(exercise);
		
		return exercise;
		
	}
	
}
