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
	
	public static ArrayList<Exercise> getExercises(Routine routine){
		return routine.getExercises();
	}
	
	public static void addExercise(Routine routine, Exercise exercise) {
		routine.addExercises(exercise);
	}
	
}
