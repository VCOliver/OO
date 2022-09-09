/**
 * 
 */
package view;

import controllers.ExerciseController;

/**
 * @author VCOliver
 * @see ExerciseControllers
 */
public class Main {

	/**
	 * Classe principal do projeto, responsavel por instanciar dados principais e inicializar o banco de dados
	 * @param args
	 */
	public static void main(String[] args) {
		
		ExerciseController.InitExerciseDataBase(); // Inicializa o banco de dados dos exercicios
		
		Login login = new Login();

	}

}
