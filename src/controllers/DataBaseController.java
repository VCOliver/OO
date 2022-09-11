package controllers;

/**
 * Controla o banco de dados dos exercicios e com a criacao dos exercicios
 * @author VCOliver
 */
public class DataBaseController {
	
	/**
	 * Initializes exercises database if null
	 */

	public static void init() {
		ExerciseController.InitExerciseDataBase();
		UserController.initUserDataBase();
		AdminController.initAdminDataBase();
	}
}
