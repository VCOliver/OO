package controllers;

import java.util.ArrayList;
import models.DataBase;
import models.Muscles;

/**
 * Controla o banco de dados dos exercicios e com a criacao dos exercicios
 * @author VCOliver
 */
public class ExerciseController {
	
	/**
	 * Initializes exercises database if null
	 */
	public static void InitExerciseDataBase(){
		
		if(DataBase.getExercises().isEmpty()) {
			for(Muscles muscle : Muscles.values()) {
				DataBase.getExercises().put(muscle.getValue(), new ArrayList<>());
			}
		}
		
	}
	
}
