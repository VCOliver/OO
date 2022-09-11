/**
 * 
 */
package controllers;

import java.util.ArrayList;

import models.DataBase;
import models.Routine;
import models.User;

/**
 * @author VCOliver
 *
 */
public class UserController {
	
	public static void initUserDataBase() {
		
		if(DataBase.getUsers().isEmpty()) {
			DataBase.getUsers().add(new User("Victor", "victor@gmail.com", "12345"));
		}
		
	}
	
	public static ArrayList<Routine> getRoutines(User user) {
		return user.getRoutines();
	}
	
	public static Routine createRoutine(User user, String name) {
		return user.createRoutine(name);
	}
}
