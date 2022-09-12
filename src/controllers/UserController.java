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
	
	/**
	 * Inicializa banco de dados do usuario com usuario pre setado
	 */
	public static void initUserDataBase() {
		
		if(DataBase.getUsers().isEmpty()) {
			DataBase.getUsers().add(new User("Victor", "victor@gmail.com", "12345"));
		}
		
	}
	
	/**Retorna rotinas do usuario
	 * @param user
	 * @return Lista de rotinas do usuario
	 * 
	 * @see Routine
	 */
	public static ArrayList<Routine> getRoutines(User user) {
		return user.getRoutines();
	}
	
	/**
	 * Cria nova rotina para usuario
	 * @param user
	 * @param name
	 * @return rotina criada
	 * 
	 * @see Routine
	 */
	public static Routine createRoutine(User user, String name) {
		return user.createRoutine(name);
	}
	
	/**
	 * Loga usuario
	 * @param name
	 * @param password
	 * @return usuario que logou ou null
	 */
	public static User login(String name, String password) {
		for(User user : DataBase.getUsers()) {
			if(name.equals(user.getEmail()) && password.equals(user.getPassword())) {
				return user;
			}
		}
		return null;
	}
	
	/**
	 * Cria usuario e adiciona ao banco de dados
	 * @param name
	 * @param email
	 * @param password
	 * @return usuario criado
	 */
	public static User createUser(String name, String email, String password) {
		User user = new User(name,email,password);
		DataBase.getUsers().add(user);
		
		return user;
	}
	
	/** Retorna usuarios registrados
	 * @return Lista de usuarios
	 */
	public static ArrayList<User> getUsers(){
		return DataBase.getUsers();
	}
 }
