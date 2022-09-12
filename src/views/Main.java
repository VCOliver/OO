/**
 * 
 */
package views;

import controllers.DataBaseController;
import models.Routine;
import models.User;

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
		
		DataBaseController.init(); // Inicializa o banco de dados dos exercicios
		
		Login login = new Login();
//		new CreateAccount();
//		User user = new User("Victor", "victor@gmail.com", "12345");
//		Routine routine = user.createRoutine("routine1");
//		user.createRoutine("routine2");
//		user.createRoutine("routine3");
		
//		new UserScreen(user);
//		new CreateRoutine(user);
//		new RoutineScreen(user, routine);

	}

}
